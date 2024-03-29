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
		
		System.out.println("\nOl� " + cl.getNome() + ", seja bem-vindo(a) a nossa sorveteria " + this.getNome() + ".\n");
		
		exibeMenu();
	}
	
	public void exibeMenu() {
		System.out.println("----------|MENU|----------");
		
		System.out.println("Op��o 1 - Ver card�pio.");
		System.out.println("Op��o 2 - Comprar.");
		System.out.println("Op��o 3 - Sair.");
		
		System.out.print("Escolha a op��o desejada: ");
		
		int opcao = entrada.nextInt();
		
		System.out.println("---------------------------\n");
		
		switch (opcao) {
			
		case 1:
			veCardapio();
		break;
		
		case 2:
			compraSorvete();
		break;
		
		case 3:
			fecharPrograma();
		break;
			
		default:
			System.out.println("Op��o inv�lida!\n");
			exibeMenu();
		}
	}

	public void veCardapio() {
		System.out.println("----------|CARD�PIO|----------");
		
		System.out.println("Op��o 1 - Sorvetes de massa.");
		System.out.println("Op��o 2 - Picol�.");
		System.out.println("Op��o 3 - Voltar para o menu principal.\n");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			System.out.println("\nSabores dispon�veis:");
			System.out.println("1 - Morango.");
			System.out.println("2 - Chocolate.");
			System.out.println("3 - Uva.\n");
			
			System.out.print("Deseja adicionar o sorvete na sexta?\n");
			System.out.println("Op��o 1 - Adicionar.");
			System.out.println("Op��o 2 - Voltar.");
			System.out.print("\nDigite sua op��o: ");
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				
				System.out.print("\nDigite o sabor desejado: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					Sorvete svm = new Sorvete("Massa", "Morango", 1.0, 12.00f);
					this.getSorvetes().add(svm);
					System.out.println("\nSorvete colocado na sexta!\n");
					this.precoTotal += svm.getPreco();
					veCardapio();
					
				} else if (opcao == 2) {
					Sorvete svm = new Sorvete("Massa", "Chocolate", 1.0, 14.00f);
					this.getSorvetes().add(svm);
					System.out.println("\nSorvete colocado na sexta!\n");
					this.precoTotal += svm.getPreco();
					veCardapio();
					
				} else if (opcao == 3) {
					Sorvete svm = new Sorvete("Massa", "Uva", 1.0, 13.00f);
					this.getSorvetes().add(svm);
					System.out.println("\nSorvete colocado na sexta!\n");
					this.precoTotal += svm.getPreco();
					veCardapio();
					
				} else {
					System.out.println("Op��o inv�lida!");
					veCardapio();
				}
				
			} else if (opcao == 2) {
				System.out.println("Voltando...");
				exibeMenu();
			}
			
		} else if (opcao == 2) {
			
			System.out.println("\nSabores dispon�veis:");
			System.out.println("1 - Manga.");
			System.out.println("2 - Lim�o.");
			System.out.println("3 - Cereja.\n");
			
			System.out.print("Deseja adicionar o sorvete na sexta?\n");
			System.out.println("Op��o 1 - Adicionar.");
			System.out.println("Op��o 2 - Voltar.");
			System.out.print("\nDigite sua op��o: ");
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				
				System.out.print("\nDigite o sabor desejado: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					Sorvete svp = new Sorvete("Picol�", "Manga", 0.100, 4.00f);
					this.getSorvetes().add(svp);
					System.out.println("\nPicol� colocado na sexta!\n");
					this.precoTotal += svp.getPreco();
					veCardapio();
					
				} else if (opcao == 2) {
					Sorvete svp = new Sorvete("Picol�", "Lim�o", 0.100, 4.00f);
					this.getSorvetes().add(svp);
					System.out.println("\nPicol� colocado na sexta!\n");
					this.precoTotal += svp.getPreco();
					veCardapio();
					
				} else if (opcao == 3) {
					Sorvete svp = new Sorvete("Picol�", "Cereja", 0.100, 4.00f);
					this.getSorvetes().add(svp);
					System.out.println("\nPicol� colocado na sexta!\n");
					this.precoTotal += svp.getPreco();
					veCardapio();
					
				} else {
					System.out.println("Op��o inv�lida!");
					veCardapio();
				}
				
			} else if (opcao == 2) {
				System.out.println("Voltando...");
				exibeMenu();
			}
			
		} else if (opcao == 3) {
			System.out.println("Voltando...\n");
			exibeMenu();
		}
	}
	
	public void compraSorvete() {
		if (this.getSorvetes().size() > 0) {
			
			System.out.println("Deseja CPF na nota?");
			System.out.println("1 - Sim.");
			System.out.println("2 - N�o.");
			System.out.print("Digite sua op��o: ");
			int opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.print("\nDigite seu CPF: ");
				cl.setCpf(entrada.next());
				
				while (cl.getCpf().length() != 11) {
					System.out.println("\nDigite somente 11 digitos, sem pontos e h�fen!");
					System.out.print("Digite seu CPF: ");
					cl.setCpf(entrada.next());
				}
			}
			
			System.out.println("\nOp��o 1 - Pagar com cart�o.");
			System.out.println("Op��o 2 - Pagar com dinheiro.");
			System.out.print("Digite sua op��o: ");
			opcao = entrada.nextInt();
			
			if (opcao == 2) {
				System.out.print("\nDigite o valor em dinheiro: ");
				float valor = entrada.nextFloat();
				
				if (this.getPrecoTotal() <= valor) {
					float valorDado = valor;
					valor -= this.getPrecoTotal();
					System.out.println("\nCompra(s) efetuada(s).");
					System.out.println("----------|Extrato|----------");
					
					for (int i = 0; i < this.getSorvetes().size(); i++) {
						System.out.println("Tipo: " + this.getSorvetes().get(i).getTipo());
						System.out.println("Sabor: " + this.getSorvetes().get(i).getSabor());
						if (sorvetes.get(i).getLitro() >= 1.00) {
							System.out.printf("Quantidade: %.3f litro(s).", this.getSorvetes().get(i).getLitro());
						} else {
							System.out.printf("Quantidade: %.3f mililitro(s).", this.getSorvetes().get(i).getLitro());
						}
						System.out.printf("\nPre�o: R$ %.2f", this.getSorvetes().get(i).getPreco());
						System.out.println();
					} 
					
					
					if (cl.getCpf() != null && !cl.getCpf().isEmpty()) {
						System.out.printf("\nPre�o total: R$ %.2f", this.getPrecoTotal());
						System.out.printf("\nValor dado: R$ %.2f", valorDado);
						System.out.printf("\nTroco: R$ %.2f", valor);
						System.out.println("\nCPF: " + cl.getCpf());
						System.out.println();
						this.getSorvetes().clear();
						this.precoTotal = 0;
						exibeMenu();
					} else {
						System.out.printf("\nPre�o total: R$ %.2f", this.getPrecoTotal());
						System.out.printf("\nValor dado: R$ %.2f", valorDado);
						System.out.printf("\nTroco: R$ %.2f", valor);
						System.out.println();
						this.precoTotal = 0;
						this.getSorvetes().clear();
						exibeMenu();
					}
				} else {
					System.out.println("\nValor dado � insufici�nte para realizar a(s) compra(s).\n");
					exibeMenu();
				}
			} else if (opcao == 1) {
				
				System.out.println("\nCompra(s) efetuada(s).");
				for (int i = 0; i < this.getSorvetes().size(); i++) {
					System.out.println("Tipo: " + this.getSorvetes().get(i).getTipo());
					System.out.println("Sabor: " + this.getSorvetes().get(i).getSabor());
					if (sorvetes.get(i).getLitro() >= 1.00) {
						System.out.printf("Quantidade: %.3f litro(s).", this.getSorvetes().get(i).getLitro());
					} else {
						System.out.printf("Quantidade: %.3f mililitro(s).", this.getSorvetes().get(i).getLitro());
					}
					System.out.printf("\nPre�o: %.2f", this.getSorvetes().get(i).getPreco());
					System.out.println();
				}
				
				System.out.printf("\nPre�o total: R$ %.2f", this.getPrecoTotal());
				
				System.out.println("\n-----------------------------");
				exibeMenu();
			}
		} else {
			System.out.println("Coloque sorvetes na sexta para poder compra-los!\n");
			exibeMenu();
		}
	}
	
	public void fecharPrograma() {
		System.out.println("Tchau, tchau " + cl.getNome() + " e volte sempre!");
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
