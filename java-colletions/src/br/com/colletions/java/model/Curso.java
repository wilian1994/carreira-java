package br.com.colletions.java.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();

	public Curso( String nome, String instrutor ) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void matricula( Aluno aluno ) {
		this.alunos.add( aluno );
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet( alunos );
	}

	public void adiciona( Aula aula ) {
		// TODO Auto-generated method stub

	}

	public boolean estaMatriculado( Aluno aluno ) {
		return this.alunos.contains( aluno );
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public boolean equals( Object obj ) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals( outroAluno.getNome() );
	}

}