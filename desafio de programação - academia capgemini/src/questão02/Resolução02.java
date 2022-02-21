/*
 # Quest�o 02
 
 D�bora se inscreveu em uma rede social para se manter em
 contato com seus amigos. A p�gina de cadastro exigia o
 preenchimento dos campos de nome e senha, por�m a senha precisa 
 ser forte. O site considera uma senha forte quando ela satisfaz
 os seguintes crit�rios:
 
 - Possui no m�nimo 6 caracteres.
 - Cont�m no m�nimo 1 digito.
 - Cont�m no m�nimo 1 letra em min�sculo.
 - Cont�m no m�nimo 1 letra em mai�sculo.
 - Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+

D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o
tem certeza se � uma senha forte. Para ajudar D�bora, construa um
algoritmo que informe qual � o n�mero m�nimo de caracteres que devem
ser adicionados para uma string qualquer ser considerada segura.

 */

package quest�o02;

import java.util.Scanner;

public class Resolu��o02 {

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
			System.out.println("A senha n�o tem 6 caracteres");
			valid = false;
		}
		String upperCase = "(.*[A-Z].*)";
		if (!password.matches(upperCase)) {
			System.out.println("A senha deve conter pelo menos uma letra mai�scula");
			valid = false;
		}
		String upperCase1 = "(.*[a-z].*)";
		if (!password.matches(upperCase1)) {
			System.out.println("A senha deve conter pelo menos uma letra min�scula");
			valid = false;
		}
		String numbers = "(.*[0-9].*)";
		if (!password.matches(numbers)) {
			System.out.println("A senha deve conter pelo menos um d�gito");
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
