package Conta;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int opçao;
		while (true ){
		System.out.print("===============================================================");
		System.out.println("\n|                                                             |");
		System.out.println("|                                                             |");
		System.out.println("|                       Innovex Capital                       |");
		System.out.println("|                                                             |");
		System.out.println("|                                                             |");
		System.out.println("===============================================================");
		System.out.println("|                              |                              |");
		System.out.println("|        1 - Criar Conta       |  2 - Listar Todas as Contas  |");
		System.out.println("|                              |                              |");
		System.out.println("===============================================================");
		System.out.println("|                              |                              |");
		System.out.println("| 3 - Buscar Contar por Numero | 4 - Atualizar Dados da Conta |");
		System.out.println("|                              |                              |");
		System.out.println("===============================================================");
		System.out.println("|                              |                              |");
		System.out.println("|       5 - Apagar Conta       |         6 - Sacar            |");
		System.out.println("|                              |                              |");
		System.out.println("===============================================================");
		System.out.println("|                              |                              |");
		System.out.println("|         7 - Depositar        |    8 - Transferir Valores    |");
		System.out.println("|                              |                              |");
		System.out.println("===============================================================");
		System.out.println("|                                                             |");
		System.out.println("|                           9 - Sair                          |");
		System.out.println("|                                                             |");
		System.out.println("===============================================================");
		System.out.println("|                  Entre com a opção desejada                 |");
		System.out.println("===============================================================");
		
		
		opçao = ler.nextInt();
		if (opçao ==9) {
			System.out.println("===============================================================");
			System.out.println("|                                                             |");
			System.out.println("|                       Innovex Capital                       |");
			System.out.println("|                  O seu Futuro Começa aqui!                  |");
			System.out.println("|                                                             |");
			System.out.println("===============================================================");
			ler.close();
			System.exit(0);
		}
		switch(opçao) {
		case 1:
			System.out.println("Criar Conta\n\n");
			
			break;
		case 2:
			System.out.println("Listar Todas as Contas\n\n");
			
			break;
		case 3:
			System.out.println("Buscar Contar por Numero\n\n");
			
			break;
		case 4:
			System.out.println("Atualizar Dados da Conta\n\n");
			
			break;
		case 5:
			System.out.println("Apagar Conta\n\n");
			
			break;
		case 6:
			System.out.println("Sacar\n\n");
			
			break;
		case 7:
			System.out.println("Depositar\n\n");
			
			break;
		case 8:
			System.out.println("Transferir Valores\n\n");
			
			break;
			default:
				System.out.println("\nOpção inválida!\n");
		}
		
		}
		
	}

}
