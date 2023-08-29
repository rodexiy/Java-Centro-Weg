/**
 * A classe ServicoManutencao representa um serviço de manutenção oferecido pela WEG.
 * Esta classe contém informações sobre o nome, descrição e custo do serviço.
 */
public class ServicoManutencao {
    private String nome;       // O nome do serviço de manutenção.
    private String descricao;  // A descrição do serviço de manutenção.
    private double custo;      // O custo do serviço de manutenção.

    /**
     * Construtor da classe ServicoManutencao.
     *
     * @param nome      O nome do serviço de manutenção.
     * @param descricao A descrição do serviço de manutenção.
     * @param custo     O custo do serviço de manutenção.
     */
    public ServicoManutencao(String nome, String descricao, double custo) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setCusto(custo);
    }

    /**
     * Obtém o nome do serviço de manutenção.
     *
     * @return O nome do serviço de manutenção.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do serviço de manutenção.
     *
     * @param nome O nome do serviço de manutenção.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a descrição do serviço de manutenção.
     *
     * @return A descrição do serviço de manutenção.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do serviço de manutenção.
     *
     * @param descricao A descrição do serviço de manutenção.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o custo do serviço de manutenção.
     *
     * @return O custo do serviço de manutenção.
     */
    public double getCusto() {
        return custo;
    }

    /**
     * Define o custo do serviço de manutenção.
     *
     * @param custo O custo do serviço de manutenção.
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }
}
