package exercicies;

import java.util.Scanner;

public class RepetitionWhile {

	Scanner in = new Scanner(System.in);

	public void exercice1() {
		/*
		 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
		 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
		 * digitados em ordem crescente ou decrescente. O programa deve finalizar quando
		 * forem digitados dois valores iguais.
		 */
	}

	public void exercice2() {
		/*
		 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um,
		 * a idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m
		 * um valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo de
		 * indiv�duos. Se for entrado um valor negativo na primeira vez, mostrar a
		 * mensagem "IMPOSSIVEL CALCULAR".
		 */
	}

	public void exercice3() {
		/*
		 * Escreva um programa que repita a leitura de uma senha at� que ela seja
		 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta � o valor 2002.
		 */

		int password;

		do {
			System.out.print("Write your password: ");
			password = in.nextInt();
			if (password == 2002) {
				System.out.println("Passwor valid");
			} else {
				System.out.println("Passwor invalid");
			}
		} while (password != 2002);

	}

	public void exercice4() {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem
		 * alguma).
		 */

		@SuppressWarnings("unused")
		int x, y;

		/*
		 * Form one do { x = in.nextInt(); y = in.nextInt(); if (x >= 1 && y >= 1) {
		 * System.out.println("Firsth"); } else if (x <= -1 && y >= 1) {
		 * System.out.println("Second"); } else if (x <= -1 && y <= -1) {
		 * System.out.println("Third"); } else if (x >= 1 && y <= -1) {
		 * System.out.println("Fourth"); } } while (x != 0 && y != 0);
		 */

		/* Form 2 */

	}

	public void exercice5() {
		/*
		 * Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno.
		 * Calcule e imprima a m�dia semestral. Fa�a com que o algoritmo s� aceite notas
		 * v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]). Cada nota deve
		 * ser validada separadamente.
		 */
	}

	public void exercice6() {
		/*
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a
		 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
		 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combust�vel, conforme exemplo.
		 */

		int alchool = 0, fuel = 0, diesel = 0, n;

		do {
			n = in.nextInt();
			if (n == 1) {
				alchool += 1;
			} else if (n == 2) {
				fuel += 1;
			} else if (n == 3) {
				diesel += 1;
			}
		} while (n != 4);

		String mensage = """
				Very thanks
				Alchool = """ + alchool + """

				Fuel =  """ + fuel + """

				Diesel = """ + diesel;

		System.out.println(mensage);
	}

	public void exercice7() {
		/*
		 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa ir�
		 * parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma
		 * dos 5 pares consecutivos a partir de X, inclusive o X, se for par. Se o valor
		 * de entrada for 4, por exemplo, a sa�da deve ser 40, que � o resultado da
		 * opera��o: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por
		 * exemplo, a sa�da deve ser 80, que � a soma de 12+14+16+18+20.
		 */
	}

	public void exercice8() {
		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usu�rio deseja repetir (s/n). Caso o usu�rio
		 * digite "s", repetir o programa
		 */

		char cont;

		do {
			System.out.print("White the temperature in Celcios: ");
			double celciuos = in.nextDouble();
			System.out.println("Equivalent in Fahrenheit: " + String.format("%.1f", ((9 * celciuos) / 5) + 32));
			System.out.print("Restart the program (Y/N)? ");
			cont = in.next().charAt(0);
		} while (cont != 'n');
	}
}
