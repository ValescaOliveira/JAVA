package br.com.fiap.main;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		// Metodo de execução
		// primeiro passo instanciar o objetos
		
		Cliente objetoCliente = new Cliente ();
		Endereco objetoEndereco = new Endereco (); 
		Carro objetoCarro = new Carro ();
		
		// Entradas
		//Cliente 
		objetoCliente.setNome("Sanrick");
		objetoCliente.setCpf("000000000000");
		objetoCliente.setIdade(31);
		
		//Endereço 
		objetoEndereco.setLogradouro("Avenida São João");
		objetoEndereco.setNumero(000);
		objetoEndereco.setComplemento("Galeria do Rock");
		objetoEndereco.setCep("00000-000");
		
		// Carro
		objetoCarro.setMarca("FIAT");
		objetoCarro.setAno(2023);
		objetoCarro.setKm(150);
		objetoCarro.setModelo("UNO");
		
		//Saída (OutPut)
		System.out.println("Nome: " + objetoCliente.getNome() + 
				"\n Idade: " + objetoCliente.getIdade());
		
		// Endereço
		System.out.println("Logradouro: " + objetoEndereco.getLogradouro());
		
		//Carro
		System.out.println("Marca: " + objetoCarro.getMarca() + 
				"\n Ano: " + objetoCarro.getAno());
	}

}
