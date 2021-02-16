package br.com.osterloh;

import java.util.List;

public interface Estocar {

	public abstract ModelProduto cadastrar();
	public abstract void editar(List<ModelProduto> prod);
	public abstract void remover(List<ModelProduto> prod);
	public abstract void listar(List<ModelProduto> prod);
	
}
