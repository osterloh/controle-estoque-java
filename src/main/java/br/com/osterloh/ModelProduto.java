package br.com.osterloh;

import java.util.List;
import java.util.Scanner;

public class ModelProduto {

	// ATRIBUTOS
	private String produto;
	private int quantidade;
	private double valor;
	private boolean ativo;
	private int totVendidos;

	// CONSTRUTOR
	public ModelProduto() {
		this.produto = null;
		this.quantidade = 0;
		this.valor = 0;
		this.ativo = false;
		this.totVendidos = 0;
	}

	// METODOS
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getTotVendidos() {
		return totVendidos;
	}

	public void setTotVendidos(int totVendidos) {
		this.totVendidos = totVendidos;
	}

}
