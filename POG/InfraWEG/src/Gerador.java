/**
 * A classe Gerador representa um tipo específico de produto fabricado pela WEG - um gerador.
 * Esta classe estende a classe ProdutoWEG e adiciona informações específicas sobre geradores, como tipo de combustível e autonomia.
 */
public class Gerador extends ProdutoWEG {
    private String tipoCombustivel; // O tipo de combustível usado pelo gerador.
    private String autonomia;       // A autonomia do gerador em unidades específicas.

    /**
     * Construtor da classe Gerador.
     *
     * @param nome            O nome do gerador.
     * @param codigo          O código único do gerador.
     * @param preco           O preço do gerador.
     * @param tipoCombustivel O tipo de combustível usado pelo gerador.
     * @param autonomia       A autonomia do gerador em unidades específicas.
     */
    public Gerador(String nome, String codigo, Double preco, String tipoCombustivel, String autonomia) {
        super(nome, codigo, preco); // Chama o construtor da classe pai ProdutoWEG com nome, código e preço.
        this.setTipoCombustivel(tipoCombustivel);
        this.setAutonomia(autonomia);
    }

    /**
     * Obtém o tipo de combustível usado pelo gerador.
     *
     * @return O tipo de combustível do gerador.
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Define o tipo de combustível usado pelo gerador.
     *
     * @param tipoCombustivel O tipo de combustível do gerador.
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * Obtém a autonomia do gerador.
     *
     * @return A autonomia do gerador em unidades específicas.
     */
    public String getAutonomia() {
        return autonomia;
    }

    /**
     * Define a autonomia do gerador.
     *
     * @param autonomia A autonomia do gerador em unidades específicas.
     */
    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }
    
    /**
     * Imprime todas as informações do gerador no console.
     */
    public void imprimirInformacoes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Tipo de Combustível: " + getTipoCombustivel());
        System.out.println("Autonomia: " + getAutonomia());

    }
    
    /**
     * Realiza a manutenção no gerador e imprime uma mensagem no console.
     */
    public void realizarManutencao() {
    	System.out.println("Realizado manutenção no gerador");
    }
}
