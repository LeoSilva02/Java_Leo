import java.util.Scanner;
import java.util.InputMismatchException;


public class Estrutura_While {

	public static void main(String[] args) {

		 		//Exercicio 1 //
		 		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print(" Informe a Senha correta!\n");
		x = validarInteiro(sc);
		
		while(x != 2002) {
			System.out.println("Senha Invalida");
			x = validarInteiro(sc);
			
		}
	
		System.out.println("Acesso Permitido");
	}

	
	
	public static int validarInteiro(Scanner sc) {
		while(true) {
			
			try {
				return sc.nextInt();	
			}catch (InputMismatchException e){
				
				System.out.println("A senha informada deve conter apenas NÚMEROS!");
				sc.next();
			}
			
		}
		/*
//-----------------------------------------------------------------------------------------------------------------------------------		

				//Exercicio 2 //

		Scanner sc = new Scanner(System.in);
		int x,y;
		String result;
		
	System.out.print("Informe as coordenadas X e Y para verificar o quadrante\n");
	x = validarInteiro(sc);
	y = validarInteiro(sc);
	
	//Enquanto a condição for verdadeira ele executara a instrução dentro do while
	while(x != 0 & y != 0) {
		result = validarQuadrante(x,y);
		System.out.println(result);
		x = validarInteiro(sc);
		y = validarInteiro(sc);
		}
		
	}
	
	public static String validarQuadrante(int x, int y) {
		String mensagem;
		
				if(x > 0 & y > 0) {
					mensagem = "Primeiro Quadrante"; 
				}else if(x < 0 & y > 0) {
					mensagem = "Segundo Quadrante";
				}else if (x < 0 & y < 0) {
					mensagem = "Terceiro Quadrante";
				}else {
					mensagem = "Quarto Quadrante";
				}

		return mensagem;

		}
	
	
	public static int validarInteiro(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Por Favor informe um número inteiro.");
				sc.next();
			}
		}
		
//----------------------------------------------------------------------------------------------------------
	
				//Exercicio 3 //

		
		Scanner sc = new Scanner (System.in);
		
	int cod,prod1 = 0 ,prod2 = 0,prod3 = 0;
		
		
		
	System.out.println("--------------------");	
	System.out.println("|Código |Produto   |");	
	System.out.println("--------------------");
	System.out.println("|   1   |Álcool    |");
	System.out.println("|   2   |Gasolina  |");	
	System.out.println("|   3   |Diesel    |");	
	System.out.println("|   4   |Fechar    |");
	System.out.println("--------------------");
	
	System.out.print("Informe o código do produto desejado:\n");
	cod = validarInteiro(sc);
	
	while(cod != 4) {
		//no switch é posto a condição para a verificação no case
		switch(cod) {
		//No case é colocado o valor esperado da condição do switch
		case 1:
			prod1 += 1;
			break;
		case 2:
			prod2 +=1;
			break;
		case 3:
			prod3 +=1;
			break;
		}
		System.out.print("Informe o código do produto desejado:\n");
		cod = validarInteiro(sc);
			
	}
	System.out.println("--------------------");
	System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d",prod1,prod2,prod3);
	

	}
	
	public static int validarInteiro(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Por favor informe um número INTEIRO valido.");
				sc.next();
			}
		}
		
		
		*/
	
		
		
	}
	
}








