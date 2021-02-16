package br.com.osterloh;

public abstract class ModelPessoa {

	// ATRIBUTOS
	private String nome;
	private int idade;

	// CONSTRUTOR
	public ModelPessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// METODOS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
