
public class Venda {

    private Vendedor vendedor;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private double valorTotal;
    private String data;

    // Construtor da venda
    public Venda(Vendedor vendedor, Cliente cliente, Produto produto, int quantidade, String data) {

        // Valida os dados da venda
        if (vendedor == null) {
            throw new IllegalArgumentException("Vendedor inválido");
        }
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido");
        }
        if (produto == null) {
            throw new IllegalArgumentException("Produto inválido");
        }
        if (quantidade <=0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        if (data == null || data.isEmpty()) {
        throw new IllegalArgumentException("Data inválida");
        }
        // Valor dos atributos
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreço() * quantidade;

        // Calcula o valor total da venda
        this.data = data;
    }
    // Métodos para os atributos
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        if (vendedor == null) {
            throw new IllegalArgumentException("Vendedor inválido");
        }
        this.vendedor = vendedor;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido");
        }
        this.cliente = cliente;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto inválido");
        }
        this.produto = produto;
        this.valorTotal = produto.getPreço() * quantidade;
        // Atualiza o valor total da venda
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <=0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreço() * quantidade;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.data = data;
    }
    // Método para retornar uma venda
    @Override
    public String toString() {
        return  "Venda: " + produto + " - Quantidade: " + quantidade + " - Valor total: R$ " + valorTotal + " - Data: " + data + "\nVendedor: " + vendedor + "\nCliente: " + cliente;
    }
}
