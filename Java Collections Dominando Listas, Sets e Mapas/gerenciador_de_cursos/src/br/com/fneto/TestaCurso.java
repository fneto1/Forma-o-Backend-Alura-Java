package br.com.fneto;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Cobra");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		javaColecoes.adiciona(new Aula("Trabalhando com arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(aulas);
	}

}
