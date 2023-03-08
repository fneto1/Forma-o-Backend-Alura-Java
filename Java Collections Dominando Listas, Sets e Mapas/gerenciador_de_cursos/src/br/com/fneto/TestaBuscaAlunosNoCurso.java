package br.com.fneto;


public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Cobra");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 19));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
	
		Aluno a1 = new Aluno("Cobra Silva", 3895);
		Aluno a2 = new Aluno("Wandao Marques", 6637);
		Aluno a3 = new Aluno("Alfaya BreakingBad", 1845);
		Aluno a4 = new Aluno("Don Pollo", 1337);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.buscaMatriculado(6638));
		
		
	}
}
