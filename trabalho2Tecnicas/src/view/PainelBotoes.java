package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Aluno;
import controller.Bug;
import controller.Celula;
import controller.Plano;
import controller.Pontuacao;
import controller.Robo;
import controller.SortearPosicaoAB;

public class PainelBotoes extends JPanel implements ActionListener {

	protected ArrayList<Celula> listaCelulas;

	public PainelBotoes() {

		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.lightGray);
		setLayout(new GridLayout(8, 8));
		listaCelulas = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Celula c = new Celula(i, j);
				JButton botao = criarBotoesTabuleiro(c);
				add(botao);
				listaCelulas.add(c);
			}
		}
		setVisible(true);
	}

	public JButton criarBotoesTabuleiro(Celula celula) {
		JButton botao = new JButton();
		botao.setBackground(Color.pink);
		botao.addActionListener(this);
		botao.putClientProperty("celula", celula);

		return botao;
	}

	public void actionPerformed(ActionEvent e) {
		JButton botaoClicado = (JButton) e.getSource();
		Celula celulaClicada = (Celula) botaoClicado.getClientProperty("celula");
		Robo roboSelecionado = BotoesRobos.getRoboSelecionado();
		SortearPosicaoAB sorteio = new SortearPosicaoAB(listaCelulas);
		Plano p = new Plano(8, 8);
		Aluno aluno = new Aluno(p);
		Bug bug = new Bug(p);
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				if (roboSelecionado != null) {
					roboSelecionado.moverParaPosicao(celulaClicada.getPosicaoX(), celulaClicada.getPosicaoY());
					botaoClicado.setIcon(roboSelecionado.getIcon());
					botaoClicado.putClientProperty("robo", roboSelecionado);
					System.out.println("verificando");

					if (sorteio.verificaAluno(i, j)) {
						botaoClicado.setBackground(Color.BLACK);
						roboSelecionado.pegouAluno(aluno);
						botaoClicado.setDisabledIcon(botaoClicado.getIcon());
						System.out.println("pegou aluno");
					} else if (sorteio.verificaBug(i, j)) {
						botaoClicado.setBackground(Color.BLACK);
						roboSelecionado.pegouBug(bug);
						botaoClicado.setDisabledIcon(botaoClicado.getIcon());
						System.out.println("pegou bug");
					}
				}
			}
		}
	}
}
