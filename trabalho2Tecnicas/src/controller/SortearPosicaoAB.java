package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortearPosicaoAB {

	private ArrayList<Celula> listaCelulas;
	private ArrayList<String> posicoesOcupadas;
	private ArrayList<Aluno> alunos;
	private ArrayList<Bug> bugs;
	private int quantAluno = 5, quantBug = 7, linhas, colunas;
	private Plano p;

	public SortearPosicaoAB(ArrayList<Celula> c) {
		this.posicoesOcupadas = new ArrayList<>();
		this.alunos = new ArrayList<>();
		this.bugs = new ArrayList<>();
		linhas = 8;
		colunas = 8;
	}

	public void adicionarAlunosEBugs() {
		sorteio(alunos, quantAluno);
		sorteio(bugs, quantBug);
	}

	private void sorteio(List<?> lista, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			int linha, coluna;
			do {
				linha = new Random().nextInt(linhas);
				coluna = new Random().nextInt(colunas);
			} while (posicoesOcupadas.contains(linha + "," + coluna));

			if (lista == alunos) {
				alunos.add(new Aluno(linha, coluna));
			} else if (lista == bugs) {
				bugs.add(new Bug(linha, coluna));
			}
		}
	}
	
	public boolean verificaAluno(int linha, int coluna) {
		for (Aluno aluno : alunos) {
			if (aluno.getPosicaoyAluno() == linha && aluno.getPosicaoxAluno() == coluna) {
				return true;
			}
		}
		return false;
	}

	public boolean verificaBug(int linha, int coluna) {
		for (Bug bug : bugs) {
			if (bug.getPosicaoyBug() == linha && bug.getPosicaoxBug() == coluna) {
				return true;
			}
		}
		return false;
	}
}
