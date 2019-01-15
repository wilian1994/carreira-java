package br.com.colletions.java;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.colletions.java.model.Aula;

public class TestandoListas {

	public static void main(String[] args) {

		
		Aula a1 = new Aula( "Java", 20 );
		Aula a2 = new Aula( "Javascript", 30 );
		Aula a3 = new Aula( "Angular", 40 );
		
		ArrayList<Aula> cursos = new ArrayList<>();
		
		cursos.add(a1);
		cursos.add(a2);
		cursos.add(a3);
		
		
		System.out.println(cursos);
		//removendo o segundo item da lista
//		cursos.remove(1);
		
		
		//ordenando uma lista
//		 Collections.sort(cursos);

		//acessando um elemento da lista
//		System.out.println(cursos.get(0));
		
		
		//ordena��o utilizando lambda
		cursos.sort( Comparator.comparing( Aula::getTempo ) );
		
	}

}
