package application;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		// Criando um conjunto usando TreeSet
		Set<String> meuTreeSet = new TreeSet<>();

		// Adicionando elementos ao conjunto
		meuTreeSet.add("Maçã");
		meuTreeSet.add("Banana");
		meuTreeSet.add("Morango");

		// Imprimindo o conjunto (ordem natural)
		System.out.println("TreeSet inicial: " + meuTreeSet);

		// Adicionando um elemento repetido (não afeta a ordem)
		meuTreeSet.add("Maçã");
		System.out.println("TreeSet após adição repetida: " + meuTreeSet);

		// Removendo um elemento
		meuTreeSet.remove("Banana");
		System.out.println("TreeSet após a remoção: " + meuTreeSet);

		// Verificando o tamanho do conjunto
		int tamanho = meuTreeSet.size();
		System.out.println("Tamanho do TreeSet: " + tamanho);

		// Verificando se o conjunto está vazio
		boolean conjuntoVazio = meuTreeSet.isEmpty();
		System.out.println("O TreeSet está vazio? " + conjuntoVazio);

		// Limpando o conjunto
		meuTreeSet.clear();
		System.out.println("TreeSet após limpar: " + meuTreeSet);
	}
}
