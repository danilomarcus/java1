
public class Golf{


	public static void main(String[] args) {
		
		Veiculo Golf = new Veiculo();
		
/*		Golf.setMarca("Golf XL total Flex");
		Golf.setLigado(true);
		Golf.setGasolina(50);
		
		System.out.println(Golf.getGasolina());
		System.out.println(Golf.getMarca());
		System.out.println(Golf.isLigado()); // Veja que este m�tod n�o � getLigado pois ele � boolean
		System.out.println(Golf.viajar());*/
		
		/* TODO Chamar o m�todo criado
		 * 
		 * Chame o m�todo e devolva o retorno
		 * 
		 * */
		
		Veiculo jetta = new Veiculo();
		jetta.setMarca("VolksWagen");
		jetta.setGasolina(9);
		jetta.setLigado(true);
		
		System.out.println(jetta.viajar());
		
		
		
		
	}
	
}
