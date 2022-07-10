package com.github.lucasdevrj.gelobom.sorvete;

public class Sorvete {

	private String tipo;
	private String sabor;
	private double litro;
	private float preco;
	
	public Sorvete(String tipo, String sabor, double litro, float preco) {
		this.tipo = tipo;
		this.sabor = sabor;
		this.litro = litro;
		this.preco = preco;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public double getLitro() {
		return litro;
	}
	
	public float getPreco() {
		return preco;
	}
}
