//import java.util.Locale; //Importanto uma lib qu é utilizada para configurar a localização do "Sistema"

public class Main {

	public static void main(String[] args) {
		/*System.out.println("Ffeito");//Imprimi com uma quebra de linha após o texto
		System.out.print("Feito"); // Imprimir sem quebra de linha, permitindo colocar mais texto ao lado*/
								
							// --Valores Numericos -- //
		/*
		 * 		
		double x = 10.35784; //Definindo uma variável com um valor fixo
		
														*Praticando*
		System.out.println(x);
		System.out.printf("%.2f%n",x); //Trazendo o valor da variável x com 2 casas decimais (Pode sofrer arredondamento de valor) 
		System.out.printf("%.4f%n",x); //Trazendo o valor da variável x com 4 casas decimais 
		Locale.setDefault(Locale.US);	
		System.out.printf("%.4f%n",x); //Como feito após o "Locale" é alterado a "," pelo "."
		System.out.println("Resultado = "+x+" Metros"); // Concatenando variável com valor statico para saida de dado
		System.out.printf("Resultado 2 = %.2f metros%n",x); // Concatenando variável com formatação com valor statico
		*/


												//Exercicio de Fixação//

/*
		
		String produto1 = "Computador";
		String produto2 = "Livro";
		
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double price1 = 2100.0;
		double price2= 650.50;
		double measure = 53.234567;
		
		
		System.out.printf("Produtos:%n%s, cujo valor é $%.2f%n",produto1,price1);
		System.out.printf("%s, cujo valor é $%.2f%n%n",produto2,price2);
		System.out.printf("Registro: %d anos de idade, código %d e gênero: %s%n%n",idade,codigo,sexo);
		System.out.printf("Medida (Três casas decimais): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Ponto decimal: %.3f", measure);


*/

		
										//Casting//
/* 			
		double a, resultado;
		int b,x;
		
		a = 5.0;
		
		x = 2;
		b = (int) a; // realiza a "conversão" para inteiro, 
		resultado = (double) b/x; //Realiza a conversão para Double 
		
		
		System.out.println(b);
		System.out.print(resultado);
*/

	}

}
