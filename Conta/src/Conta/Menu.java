package Conta;

import java.util.Scanner;
import Conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int opçao;
		while (true ){
		System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND);
		System.out.print("===============================================================");
		System.out.println("\n|                                                             |");
		System.out.println("|                                                             |");
		System.out.println("|                       Innovex Capital                       |");
		System.out.println("|                                                             |");
		System.out.println("|                                                             |");
		System.out.println("===============================================================");
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
		System.out.println("===============================================================");
		System.out.println("|                  Entre com a opção desejada                 |");
		System.out.println("===============================================================");
		System.out.println("|                                                             |"+Cores.TEXT_RESET);
		
		opçao = ler.nextInt();
		if (opçao ==9) {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND+"===============================================================");
			System.out.println("|                                                             |");
			System.out.println(Cores.TEXT_WHITE_BOLD+"|                       Innovex Capital                       |");
			System.out.println(Cores.TEXT_WHITE_BOLD+"|                  O seu Futuro Começa aqui!                  |");
			System.out.println("|                                                             |");
			System.out.println("===============================================================");
			ler.close();
			System.exit(0);
		}
		switch(opçao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Criar Conta\n\n");
			
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Listar Todas as Contas\n\n");
			
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Buscar Contar por Numero\n\n");
			
			break;
		case 4:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar Dados da Conta\n\n");
			
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar Conta\n\n");
			
			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Sacar\n\n");
			
			break;
		case 7:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Depositar\n\n");
			
			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE_BOLD+"Transferir Valores\n\n");
			
			break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD+"\nOpção inválida!\n"+Cores.TEXT_RESET11);
		}
		
		}
		
	}

}
