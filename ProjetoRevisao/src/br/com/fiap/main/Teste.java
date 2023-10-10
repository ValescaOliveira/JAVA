package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class Teste {
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog (j));
	}
	
	//double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		//Instanciar o objeto
		//String razaoSocial, String email, int unidade
		Empresa objEmpresa = new Empresa(JOptionPane.showInputDialog("Qual a razão social: "), 
				texto("Qual o e-mail: "),
				inteiro("Qual a unidade: "));
		
		
		//String logradouro, String cep, String bairro, int numero
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Qual o logradouro: "),
				texto("Qual o CEP: "),
				texto("Qual o bairro: "),
				inteiro("Qual o número: "));
		
		objEmpresa.setEndereco(objEndereco);
		
		//int codigo, String tipo, String marca, double valor
		Produto objProduto = new Produto(Integer.parseInt(JOptionPane.showInputDialog("Qual o código: ")),
				texto("Qual o tipo do produto: "),
				texto("Qual a marca do produto: "),
				real("Qual o valor do produto: "));

		
		//Saída
		System.out.println("Empresa: " + objEmpresa.getRazaoSocial() + 
				"\nEmail: " + objEmpresa.getEmail() + 
				"\nUnidade: " + objEmpresa.getUnidade() +
				"\nLogradouro: " + objEmpresa.getEndereco().getLogradouro() + 
				"\nCEP: " + objEmpresa.getEndereco().getCep() + 
				"\nBairro: " + objEmpresa.getEndereco().getBairro() + 
				"\nNúmero: " + objEmpresa.getEndereco().getNumero() + 
				"\n\nINFORMAÇÕES DO PRODUTO" + 
				"\nCódigo: " + objProduto.getCodigo() + 
				"\nTipo: " + objProduto.getTipo() + 
				"\nMarca: " + objProduto.getMarca() + 
				"\nValor: " + objProduto.getValor()
				);
		
	}

}
