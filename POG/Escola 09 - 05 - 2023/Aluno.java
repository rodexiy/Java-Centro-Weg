import java.time.LocalDate;

import javax.tools.DocumentationTool.Location;

public class Aluno {
    
    private String nome;
    private LocalDate dataDeNascimento;
    private Matricula matricula;
    private String cpf;
    private Location endereco;
    private String telefone;
    private String email;
    private String responsavel;

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

    public void setDataDeNascimento(int year, int month, int day){
        if (year > 1900 && year <= LocalDate.now().getYear() && month >= 1 && month <= 12 && day >= 1 && day <= 31){
            this.dataDeNascimento = LocalDate.of(year, month, day);
        }else{
            System.out.println("Data de nascimento inválida!");
        }
    }

    public LocalDate getDataDeNascimento(){
        return this.dataDeNascimento;
    }

    public void setMatricula(Matricula matricula){
        this.matricula = matricula;
    }

    public Matricula getMatricula(){
        return this.matricula;
    }

    public void setCPF(String cpf){
        if (cpf.length() == 11 && cpf.matches("[0-9]*")){
            this.cpf = cpf;
        }else{
            System.out.println("CPF inválido!");
        }
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setEndereco(Location endereco){
        this.endereco = endereco;
    }

    public Location getEndereco(){
        return this.endereco;
    }

    public void setTelefone(String telefone){
        if (telefone.matches("[0-9]*")){
            this.telefone = telefone;
        }else{
            System.out.println("Telefone Inválido");
        }
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setEmail(String email){
        if (email.matches("[@]*")){
            this.email = email;
        }else{
            System.out.println("Email inválido!");
        }
    }

    public String getEmail(){
        return this.email;
    }

    public void setResponsavel(String responsavel){
        if (nome.length() >= 3 && nome.matches("[A-Za-z]*")){
            this.responsavel = responsavel;
        }else{
            System.out.println("Responsável inválido!");
        }
    }

    public String getResponsavel(){
        return this.responsavel;
    }

}

