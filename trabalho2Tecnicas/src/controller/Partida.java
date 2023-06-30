package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {

	Plano p;
	Aluno aluno;
	Bug bug;
	Robo r;
	Celula celula;
	protected boolean partida;
	protected ArrayList<Celula> c;
	protected ArrayList<Robo> listaDeRobo;
	protected int rodada = 0;

	public Partida(ArrayList<Celula> c) {
		p = new Plano(8, 8);
		this.c = c;
		partida = true;
	}

	public boolean aindaTemAluno(Plano p) {
		for (int i = 1; i <= c.size(); i++) {
			for (int j = 1; j <= c.size(); j++) {
				Celula celula = new Celula(i, j);
				if (celula.possuiAluno()) {
					return true;
				}
			}
		}
		return false;
	}

	public Robo verificarVencedor(ArrayList<Robo> robos) {
		Robo vencedor = null;
		int pontuacaoMaxima = Integer.MIN_VALUE;

		for (Robo robo : robos) {
			int pontuacao = robo.getPontos();

			if (pontuacao > pontuacaoMaxima) {
				pontuacaoMaxima = pontuacao;
				vencedor = robo;
			} else {
				return null;
			}
		}

		return vencedor;
	}

	// iniciando a partida

	public void iniciarPartida() {
			rodada++;
			SortearPosicaoAB sortear = new SortearPosicaoAB(c);
			sortear.adicionarAlunosEBugs();
	}
	
	public int getRodada() {
		return rodada;
	}

}
