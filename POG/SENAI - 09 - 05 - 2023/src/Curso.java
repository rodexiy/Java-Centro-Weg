
/**
 * Classe sobre o curso
 * 
 * @author Daniel
 */

public class Curso {
    private String nome;

    /**
     * construtor da classe Curso
     * 
     * @param nome (String)
     */
    public Curso(String nome) {
        setNome(nome);
    }

    /**
     * Método que atribui o nome do curso, contém verificações de tamanho e
     * caracteres alfabeticos
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
     * Retorna o nome do curso
     * 
     * @return (String)
     */
    public String getNome() {
        return this.nome;
    }

}
