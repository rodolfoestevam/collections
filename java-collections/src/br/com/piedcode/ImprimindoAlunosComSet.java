package br.com.piedcode;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosComSet {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Rodolfo Estevam");
		alunos.add("Vitor Oliveira");
		alunos.add("Mav Vasconcelos");
		alunos.add("Luhan Lacerda");
		alunos.add("Mauricio");
		alunos.add("Binho L0st");

		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.remove("Rodolfo Estevam");

		alunos.add("Juju");
		alunos.add("Rodrigou");

		System.out.println(alunos.size());
		
		
		boolean adicionou = alunos.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
	}
}
