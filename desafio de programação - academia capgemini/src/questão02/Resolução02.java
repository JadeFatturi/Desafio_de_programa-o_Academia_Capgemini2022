/*
 # Questão 02
 
 Débora se inscreveu em uma rede social para se manter em
 contato com seus amigos. A página de cadastro exigia o
 preenchimento dos campos de nome e senha, porém a senha precisa 
 ser forte. O site considera uma senha forte quando ela satisfaz
 os seguintes critérios:
 
 - Possui no mínimo 6 caracteres.
 - Contém no mínimo 1 digito.
 - Contém no mínimo 1 letra em minúsculo.
 - Contém no mínimo 1 letra em maiúsculo.
 - Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não
tem certeza se é uma senha forte. Para ajudar Débora, construa um
algoritmo que informe qual é o número mínimo de caracteres que devem
ser adicionados para uma string qualquer ser considerada segura.

 */

package questão02;

import java.util.Scanner;

public class Resolução02 {

	public static void main(String[] args) {

		String inputName;
		String inputPassword;
		String confirmPassword;

		Scanner input = new Scanner(System.in);
		System.out.print("Emtre com o seu nome:  ");
		inputName = input.next();

		System.out.print("Cadastre uma senha!: ");
		inputPassword = input.next();
		passCheck(inputPassword);

		System.out.print("Por favor, Confirme a senha: ");
		confirmPassword = input.next();

		if (inputPassword.matches(confirmPassword)) {
			System.out.println("Senha Cadastrada com sucesso");
		} else {
			System.out.println("Cadastre Novamente");
		}

	}

	public static void passCheck(String password) {
		boolean valid = true;
		if (password.length() < 6) {
			System.out.println("A senha não tem 6 caracteres");
			valid = false;
		}
		String upperCase = "(.*[A-Z].*)";
		if (!password.matches(upperCase)) {
			System.out.println("A senha deve conter pelo menos uma letra maiúscula");
			valid = false;
		}
		String upperCase1 = "(.*[a-z].*)";
		if (!password.matches(upperCase1)) {
			System.out.println("A senha deve conter pelo menos uma letra minúscula");
			valid = false;
		}
		String numbers = "(.*[0-9].*)";
		if (!password.matches(numbers)) {
			System.out.println("A senha deve conter pelo menos um dígito");
			valid = false;
		}
		String specialChars = "(^(?:(?=.*[!@#$%^&*()-+]).*)$)";
		if (!password.matches(specialChars)) {
			System.out.println("A senha deve conter pelo menos um destes caracteres especiais: !@#$%^&*()-+ ");
			valid = false;
		}

		if (valid) {
			System.out.println("Senha aceita!");

		}
	}

}
