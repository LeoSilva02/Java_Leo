import java.util.Locale;
import java.util.Scanner; // lib para entrada de dados

public class Entrada_Dados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Inicializando objeto Scanner
		//Observação: (Scanner é utilizado para ler os dados informado pelo usuário)
		
		/*
		 		*****("Next" é apenas para letras)***** 
		  
		  
		  String x;
		  
		  System.out.print("Informe um Valor: "); 
		  x = sc.next(); // Utilizado para
		  poder obter o valor digitado e salvar na variável
		  System.out.print("Você Digitou o  Valor: "+x);
----------------------------------------------------------------------------------------
		  
		 			*****("NextInt" é apenas para Inteiro)*****
		  
		  int a;
		  
		  System.out.println("Informe um número: "); a = sc.nextInt();
		  System.out.print("Você digitou o número: "+a);
---------------------------------------------------------------------------------------------

		 			*****("NextDouble" é apenas para Double)***** 
		 
		 
		 double a ;
		  
		  System.out.println("Informe um número: ");
		   a = sc.nextDouble();
		  Locale.setDefault(Locale.US);
		   System.out.print("Você digitou o número: "+a);
-------------------------------------------------------------------------------------------------		  
		 			
					*****("chatAt" é par obter a letra na posição informada no parâmetro)***** 
			
			**Observação:Para ler um unico caracter é necessario utilizar a função "ChatAt" e passar a posição 
			  da letra que você deseja obter, essa função é usada apenas para variáveis do tipo CHAR
		
					String x;
					int a;
					char letra;
					
					System.out.print("Informe um Nome: ");
		 			x = sc.next();
		 			
		 			System.out.print("Informe a posição da letra que deseja obter: ");
		 			a = sc.nextInt();
		 			letra = x.charAt(a-1);
		 			System.out.println("A letra é: "+letra);
-------------------------------------------------------------------------------------------------------------------------------
		 			
		 			*****("NextLine" é ler os dados da linha inteira)***** 
		 
		 **Observação: Ao utilizar um comando de leitura diferente de nextline 
		   ao dar um espaço o próximo valor não é "salvo" na variável, salvando na próxima variável caso tenha
		 
		  *Já o netLine permite que seja salvo todo o valor até a quebra de linha
		
		String s1,s2,s3;
		
		System.out.println("Digite 3 palavras:");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
	
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		  */
		 
		 
		sc.close(); // Encerrando Scanner

	}

}
