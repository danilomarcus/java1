package aula02.erros;

public class Error05 {

	public static void main(String[] args) {
		
	   	double salario = 10;
	   	int dia_total = 30;
	   	int dia_parcial = 25;
		int dias = dia_total-dia_parcial-5;
		// Solu��o � usar um la�o if
		if(dias < 0){
			double salario_dia = salario / dias;
		}
		double salario_dia = salario / dias;
	   	System.out.println("O sal�rio por dia �: "+ salario_dia);
	   
   }
}
