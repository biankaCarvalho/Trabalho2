package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Dados;
import java.io.File;

import controller.Partida;
import controller.Plano;

public class MostrarTabuleiro implements ActionListener{
	
	private Janela frame;
	private PainelOpcoes po;
	protected Partida partida;
	
	public MostrarTabuleiro (Janela frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent arg0) {
		po = new PainelOpcoes(frame);
		Dados d = new Dados();
		File f = new File("dados");
		d.escrever(po.getText(), f);
		partida = new Partida(new PainelBotoes().listaCelulas);
		Plano p = new Plano(8,8);
		partida.iniciarPartida(p);
		frame.pontTabu.setVisible(true);
		frame.relatorio.setVisible(false);
	}
}
