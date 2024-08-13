import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Primeiro_Exercicio {

	public static void main(String[] args) {
	
			//Scanner sc = new Scanner(System.in);
								
								//Exercícios Java sem uso de Métodos//
		
									//Exercício 1//
		/*
		int a,b;
		
		System.out.print("Informe dois valores para que sejam somados:\n 1ª = ");
		a = sc.nextInt();
		System.out.print(" 2º = ");
		b = sc.nextInt();
		
		System.out.println(" Soma = "+ (a+b));
-------------------------------------------------------------------------------------
			
								//Exercício 2//
			String A;
			double a,Resultado;
			double b = 3.14159; 
			
			System.out.print("Para que possa ser calculado a área é necessário informar o valor do Raio \nRaio = ");
			A = sc.next();
			
			// (Contains) Verifica se existe o caracter apontado no argumento
			if(A.contains(",")) {
				A = A.replace(',','.');	// Realiza a troca do caracter antigo pelo novo
			}
			
			a = Double.parseDouble(A); // Convertendo String para Double
			
			Locale.setDefault(Locale.US);
			a = Math.pow(a,2.00);
			Resultado = b*a;
			System.out.printf("A = %.4f",Resultado);
			
			
			
			/*Observação:
			 * A class "NumberFormatException" é uma class nativa do java para tratamento de erros relacionado a
			 *conversão de dados, seja 'int','double','float',etc...
			 
-------------------------------------------------------------------------------------------------------------------------
		
									//Exercício 3//
			String A,B,C,D;
			double a,b,c,d, result;
			
			System.out.println("Informe  numéros para que possa ser calculada a diferença entre eles:");
			Locale.setDefault(Locale.US);
			
			// Obtendo variável A, Trocando ',' por '.' e Convertendo string para Double
			A = sc.nextLine();
			if(A.contains(",")) {
			A =	A.replace(',' , '.');
			}
			a = Double.parseDouble(A);
			
			// Obtendo variável B, Trocando ',' por '.' e Convertendo string para Double
			B = sc.nextLine();
			if(B.contains(",")) {
			B = B.replace(',' , '.');
			}
			b = Double.parseDouble(B);
			
			// Obtendo variável C, Trocando ',' por '.' e Convertendo string para Double
			C = sc.nextLine();
			if(C.contains(",")) {
			C = C.replace(',' , '.');
			}
			c = Double.parseDouble(C);
			
			// Obtendo variável D, Trocando ',' por '.' e Convertendo string para Double
			D = sc.nextLine();
			if(D.contains(",")) {
			D = D.replace(',','.');
			}
			d = Double.parseDouble(D);
						
			result = (a*b - c*d);
			
			System.out.printf("Diferença = %.2f",result);
			
			sc.close();
			
			
-------------------------------------------------------------------------------------------------------------------------------
/*
									//Exercício 4//
			
			String A, B;
			double a, b, result;

			System.out.print("Informe a quantidade de horas trabalhadas pelo funcionário:\nHoras = ");
			A = sc.nextLine();
			try {
				a = Double.parseDouble(A);
			} catch (NumberFormatException e) {
				System.out.println("Informe uma hora valida!");
				System.exit(1);
			}
			
			a = Double.parseDouble(A);
			
			System.out.print("Informe o valor da hora:\nValor: ");
			B = sc.nextLine();
			try {
				if (B.contains(",")) {
					B = B.replace(',', '.');
				}
				b = Double.parseDouble(B);
			} catch (NumberFormatException e) {
				System.out.println("Informe um valor valido!");
				System.exit(1);
			}
			
			b = Double.parseDouble(B);
			result = a * b;

			System.out.printf("%nResultado = %.2f", result);
			sc.close();

		}

								//Exercício 5 sem Método//

			Scanner sc = new Scanner(System.in);
			
			int cod1,cod2,qtd1,qtd2;
			double valor1,valor2,result;
			
			System.out.println("Informe o código, o número e o valor unitário da peça 1: ");
				cod1 = sc.nextInt();
				qtd1 = sc.nextInt();
				valor1 = sc.nextDouble();	
			System.out.println("Informe o código, o número e o valor unitário da peça 2: ");
				cod2 = sc.nextInt();
				qtd2 = sc.nextInt();
				valor2 = sc.nextDouble();
				
				result = (valor1*qtd1) + (valor2*qtd2);
				
				System.out.printf("Valor a Pagar: %.2f",result);
*/
		   	
		
	}	
}
