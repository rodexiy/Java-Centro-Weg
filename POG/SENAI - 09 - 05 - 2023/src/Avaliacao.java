
/** Classe que define as avaliações */

public class Avaliacao {
    private String nome;
    private UnidadesCurriculares unidadesCurriculares;

    /**
     * Construtor da classe Avalicao, recebe nome e UnidadesCurriculares
     * 
     * @param nome                 (String)
     * @param unidadesCurriculares (UnidadesCurriculares)
     */
    public Avaliacao(String nome, UnidadesCurriculares unidadesCurriculares) {
        setNome(nome);
        setUnidadesCurriculares(unidadesCurriculares);

    }

    /**
     * Metodo para adicionar nome na classe Avaliacao, contém verificações de
     * tamanho e caracteres alfabeticos
     * 
     * @param nome (String)
     * @return (boolean)
     */
    public boolean setNome(String nome) {
        if (nome.length() > 0 && nome.matches("[A-Za-z\\s]*")) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna o nome da avaliação
     * 
     * @return (String)
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Metodo para adicionar as UnidadesCurriculares na classe Avaliacao, verifica
     * se a classe é mesmo UnidadesCurriculares
     * 
     * @param unidadesCurriculares (unidadesCurriculares)
     * @return (boolean)
     */
    public boolean setUnidadesCurriculares(UnidadesCurriculares unidadesCurriculares) {
        if (unidadesCurriculares.getClass().getSimpleName() == "UnidadesCurriculares") {
            this.unidadesCurriculares = unidadesCurriculares;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna as UnidadesCurriculares da classe Avalicao
     * 
     * @return (UnidadesCurriculares)
     */
    public UnidadesCurriculares getUnidadesCurriculares() {
        return this.unidadesCurriculares;
    }

}
