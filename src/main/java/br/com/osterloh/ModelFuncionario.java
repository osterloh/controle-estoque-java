package br.com.osterloh;

public class ModelFuncionario extends ModelPessoa {

	//ATRIBUTOS
	private String login;
	private double salario;

	//CONSTRUTOR
	public ModelFuncionario(String nome, int idade, String login, double salario) {
		super(nome, idade);
		this.login = login;
		this.salario = salario;
	}

	//METODOS
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
