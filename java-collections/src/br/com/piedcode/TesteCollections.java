package br.com.piedcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteCollections {

	public static void main(String[] args) {
		System.out.println("**** ArrayList vs LinkedList****");

		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();

		int quantidadeElementos = 100000;

		long tempoArrayList = insereElementosNo(numerosArrayList,
				quantidadeElementos);
		long tempoLinkedList = insereElementosNo(numerosLinkedList,
				quantidadeElementos);
		
		System.out.println("Tempo de inserção ArrayList: "+ tempoArrayList);
		System.out.println("Tempo de inserção LinkedList: "+ tempoLinkedList);
		
		tempoArrayList = removePrimeirosElementos(numerosArrayList);
		tempoArrayList = removePrimeirosElementos(numerosArrayList);
	}

	private static long removePrimeirosElementos(List<Integer>numeros) {

		long ini = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			
			//remove sempre o primeiro elemento
			numeros.remove(0);
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

	private static long insereElementosNo(List<Integer> numeros, int quantidade) {

		long ini = System.currentTimeMillis();
		for (int i = 0; i < quantidade; i++) {
			numeros.add(i);
		}
		long fim = System.currentTimeMillis();
		return ini - fim;

	}
}
