package br.com.piedcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + ", Tempo Total: " + this.getTempoTotal() + ", aulas: [" + this.aulas + "] ]";
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		
		int tempoTotal = 0;
		for(Aula aula : aulas){
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	// java8 - this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
