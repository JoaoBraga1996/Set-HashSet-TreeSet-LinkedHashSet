package application;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		// Criando um conjunto de Strings
		Set<String> meuConjunto = new HashSet<>();

		// Adicionando elementos ao conjunto
		meuConjunto.add("Maçã");
		meuConjunto.add("Banana");
		meuConjunto.add("Morango");
		meuConjunto.add("Morango");

		// Imprimindo o conjunto (ordem não garantida e não repete elemento)
		System.out.println("Conjunto inicial: " + meuConjunto);

		// Verificando a presença de um elemento
		boolean contemBanana = meuConjunto.contains("Banana");
		System.out.println("Contém Banana? " + contemBanana);

		// Removendo um elemento
		meuConjunto.remove("Maçã");
		System.out.println("Conjunto após a remoção: " + meuConjunto);

		// Verificando o tamanho do conjunto
		int tamanho = meuConjunto.size();
		System.out.println("Tamanho do conjunto: " + tamanho);

		// Verificando se o conjunto está vazio
		boolean conjuntoVazio = meuConjunto.isEmpty();
		System.out.println("O conjunto está vazio? " + conjuntoVazio);

		// Limpando o conjunto
		meuConjunto.clear();
		System.out.println("Conjunto após limpar: " + meuConjunto);
	}

}