package com.github.lucasdevrj.gelobom.sorveteria;

import java.util.Scanner;

import com.github.lucasdevrj.gelobom.cliente.Cliente;

public class Sorveteria {
	
	private String nome = "Gelo Bom";
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagem() {
		Cliente cl = new Cliente();
		
		System.out.print("Digite seu nome: ");
		cl.setNome(entrada.next());
		
		System.out.println("\nOl� " + cl.getNome() + ", seja bem-vindo(a) a nossa sorveteria " + this.getNome() + ".");
		
		exibeMenu();
	}
	
	public void exibeMenu() {
		System.out.println("Op��o 1 - Ver card�pio.");
		
		System.out.println("Escolha a op��o desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			
		case 1:
			veCardapio();
		}
	}
	
	public void veCardapio() {
		System.out.println("Op��o 1 - Sorvetes de Massa.");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			
		}
		
	}

	public String getNome() {
		return nome;
	}
}
