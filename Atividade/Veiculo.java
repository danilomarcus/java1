public class Veiculo {

	private String marca;
	private boolean ligado;
	private int gasolina;
	
	private String fabricante;
	private boolean carroLigado;
	private int combustivel;
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public boolean isCarroLigado() {
		return carroLigado;
	}

	public void setCarroLigado(boolean carroLigado) {
		this.carroLigado = carroLigado;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getGasolina() {
		return gasolina;
	}

	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}

	/*
	 * TODO Cria Método viajar
	 * 
	 * CRIAR O METODO viajar em que testa se o carro esta ligado e se a gasolina
	 * é maior que zero. Se estiver tudo OK com a gasolina e o carro estiver
	 * ligado deve imprimir a mensagem "viajando..."
	 * 
	 * Verifique se este método deverá ter retorno ou parâmetros *
	 */

	public String viajar() {

		String status = "";
		
		if (this.ligado && this.gasolina < 10) { // ligado sem gasolina

			status = "Abasteça o carro";

		} else if (this.ligado && this.gasolina > 10) { // ligado e com gasolina
		
			status = "Viajando";
		
		} else if (!this.ligado && this.gasolina < 10) { // desligado e sem gasolina 
		
			status = "Abasteça e ligue o carro";
		
		} else if (!this.ligado && this.gasolina > 10) {
		
			status = "Ligue o carro"; // com gasolina e desligado
		
		}

		return status;
	}
}
