package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Array {

	Scanner in = new Scanner(System.in);

	int cont;

	public void exercicie1() {
		/*
		 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois
		 * N n�meros inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os n�meros negativos lidos.
		 */

		System.out.print("How many numbers will you type? ");
		cont = in.nextInt();

		int[] vec = new int[cont];

		for (int i = 0; i < vec.length; i++) {
			System.out.print("Digit a number: ");
			vec[i] = in.nextInt();
		}

		System.out.println("Negative numbers: ");

		for (int i = 0; i < vec.length; i++) {
			if (vec[i] < 0) {
				System.out.println(vec[i]);
			}
		}

	}

	public void exercicie2() {
		/*
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * m�dia dos elementos do vetor
		 */
		double sum = 0;

		Locale.setDefault(Locale.US);
		System.out.print("How many numbers will you type? ");
		cont = in.nextInt();

		double[] array = new double[cont];

		for (int i = 0; i < cont; i++) {

			System.out.print("Digit a number: ");
			array[i] = in.nextDouble();
		}
		System.out.print("Values: ");
		for (int i = 0; i < cont; i++) {
			sum += array[i];
			System.out.printf("%.1f ", array[i]);
		}
		System.out.println("\nSum: " + String.format("%.2f", sum));
		System.out.println("Avarage: " + String.format("%.2f", sum / cont));

	}

	public void exercicie3() {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura m�dia das pessoas, e mostrar tamb�m
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		String name;
		int age;
		double height, avg, sum = 0;

		System.out.print("How many persons will you type? ");
		cont = in.nextInt();

		Person[] person = new Person[cont];

		for (int i = 0; i < person.length; i++) {

			System.out.println("Date of " + (i + 1) + "a person: ");
			in.nextLine();
			System.out.print("Name: ");
			name = in.nextLine();
			System.out.print("Age: ");
			age = in.nextInt();
			System.out.print("Height: ");
			height = in.nextDouble();

			person[i] = new Person(name, age, height);

		}

		int contp = 0;

		for (int i = 0; i < person.length; i++) {
			sum += person[i].getHeight();

		}

		avg = sum / cont;
		System.out.println("Average height: " + String.format("%.2f", avg));

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				contp++;
			}
		}

		System.out.println("People whit less 16 year old: " + String.format("%.1f", (100.00 * contp) / cont)+"%");

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}

		}
	}

	public void exercicie4() {
		/*
		 * Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os n�meros pares, e tamb�m a quantidade de
		 * n�meros pares.
		 */
		System.out.print("How many numbers will you type? ");
		cont = in.nextInt();

		int[] vec = new int[cont];

		for (int i = 0; i < vec.length; i++) {
			System.out.print("Digit a number: ");
			vec[i] = in.nextInt();
		}
		cont = 0;

		System.out.println("Even numbers: ");
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] % 2 == 0) {
				System.out.print(vec[i] + " ");
				cont++;
			}

		}
		System.out.println("\nEven quantity: " + cont);
	}

	public void exercicie5() {
		/*
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior n�mero do vetor (supor n�o haver empates).
		 * Mostrar tamb�m a posi��o do maior elemento, considerando a primeira posi��o
		 * como 0 (zero).
		 */
	}

	public void exercicie6() {
		/*
		 * Fa�a um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C � a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 * 
		 * .
		 */
	}

	public void exercicie7() {
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois um vetor de N n�meros
		 * reais. Em seguida, mostrar na tela a m�dia aritm�tica de todos elementos com
		 * tr�s casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da m�dia, com uma casa decimal cada.
		 */
	}

	public void exercicie8() {
		/*
		 * Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida,
		 * mostrar na tela a m�dia aritm�tica somente dos n�meros pares lidos, com uma
		 * casa decimal. Se nenhum n�mero par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */
	}

	public void exercicie9() {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
		 */
	}

	public void exercicie10() {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1� e 2� semestres. Cada uma dessas informa��es deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja m�dia das notas seja maior ou igual a 6.0
		 * (seis).
		 */
	}

	public void exercicie11() {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o g�nero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * m�dia de altura das mulheres, e o n�mero de homens.
		 */
	}
}
