/**
 * A classe MotorEletrico representa um tipo específico de produto fabricado pela WEG - um motor elétrico.
 * Esta classe estende a classe ProdutoWEG e adiciona informações específicas sobre motores elétricos, como tipo de enrolamento e eficiência.
 */
public class MotorEletrico extends ProdutoWEG {
    private String tipoEnrolamento; // O tipo de enrolamento do motor elétrico.
    private double eficiencia;      // A eficiência do motor elétrico.

    /**
     * Construtor da classe MotorEletrico.
     *
     * @param nome            O nome do motor elétrico.
     * @param codigo          O código único do motor elétrico.
     * @param preco           O preço do motor elétrico.
     * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
     * @param eficiencia      A eficiência do motor elétrico.
     */
    public MotorEletrico(String nome, String codigo, double preco, String tipoEnrolamento, double eficiencia) {
        super(nome, codigo, preco); // Chama o construtor da classe pai ProdutoWEG com nome, código e preço.
        this.setTipoEnrolamento(tipoEnrolamento);
        this.setEficiencia(eficiencia);
    }

    /**
     * Obtém o tipo de enrolamento do motor elétrico.
     *
     * @return O tipo de enrolamento do motor elétrico.
     */
    public String getTipoEnrolamento() {
        return tipoEnrolamento;
    }

    /**
     * Define o tipo de enrolamento do motor elétrico.
     *
     * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
     */
    public void setTipoEnrolamento(String tipoEnrolamento) {
        this.tipoEnrolamento = tipoEnrolamento;
    }

    /**
     * Obtém a eficiência do motor elétrico.
     *
     * @return A eficiência do motor elétrico.
     */
    public double getEficiencia() {
        return eficiencia;
    }

    /**
     * Define a eficiência do motor elétrico.
     *
     * @param eficiencia A eficiência do motor elétrico.
     */
    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    
    /**
     * Imprime todas as informações do motor elétrico no console.
     */
    public void listarInformacoes() {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Tipo de Enrolamento: " + this.getTipoEnrolamento());
        System.out.println("Eficiência: " + this.getEficiencia());
    }

    /**
     * Realiza a manutenção no motor elétrico e imprime uma mensagem no console.
     */
    public void realizarManutencao() {
        System.out.println("Realizada manutenção no motor elétrico");
    }
}
