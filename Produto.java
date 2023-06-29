public class Produto {
    private String codigo;
    private String nome;
    private double preço;

    public Produto(String codigo, String nome, double preço) {
        if (codigo == null || codigo.isEmpty()) {
        throw new IllegalArgumentException("Codigo invalido");
        }
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        if (preço <=0) {
            throw new IllegalArgumentException("Preço invalido");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
    }
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
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        if (preço <=0) {
            throw new IllegalArgumentException("Preoço invalido");
        }
        this.preço = preço;
    }
    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Produto) {
            Produto outro = (Produto) object;
                return this.codigo.equals(outro.codigo);
            }
        return false;
        }
        @Override
    public String toString() {
        return "Produto: " + nome + " - Codigo: " + codigo + " - Preço: R$" + preço;
    }
}