package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Aluno {

	protected int posicaox;
	protected int posicaoy;
	protected int quantAluno = 5;
	protected int quantAlunosPegos = 0;
	protected Plano p;
	protected Random random = new Random();
	protected ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

	public Aluno(Plano p) {
		super();
		this.p = p;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(int linha, int coluna) {
		posicaox = linha;
		posicaoy = coluna;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPosicaoxAluno() {
		return posicaox;
	}

	public int getPosicaoyAluno() {
		return posicaoy;
	}

	public int getQuantAluno() {
		return quantAluno;
	}

	public int getQuantAlunosPegos() {
		return quantAlunosPegos;
	}


	public void encontrouAluno(Robo r) {
			quantAluno--;
			quantAlunosPegos++;
		
	}

}
