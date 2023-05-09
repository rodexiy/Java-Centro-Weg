public class Curso {
    private String nome;
    private int cargaHoraria;
    private UnidadesCurriculares unidadesCurriculares;

    public void setNome(String nome){
        if (nome.length() >= 3 && nome.matches("[A-Za-z]*")){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido!");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setCargaHoraria(int cargaHoraria){
        if (cargaHoraria > 0){
            this.cargaHoraria = cargaHoraria;
        }
    }

    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    public void setUnidadesCurriculares(UnidadesCurriculares unidadesCurriculares){
        this.unidadesCurriculares = unidadesCurriculares;
    }

    public UnidadesCurriculares getUnidadesCurriculares(){
        return this.unidadesCurriculares;
    }
}
