/*
 * Classe para representar as Unidades Curriculares
 * @author Daniel
 */

public class UnidadesCurriculares {
    private Avaliacao avaliacao;
    private Double frequencia;
    private Professor professor; 

    
    /* Atribui a classe Avaliacao à UnidadesCurriculares */
    public void setAvaliacao(Avaliacao avaliacao){
        this.avaliacao = avaliacao;
    }

    
    /* retorna a classe Avaliacao das UnidadesCurriculares */
    public Avaliacao getAvaliacao(){
        return this.avaliacao;
    }

    /* Atribui a frequencia à UnidadesCurriculares */
    public void setFrequencia(Double frequencia){
        if (frequencia >= 0 && frequencia <= 100){
            this.frequencia = frequencia;
        }else{
            System.out.println("Frequencia inválida!");
        }
    }

    /* retorna a frequencia das UnidadesCurriculares */
    public Double getfrequencia(){
        return this.frequencia;
    }

    /* Atribui a classe Professor à UnidadesCurriculares */
    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    /* Atribui a classe Professor à UnidadesCurriculares */
    public Professor getProfessor(){
        return this.professor;
    }
}
