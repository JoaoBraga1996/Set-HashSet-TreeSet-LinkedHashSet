package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		
		//interface não consegue achar o elemento por index

		// Criando um conjunto usando LinkedHashSet
		Set<String> meuLinkedHashSet = new LinkedHashSet<>();

		// Adicionando elementos ao conjunto
		meuLinkedHashSet.add("Maçã");
		meuLinkedHashSet.add("Banana");
		meuLinkedHashSet.add("Morango");
		meuLinkedHashSet.add("Morango");
		

		// Imprimindo o conjunto (mantém a ordem de inserção e não repete o elemento)
		System.out.println("LinkedHashSet inicial: " + meuLinkedHashSet);

		// Adicionando um elemento repetido (não afeta a ordem)
		meuLinkedHashSet.add("Maçã");
		System.out.println("LinkedHashSet após adição repetida: " + meuLinkedHashSet);

		// Removendo um elemento
		meuLinkedHashSet.remove("Banana");
		System.out.println("LinkedHashSet após a remoção: " + meuLinkedHashSet);

		// Verificando o tamanho do conjunto
		int tamanho = meuLinkedHashSet.size();
		System.out.println("Tamanho do LinkedHashSet: " + tamanho);

		// Verificando se o conjunto está vazio
		boolean conjuntoVazio = meuLinkedHashSet.isEmpty();
		System.out.println("O LinkedHashSet está vazio? " + conjuntoVazio);

		// Limpando o conjunto
		meuLinkedHashSet.clear();
		System.out.println("LinkedHashSet após limpar: " + meuLinkedHashSet);
	}
}