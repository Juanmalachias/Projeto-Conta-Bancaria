package Conta.controller;

import java.util.ArrayList;


import Conta.model.conta;
import Conta.repository.ContaRepository;


public class ContaController implements ContaRepository{

	private ArrayList<conta> listaContas = new ArrayList<conta>();
	int numero = 0;
	
	

	

	@Override
	public void cadastrar(conta Conta) {
		// TODO Auto-generated method stub
		listaContas.add(Conta);
		System.out.println("\nA Conta número: "+Conta.getNumero()+" foi criada com sucesso!");
	}

	@Override
	public void atualizar(conta Conta) {
		// TODO Auto-generated method stub
		var buscaConta = buscarNaCollection(Conta.getNumero());
		
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta),Conta);
			System.out.println("\nA conta numero: "+Conta.getNumero()+" foi atualizada com sucesso!");
		}else 
			System.out.println("\nA conta numero: "+Conta.getNumero()+" não foi atualizada!");
		
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);
		
		if (conta !=null) {
			if(listaContas.remove(conta)==true)
				System.out.println("\nA conta numero: "+numero+" foi deletada com sucesso!");
		}else 
			System.out.println("\nA conta numero: "+ numero+" não foi encontrada!");
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);
		if (conta!=null) {
			if (conta.sacar(valor)==true)
				System.out.println("\nO saque da conta numero: "+numero+" foi efetuado com sucesso!");
		}else
			System.out.println("\nA conta de numero: "+numero+" não foi encontrada!");
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);
		
		if (conta!=null) {
			conta.depositar(valor);
			System.out.println("\nO depósito na conta de numero "+numero+" foi efetuado com sucesso");
		}else
			System.out.println("\nA conta de numero: "+numero+" não foi encontrada ou a conta não é uma conta corrente!");
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		var contaOringem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOringem != null && contaDestino != null) {
			if (contaOringem.sacar(valor)==true) {
				contaDestino.depositar(valor);
				System.out.println("\nA transferencia foi efetuada com sucesso!");
			}
		}else 
			System.out.println("\nA conta de origem e/ou destino não foram encontradas");
	}
	
	@Override
	public void listarTodas() {
		for(var conta : listaContas) {
			conta.visualizar();
		}
	}
	
	public int gerarNumero() {
		return ++numero;
	}
	
	public conta buscarNaCollection(int numero) {
		for (var conta : 	listaContas) {
			if (conta.getNumero()== numero) {
				return conta;
			}
		}
		return null;
	}
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) 
			conta.visualizar();
		else 
			System.out.println("\nA Conta número: "+numero+" não foi encontrada!");
	}

	@Override
	public void procurarPorNumero1(int numero) {
		// TODO Auto-generated method stub
		
	}
	public int retornaTipo (int numero) {
		for (var conta : listaContas) {
			if( conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return 0;
	}
		
}
