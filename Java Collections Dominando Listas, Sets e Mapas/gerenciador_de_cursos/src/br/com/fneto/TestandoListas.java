package br.com.fneto;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " +aula);
		}
		
		String primeiraAula = aulas.get(0);
		
		System.out.println("A primeira aula eh: " +primeiraAula);
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		
		aulas.forEach(aula -> { //o aula no argumento faz o papel do i no for
			System.out.println("Aula Alura: " +aula);
		});
		
		aulas.add("Don pollo king of ohio");
		
		//antes do sort
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		//depois do sort
		System.out.println(aulas);
	}
}
