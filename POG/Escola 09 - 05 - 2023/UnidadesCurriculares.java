public class UnidadesCurriculares {
    private Avaliacao avaliacao;
    private float frequencia;
    private Professor professor; 

    public void setAvaliacao(Avaliacao avaliacao){
        this.avaliacao = avaliacao;
    }

    public Avaliacao getAvaliacao(){
        return this.avaliacao;
    }

    public void setFrequencia(Float frequencia){
        if (frequencia >= 0 && frequencia <= 100){
            this.frequencia = frequencia;
        }else{
            System.out.println("Frequencia inválida!");
        }
    }

    public float getfrequencia(){
        return this.frequencia;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor(){
        return this.professor;
    }
}
