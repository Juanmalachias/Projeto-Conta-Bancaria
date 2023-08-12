package Conta.repository;

import Conta.model.conta;

public interface ContaRepository {

	//CRUD DA CONTA
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(conta Conta);
	public void atualizar(conta Conta);
	public void deletar(int numero);
	
	
	//metodos Bancarios
	public void sacar(int numero,float valor);
	public void depositar(int numero,float valor);
	public void transferir(int numeroOrigem,int numeroDestino, float valor);
	void procurarPorNumero1(int numero);
}
