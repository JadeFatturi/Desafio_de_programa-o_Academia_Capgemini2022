/*
# Questão 03

Duas palavras podem ser consideradas anagramas de si mesmas
se as letras de uma palavra podem ser realocadas para formar a
outra palavra. Dada uma string qualquer, desenvolva um algoritmo
que encontre o número de pares de substrings que são anagramas.
 */

package questão03;




import java.util.Scanner;




public class Resolução03 {
	public static void main(String[] args) {
		  subString(" ");
    }

    static void subString(String s){
    	Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite a palavra: ");
			String palavra = sc.next();

			int n = palavra.length();
			int contador = 0;

			for (int i = 0; i <= n - 1; i++) {
				for (int j = 0; j <= n - 1 - i; j++) {
					String palavraCont = palavra.substring(j, j + i + 1);
					for (int k = j + 1; k <= n - i - 1; k++) {
						StringBuilder s2 = new StringBuilder(palavra.substring(k, k + i + 1));
						if (s2.toString().indexOf(palavraCont.charAt(0)) >= 0) {
							int cont = 0;
							for (int m = 0; m < palavraCont.length(); m++) {
								if (s2.toString().indexOf(palavraCont.charAt(m)) >= 0) {
									s2.deleteCharAt(s2.toString().indexOf(palavraCont.charAt(m)));
									cont++;
								}
							}
							if (cont == palavraCont.length()) {
								contador++;
							}
						}
					}
				}
			}
			System.out.println(contador+" são os número de pares de substrings da palavra digitada, que são anagramas!");
			int opcao = sc.nextInt();
			if (opcao == 0) {
				break;
			}
			sc.close();

		}

	}
}