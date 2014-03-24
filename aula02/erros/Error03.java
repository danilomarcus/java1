package aula02.erros;
/*
* Danilo Marcus - Segundo Programa
* https://github.com/danilomarcus
* DESCOBRINDO ERROS
*/

class Error03 {
    public static void main(String[] args) {

     	double salario = 990;
    	int dias = 30;
    	// Solução é receber o salario_dia como double e
    	// não como int
    	double salario_dia = salario / dias;
    	System.out.println("O salário por dia é: "+ salario_dia);
    	
    	System.out.printf("%.2f", salario_dia); // formata o valor para ter duas casas decimais
    }
}
