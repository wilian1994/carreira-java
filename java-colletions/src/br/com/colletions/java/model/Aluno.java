package br.com.colletions.java.model;

public class Aluno {

	private String nome;
	private int matricula;

	public Aluno( String nome, int matricula ) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}

}
