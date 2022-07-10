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
		
		System.out.println("\nOlá " + cl.getNome() + ", seja bem-vindo(a) a nossa sorveteria " + this.getNome() + ".\n");
		
		exibeMenu();
	}
	
	public void exibeMenu() {
		System.out.println("----------|MENU|----------");
		
		System.out.println("Opção 1 - Ver cardápio.");
		System.out.println("Opção 2 - Comprar.");
		
		System.out.print("Escolha a opção desejada: ");
		int opcao = entrada.nextInt();
		
		System.out.println("---------------------------");
		
		switch (opcao) {
			
		case 1:
			veCardapio();
		break;
		
		case 0:
			finalizaPrograma();
		}
	}

	public void veCardapio() {
		System.out.println("----------|CARDÁPIO|----------");
		
		System.out.println("Opção 1 - Sorvetes de Massa.");
		System.out.println("Opção 2 - Picolé.");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Sabores disponíveis:");
			System.out.println("1 - Morango");
			System.out.println("2 - Chocolate");
			System.out.println("3 - Uva");
			
			System.out.println("Deseja adicionar na sexta ou não?\n1 - Sim.\n2 - Voltar.");
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o sabor desejado: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					Sorvete svm = new Sorvete("Massa", "Morango", 1.0, 12.00f);
					this.getSorvetes().add(svm);
					veCardapio();
					
				} else if (opcao == 2) {
					
				}
			}
			
		}
		System.out.println("------------------------------");
		
		exibeMenu();
	}
	
	public void finalizaPrograma() {
		System.out.println("Compra(s) efetuada(s).");
		for (int i = 0; i < this.getSorvetes().size(); i++) {
			System.out.println("Compra realizada com sucesso!");
			System.out.println("Tipo: " + this.getSorvetes().get(i).getTipo());
			System.out.println("Sabor: " + this.getSorvetes().get(i).getSabor());
			System.out.println("Quantidade: " + this.getSorvetes().get(i).getLitro());
			System.out.println("Preço: " + this.getSorvetes().get(i).getPreco());
		}
	}

	public String getNome() {
		return nome;
	}
	
	public ArrayList<Sorvete> getSorvetes() {
		return sorvetes;
	}
}
