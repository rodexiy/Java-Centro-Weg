/* Classe que define as avaliações */

public class Avaliacao {
    private String nome;
    private UnidadesCurriculares unidadesCurriculares;

    public Avaliacao(String nome, UnidadesCurriculares unidadesCurriculares){
        setNome(nome);
        setUnidadesCurriculares(unidadesCurriculares);

    }

    public boolean setNome(String nome){
        if (nome.length() > 0 && nome.matches("[A-Za-z]*")){
            this.nome = nome;
            return true;
        }else{
            System.out.println("Nome inválido!");
            return false;
        }
    }

    public String getNome(){
        return this.nome;
    }


    public boolean setUnidadesCurriculares(UnidadesCurriculares unidadesCurriculares){
        if (unidadesCurriculares.getClass().getSimpleName() == "UnidadesCurriculares"){
            this.unidadesCurriculares = unidadesCurriculares;
            return true;
        }else{
            System.out.println("unidades Curriculares inválidas!");
            return false;
        }
    }

    public UnidadesCurriculares getUnidadesCurriculares(){
        return this.unidadesCurriculares;
    }    

}
