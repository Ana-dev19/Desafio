public class Cliente {

    // Atributos do cliente
    private String nome;
    private String cpf;
    private String email;

    // Construtor do cliente
    public Cliente(String nome, String cpf, String email) {
        // Valida os dados do cliente
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        // Atribui os valores aos atributos
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    // Metodos para os atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }
    // Métod para gerar o hash cpde do cliente baseado no seu CPF
    @Override
    public int hashCode(){
        return cpf.hashCode();
    }
    // Metodo para comparar dois clientes baseado no seu CPF
    @Override
    public boolean equals(Object object) {
        if (object instanceof Cliente) {
            Cliente outro = (Cliente) object;
            return this.cpf.equals(outro.cpf);
        }
        return false;
    }
    // Método para retornar uma represenção do cliente
    @Override
    public String toString() {
        return "Cliente: " + nome + " - CPF: " + cpf + " - Email: " + email;
    }
    }

