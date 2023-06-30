package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Jogador;

public class PainelOpcoes extends JPanel{

	private JButton jogar;
	private JButton relatorio;
	private Jogador jogador;
	protected String nomeJogador;
	private Janela janela;
	private JTextField caixa;

	public PainelOpcoes(Janela janela) {
		
		this.janela = janela;
		JLabel label = new JLabel("Nome: ");
		this.add(label);
		setBackground(Color.lightGray);
		caixa = new JTextField();
		caixa.setPreferredSize(new Dimension(80, 27));
		this.add(caixa);
		nomeJogador = caixa.getText();
		jogador = new Jogador(nomeJogador);
		juntarBotoes();
		
		this.setLayout(new FlowLayout());
	}
	
	private void juntarBotoes() {
		jogar = criarBotaoOpcao("Jogar", new MostrarTabuleiro(janela));
		relatorio =  criarBotaoOpcao("Relatório", new MostrarRelatorio(janela));
		this.add(jogar);
		this.add(relatorio);
	}
	
	public JButton criarBotaoOpcao(String nome, ActionListener a) {
		JButton botao = new JButton(nome);
		botao.addActionListener(a);
		botao.setBackground(Color.white);
		return botao;
	}
	
	public String getText() {
		String s = "";
		s += nomeJogador +";";
		return s;
	}
}

