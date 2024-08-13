import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Estrutura_For {

	public static void main(String[] args) {
		/*
		 				//Exercicio 1//
		 * 
		Scanner sc = new Scanner(System.in);
		int x;
		
		
		System.out.print("Informe um valor para que possa ser verificado nos números impares \nnúmero:  ");
		x = validarInteiro(sc);
		
		// só vai executar o comanda do for enquanto a condição no segundo parâmetro for verdadeiro
		for(int i = 0; i<= x;i++) {
		
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
//	
	public static int validarInteiro(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Por favor informe um número inteiro valido!");
				sc.next();
			}
		}
----------------------------------------------------------------------------------------------------------------

						//Exercicio 2//

		Scanner sc = new Scanner(System.in);
		
		int out = 0, in = 0,x,y;
		
		System.out.print("Informe a quantidade de números que deseja analisar \nQuantidade: ");
		x = sc.nextInt();
		
		for(int i = 1; i<=x;i++) {
			System.out.print(i+": ");
			y = validarInteiro(sc);
			
			if(y >= 10 & y<=20) {
				in +=1;
			}else {
				out +=1;
			}
			
		}
		
		System.out.printf("\n Números dentro do Intervalo de [10,20]\n%d Dentro do Intervalo\n%d Fora do Intervalo",in,out);
		
	}
	
	
	public static int validarInteiro(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Por favor informe um número inteiro valido!");
				sc.next();
			}
		}
-----------------------------------------------------------------------------------------------------------------------		
					//Exercicio 3//

			Scanner sc = new Scanner(System.in);
		
	double valor, result =0;
	
	System.out.println("Informe os valores para a realização do calculo:");
	
	for(int i = 1; i<=3;i++) {
		
		System.out.print("número "+i+": ");
		
		
		switch(i) {
			case 1:
			valor = validarDouble(sc);
				valor = valor *2;
			result = result +valor;
				break;
			case 2:
			valor = validarDouble(sc);
				valor= valor *3;
			result = result + valor;
				break;
			case 3:
			valor = validarDouble(sc);
				valor = valor *5;
				result = result +valor;
				break;
		}
		
	}
	
	result = result/10;
	System.out.printf("O Resultado é %.2f",result);
}

	public static Double validarDouble(Scanner sc) {
		
		while(true) {
			
			try {
				return sc.nextDouble();
			}catch (InputMismatchException e){
				System.out.println("Por favor informe um valor númerico!");
				sc.next();
			}
		}
-------------------------------------------------------------------------------------------------------------------		

					//Exercicio 4 //
				
		Scanner sc = new Scanner(System.in);
		
		int x;
		double val1,val2,result;
		
		Locale.setDefault(Locale.US);
		System.out.print("Informe quantas a quantidade de divisões que deseja realizar: ");
		 x = validarInteiro(sc);
		 
		
		for(int i = 1; i <= x; i++) {
			System.out.println("********************");
			System.out.print("Divisão "+i+": \nValor 1: ");
			val1 = validarDouble(sc);
			System.out.print("Valor 2: ");
			val2 = validarDouble(sc);
			
			
			if(val2 == 0) {
				System.out.println("Divisão Impossivel");
			}else {
				result = val1/val2;
				System.out.printf("Resultado: %.1f%n",result);
			}
			
		}
		
		
	}
	
	
	public static int validarInteiro(Scanner sc) {
		
		while(true) {
			
			try {
				return sc.nextInt();
			}catch (InputMismatchException e){
				System.out.println("Por favor informe um valor númerico!");
				sc.next();
			}
		}
	}
		
		public static Double validarDouble(Scanner sc) {
			
			while(true) {
				
				try {
					return sc.nextDouble();
				}catch (InputMismatchException e){
					System.out.println("Por favor informe um valor númerico!");
					sc.next();
				}
			}
---------------------------------------------------------------------------------------------------

		
			//	Exercicio 5 Refazer Treinar Lógica//
			 * 
			 * 
		Scanner sc = new Scanner(System.in);
		int n,result = 1;
		
		
		System.out.println("Informa o valor que deseja saber seu fatorial");
		n = validarInteiro(sc);
		
		for(int i = 1; i<=n;i++) {
			result*=i;
			System.out.println(i+": "+result);
			
		}
}
	
public static int validarInteiro(Scanner sc) {
		
		while(true) {
			
			try {
				return sc.nextInt();
			}catch (InputMismatchException e){
				System.out.println("Por favor informe um valor númerico!");
				sc.next();
			}
		}

-------------------------------------------------------------------------------------------------------	
		//Exercicio 6//
		Scanner sc = new Scanner(System.in);
		
		int x,result;
		
		System.out.print("Informe o número para que possa ser verificado os seus divisores\nNúmero: ");
		x = validarInteiro(sc);
		
		//O contador deve comçar com 1, visto que não é possivel dividir um valor por zero
		
		for(int i = 1; i<=x;i++) {
			
			if(x % i == 0) {
				System.out.println(i);
			}
			
		}
		
	
	}

public static int validarInteiro(Scanner sc) {
		
		while(true) {
			
			try {
				return sc.nextInt();
			}catch (InputMismatchException e){
				System.out.println("Por favor informe um valor númerico!");
				sc.next();
			}
		}
-------------------------------------------------------------------------------------------------------------------
*/
				Scanner sc = new Scanner(System.in);
		int x,quadrado,cubo;
		
		System.out.println("Informe um valor: ");
		x = validarInteiro(sc);
		
		for(int i = 1; i<=x; i++) {
		
			quadrado = i*i;
			cubo = i*i*i;
			
		System.out.println(i+" "+quadrado+" "+cubo);	
			
		}
		
		
		
	}
	
	public static int validarInteiro(Scanner sc) {
		while(true) {
		
			try {
				return sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Informe um número Inteiro");
				sc.next();
			}
		}
		
		
	}
	

}
