package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.Aluno;
import controller.Bug;
import controller.Celula;
import controller.Jogador;
import controller.Partida;
import controller.Pontuacao;

public class PainelRelatorio extends JPanel{
	
	private JPanel painelFundo;
	private JTable tabela;
	private JScrollPane barraRolagem;
	public Partida p;
	private PainelBotoes pb;
	ArrayList<Celula> celula;

	public PainelRelatorio() {
		pb = new PainelBotoes();
		celula = pb.listaCelulas;
		painelFundo = new JPanel();
		painelFundo.setLayout(new GridLayout(1, 1));
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		painelFundo.add(barraRolagem);

		this.add(painelFundo);
	}

	Object[][] dados = { { new Jogador().getNome(), new Partida(celula).getRodada(), "Cel vazias", new Pontuacao().pontuacaoGeral(),  new Aluno().getQuantAlunosPegos(), new Bug().getQuantBugPego() },

	};

	String[] colunas = { "Jogador", "Quant Rodadas", "Cel. Vazias", "Pontuação", "Alunos Resgatados", "Bugs Encontrados" };

}


