/*
 # Quest�o 01
 
 Escreva um algoritmo que mostre na tela uma escada de
 tamanho n utilizando o caractere * e espa�os.
 A base e altura da escada devem ser iguais ao valor de n.
 A �ltima linha n�o deve conter nenhum espa�o.
 
 */

package quest�o01;

import java.util.Scanner;

public class Resolu��o01 {
	private static Scanner sc;

	public static void main(String[] args) {

		int numero;
		sc = new Scanner(System.in);

		System.out.println(" Por favor entre com um n�mero: ");
		numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			for (int j = numero; j > i; j--) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
