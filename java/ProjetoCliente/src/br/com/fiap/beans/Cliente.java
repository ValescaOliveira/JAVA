package br.com.fiap.beans;

public class Cliente {
	
	// comentário: Visibilidade, tipo de dado e variavel
	
	private String nome;
	private String cpf;
	private int idade;
	private double mensalidade;
	private Endereco endereco;
	
	public String getNome() {
		
	// Setters (Entrada - imput) e Getters (Resposável por exibir - output)
		
	return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	// void não retorna nada. 

	
	
}
