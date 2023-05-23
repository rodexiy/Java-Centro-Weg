
/**
 * Classe para representar a Matricula
 * 
 * @author Daniel
 */

public class Matricula {
    private String codigo;
    private UnidadesCurriculares unidadesCurriculares;
    private Aluno aluno;

    /**
     * construtor da classe Matricula, recebe a classe Aluno e UnidadesCurriculares
     * 
     * @param aluno                (Aluno)
     * @param unidadesCurriculares (UnidadesCurriculares)
     */
    public Matricula(Aluno aluno, UnidadesCurriculares unidadesCurriculares) {
        setAluno(aluno);
        setUnidadesCurriculares(unidadesCurriculares);
    }

    /**
     * atribui o numero da matricula à classe Matricula
     * 
     * @param codigo (String)
     * @return (boolean)
     */
    public boolean setCodigo(String codigo) {
        boolean codigoValido = true;
        String[] codigoSplit = codigo.split("S");
        String numero = codigoSplit[1];

        if (numero.length() != 5) {
            codigoValido = false;
        }

        if (!numero.matches("[0-9]*")) {
            codigoValido = false;
        }

        if (codigoValido) {
            this.codigo = codigo;
        }
        return codigoValido;
    }

    /**
     * retorna o numero da matricula da classe Matricula
     * 
     * @return (String)
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * Metodo para atribuir nome na classe Matricula, verifica se o parametro aluno
     * é da classe Aluno
     * 
     * @param aluno (Aluno)
     * @return (boolean)
     */
    public boolean setAluno(Aluno aluno) {
        if (aluno.getClass().getSimpleName() == "Aluno") {
            this.aluno = aluno;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna o aluno da classe Matricula
     * 
     * @return (Aluno)
     */
    public Aluno getAluno() {
        return this.aluno;
    }

    /**
     * Metodo para atribuir nome na classe Matricula, verifica se o parametro
     * unidadesCurriculares é da classe UnidadesCurriculares
     * 
     * @param unidadesCurriculares (UnidadesCurriculares)
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
     * retorna as UnidadesCurriculares da classe Matricula
     * 
     * @return (UnidadesCurriculares)
     */
    public UnidadesCurriculares getUnidadesCurriculares() {
        return this.unidadesCurriculares;
    }

}
