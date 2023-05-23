
/**
 * Classe para representar o aluno
 * 
 * @author Daniel
 */
public class Aluno {
    private String nome;
    private Matricula matricula;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String responsavel;

    public Aluno(String nome) {
        setNome(nome);
    }

    /**
     * Metodo para adicionar nome na classe aluno, contém verificações de tamanho e
     * caracteres alfabeticos
     * 
     * @param nome (String)
     * @return (boolean)
     */
    public boolean setNome(String nome) {
        if (nome.length() > 0 && nome.matches("[A-Za-z\\s]*")) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna o nome do aluno
     * 
     * @return (String)
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Atribui o CPF à classe, contém verificações de números e tamanho máximo de
     * 11, insira o CPF sem pontos e hífem.
     * 
     * @param cpf (String)
     * @return (boolean)
     */
    public boolean setCPF(String cpf) {
        boolean cpfValido = true;
        String[] cpfSplitPonto = cpf.split("[.]");
        String[] cpfSplitIfen = cpf.split("-");

        if (cpfSplitPonto.length != 3) {
            cpfValido = false;
        }
        if (cpfSplitIfen.length != 2) {
            cpfValido = false;
        }

        for (int contadorPonto = 0; contadorPonto < 2; contadorPonto++) {
            if (!cpfSplitPonto[contadorPonto].matches("[0-9]*")) {
                cpfValido = false;
            }
        }

        if (!cpfSplitPonto[2].split("-")[0].matches("[0-9]*")) {
            System.out.println("Inv");
        }

        if (!cpfSplitIfen[1].matches("[0-9]*")) {
            cpfValido = false;
        }

        if (cpfValido) {
            this.cpf = cpf;
            return true;
        } else {
            System.out.println("CPF inválido!");
            return false;
        }
    }

    /**
     * Retorna o CPF.
     * 
     * @return (String)
     */
    public String getCPF() {
        return this.cpf;
    }

    /**
     * Atribui a matricula à classe
     * 
     * @param matricula (Matricula)
     * @return (boolean)
     */
    public boolean setMatricula(Matricula matricula) {
        this.matricula = matricula;
        return true;
    }

    /**
     * Retorna a matricula
     * 
     * @return (Matricula)
     */
    public Matricula getMatricula() {
        return this.matricula;
    }

    /**
     * Atribui o endereço a classe, não contém verificações.
     * 
     * @param endereco (String)
     * @return (boolean)
     */
    public boolean setEndereco(String endereco) {
        if (endereco.length() > 0) {
            this.endereco = endereco;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o endereço
     * 
     * @return (String)
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * Atribui o telefone à classe, possui verificações de número.
     * 
     * @param telefone (String)
     * @return (boolean)
     */
    public boolean setTelefone(String telefone) {
        if (telefone.matches("[0-9]*")) {
            this.telefone = telefone;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna a o telefone da classe
     * 
     * @return (String)
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * Atribui o Email à classe, possui a verificação de @
     * 
     * @param email (String)
     * @return (boolean)
     */
    public boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o Email
     * 
     * @return (String)
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Metodo para adicionar nome na classe responsável, contém verificações de
     * tamanho e caracteres alfabeticos
     * 
     * @param responsavel (String)
     * @return (boolean)
     */
    public boolean setResponsavel(String responsavel) {
        if (nome.length() > 0 && nome.matches("[A-Za-z\\s]*")) {
            this.responsavel = responsavel;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retorna o responsavel da classe Aluno
     * 
     * @return (String)
     */
    public String getResponsavel() {
        return this.responsavel;
    }

}
