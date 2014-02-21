/*
* Danilo Marcus - Segundo Programa
* https://github.com/danilomarcus
*/

//In�cio do c�digo 
import java.util.Scanner;

class SegundoPrograma {
	
	public static void main(String[] args) {
	
	// Inst�ncia da classe Scanner que permite ler dados do teclado
		Scanner teclado = new Scanner(System.in);
		
		//Cria��o de vari�veis
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
		System.out.println("\nDigite onde voc� nasceu");
		cidade = teclado.next();
		
		//Sa�da de dados
		System.out.println("\n*****************************\n");
		System.out.println("Ol� "+ nome +" "+sobrenome +", voc� tem "+ idade + " anos e nasceu em "+cidade);
		
		/*************    RESOLU��O DA TAREFA ******************/
		if(idade < 60)
		{
			System.out.println("MENOR QUE 60");
		}
		else
		{
			System.out.println("MAIOR IDADE");
		}
		/*************    FIM DA RESOLU��O ******************/
		
		System.out.println("\n*****************************\n");
		
	}	
}
//Fim do c�digo