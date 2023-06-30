package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import controller.Jogador;

public class Dados {

	public void escrever(String mensagem, File file) {
		FileWriter arquivo;
		try {
			arquivo = new FileWriter(file, true);
			arquivo.write(mensagem);
			arquivo.close();
		} catch (Exception e) {
		}
	}

}
