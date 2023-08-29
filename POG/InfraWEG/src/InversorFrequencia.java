/**
 * A classe InversorFrequencia representa um tipo específico de produto fabricado pela WEG - um inversor de frequência.
 * Esta classe estende a classe ProdutoWEG e adiciona informações específicas sobre inversores de frequência, como capacidade de frequência e número de fases.
 */
public class InversorFrequencia extends ProdutoWEG {
    private double capacidadeFrequencia; // A capacidade de frequência do inversor de frequência.
    private int numeroFases;             // O número de fases do inversor de frequência.

    /**
     * Construtor da classe InversorFrequencia.
     *
     * @param nome              O nome do inversor de frequência.
     * @param codigo            O código único do inversor de frequência.
     * @param preco             O preço do inversor de frequência.
     * @param capacidadeFrequencia A capacidade de frequência do inversor de frequência.
     * @param numeroFases       O número de fases do inversor de frequência.
     */
    public InversorFrequencia(String nome, String codigo, double preco, double capacidadeFrequencia, int numeroFases) {
        super(nome, codigo, preco); // Chama o construtor da classe pai ProdutoWEG com o nome, código e preço.
        this.setCapacidadeFrequencia(capacidadeFrequencia);
        this.setNumeroFases(numeroFases);
    }

    /**
     * Obtém a capacidade de frequência do inversor de frequência.
     *
     * @return A capacidade de frequência do inversor de frequência.
     */
    public double getCapacidadeFrequencia() {
        return capacidadeFrequencia;
    }

    /**
     * Define a capacidade de frequência do inversor de frequência.
     *
     * @param capacidadeFrequencia A capacidade de frequência do inversor de frequência.
     */
    public void setCapacidadeFrequencia(double capacidadeFrequencia) {
        this.capacidadeFrequencia = capacidadeFrequencia;
    }

    /**
     * Obtém o número de fases do inversor de frequência.
     *
     * @return O número de fases do inversor de frequência.
     */
    public int getNumeroFases() {
        return numeroFases;
    }

    /**
     * Define o número de fases do inversor de frequência.
     *
     * @param numeroFases O número de fases do inversor de frequência.
     */
    public void setNumeroFases(int numeroFases) {
        this.numeroFases = numeroFases;
    };

    /**
     * Imprime todas as informações do inversor de frequência no console.
     */
    public void imprimirInformacoes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Capacidade de Frequência: " + getCapacidadeFrequencia());
        System.out.println("Número de Fases: " + getNumeroFases());

        // Você pode adicionar mais informações específicas do inversor de frequência aqui, se necessário.
    }
    
    /**
     * Realiza a manutenção no inversor de frequência e imprime uma mensagem no console.
     */
    public void realizarManutencao() {
    	System.out.println("Realizado manutenção no inversor de frequencia");
    }
}
