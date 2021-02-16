package br.com.osterloh;

import java.util.Scanner;

public class ControllerEstoque {

	private Scanner tec;
	
	public ControllerEstoque() {
		tec = new Scanner(System.in);
	}
	
	public int opcaoMenu() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastro de Produto");
		System.out.println("2) Cadastro de Funcionario");
		System.out.println("3) Listar Produtos");
		System.out.println("4) Listar Funcionarios");
		System.out.println("5) Editar Produto");
		System.out.println("6) Editar Funcionario");
		System.out.println("7) Remover Produto");
		System.out.println("8) Remover Funcionario");
		System.out.println("9) Encerrar Aplicação");
		System.out.println("-------------------------------");
	}
	
}
