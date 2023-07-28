import java.util.Scanner;

/*Questão 2: Faça um programa que solicite ao usuário o ano em que ele nasceu e verifique se o ano é Bissexto ou não e imprima uma mensagem na tela.*/

public class Questao_2{
	public static void main(String[] args) throws Exception {
		Scanner ler = new Scanner(System.in);
		int ano;
		System.out.printf("Insira seu ano de nascimento: ");
  		ano = ler.nextInt();
		int resto = ano % 4;
		if (resto==0){
			System.out.println("O ano " + ano + " é bissexto");
		}
		else{
			System.out.println("O ano " + ano + " não é bissexto");
		}
		

	}
	
}
