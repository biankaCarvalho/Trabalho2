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

	public Aluno(int quantAluno, Plano p) {
		super();
		this.quantAluno = quantAluno;
//		if (quantAluno <= p.listaDeCelulas.size() / 2) {
//			this.quantAluno = quantAluno;
//		}
	this.p = p;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
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

	public void sortearPosicaoAlunos(int numAlunos, ArrayList<Celula> listaCelulas) {
//		for (int i = 0; i < numAlunos; i++) {
//			int posX = random.nextInt(listaCelulas.size());
//			int posY = random.nextInt(listaCelulas.size());
//
//			Aluno aluno = new Aluno(numAlunos, new Plano(8,8));
//			posicaox = posX;
//			posicaoy = posY;
//			listaDeAlunos.add(aluno);
//
//			Celula celula = p.retornarCelula(posX, posY);
//			celula.setAluno(aluno);
			
			 for (int i = 0; i < 5; i++) {
		            int index = random.nextInt(listaCelulas.size());
		            Celula celula = listaCelulas.get(index);
		            celula.setAluno(new Aluno());
		        }
			}

	

	public void encontrouAluno(Robo r) {
		int x = r.getPosicaox();
		int y = r.getPosicaoy();
		Celula c = p.retornarCelula(x, y);
		if (c.possuiAluno()) {
		quantAluno--;
		quantAlunosPegos++;
		}
	}

}
