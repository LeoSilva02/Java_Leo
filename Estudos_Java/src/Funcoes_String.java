
public class Funcoes_String {

	public static void main(String[] args) {
		
					// Funções String//
		
		String original = "abc ABC gjg NfB ";
		
		// Funções de Formatação de texto//
		
		String s1 = original.toLowerCase(); // Tornar o texto da variável Minúsculo
		String s2 = original.toUpperCase(); // Tornar o texto da variável Maiúscula
		String s3 = original.trim(); // Remove os espaços no inicio e no fim do texto da variável
				
		System.out.println("Original: "+original);
		System.out.println("ToLowerCase (Minúsculo): -"+s1+"- ");
		System.out.println("ToUpperCase (Maiúsculo): - "+s2+" - ");
		System.out.println("Trim (remover espaço): -"+s3+"- ");
		
		
		//Funções para Recortar o texto 
		System.out.println("------------------------------------------------------------------------------\nFunções para Recortar o texto \n");
		String s4 = original.substring(5); //Retornando o texto após a posição do carácter informado
		String s5 = original.substring(1,9);//Retornando o texto entre as posições do carácter informado
		
		System.out.println("Substring (Recorte de texto da posição 5): -"+s4+"- ");
		System.out.println("Substring (Recorte de texto da posição 1 a 9): -"+s5+"- ");
		
		
		//Funções para Substituir texto
		System.out.println("------------------------------------------------------------------------------\nFunções para Substituir texto\n");
		String s6 = original.replace("abc", "123");//Troca o trecho do texto por outro
		String s7 = original.replace("B", "1");//Troca o carácter do texto por outro
		
		System.out.println("Replace (Trocar o texto): -"+s6+"- ");
		System.out.println("Replace (Trocar carácter): -"+s7+"- ");
		
		
		//Funções para Buscar texto
		System.out.println("------------------------------------------------------------------------------\nFunções para Buscar texto\n");
		int s8 = original.indexOf('A'); //Busca a primeira posição(inteiro) do carácter no texto
		int s9 = original.lastIndexOf('f');//Busca a última posição(inteiro) do carácter no texto
		
		System.out.println("IndexOf (obtem a primeira posição do carácter): "+s8);
		System.out.println("LastIndexOf (obtem a última posição do carácter): "+s9);
		
		
		//Função para quebrar texto em Lista
		System.out.println("------------------------------------------------------------------------------\nFunção para quebrar texto em Lista\n");
		String text = "Maça,Pera,Manga";
		
		//Quebrando o texto no caracter ',' gerando um Vetor
		String [] List = text.split(","); //Para o uso do Split é necessário utilizar uma variável tipo Vetor(Lista)"[]"
		
		System.out.println("Posição 1: "+ List[0]); //Em vetor a primeira posição comeã em '0' e não em '1'
		System.out.println("Posição 2: "+ List[1]);
		System.out.println("Posição 3: "+ List[2]);
		
	}

}
