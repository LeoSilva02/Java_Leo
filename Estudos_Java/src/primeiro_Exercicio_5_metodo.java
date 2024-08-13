import java.util.Locale;
import java.util.InputMismatchException;
import java.util.Scanner;

public class primeiro_Exercicio_5_metodo {

	public static void main(String[] args) {
		// Exercício 5 com Método//

			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			int cod1,cod2,qtd1,qtd2;
			double valor1,valor2,result;
			

			System.out.println("Informe o código, quantidade e valor da peça 1:");
			cod1 = validarInteiro(sc,"Código 1: ");
			qtd1 = validarInteiro(sc,"Quantidade da peça 1: ");
			valor1 = validarDouble(sc, "Valor da peça 1: ");
			System.out.println("\n**********************************************************************\n");
			System.out.println("Informe o código, quantidade e valor da peça 2:");
			cod2 = validarInteiro(sc,"Código 2: ");
			qtd2 = validarInteiro(sc,"Quantidade da peça 2: ");
			valor2 = validarDouble(sc, "Valor da peça 2: ");
			
			result = (valor1*qtd1) + (valor2 * qtd2);
		
		System.out.printf("Valor a Pagar: R$%.2f",result);
		
		
		
	}

	public static int validarInteiro(Scanner sc, String mensagem) {
		// Looping infinito, apenas saira do loop ao cair no return, que saira do método. 
		while(true) {
			System.out.print(mensagem);
		
			try {
				return sc.nextInt(); // retornará o valor de entrada caso não tenha exception
			}catch (InputMismatchException e){
				 System.out.println("Entrada inválida. Por favor, insira um número inteiro");
				 sc.next(); //Limpando entrada de dados
			}
		}
		
		
	}
	
	public static double validarDouble(Scanner sc, String mensagem) {
		// Looping infinito, apenas saira do loop ao cair no return, que saira do método.
		while(true) {
			System.out.print(mensagem);
			
			try {
				return sc.nextDouble(); //Obtendo entrada de dado e retorna no método.
			}catch (InputMismatchException e){
				System.out.println("Entrada inválida. Por favor, insira um valor décimal");
				sc.next(); // Limpando Entrada de dados.
			}
		}
	}
	
	
	
	
	
	
	
}
