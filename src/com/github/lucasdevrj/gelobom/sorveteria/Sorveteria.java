package com.github.lucasdevrj.gelobom.sorveteria;

import java.util.Scanner;

import com.github.lucasdevrj.gelobom.cliente.Cliente;

public class Sorveteria {
	
	private String nome;
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagem() {
		Cliente cl = new Cliente();
		
		System.out.print("Digite seu nome: ");
		cl.setNome(entrada.next());
		
		System.out.println("\nOlá " + cl.getNome() + ", seja bem-vindo(a) a nossa sorveteria ");
	}
	
	public String getNome() {
		return nome;
	}
}
