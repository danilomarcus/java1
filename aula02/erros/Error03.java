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
    	// Solu��o � receber o salario_dia como double e
    	// n�o como int
    	double salario_dia = salario / dias;
    	System.out.println("O sal�rio por dia �: "+ salario_dia);
    	
    	System.out.printf("%.2f", salario_dia); // formata o valor para ter duas casas decimais
    }
}
