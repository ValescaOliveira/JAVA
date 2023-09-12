package br.com.fiap.beans;

public class Carro {
	
	// Visibilida, tipo de dado e variaveis
	private String marca;
	private String modelo;
	private int ano;
	private double km;
	
	
	//Setters (entrada) e Gatters (Exibir)
	
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	} 
	
	

}
