package br.com.colletions.java.model;

public class Aulas implements Comparable<Aulas>{

	private String curso;
	private int tempo;

	public Aulas(String curso, int tempo) {
		this.curso = curso;
		this.tempo = tempo;
	}

	public String getCurso() {
		return curso;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aulas [curso=" + curso + ", tempo=" + tempo + "]";
	}

	//implementando o metodo de comparable
	@Override
	public int compareTo(Aulas outraAula) {
		return this.curso.compareTo(outraAula.getCurso());
	}

}
