package Conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Conta.controller.ContaController;
import Conta.util.Cores;
import Conta.model.ContaCorrente;
import Conta.model.ContaPoupança;

public class Menu {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ContaController Conta = new ContaController();
		
		
		
		
		Scanner ler = new Scanner(System.in);
		int opçao, numero, agencia, tipo, aniversario,numeroDestino;
		String titular;
		float saldo, limite,valor;
		
		System.out.println("\nCriar Conta\n");
		
		ContaCorrente cc1 = new ContaCorrente(Conta.gerarNumero(),123,1,"João da Silva", 1000f,100.0f);
		Conta.cadastrar(cc1);
		ContaCorrente cc2 = new ContaCorrente(Conta.gerarNumero(),124,1,"Maria Souza", 2000f,100.0f);
		Conta.cadastrar(cc2);
		ContaPoupança cp1 = new ContaPoupança(Conta.gerarNumero(),125,2,"Mariana Fernandez", 4000f,12);
		Conta.cadastrar(cp1);
		ContaPoupança cp2 = new ContaPoupança(Conta.gerarNumero(),125,2,"Juliana Lima", 8000f,12);
		Conta.cadastrar(cp2);
		
		
		Conta.listarTodas();
		
		while (true ){
		System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND);
		System.out.print("===============================================================");
		System.out.println("\n|                                                             |");
		System.out.println("|                     ▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂                    |");
		System.out.println("|                       Innovex Capital                       |");
		System.out.println("|                     ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔                    |");
		System.out.println("|                                                             |");
		System.out.println("===============================================================");
		System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_WHITE_BACKGROUND +
                           "===============================================================");
		System.out.println("|                                                             |");
		System.out.println("|        1 - Criar Conta                                      |");
		System.out.println("|        2 - Listar Todas as Contas                           |");
		System.out.println("|        3 - Buscar Contar por Numero                         |");
		System.out.println("|        4 - Atualizar Dados da Conta                         |");
		System.out.println("|        5 - Apagar Conta                                     |");
		System.out.println("|        6 - Sacar                                            |");
		System.out.println("|        7 - Depositar                                        |");
		System.out.println("|        8 - Transferir Valores                               |");
		System.out.println("|        9 - Sair                                             |");
		System.out.println("|                                                             |");
		System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND+"===============================================================");
		System.out.println("|                  Entre com a opção desejada                 |");
		System.out.println("===============================================================");
		System.out.println("|                                                             |"+Cores.TEXT_RESET);
		try {
		opçao = ler.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("\nDigite valores inteiros!");
			ler.nextLine();
			opçao=0;
		}
		if (opçao ==9) {
			System.out.println(Cores.TEXT_YELLOW_BOLD +Cores.ANSI_BLACK_BACKGROUND+"===============================================================");
			System.out.println("|                                                             |");
			System.out.println(Cores.TEXT_YELLOW_BOLD +"|                       Innovex Capital                       |");
			System.out.println(Cores.TEXT_YELLOW_BOLD +"|                  O seu Futuro Começa aqui!                  |");
			System.out.println("|                                                             |");
			System.out.println("===============================================================");
			ler.close();
			System.exit(0);
		}
		switch(opçao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Criar Conta\n\n");
			
			System.out.println("Digite o Numero da Agência: ");
			agencia = ler.nextInt();
			System.out.println("Digite o nome do titular da conta: ");
			ler.skip("\\R?");
			titular = ler.nextLine();
			
			do {
				System.out.println("Digite o Tipo de Conta (1-CC OU 2 CP): ");
				tipo = ler.nextInt();	
			}while (tipo < 1 && tipo > 2);
			
			System.out.println("Digite o Saldo da Conta (R$): ");
			saldo = ler.nextFloat();
			
			switch(tipo) {
			case 1 -> {
				System.out.println("Digite o limite de Crédito (R$): ");
				limite = ler.nextFloat();
				Conta.cadastrar(new ContaCorrente(Conta.gerarNumero(),agencia,tipo, titular,saldo,limite));
			}
			case 2 -> {
				System.out.println("Digite o dia do Aniversario da conta: ");
				aniversario = ler.nextInt();
				Conta.cadastrar(new ContaPoupança(Conta.gerarNumero(),agencia,tipo, titular,saldo,aniversario));
			}
			}
			
			keyPress();
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Listar Todas as Contas\n\n");
			Conta.listarTodas();
			keyPress();
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Buscar Contar por Numero\n\n");
			
			System.out.println("Digitar o numero da conta: ");
			numero = ler.nextInt();
			
				Conta.procurarPorNumero(numero);
			
			keyPress();
			break;
		case 4:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar Dados da Conta\n\n");
			
			System.out.println("Digite o número da conta: ");
			numero = ler.nextInt();
			
			if (Conta.buscarNaCollection(numero)!=null) {
				System.out.println("Digite o numero da agência: ");
				agencia = ler.nextInt();
				System.out.println("Digite o nome do titular: ");
				titular = ler.nextLine();
				
				System.out.println("Digite o saldo da conta (R$): ");
				saldo = ler.nextFloat();
				
				tipo = Conta.retornaTipo(numero);
				
				switch(tipo) {
				case 1 -> {System.out.println("Digite o limite de crédito (R$):");
				limite = ler.nextFloat();
				Conta.atualizar(new ContaCorrente(numero,agencia,tipo,titular,saldo,limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da conta: ");
					aniversario = ler.nextInt();
					Conta.cadastrar(new ContaPoupança(Conta.gerarNumero(),agencia,tipo, titular,saldo,aniversario));
				}
				default ->{
					System.out.println("Tipo de Conta invalida!");
					}
				}
			}else 
				System.out.println("\nConta não encontrada!");
			
			keyPress();
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar Conta\n\n");
			
			System.out.println("Digite o numero da conta:");
			numero = ler.nextInt();
			
			Conta.deletar(numero);
			
			keyPress();
			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Sacar\n\n");
			
			System.out.println("Digite o numero da conta:");
			numero = ler.nextInt();
			
			do {
				System.out.println("Digite o valor do saque: ");
				valor = ler.nextFloat();
			}while (valor <=0);
			
			Conta.sacar(numero,valor);
			
			
			
			keyPress();
			break;
		case 7:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Depositar\n\n");
			
			System.out.println("Digite o numero da conta:");
			numero = ler.nextInt();
			
			do {
				System.out.println("Digite o valor do depósito: ");
				valor = ler.nextFloat();
			}while (valor <=0);
			
			Conta.depositar(numero, valor);
			
			keyPress();
			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Transferir Valores\n\n");
			
			System.out.println("Digite o numero da conta de origem:");
			numero = ler.nextInt();
			System.out.println("Digite o numero da conta de destino:");
			numeroDestino = ler.nextInt();
			
			do {
				System.out.println("Digite o valor da transferência: ");
				valor = ler.nextFloat();
			}while (valor <=0);
			
			Conta.transferir(numero,numeroDestino,valor);
			
			
			keyPress();
			break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD+"\nOpção inválida!\n"+Cores.TEXT_RESET);
			}
		
		}
	}
	
	
		public static void keyPress() {
			try {
				System.out.println(Cores.TEXT_RESET +"\n\nPresione Enter para continuar...");
				System.in.read();
			}catch(IOException e) {
				System.out.println("\nVocê pressionou a tecla diferente!");
			
		}
		
	}

}
