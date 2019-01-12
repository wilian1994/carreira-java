package br.com.colletions.java;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.colletions.java.model.Aulas;

public class TestandoListas {

	public static void main(String[] args) {

		
		Aulas a1 = new Aulas("Java", 20);
		Aulas a2 = new Aulas("Javascript", 30);
		Aulas a3 = new Aulas("Angular", 40);
		
		ArrayList<Aulas> cursos = new ArrayList<>();
		
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
		
		
		//ordenação utilizando lambda
		cursos.sort(Comparator.comparing(Aulas::getTempo));
		
	}

}
