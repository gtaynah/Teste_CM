import java.util.Scanner;

public class Questao_1{
	public static void main(String[] args) throws Exception {
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		System.out.printf("Insira um número: ");
  		n1 = ler.nextInt();
		System.out.printf("Insira outro número: ");
  		n2 = ler.nextInt();
		if(n1>n2){
			System.out.println("A raiz quadrada de " + n1 + " é " + Math.sqrt(n1));
			System.out.println("O quadrado de " + n2 + " é " + Math.pow(n2,2));
		}
		else if(n2>n1){
			System.out.println("A raiz quadrada de " + n2 + " é " + Math.sqrt(n2));
			System.out.println("O quadrado de " + n1 + " é " + Math.pow(n1,2));
		}
		else{
			System.out.println("Os números são iguais!");
		}

	}
	
}
