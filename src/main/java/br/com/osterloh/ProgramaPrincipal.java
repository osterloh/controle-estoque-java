package br.com.osterloh;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		// ARMAZENA OS DADOS CADASTRADOS NO ARRAY LIST
		List<ModelFuncionario> funcionario = new ArrayList<>();
		List<ModelProduto> produto = new ArrayList<>();

		// INSTACIA DO OBJETO
		ControllerEstoque estoque = new ControllerEstoque();
		ControllerProduto prod = new ControllerProduto();

		// CONTROLE DO LOOP DE SAIDA
		boolean sair = false;

		do {

			// CHAMADA DO METODO MENU NO OBJETO ESTOQUE
			estoque.menu();

			// ARMAZENA NA VAR OPC UMA OPCAO RETORNADA PELO METODO OPCAOMENU NO OBJETO
			// ESTOQUE, PARA O SWITCH CASE
			int opc = estoque.opcaoMenu();

			switch (opc) {
			case 1:
				//cadastro de produtos
				produto.add(prod.cadastrar());
				break;

			case 2:
				//cadastro de funcionarios
				break;

			case 3:
				//listar produtos
				prod.listar(produto);
				break;

			case 4:
				//listar funcionarios
				break;

			case 5:
				//editar produtos
				prod.editar(produto);
				break;

			case 6:
				//editar funcionarios
				break;

			case 7:
				//remover produtos
				prod.remover(produto);
				break;

			case 8:
				//remover funcionarios
				break;

			case 9:
				sair = true;
				break;

			default:
				System.out.println("Opção inválida!!!");
				break;
			}

		} while (!sair);

		System.out.println("Sistema encerrado com sucesso!!!");

	}

}
