/*
 * Classe sobre o curso
 */

public class Curso {
    private String nome;


    public Curso(String nome){
        setNome(nome);
    }

    /* Método que atribui o nome do curso, contem verificação de tamanho e caracteres*/
    public boolean setNome(String nome){
        if (nome.length() > 0 && nome.matches("[A-Za-z]*")){
            this.nome = nome;
            return true;
        }else{
            System.out.println("Nome inválido!");
            return false;
        }
    }

    

    /* Retorna o nome do curso */
    public String getNome(){
        return this.nome;
    }

}
