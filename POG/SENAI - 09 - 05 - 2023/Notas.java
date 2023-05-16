public class Notas {
    private Aluno aluno;
    private Avaliacao avaliacao;
    private Double nota;

    public Notas(Aluno aluno, Avaliacao avaliacao, Double  nota){
        setAluno(aluno);
        setAvaliacao(avaliacao);
        setNota(nota);
    }

    public boolean setAluno(Aluno aluno){
        if (aluno.getClass().getSimpleName() == "Aluno"){
            this.aluno = aluno;
            return true;
        }else{
            return false;
        }
    }

    public Aluno getAluno(){
        return this.aluno;
    }

    public boolean setAvaliacao(Avaliacao avaliacao){
        if (avaliacao.getClass().getSimpleName() == "Avaliacao"){
            this.avaliacao = avaliacao;
            return true;
        }else{
            return false;
        }
    }

    public Avaliacao getavaliacao(){
        return this.avaliacao;
    }

    public boolean setNota(Double nota){
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
            return true;
        }else {
            return false;
        }
    }

    public Double getNota(){
        return this.nota;
    }

}
