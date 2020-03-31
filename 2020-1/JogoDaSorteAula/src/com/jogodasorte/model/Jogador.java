package com.jogodasorte.model;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private int numeroDaSorte;
	private double saldo;

	public Jogador() {
		perguntarNomeJogador();
		perguntarNumeroDaSorte();
	}

	//- Perguntar o nome
	//- Salvar o nome (em algum lugar) -> num objeto da classe Jogador
	
	/*
	 * M�todo para perguntar e salvar o nome do jogador
	 * args []
	 * return void
	 * 	 * */
	public void perguntarNomeJogador() {
		String nomeTemp;
		nomeTemp = JOptionPane.showInputDialog(null, "Digite o nome do primeiro jogador", "Cadastro de jogador", JOptionPane.QUESTION_MESSAGE);
		nome = nomeTemp;
	}
	
	//- Perguntar o n�mero da sorte do jogador
	//- Salvar o n�mero da sorte (em algum lugar)
	/*
	 * M�todo para perguntar e salvar o n�mero da sorte
	 * args []
	 * return void
	 * 	 * */
	public void perguntarNumeroDaSorte() {
		String tmp;
		tmp = JOptionPane.showInputDialog(null, "Digite o seu n�mero da sorte!$!\n (Entre 1 e 5)", "Cadastro de n�mero da sorte", JOptionPane.QUESTION_MESSAGE);
		
		// String -> Integer.parseInt() -> int
		numeroDaSorte = Integer.parseInt(tmp);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double v) {
		saldo = v;
	}
	
	public int getNumeroDaSorte() {
		return numeroDaSorte;
	}
	
	public boolean podeJogar(double valorEsperado) {
	/*
		 if(saldo >= valorEsperado)
			return true;
		else
			return false;
	*/
		return saldo >= valorEsperado;
	}
	
	
}
