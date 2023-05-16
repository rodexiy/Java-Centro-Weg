import java.time.LocalDate;

/*
 * Classe para representar o Professor
 * @author Daniel
 */

public class Professor {
    private String nome;
    private LocalDate dataDeNascimento;
    private Matricula matricula;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;


    /*
     * Metodo para adicionar nome na classe Professor, contém verificações de
     * tamanho e caracteres alfabeticos
     */
    public void setNome(String nome) {
        if (nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    /**
     * @return String
     */
    /* retorna o nome do aluno */
    public String getNome() {
        return this.nome;
    }

    /*
     * Método que adiciona data de nascimento, verifica se a data é valida e maior
     * que 1900
     */
    public void setDataDeNascimento(int year, int month, int day) {
        if (year > 1900 && year <= LocalDate.now().getYear() && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            this.dataDeNascimento = LocalDate.of(year, month, day);
        } else {
            System.out.println("Data de nascimento inválida!");
        }
    }

    /* Retorna a data de nascimento */
    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    /* Atribui a matricula à classe */
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    /* Retorna a matricula */
    public Matricula getMatricula() {
        return this.matricula;
    }

    /*
     * Atribui o CPF à classe, contém verificações de números e tamanho máximo de
     * 11, insira o CPF sem pontos e hífem.
     */
    public void setCPF(String cpf) {
        if (cpf.length() == 11 && cpf.matches("[0-9]*")) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
        }
    }

    /* Retorna o CPF. */
    public String getCPF() {
        return this.cpf;
    }

    /* Atribui o endereço a classe, não contém verificações. */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /* Retorna o endereço */
    public String getEndereco() {
        return this.endereco;
    }

    /* Atribui o telefone à classe, possui verificações de número. */
    public void setTelefone(String telefone) {
        if (telefone.matches("[0-9]*")) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone Inválido");
        }
    }

    /* Retorna a o telefone da classe */
    public String getTelefone() {
        return this.telefone;
    }

    /* Atribui o Email à classe, possui a verificação de @ */
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido!");
        }
    }

    /* Retorna o Email */
    public String getEmail() {
        return this.email;
    }
}
