package java8;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

	public static void main( String[] args ) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add( new Curso( "Python", 45 ) );
		cursos.add( new Curso( "JavaScript", 150 ) );
		cursos.add( new Curso( "Java 8", 118 ) );
		cursos.add( new Curso( "C", 55 ) );

		// // ordenação usando lambda
		// cursos.sort( Comparator.comparing( c -> c.getAlunos() ) );
		//
		// // ordenação usando method reference
		// cursos.sort( Comparator.comparingInt( Curso::getAlunos ) );
		//
		// // filtrando alunos que tenha mais de 50
		// // cursos.stream().filter( c -> c.getAlunos() >= 50 ).forEach( c ->
		// // System.out.println( c.getNome() ) );
		//
		// // transformando a Stream curso em Stream String
		// Stream<String> nomes = cursos.stream().map( Curso::getNome );
		//
		// cursos.stream().filter( c -> c.getAlunos() > 50 ).map( c ->
		// c.getAlunos() ).forEach( x -> System.out.println( x ) );
		//
		// cursos.stream().filter( c -> c.getAlunos() > 50 ).findFirst();

	}

}
