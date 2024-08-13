
public class Funcoes_Matematicas {

	public static void main(String[] args) {

		// *****Funções Matemáticas*****//

		double x = 3; // Em valores (Double) é bom colocar o ".0" ao final para identificar,
						// basicamente uma boa prática//
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		// ***** (Math.sqrt) *****//
		
		// É uma Função utilizada para achar a raiz quadrada do Valor, servindo
		// apenas para ser salva em variável do tipo (Double)

		System.out.printf("%n**************** Função Math.sqrt **********%n%n");
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("  Raiz quadrada de " + x + " = " + A);
		System.out.println("  Raiz quadrada de " + y + " = " + B);
		System.out.println("  Raiz quadrada de 25 = " + C);
	

		System.out.printf("********************************************");

		// ***** (Math.pow) *****//

		// É uma Função utilizada para achar o Valor elevado de uma variável por outra,
		// servindo apenas para ser salva em variável do tipo (Double)

		System.out.printf("%n%n**************** Função Math.pow **********%n%n");

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println("  "+x + " elevado a " + y + " = " + A);
		System.out.println("  "+  x + " elevado ao quadrado" + " = " + B);
		System.out.println("  5 elevado ao quadrado = " + C);

		System.out.printf("********************************************");

		// ***** (Math.pow) *****//

		//É uma Função utilizada para achar o Valor absoluto de uma variável, servindo 
		//apenas para ser salva em variável do tipo (Double)

		System.out.printf("%n%n**************** Função Math.abs **********%n%n");
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("  Valor absoluto de "+ y +" = "+ A );
		System.out.println("  Valor absoluto de "+ z + " = "+ B);
		
		
	}

}
