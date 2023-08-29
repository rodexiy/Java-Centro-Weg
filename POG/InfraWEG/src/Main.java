public class Main {
	public static void main(String[] args) {
		WEG weg = new WEG();
		Gerador gerador = new Gerador("Gerador Industrial MK2", "codigo 123", 50000.0, "Cinetico", "10000H");
		InversorFrequencia inversor = new InversorFrequencia("Inversor 1", "teste123", 300.0, 500.0, 4);
		
		weg.adicionarProduto(gerador);
		weg.adicionarProduto(inversor);
		
		weg.listarInformacoesProdutos();
		
		gerador.realizarManutencao();
	}
}	
