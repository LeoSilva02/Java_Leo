import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Operador_Logico {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
/*
 						//Exercicio 1//
		int a;
	
		a = validarInt(sc,"Informe um valor para válidação: ");
		
		if(a > 0) {
			System.out.println("Valor Não Negativo");
		}else if(a == 0) {
			System.out.println("Valor igual a Zero");
		}else {
			System.out.println("Valor Negativo");
		}
		
		
	}		

	public static int validarInt(Scanner sc, String mensagem) {
		 while(true) {
			 System.out.println(mensagem);
			
			 try {
				 return sc.nextInt();
				 
			 }catch(InputMismatchException e) {
				 System.out.println("Entrada inválida.\n");
				 sc.next();
			 }
		 }
---------------------------------------------------------------------------------------------------------------------------------------

									//Exercicio 2//
								
							Scanner sc = new Scanner(System.in);
		
		int a;
		String result;
		
		System.out.print("Informe um número: ");
		a = validarInt(sc);
		result = calcResto(a);
		System.out.println(result);
	}
	
	public static int validarInt(Scanner sc) {
		while(true) {
		
			try {
				return sc.nextInt();
			}catch (InputMismatchException e){
				System.out.println("O valor passado deve ser um número inteiro. Por favor insira um novo número \n");
				sc.next();
			}
		}
		
	}
	
	public static String calcResto(int a) {
		String mensagem;

		if (a % 2 == 0) {
			mensagem = "Número PAR";
		} else if (a % 3 == 0) {
			mensagem = "Número IMPAR";
		}else {
	        mensagem = "Número não é divisível por 2 nem por 3";
	    }
		return mensagem;

*-------------------------------------------------------------------------------------------------------------------------------------*

								//Exercicio 3 //
		
							Scanner sc = new Scanner(System.in);
		
		int valor1,valor2;
		String result;
		
		System.out.print("Informe dois valores:\nValor 1: ");
		valor1 = validarEntrada(sc,"Valor 1: "); // a variável 'a' vai chamar a função que faz a leitura e validação da entrada de dado.
		System.out.print("Valor 2: ");
		valor2 = validarEntrada(sc,"Valor 2: ");
		
		result = validarMultiplos(valor1,valor2);
		System.out.println(result);
		
	}
		
	public static String validarMultiplos (int a,int b) {
		String mensagem;
		
		if(a>b) {
			if(a % b == 0) {
				mensagem = "Os Valores São Multiplos";
			}else {
				mensagem = "Os Valores Não São Multiplos";
			}
		}else if (a<b) {
			if(b % a == 0) {
				mensagem = "Os Valores São Multiplos";
			}else {
				mensagem = "Os Valores Não São Multiplos";
			}
		}else {
			mensagem = "Os valores são iguais, logo são Multiplos";
		}
		
		return mensagem;		
	}
	
	
	public static int validarEntrada(Scanner sc, String mensagem) {
		while(true) {
			try {
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.print("Por favor informe um valor inteiro.\n"+mensagem);
				sc.next();
			}
		}
		
		
-------------------------------------------------------------------------------------------------------------------------------------*

								//Exercicio 4 (Não foi feito por mim)//
	
		
					Scanner sc = new Scanner(System.in);
		

					int horaInicial = sc.nextInt();
					int horaFinal = sc.nextInt();
					
					int duracao;
					if (horaInicial < horaFinal) {
						duracao = horaFinal - horaInicial;
					}
					else {
						duracao = 24 - horaInicial + horaFinal;
					}
					
					System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
					
					sc.close();
		
					
	*/		
					
									//Exercicio 5 //
		
			Scanner sc = new Scanner(System.in);
			// Criação de um ArrayList que permite apenas salvar valores tipo Double
			//ao utilizr '<Double>' eu defino qual tipo vai ser permitido armazenar no array
			ArrayList<Double> lista = new ArrayList<>(); 
			
		
		int codigo, quant, tamanho;
		double valor;
		
		System.out.println("-----------------------------------------");		
		System.out.println("|CODIGO   | Especificação       | Preço |");
        System.out.println("|---------|---------------------|-------|");

        // Imprime cada linha da tabela
        System.out.println("|1        | Cachorro Quente     | R$4.00|");
        System.out.println("|2        | X-Salada            | R$4.50|");
        System.out.println("|3        | X-Bacon             | R$5.00|");
        System.out.println("|4        | Torrada Simples     | R$2.00|");
        System.out.println("|5        | Refrigerante        | R$1.50|");
        System.out.println("|0        | Sair                |*******|");
        System.out.println("-----------------------------------------");
					
		System.out.println("Informe o codigo do produto e a quantidade que deseja");
	
		do {
			System.out.print("\nCódigo: ");
			codigo = validarInteiro(sc);
			if (codigo != 0) {
				if (validarCodigo(codigo)) {

					System.out.print("Quantidade: ");
					quant = validarInteiro(sc);
					valor = valorProd(codigo, quant);
					lista.add(valor);
				} else {
					System.out.println("Código não encontrado.");
				}
			} else {

			}

		} while (codigo != 0);
		
		valor = valorConta(lista);

		System.out.printf("Sua Conta deu R$%f.2",valor);
		
		
	}
	//
	public static int validarInteiro(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Por favor informe um valor Inteiro");
				sc.next();
			}
		}
	}
	
	//
	public static boolean validarCodigo(int a) {
		
		if(a <= 5 & a >= 0) {
			return true;
		}else {
			return false;	
		}	
	}
	
	//
	public static double valorProd (int cod, int qtd) {
		double result;
		if(cod == 1) {
			result = 4.00 * qtd; 
		}else if(cod == 2) {
			result = 4.50 * qtd;
		}else if(cod == 3) {
			result = 5.0 * qtd;
		}else if(cod == 4) {
			result = 2.0 * qtd;
		}else if(cod == 5) {
			result = 1.50 * qtd;
		}else {
			result = 0;
		}
		
		return result;
	}
		
	//
	
	public static double valorConta(ArrayList<Double> lista) {
		int tamanho = lista.size();
		double valor = 0;
		
		for(int i = 0;i < tamanho;i++) {
			valor +=  lista.get(i);
		}
		
		return valor;
	}
	
	
	
	
}
	
	
					


