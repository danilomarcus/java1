
public class Golf{


	public static void main(String[] args) {
		
		Veiculo Golf = new Veiculo();
		
/*		Golf.setMarca("Golf XL total Flex");
		Golf.setLigado(true);
		Golf.setGasolina(50);
		
		System.out.println(Golf.getGasolina());
		System.out.println(Golf.getMarca());
		System.out.println(Golf.isLigado()); // Veja que este métod não é getLigado pois ele é boolean
		System.out.println(Golf.viajar());*/
		
		/* TODO Chamar o método criado
		 * 
		 * Chame o método e devolva o retorno
		 * 
		 * */
		
		Veiculo jetta = new Veiculo();
		jetta.setMarca("VolksWagen");
		jetta.setGasolina(9);
		jetta.setLigado(true);
		
		System.out.println(jetta.viajar());
		
		
		
		
	}
	
}
