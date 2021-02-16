package br.com.osterloh;

import java.util.List;
import java.util.Scanner;

public class ControllerProduto implements Estocar {

	private Scanner tec;

	// CONSTRUTOR
	public ControllerProduto() {
		tec = new Scanner(System.in);
	}

	// METODOS IMPLEMENTADOS
	@Override
	public ModelProduto cadastrar() {
		ModelProduto prod = new ModelProduto();

		System.out.println("--- CADASTRAR PRODUTOS ---");
		System.out.print("Produto: ");
		tec.nextLine();
		prod.setProduto(tec.nextLine());
		System.out.print("Quantidade: ");
		prod.setQuantidade(tec.nextInt());
		System.out.print("Valor unitario: R$");
		prod.setValor(tec.nextDouble());

		return prod;
	}

	@Override
	public void editar(List<ModelProduto> prod) {
		ModelProduto itens = new ModelProduto();
		int aux, opc;
		String acao;

		if (prod.size() <= 0) {
			System.out.println("Estoque vazio!!!");

		} else {
			this.listar(prod);
			
			System.out.print("Informe o código produto a ser editado: ");
			aux = tec.nextInt();
			
			if(aux > prod.size() || aux <= 0) {
				System.out.println("Código inválido!!!");
				
			} else {
				System.out.println("Qual informação deseja editar?");
				System.out.println("1) Desecrição do produto");
				System.out.println("2) Quantidade de itens");
				System.out.println("3) Valor unitário");
				System.out.println("4) Ativar - Desativar");
				System.out.print(">");
				opc = tec.nextInt();
				
				switch (opc) {
				case 1:
					itens.setAtivo(prod.get(aux - 1).getAtivo());
					itens.setQuantidade(prod.get(aux - 1).getQuantidade());
					itens.setTotVendidos(prod.get(aux - 1).getTotVendidos());
					itens.setValor(prod.get(aux - 1).getValor());
					System.out.print("Informe a descriçao do item: " + prod.get(aux - 1).getProduto() + ": ");
					itens.setProduto(tec.nextLine());
					
					prod.set(aux - 1, itens);
					break;
					
				case 2:
					itens.setAtivo(prod.get(aux - 1).getAtivo());
					itens.setProduto(prod.get(aux - 1).getProduto());
					itens.setTotVendidos(prod.get(aux - 1).getTotVendidos());
					itens.setValor(prod.get(aux - 1).getValor());
					System.out.print("Informe a nova quantidade de: " + prod.get(aux - 1).getProduto() + " em estoque: ");
					itens.setQuantidade(tec.nextInt());
					
					prod.set(aux - 1, itens);
					break;
					
				case 3:
					itens.setAtivo(prod.get(aux - 1).getAtivo());
					itens.setQuantidade(prod.get(aux - 1).getQuantidade());
					itens.setTotVendidos(prod.get(aux - 1).getTotVendidos());
					itens.setProduto(prod.get(aux - 1).getProduto());
					System.out.print("Informe o novo valor de: " + prod.get(aux - 1).getProduto() + ": R$");
					itens.setValor(tec.nextDouble());
					
					prod.set(aux - 1, itens);
					break;
					
				case 4:
					itens.setQuantidade(prod.get(aux - 1).getQuantidade());
					itens.setTotVendidos(prod.get(aux - 1).getTotVendidos());
					itens.setProduto(prod.get(aux - 1).getProduto());
					itens.setValor(prod.get(aux - 1).getValor());
					
					if(prod.get(aux - 1).getAtivo()) {
						System.out.println("Deseja desativar o item: " + prod.get(aux - 1).getProduto() + "? [s/n]");
						acao = tec.next();
						
						if(acao.equalsIgnoreCase("s")) {
							itens.setAtivo(false);
							
						}
						
					} else {
						System.out.println("Deseja ativar o item: " + prod.get(aux - 1).getProduto() + "? [s/n]");
						acao = tec.next();
						
						if(acao.equalsIgnoreCase("s")) {
							
							itens.setAtivo(true);
						}
					}
					
					prod.set(aux - 1, itens);
					
					break;

				default:
					System.out.println("Opção inválida!!!");
					break;
				}
			}

		}

	}

	@Override
	public void remover(List<ModelProduto> prod) {
		int aux;

		if (prod.size() <= 0) {
			System.out.println("Estoque vazio!!!");

		} else {
			this.listar(prod);

			System.out.println("--- REMOVER ITENS ---");
			System.out.print("Informe o código do produto: ");
			aux = tec.nextInt();

			if (aux > prod.size() || aux <= 0) {
				System.out.println("Produto inezistente!!!");

			} else {
				prod.remove(aux - 1);
				System.out.println("Produto removido com sucesso!!!");
				System.out.println();
			}
		}

	}

	@Override
	public void listar(List<ModelProduto> prod) {
		System.out.println("--- PRODUTOS CADASTRADOS ---");

		System.out.printf("| %3s | %10s | %4s | %8s | %6s | %10s |\n", "Cod", "Produto", "Qtd", "Valor", "Ativo",
				"Qtd Vendidos");

		for (int i = 0; i < prod.size(); i++) {
			System.out.printf("| %3d | %10s | %4d | R$%6.2f | %6b | %12d |\n", (i + 1), prod.get(i).getProduto(),
					prod.get(i).getQuantidade(), prod.get(i).getValor(), prod.get(i).getAtivo(),
					prod.get(i).getTotVendidos());
		}

		System.out.println("");

	}

}
