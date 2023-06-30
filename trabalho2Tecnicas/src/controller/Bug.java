package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bug {

	protected int posicaox;
	protected int posicaoy;
	protected Random random = new Random();
	protected int quantBug = 7;
	protected int quantBugPegos = 0;
	protected Plano plano;
	protected ArrayList<Bug> listaDeBugs = new ArrayList<Bug>();
	protected Celula c;
	
	public Bug(Plano p) {
		this.plano = p;
	}

	public Bug() {
		// TODO Auto-generated constructor stub
	}

	public Bug(int linha, int coluna) {
		posicaox = linha;
		posicaoy = coluna;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPosicaoxBug() {
		return posicaox;
	}

	public int getPosicaoyBug() {
		return posicaoy;
	}
	
	public int getQuantBug() {
		return quantBug;
	}
	
	public int getQuantBugPego() {
		return quantBugPegos;
	}
	
	public void encontrouBug(Robo r) {
			quantBug--;
			quantBugPegos++;
			
	}
	
}
