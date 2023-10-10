package br.com.fiap.beans;

public class Empresa {
	
	private String razaoSocial;
	private String email;
	private int unidade;
	private Endereco endereco;
	
	
	public Empresa() {
		super();
	}

	public Empresa(String razaoSocial, String email, int unidade) {
		super();
		this.razaoSocial = razaoSocial.toUpperCase();
		this.email = email.toLowerCase();
		this.unidade = unidade;
	
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getUnidade() {
		return unidade;
	}


	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

}
