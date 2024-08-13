import java.util.Scanner;
public class Usando_Funcoes {

	public static void main(String[] args) {
		
	//Como utilizar funções em Java.	
		//1 - Funções com Retorno
		//2 - Funções sem Retorno
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três números");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int total = max(a,b,c);
		
		imprimir(total);
			
		sc.close();
	}
	
	//Definição de uma Função com o retorno, para isso é necessário definir o tipo após o "Static" e colocar o "return" no final.
	public static int max(int a, int b, int c) {
		int max;
		
		if(a>b && a>c) {
			max = a;
		}else if(b>c) {
			max = b;
		}else {
			max = c;
		}
		
		return max;
	}
	
	
	//Definição de uma Função sem retorno, para isso é utilizado o "Void".
	public static void imprimir(int valor) {
		System.out.println("O maior valor é: "+valor);
	}
	

}
