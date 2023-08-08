import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;


public class Cliente {

	
	
    private String nome;
    private String cpf;
    private Date dataDeNascimento;
    private Endereco endereco;
    private String email;
    private String login;
    private String senha;
    private String telefone;
    private double carteira;
    private String formaDePagamento;
    private Carrinho carrinho;
	private Boolean cadastrado = false;

    
    // Métodos
	
	
    public Boolean getCadastrado() {
		return cadastrado;
	}



	public void setCadastrado(Boolean cadastrado) {
		this.cadastrado = cadastrado;
	}
    
    public Cliente() {
  
    }

    
    public boolean setCarrinho(Carrinho carrinho) {
    	this.carrinho = carrinho;
    	return true;
    }
    
    public Carrinho getCarrinho() {
    	return this.carrinho;
    }
    
    
    /**
     * @return String
     * retorna o nome do cliente
     * */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome nome
     * @return boolean
     * atribui o nome do cliente, o nome não pode ser vazio e precisa ser de A-Za-z
     * */
    public boolean setNome(String nome) {
        if (nome.length() > 0 && nome.matches("[A-Za-z\\s]*")) {
            this.nome = nome;
            return true;
        }else
            return false;
    }

    /**
     * @return CPF
     * retorna o cpf do cliente
     * */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf CPF
     * @return boolean
     * atribui o cpf do cliente, o cpf precisa seguir o formato de xxx.xxx.xxx-xx
     * */
    public boolean setCpf(String cpf) {
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
            return  true;
        } else {
            System.out.println("CPF inválido!");
            return  false;
        }
    }

    /**
     * @return data de nascimento
     * retorna a data de nascimento do cliente
     * */
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * @param dataDeNascimento data de nascimento
     * @return (boolean)
     * atribui a data de nascimento do usuário, o ano não pode ser maior que o ano atual e não
     * pode ser menor que 1880
     * */
    public boolean setDataDeNascimento(Date dataDeNascimento) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dataDeNascimento);

        if (calendar.get(Calendar.YEAR) < 1880 || calendar.get(Calendar.YEAR) > LocalDate.now().getYear()) {return  false;}

        this.dataDeNascimento = dataDeNascimento;
        return  true;
    }

    /**
     * @return (Endereco)
     * retorna o endereço do cliente
     * */
    public Endereco getEndereco() {
        return endereco;
    }
    /**
     * @param endereco endereco fornecido
     * @return (boolean)
     * atribui o endereço do cliente
     * */
    public boolean setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return true;
    }

    /**
     * retorna o email do cliente
     * */
    public String getEmail() {
        return email;
    }
    /**
     * @param email email fornecido
     * @return (boolean)
     * atribui o email do cliente, o email precisa conter @
     * */
    public boolean setEmail(String email) {
        if (!email.contains("@")) {return false;}

        this.email = email;
        return true;
    }

    /**
     * @return boolean
     * retorna o nome de login
     * */
    public String getLogin() {
        return login;
    }
    /**
     * @param login login fornecido
     * @return (boolean)
     * atribui o nome do cliente, o nome não pode ser vazio e precisa ser de A-Za-z
     * */
    public boolean setLogin(String login) {
        if (login.length() > 0 && login.matches("[A-Za-z\\s]*")) {
            this.login = login;
            return true;
        }else
            return false;
    }

    /**
     * @param nome nome de login
     * @param senha senha fornecida
     * Cadastra o usuário a classe
     * */
    public boolean cadastrar(String nome, String senha) {
        setLogin(nome);
        setSenha(senha);
        return true;
    }

    /**
     * Metodo para efetuar a compra
     * @return (boolean)
     * */
    public boolean comprar(){

        return true;
    }

    /**
     * Mostra os dados bases do cliente: nome, data de nascimento, saldo, email, telefone,
     * forma de pagamento
     * */
    public void mostrarDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Data de nascimento: "+ dataDeNascimento);
        System.out.println("Saldo: "+ carteira);
        System.out.println("Email: "+ email);
        System.out.println("Telefone: "+ telefone);
        System.out.println("Forma de pagamento: "+ formaDePagamento);
    }
    /**
     * @param senha senha
     * @return boolean
     * retorna verdadeiro se a senha for igual a inserida
     * */
    public boolean verificarSenha(String senha) {
        return (senha.equals(getSenha()));
    }

    /**
     * @param login login
     * @return boolean
     * retorna verdadeiro se o login for igual ao inserido
     * */
    public boolean verificarNomeLogin(String login) {
        return (login.equals(getLogin()));
    }

    /**
     * retorna verdadeiro se o login e a senha for igual as inseridas
     * */
    public boolean verificarLogin(String login, String senha){
        return  (verificarNomeLogin(login) && verificarSenha(senha));
    }

    /**
     * @return String
     * retorna a senha do cliente
     * */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha senha
     * @return boolean
     * atribui a senha ao cliente, a senha não pode ser menor que 8 caracteres
     * */
    public boolean setSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }
        this.senha = senha;
        return true;
    }

    /**
     * retorna o telefone do cliente
     * */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Definir o número de telefone,
     * considerando que os números SEMPRE serão direcionados ao Brasil.
     * formato: DD xxxxx-xxxx
     * */
    public boolean setTelefone(String telefone) {
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        
        
        System.out.println(telefone);
        if (telefone.length() != 11){ return false;}
        Integer[] codigosDDD = {
                11, 12, 13, 14, 15, 16, 17, 18, 19,
                21, 22, 24, 27, 28, 31, 32, 33, 34,
                35, 37, 38, 41, 42, 43, 44, 45, 46,
                47, 48, 49, 51, 53, 54, 55, 61, 62,
                64, 63, 65, 66, 67, 68, 69, 71, 73,
                74, 75, 77, 79, 81, 82, 83, 84, 85,
                86, 87, 88, 89, 91, 92, 93, 94, 95,
                96, 97, 98, 99};
        if ( java.util.Arrays.asList(codigosDDD).indexOf(Integer.parseInt(telefone.substring(0, 2))) == -1) return false;


        this.telefone = telefone;
        return  true;
    }

    /**
     * retorna a carteira do cliente
     * */
    public double getCarteira() {
        return carteira;
    }

    /**
     * @param valor valor
     * @return boolean
     * Atribui um valor à carteira, caso queria adicionar um valor use o metodo addCarteira()
     * */
    public boolean setCarteira(double valor) {
        this.carteira = valor;
        return true;
    }

    /**
     * @param valor valor
     * @return boolean
     * adiciona um valor a carteira, caso definir a carteira com um valor, use setCarteira(valor)
     * */
    public boolean addCarteira(double valor) {
        this.carteira += valor;
        return  true;
    }

    /**
     * retorna as formas de pagamento
     * @return String
     * */
    public String getFormasDePagamento() {
        return formaDePagamento;
    }

    /**
     * @param formaDePagamento forma de pagamento
     * @return boolean
     * atribui as formas de pagamento, elas só podem ser (pix, boleto, debito e credito
     * */
    public boolean setFormaDePagamento(String formaDePagamento) {
        ArrayList<String> FormasValidas = new  ArrayList<String>();

        FormasValidas.add("pix");
        FormasValidas.add("boleto");
        FormasValidas.add("credito");
        FormasValidas.add("debito");
        FormasValidas.add("cartao");
        FormasValidas.add("carteira");

        if (!FormasValidas.contains(formaDePagamento)) {return false;}

        this.formaDePagamento = formaDePagamento;
        return  true;
    }
}