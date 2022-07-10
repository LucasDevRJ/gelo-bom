package com.github.lucasdevrj.gelobom.sorveteria;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.gelobom.cliente.Cliente;
import com.github.lucasdevrj.gelobom.sorvete.Sorvete;

public class Sorveteria {
	
	private String nome = "Gelo Bom";
	private ArrayList<Sorvete> sorvetes = new ArrayList<Sorvete>();
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagem() {
		Cliente cl = new Cliente();
		
		System.out.print("Digite seu nome: ");
		cl.setNome(entrada.next());
		
		System.out.println("\nOl� " + cl.getNome() + ", seja bem-vindo(a) a nossa sorveteria " + this.getNome() + ".\n");
		
		exibeMenu();
	}
	
	public void exibeMenu() {
		System.out.println("----------|MENU|----------");
		
		System.out.println("Op��o 1 - Ver card�pio.");
		
		System.out.print("Escolha a op��o desejada: ");
		int opcao = entrada.nextInt();
		
		System.out.println("---------------------------");
		
		switch (opcao) {
			
		case 1:
			veCardapio();
		}
	}
	
	public void veCardapio() {
		System.out.println("----------|CARD�PIO|----------");
		
		System.out.println("Op��o 1 - Sorvetes de Massa.");
		System.out.println("Op��o 2 - Sorvete Artesanal.");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Sabores dispon�veis:");
			System.out.println("1 - Morango");
			System.out.println("2 - Chocolate");
			System.out.println("3 - Uva");
			
			System.out.println("Deseja comprar ou n�o?\n1 - Sim.\n2 - Voltar.");
			int escolha = entrada.nextInt();
			
			if (escolha == 1) {
				System.out.println("");
			} else {
				exibeMenu();
			}
			
		}
		System.out.println("------------------------------");
		
		exibeMenu();
	}

	public String getNome() {
		return nome;
	}
	
	public ArrayList<Sorvete> getSorvetes() {
		return sorvetes;
	}
}
