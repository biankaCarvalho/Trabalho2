package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Dados;
import java.io.File;

import controller.Jogador;
import controller.Partida;
import controller.Plano;

public class MostrarTabuleiro implements ActionListener {

	private Janela frame;
	private Jogador j;
	protected Partida partida;
	private PainelOpcoes po;

	public MostrarTabuleiro(Janela frame) {
		this.frame = frame;
		po = new PainelOpcoes(frame);
	}

	public void actionPerformed(ActionEvent arg0) {
		j = new Jogador();
		Dados d = new Dados();
		File f = new File("dados");
		d.escrever(j.getNome(), f);
		partida = new Partida(new PainelBotoes().listaCelulas);
		partida.iniciarPartida();
		frame.pontTabu.setVisible(true);
		frame.relatorio.setVisible(false);
	}
}
