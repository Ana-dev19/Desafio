public class Produto {
    // Atributos do produto
    private String codigo;
    private String nome;
    private double preço;

    // Construtor do produto
    public Produto(String codigo, String nome, double preço) {
        // Valida os dados do produto
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("Codigo inválido");
        }
        if (nome == null || nome.isEmpty()) {
        throw new IllegalArgumentException("Nome inválido");
        }
        if (preço <=0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        // Atribui os valores aos atributos
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
    }
   
    // Método para os atributos
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("Codigo invalido");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        if(preço <=0){
            throw new IllegalArgumentException("Preço inválidp");
        }
        this.preço = preço;
    }
    // Método para gerar o hash code do produto baseado no seu codigo
    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
    // Método para comparar dois produtos baseado no seu codigo
    @Override
    public boolean equals(Object object) {
        if (object instanceof  Produto) {
            Produto outro = (Produto) object;
            return this.codigo.equals(outro.codigo);
        }
        return false;
    }
    // Método para retornar uma representação do produto
    @Override
    public String toString() {
        return "Produto: " + nome + " - Código: " + codigo + " - Preço: R$ " + preço;
    }
}
