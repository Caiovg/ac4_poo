package Classes;

import java.util.Scanner;

public class GestaoAcademicaApp1 {

	public static Scanner entrada;
	
	public static void listarAlunos(Estudantes estudantes){
		estudantes.toString();
	}
	
	public static void main(String[] args) {
		
		boolean sair = false;
		entrada = new Scanner(System.in);
		while(!sair) {
			System.out.println("Escolha uma op��o:");
			System.out.println("(1) Listar os n�meros e nomes de todos os estudantes");
			System.out.println("(2) Listar os c�digos de todas as disciplinas");
			System.out.println("(3) depositar");
			System.out.println("(4) transferir");
			System.out.println("(5) sair");
			System.out.print("Op��o escolhida: ");
			int escolha = entrada.nextInt();
			System.out.println();
			switch(escolha) {
				case 1: listarAlunos(null); break;
				case 2: System.out.println("2"); break;
				case 3: System.out.println("3"); break;
				case 4: System.out.println("4"); break;
				case 5: sair = true; break;
				default: System.out.println("Op��o inv�lida!");
			}
				System.out.println();
		}
		System.out.println("Fim do programa!");
	}
}
