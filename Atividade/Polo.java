
public class Polo {

	public static void main(String[] args) {
		
		Veiculo Polo = new Veiculo();
		
		Polo.setFabricante("Polo iMotion total Flex");
		Polo.setCarroLigado(true);
		Polo.setCombustivel(120);
		
		System.out.println("------------------------------");
		System.out.println("Trabalho prático de Java");
		System.out.println("Prof: Danilo Marcus");
		System.out.println("------------------------------\n\n");
		
		System.out.println("Resultado do Polo:\n");
		System.out.println("Modelo: " + Polo.getFabricante());
		System.out.println("Ligado?: " + Polo.isCarroLigado());
		System.out.println("Tanque: " + Polo.getCombustivel()); 

		System.out.println();
		System.out.println();
		
		Veiculo Up = new Veiculo();
		
		Up.setFabricante("Up 1.0 iTrend");
		Up.setCarroLigado(false);
		Up.setCombustivel(60);
		
		System.out.println("Resultado do Up:\n");
		System.out.println("Modelo: " + Up.getFabricante());
		System.out.println("Ligado?: " + Up.isCarroLigado());
		System.out.println("Tanque: " + Up.getCombustivel()); 
		
	}

}
