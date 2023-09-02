package collection;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		/*
		 * Sintaxe para implementar uma lista
		 * List<tipo da lista> nome = new ArrayList<>();
		 * **/
	
		// Implementar lista tipo String
		
		List<String> lista = new ArrayList<>();
		
		
		// Adicionar elementos a lista 
		lista.add("Matemática");
		lista.add("Física");
		lista.add("Biologia");
		lista.add("Português");
		lista.add("Geografia");
		lista.add("História");
		
		// Percorrer os elementos da lista
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		// Inserir elemento entre um nodo 
		lista.add(3, "Química");
		lista.add("Inglês");
		lista.add(5, "Programação");
		System.out.println("------------------------------------");
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		// Verificar o tamanho da lista
		System.out.println("------------------------------------------");
		System.out.println("A lista possui um tamanho de " + lista.size() + " Posições.");
		System.out.println("------------------------------------------");
		
		//Verificar uma posição individual.
		System.out.println("Conteudo na posição 3: " + lista.get(3));
		
		
		// Remover elemento da lista
		lista.remove(2);
		lista.remove("Física");
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		// Listar a posição de um elemento
		System.out.println("Index de Inglês: " + lista.indexOf("Inglês"));
		
		System.out.println("---------------------------------------------------");
		
		// Trabalhar com predicado
		// Remover todos os elementos que iniciam com a letra G
		// Para remover um elemento utilizando predicado, usamos o método removeIf
		
		lista.removeIf(disciplina -> disciplina.charAt(0) == 'G'); // Remove tudo que começa com a letra G
		lista.removeIf(disciplina -> disciplina.charAt(4) == 'm');
		lista.removeIf(disciplina -> disciplina.charAt(4) == 'r');
		
		
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		
		
		
	}

}
