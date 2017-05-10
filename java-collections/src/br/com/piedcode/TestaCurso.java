package br.com.piedcode;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// Cria objeto
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
				"Rodolfo Estevam");

		// Cria colecao generica
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		javaColecoes.getAulas()
				.add(new Aula("Relacionamento com colecoes", 24));
		System.out.println(aulas);

	}

}
