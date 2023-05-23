
/**
 * Classe para representar as Unidades Curriculares
 * 
 * @author Daniel
 */

public class UnidadesCurriculares {
    private String nome;
    private Curso curso;

    /**
     * construtor da classe UnidadesCurriculares, recebe o nome da unidade
     * curricular em String e o curso
     * 
     * @param nome  (String)
     * @param curso (Curso)
     */
    public UnidadesCurriculares(String nome, Curso curso) {
        setNome(nome);
        setCurso(curso);
    }

    /**
     * atribui a classe nome à UnidadesCurriculares, contém verificações de tamanho
     * e caracteres alfabeticos
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
     * retorna o nome da classe UnidadesCurriculares
     * 
     * @return (String)
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * atribui o Curso à classe UnidadesCurriculares, verifica se o parâmetro é da
     * classe Curso
     * 
     * @param curso (Curso)
     * @return (boolean)
     */
    public boolean setCurso(Curso curso) {
        if (curso.getClass().getSimpleName() == "Curso") {
            this.curso = curso;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna o Curso da classe UnidadesCurriculares
     * 
     * @return (Curso)
     */
    public Curso getCurso() {
        return this.curso;
    }

}
