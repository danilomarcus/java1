/*
* Danilo Marcus - Segundo Programa
* https://github.com/danilomarcus
*/

//Início do código 
import java.util.Scanner;

class SegundoPrograma {
	
	public static void main(String[] args) {
	
	// Instância da classe Scanner que permite ler dados do teclado
		Scanner teclado = new Scanner(System.in);
		
		//Criação de variáveis
		String nome;
		String sobrenome;
		int idade;
		String cidade; 
		
		//Entrada de dados
		System.out.println("\nDigite seu Nome");
		nome = teclado.next();
		System.out.println("\nDigite seu Sobrenome");
		sobrenome = teclado.next();
		System.out.println("\nDigite sua idade");
		idade = teclado.nextInt();
		System.out.println("\nDigite onde você nasceu");
		cidade = teclado.next();
		
		//Saída de dados
		System.out.println("\n*****************************\n");
		System.out.println("Olá "+ nome +" "+sobrenome +", você tem "+ idade + " anos e nasceu em "+cidade);
		
		/*************    RESOLUÇÃO DA TAREFA ******************/
		if(idade < 60)
		{
			System.out.println("MENOR QUE 60");
		}
		else
		{
			System.out.println("MAIOR IDADE");
		}
		/*************    FIM DA RESOLUÇÃO ******************/
		
		System.out.println("\n*****************************\n");
		
	}	
}
//Fim do código