package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Plano;
import controller.Robo;

public class BotoesRobos extends JButton implements ActionListener{

	private static Robo roboSelecionado;
	private JButton robo1;
	private JButton robo2;
	private JButton robo3;
	protected JPanel painelRobos = new JPanel();
	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;


	public BotoesRobos() {
		painelRobos.setBackground(Color.lightGray);
		painelRobos.setLayout(new FlowLayout());

		icon1 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050-removebg (2).png"));
		icon2 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050-removebg (1).png"));
		icon3 = new ImageIcon(getClass().getResource("/imgs/clubPenguinEspiao5050sembg.png"));
		
		robo1 = criarBotaoRobo(icon1);
		robo2 = criarBotaoRobo(icon2);
		robo3 = criarBotaoRobo(icon3);

		painelRobos.add(robo1);
		painelRobos.add(robo2);
		painelRobos.add(robo3);
	}
	
	private JButton criarBotaoRobo(ImageIcon icon) {
		JButton botao = new JButton();
		botao.setPreferredSize(new Dimension(52, 55));
		botao.setBackground(Color.white);
		botao.setIcon(icon);
		botao.addActionListener(this);
		return botao;
	}

	public void actionPerformed(ActionEvent e) {
		JButton botaoClicado = (JButton) e.getSource();
		if (botaoClicado == robo1) {
			roboSelecionado = new Robo();
			roboSelecionado.setIcon(icon1);
		} else if (botaoClicado == robo2) {
			roboSelecionado = new Robo();
			roboSelecionado.setIcon(icon2);
		} else if (botaoClicado == robo3) {
			roboSelecionado = new Robo();
			roboSelecionado.setIcon(icon3);
		}
	}
	
	public JPanel getPainelRobo() {
		return painelRobos;
	}

	public static Robo getRoboSelecionado() {
		return roboSelecionado;
	}

}
