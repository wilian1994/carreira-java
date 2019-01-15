package br.com.colletions.java;

import java.util.List;

import br.com.colletions.java.model.Aula;
import br.com.colletions.java.model.Curso;

public class TestaCurso {

	public static void main( String[] args ) {

		Curso javaColecoes = new Curso( "Domindo java", "Wilian" );
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println( aulas );

		javaColecoes.getAulas().add( new Aula( "Wilan", 21 ) );
	}
}
