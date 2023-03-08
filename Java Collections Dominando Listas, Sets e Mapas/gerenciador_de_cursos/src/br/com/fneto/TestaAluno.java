package br.com.fneto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Don pollo");
		alunos.add("WANDAO");
		alunos.add("Souza7");
		alunos.add("deinho");
		alunos.add("WANDAO");
		
		boolean wandaoEstaMatriculado = alunos.contains("WANDAO");
		
		System.out.println(wandaoEstaMatriculado);
		
		
		//o hash não contabiliza valores repetidos
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		

	}

}
