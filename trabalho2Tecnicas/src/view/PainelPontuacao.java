package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Aluno;
import controller.Bug;
import controller.Celula;
import controller.Plano;
import controller.Pontuacao;
import controller.Robo;

public class PainelPontuacao extends JPanel {

	protected Robo robo;
	protected PainelAlunoBug painelAB;
	protected Pontuacao pontuacao;

	public PainelPontuacao() {
		robo = new Robo();
		pontuacao = new Pontuacao();
		JButton verificar = new JButton("Verificar");
		verificar.setBackground(Color.white);
		verificar.addActionListener(new VerificarPontuacao());
		
		JButton sair = new JButton("Sair do Jogo");
		sair.setBackground(Color.white);
		sair.addActionListener(new SairdoJogo());
		this.add(painelPontGeralQuantAB());
		BotoesRobos robos = new BotoesRobos();
		painelRobosComPontuacao();
		this.add(robos.painelRobos);
		this.add(verificar);
		this.add(sair);
		this.setLayout(new GridLayout(5, 1));

		this.setVisible(true);
	}

	public JPanel painelPontGeralQuantAB() {
		JPanel ppquantAB = new JPanel();
		JLabel label = new JLabel("Pontuação: " + pontuacao.pontuacaoGeral());
		painelAB = new PainelAlunoBug();
		ppquantAB.setLayout(new GridLayout(2, 1));
		ppquantAB.add(label);
		ppquantAB.add(painelAB);
		ppquantAB.setBackground(Color.lightGray);
		return ppquantAB;
	}

	public void painelRobosComPontuacao() {

		ImageIcon robo1 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050-removebg (2).png"));
		ImageIcon robo2 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050-removebg (1).png"));
		ImageIcon robo3 = new ImageIcon(getClass().getResource("/imgs/clubPenguinEspiao5050sembg.png"));

		JLabel labelR1 = new JLabel(robo1);
		JLabel pontuacaoR1 = new JLabel(" : " + pontuacao.getPontuacaoR1());
		JLabel labelR2 = new JLabel(robo2);
		JLabel pontuacaoR2 = new JLabel(" : " + pontuacao.getPontuacaoR2());
		JLabel labelR3 = new JLabel(robo3);
		JLabel pontuacaoR3 = new JLabel(" : " + pontuacao.getPontuacaoR3());

		JPanel painelRobos = new JPanel();
		painelRobos.setLayout(new FlowLayout());
		painelRobos.setBackground(Color.lightGray);

		painelRobos.setPreferredSize(new Dimension(100, 100));

		painelRobos.add(labelR1);
		painelRobos.add(pontuacaoR1);
		painelRobos.add(labelR2);
		painelRobos.add(pontuacaoR2);
		painelRobos.add(labelR3);
		painelRobos.add(pontuacaoR3);
		painelRobos.setVisible(true);

		this.add(painelRobos);
	}

}

class SairdoJogo implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

class VerificarPontuacao implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Aluno aluno = new Aluno(5, new Plano(8,8));
		Bug bug = new Bug(7);
		Robo robo = new Robo();
		Celula c = new Celula(robo.getPosicaox(), robo.getPosicaoy());

		if (c.possuiAluno()) {
			robo.pegouAluno(aluno);
		} else if (c.possuiBug()) {
			robo.pegouBug(bug);
		}
	}
}
