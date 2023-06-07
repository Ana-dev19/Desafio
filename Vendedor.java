public class Vendedor {

    // Atributos do vendedor
    private String nome;
    private String cpf;

    private String email;

    // Construtor do vendedor
    public Vendedor(String nome, String cpf, String email) {
        // Valida os dados do vendedor
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido");
        }
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        // Atribui os valores aos atributos
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    //Metodos para os atrbutos
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
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
    // Método para gerar o hash code no vendedor baseado no sey CPF
    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
    // Método para comparar dois vendedores baseado no seu CPF
    @Override
    public boolean equals(Object object) {
        if (object instanceof Vendedor) {
            Vendedor outro = (Vendedor) object;
            return  this.cpf.equals(outro.cpf);
        }
        return false;
    }
    // Método para retornar uma representação do vendedor
    @Override
    public String toString() {
        return "Vendedor: " + nome + " - CPF:" + cpf + " - Email: " + email;
    }


    }
