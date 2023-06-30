package controller;

public class Pontuacao {

	protected Aluno aluno;
	protected Bug bug;

	private int pontuacaoR1;
	private int pontuacaoR2;
	private int pontuacaoR3;

	public Pontuacao() {

	}

	public void setpontuacaoRobo1(Celula c) {
		if (c.possuiAluno())
			pontuacaoR1 += 10;
		else if (c.possuiBug())
			pontuacaoR1 -= 15;
	}

	public void setpontuacaoRobo2(Celula c) {
		if (c.possuiAluno())
			pontuacaoR2 += 10;
		else if (c.possuiBug())
			pontuacaoR2 -= 15;
	}

	public void setpontuacaoRobo3(Celula c) {
		if (c.possuiAluno())
			pontuacaoR3 += 10;
		else if (c.possuiBug())
			pontuacaoR3 -= 15;
	}

	public int getPontuacaoR1() {
		return pontuacaoR1;
	}

	public int getPontuacaoR2() {
		return pontuacaoR2;
	}

	public int getPontuacaoR3() {
		return pontuacaoR3;
	}

	public int pontuacaoGeral() {
		int pontGeral;
		pontGeral = pontuacaoR1 + pontuacaoR2 + pontuacaoR3;
		return pontGeral;
	}

}
