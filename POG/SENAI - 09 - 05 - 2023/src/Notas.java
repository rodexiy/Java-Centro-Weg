
/**
 * Classe para representar as notas
 * 
 * @author Daniel
 */

public class Notas {
    private Aluno aluno;
    private Avaliacao avaliacao;
    private Double nota;

    /**
     * construtor da classe Notas, recebe a classe Aluno, Avaliacao e um Double
     * referente a nota
     * 
     * @param aluno     (Aluno)
     * @param avaliacao (Avaliacao)
     * @param nota      (Double)
     */
    public Notas(Aluno aluno, Avaliacao avaliacao, Double nota) {
        setAluno(aluno);
        setAvaliacao(avaliacao);
        setNota(nota);
    }

    /**
     * atribui a classe Aluno à Notas, verifica se o parâmetro é da classe Aluno
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
     * reorna a classe Aluno da classe Notas
     * 
     * @return (Aluno)
     */
    public Aluno getAluno() {
        return this.aluno;
    }

    /**
     * atribui a classe Avaliacao à Notas, verifica se o parâmetro é da classe
     * Avaliacao
     * 
     * @param avaliacao (Avaliacao)
     * @return (boolean)
     */
    public boolean setAvaliacao(Avaliacao avaliacao) {
        if (avaliacao.getClass().getSimpleName() == "Avaliacao") {
            this.avaliacao = avaliacao;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna a classe Avalicao da classe Notas
     * 
     * @return (Avaliacao)
     */
    public Avaliacao getavaliacao() {
        return this.avaliacao;
    }

    /**
     * atribui a nota à classe Notas, verifica se o Double está entre 0 e 10
     * 
     * @param nota (Double)
     * @return (boolean)
     */
    public boolean setNota(Double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna a nota da classe Notas
     * 
     * @return (Double)
     */
    public Double getNota() {
        return this.nota;
    }

}
