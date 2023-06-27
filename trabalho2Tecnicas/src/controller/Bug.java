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
	protected ArrayList<Bug> listaDeBugs = new ArrayList<Bug>();
	protected Celula c;
	
	public Bug(int quantBug) {
		this.quantBug = quantBug;
	}

	public Bug() {
		// TODO Auto-generated constructor stub
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
	
	public void sortearPosicaoBug(int numBugs, ArrayList<Celula> listaCelulas) {
//	    for (int i = 0; i < numBugs; i++) {
//	        int posX = random.nextInt(listaCelulas.size());
//	        int posY = random.nextInt(listaCelulas.size());
//
//	        Bug bug = new Bug(numBugs);
//	        posicaox = posX;
//	        posicaoy = posY;
//	        listaDeBugs.add(bug);
//	        Plano p = new Plano(8, 8);
//	        Celula celula = p.retornarCelula(posX, posY);
//	        celula.setBug(bug);
	    	for (int i = 0; i < 7; i++) {
	            int index = random.nextInt(listaCelulas.size());
	            Celula celula = listaCelulas.get(index);
	            celula.setBug(new Bug());
	        }
	    }

	
	public void encontrouBug(Robo r) {
		int x = r.getPosicaox();
		int y = r.getPosicaoy();
		Plano p = new Plano(8, 8);
		Celula c = p.retornarCelula(x, y);
		if (c.possuiBug()) {
			quantBug--;
			quantBugPegos++;
		}
	}
	
}
