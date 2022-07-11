package com.github.lucasdevrj.gelobom.sorveteria;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.gelobom.cliente.Cliente;
import com.github.lucasdevrj.gelobom.sorvete.Sorvete;

public class Sorveteria {
	
	private String nome = "Gelo Bom";
	private ArrayList<Sorvete> sorvetes = new ArrayList<Sorvete>();
	private float precoTotal;
	
	
	Cliente cl = new Cliente();
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagem() {
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
		
		System.out.println("---------------------------\n");
		
		switch (opcao) {
			
		case 1:
			veCardapio();
		break;
		
		case 2:
			compraSorvete();
		}
	}

	public void veCardapio() {
		System.out.println("----------|CARDÁPIO|----------");
		
		System.out.println("Opção 1 - Sorvetes de massa.");
		System.out.println("Opção 2 - Picolé.");
		System.out.println("Opção 3 - Voltar para o menu principal.\n");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		System.out.println();
		
		switch (opcao) {
		case 1:
			System.out.println("Sabores disponíveis:");
			System.out.println("1 - Morango.");
			System.out.println("2 - Chocolate.");
			System.out.println("3 - Uva.\n");
			
			System.out.print("Digite 1 para adicionar o sorvete na sexta ou 2 para voltar: ");
			opcao = entrada.nextInt();
			
			System.out.println();
			
			if (opcao == 1) {
				System.out.print("Digite o sabor desejado: ");
				opcao = entrada.nextInt();
				
				System.out.println();
				
				if (opcao == 1) {
					Sorvete svm = new Sorvete("Massa", "Morango", 1.0, 12.00f);
					this.getSorvetes().add(svm);
					System.out.println("\nSorvete colocado na sexta!");
					this.precoTotal += svm.getPreco();
					veCardapio();
					
				} else if (opcao == 2) {
					Sorvete svm = new Sorvete("Massa", "Chocolate", 1.0, 14.00f);
					this.getSorvetes().add(svm);
					System.out.println("\nSorvete colocado na sexta!");
					this.precoTotal += svm.getPreco();
					veCardapio();
					
				} else if (opcao == 3) {
					Sorvete svm = new Sorvete("Massa", "Uva", 1.0, 13.00f);
					this.getSorvetes().add(svm);
					System.out.println("\nSorvete colocado na sexta!");
					this.precoTotal += svm.getPreco();
					veCardapio();
					
				} else {
					System.out.println("Opção inválida!");
					veCardapio();
				}
				
			} else if (opcao == 2){
				veCardapio();
			}
			
		case 2:
			System.out.println("Sabores disponíveis:");
			System.out.println("1 - Manga.");
			System.out.println("2 - Limão.");
			System.out.println("3 - Cereja.\n");
			
			System.out.print("Digite 1 para adicionar o picolé na sexta ou 2 para voltar: ");
			opcao = entrada.nextInt();
			
			System.out.println();
			
			if (opcao == 1) {
				System.out.print("Digite o sabor desejado: ");
				opcao = entrada.nextInt();
				
				System.out.println();
				
				if (opcao == 1) {
					Sorvete svp = new Sorvete("Picolé", "Manga", 0.100, 4.00f);
					this.getSorvetes().add(svp);
					System.out.println("\nPicolé colocado na sexta!");
					this.precoTotal += svp.getPreco();
					veCardapio();
					
				} else if (opcao == 2) {
					Sorvete svp = new Sorvete("Picolé", "Limão", 0.100, 4.00f);
					this.getSorvetes().add(svp);
					System.out.println("\nPicolé colocado na sexta!");
					this.precoTotal += svp.getPreco();
					veCardapio();
					
				} else if (opcao == 3) {
					Sorvete svp = new Sorvete("Picolé", "Cereja", 0.100, 4.00f);
					this.getSorvetes().add(svp);
					System.out.println("\nPicolé colocado na sexta!");
					this.precoTotal += svp.getPreco();
					veCardapio();
					
				} else {
					System.out.println("Opção inválida!");
					veCardapio();
				}
			}
			
		case 3:
			exibeMenu();
		}
		
		System.out.println("\n------------------------------\n");
		
		exibeMenu();
	}
	
	public void compraSorvete() {
		if (this.getSorvetes().size() < -1) {
			
			System.out.println("----------|Extrato|----------");
			System.out.println("Deseja CPF na nota?");
			System.out.println("1 - Sim.");
			System.out.println("2 - Não.");
			System.out.print("Digite sua opção: ");
			int opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.print("Digite seu CPF: ");
				cl.setCpf(entrada.next());
				
				while (cl.getCpf().length() != 11) {
					System.out.println("Digite somente 11 digitos, sem pontos e hífen!");
					System.out.print("Digite seu CPF: ");
					cl.setCpf(entrada.next());
				}
			}
			
			System.out.println("Opção 1 - Pagar com cartão.");
			System.out.println("Opção 2 - Pagar com dinheiro.");
			System.out.print("Digite sua opção: ");
			opcao = entrada.nextInt();
			
			if (opcao == 2) {
				System.out.println("Digite o valor em dinheiro: ");
				float valor = entrada.nextFloat();
				
				if (this.getPrecoTotal() < valor) {
					valor -= this.getPrecoTotal();
					for (int i = 0; i < this.getSorvetes().size(); i++) {
						System.out.println("Tipo: " + this.getSorvetes().get(i).getTipo());
						System.out.println("Sabor: " + this.getSorvetes().get(i).getSabor());
						System.out.printf("Quantidade: %.3f", this.getSorvetes().get(i).getLitro());
						System.out.printf("\nPreço: R$ %.2f", this.getSorvetes().get(i).getPreco());
						System.out.printf("\nTroco: R$ ", valor);
					}
				}
			}
			
			System.out.println("\nCompra(s) efetuada(s).");
			for (int i = 0; i < this.getSorvetes().size(); i++) {
				System.out.println("Tipo: " + this.getSorvetes().get(i).getTipo());
				System.out.println("Sabor: " + this.getSorvetes().get(i).getSabor());
				System.out.printf("Quantidade: %.3f", this.getSorvetes().get(i).getLitro());
				System.out.printf("\nPreço: %.2f", this.getSorvetes().get(i).getPreco());
				System.out.println();
			}
			
			System.out.printf("Valor total: %.2f", this.getPrecoTotal());
			
			System.out.println("\n-----------------------------");
			
		} else {
			System.out.println("\nColoque sorvetes na sexta para poder compra-los!");
			exibeMenu();
		}
	}

	public String getNome() {
		return nome;
	}
	
	public ArrayList<Sorvete> getSorvetes() {
		return sorvetes;
	}
	
	public float getPrecoTotal() {
		return precoTotal;
	}
}
