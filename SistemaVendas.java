import java.util.*;

public class SistemaVendas {

    // Atributos do sistema
    private Set<Cliente> clientes; // Conjunto de clientes cadastrados
    private Set<Vendedor> vendedores; // Conjunto de vendedores cadastrados
    private Set<Produto> produtos; // Conjunto de produtos cadastrados
    private List<Venda> vendas; // Lista de vendas realizadas

    // Construtor do sistema
    public SistemaVendas() {
        // Inicializa os atributos como coleções vazias
        clientes = new HashSet<>();
        vendedores = new HashSet<>();
        produtos = new HashSet<>();
        vendas = new ArrayList<>();
        }
    // Método para cadastrar um cliente no sistema
    public void cadastrarCliente(Cliente cliente) {
        // Valida o cliente
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido");
    }
        // Verifica se já existe um cliente com o mesmo CPF ou e-mail
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cliente.getCpf())) {
                throw new IllegalArgumentException("Já existe um cliente com este CPF");
            }
            if (c.getEmail().equals(cliente.getEmail())) {
                throw new IllegalArgumentException("Já existe um cliente com este e-mail");
            }
        }
        // Adicionar o cliente ao conjunto de clientes
        clientes.add(cliente);
        }

        // Método para cadastrar um vendendor no sistema
public void cadastrarVendedor(Vendedor vendedor) {
        // Válida o vendedor
        if (vendedor == null) {
            throw new IllegalArgumentException("Vendedor inválido");
        }
        // Verifica se já existe um vendedor com o mesmo CPF ou e-mail
    for (Vendedor v : vendedores) {
        if ( vendedor.getCpf().equals(vendedor.getCpf())) {
            throw new IllegalArgumentException("Já existe um vendedor com este CPF");
        }
        if (vendedor.getEmail().equals(vendedor.getEmail())) {
            throw new IllegalArgumentException("Já existe um vendedor com este email");
        }
    }
    // Adiciona o vendedor ao conjunto de vendedores
    vendedores.add(vendedor);
        }
        // Método para cadrastrar um produto no sistema
        public void cadastrarProduto(Produto produto) {
        // Valida o produto
            if (produto ==null) {
                throw new IllegalArgumentException("Produto inválido");
            }
        // Verifica se já existe um produto com o mesmo código
            for (Produto p : produtos) {
                if (produto.getCodigo().equals(produto.getCodigo())) {
                    throw new IllegalArgumentException("Já existe um produto com este código");
                }
            }
            // Adiciona o produto ao conjunto de produtos
            produtos.add(produto);
        }
    // Método para cadastrar uma venda no sistema
    public void cadastrarVenda(Venda venda) {
        // Valida a venda
        if (venda == null) {
            throw new IllegalArgumentException("Venda inválida");
    }
        // Verifica se o cliente e o vendedor da venda estão cadastrados no sistema
        if (!clientes.contains(venda.getCliente())) {
            throw new IllegalArgumentException("Cliente não cadastrado");
        }
        if (!vendedores.contains(venda.getVendedor())) {
            throw new IllegalArgumentException("Vendedor não cadastrado");
            }
        // Adiciona a venda á lista de vendas
    vendas.add(venda);
    }
    // Método para listar todos os clientes cadrastrados no sistema
public void listarClientes() {
        // Verifica se há clientes cadastrados
    if (clientes.isEmpty()) {
        System.out.println("Não há clientes cadastrados");
    } else {
        // Percorre o conjunto de clientes e imprime cada um
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    }
    // Método para listar todos os venderoes cadastrados no sistema
    public void listarVendedores() {
        // Verifica se há vendedores cadastrados
        if (vendedores.isEmpty()) {
        System.out.println("Não há vendedores cadastrados");
        } else {
            // Percorre o conjunto de vendedores e imprime cada um
            System.out.println("Vendedores cadastrados:");
            for (Vendedor v : vendedores) {
                System.out.println(v);
            }
        }
    }
    // Método para listar todos os produtos cadastrados no sistema
    public void listarProdutos() {

        // Verifica se há produtos cadastrados
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados");
        } else {
            // Percorre o conjunto de produtos e imprime cada um
            System.out.println("Produtos cadastrados:");
            for (Produto produto : produtos){
                System.out.println(produto);
            }
        }
    }
    // Método para listar todas as vendas realizadas no sistema
    public void listarVendas() {
        // Verifica se há vendas realizadas
        if (vendas.isEmpty()) {
            System.out.println("Não há vendas realizadas");
        } else {
            // Percorre a lista de vendas e imprime cada uma
            System.out.println("Vendas realizadas:");
            for (Venda venda : vendas) {
                System.out.println(venda);
            }
        }
    }
// Método para pesquisar todas as compras de um cliente específico através de seu CPF
public void pesquisarComprasPorClientes(String cpf) {
        // Valida o CPF
    if (cpf == null || cpf.isEmpty()) {
        throw new IllegalArgumentException("CPF invalido");
    }
    // Cria uma lista para armazenar as compras do cliente
    List<Venda> compras = new ArrayList<>();
    // Percorre a lista de vendas e verifica se o cliente da venda tem o CPF informado
    for (Venda venda : vendas) {
        if (venda.getCliente().getCpf().equals(cpf)) {
            // Adiciona a venda á lista de compras do cliente
            compras.add(venda);
        }
    }
    // Verifica se há compras do cliente
    if (compras.isEmpty()) {
        System.out.println("Não há compras do cliente com este CPF");
    } else {
        // Percorre a lista de compras do cliente e imprime cada uma
        System.out.println("Compras dos cliente com CPF " + cpf + ":");
        for (Venda c : compras) {
            System.out.println(c);
        }
    }
    }

    // Método para pesquisar todas as vendas de um vendedor específico através de seu e-mail
    public void pesquisarVendasPorVendedor(String email) {
        // Valida o email
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválidp");
        }
        // // Cria uma lista para armazenar as vendas do vendedor
        List<Venda> vendasDoVendedor = new ArrayList<>();
        // Percorre a lista de vendas e verifica se o vendedor da venda tem o e-mail informado
        for (Venda venda : vendas) {
            if (venda.getVendedor().getEmail().equals(email)) {
                // Adiciona a venda à lista de vendas do vendedor
                vendasDoVendedor.add(venda);
            }
        }
        // Verifica se há vendas do vendedor
        if (vendasDoVendedor.isEmpty()) {
            System.out.println("Não há vendas do vendedor com este email");
        } else {
            // Percorre a lista de vendas do vendedor e imprime cada uma
            System.out.println("Vendas do vendedor com email " + email + ";");
            for (Venda venda : vendasDoVendedor) {
                System.out.println(venda);
            }
        }
    }
    // Método para exibir um menu de opções ao usuário
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        // Variavel que armazena a opção escolhida pelo usuario
        int opção = 0;
        // laço de repetição para repetir o menu até o usuario escolher sair
        do {
            System.out.println("Sistema de vendas");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar vendedor");
            System.out.println("3 - Cadastrar produto");
            System.out.println("4 - Cadastrar venda");
            System.out.println("5 - Listar clientes");
            System.out.println("6 - Listar vendedores");
            System.out.println("7 - Listar produtos");
            System.out.println("8 - Listar vendas");
            System.out.println("9 - Pesquisar compras por cliente");
            System.out.println("10 - Pesquisar vendas por vendedor");
            System.out.println("10 - Pesquisar vendas por vendedor");
            System.out.println("0 - Sair");

            // le a opção digitada pelo usuario
            opção = scanner.nextInt();

            // verifica qual opção foi escolhida e executa a açaõ correspondente

            switch (opção){
                // Cadastrar cliente
                case 1:
                    // le os daodos do cleinte
                    System.out.println("Digite o nome do cliente");
                    String nomeCliente = scanner.next();

                    System.out.println("Digite o CPF do cliente:");
                    String cpfCliente = scanner.next();

                    String emailCliente = scanner.next();

                    System.out.println("Digite o email do cliente");

                    //Objeto criado da classe Cliente com os dados lidos
                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, emailCliente);

                    // Tenta cadastrar o cliente no sistema

                    try {
                        cadastrarCliente(cliente);
                        System.out.println("Cliente cadastrado com sucesso");
                    } catch (IllegalArgumentException e) {
                        //Se ocorrer uma exceção, imprime a mensagem de erro
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do vendedor:");
                    String nomeVendedor = scanner.next();
                    String cpfVendedor = scanner.next();
                    System.out.println("Digite o email do vendedor:");
                    String emailVendedor = scanner.next();

                    Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, emailVendedor);

                    try {
                        cadastrarVendedor(vendedor);
                        System.out.println("Vendedor cadastrado com sucesso");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Digite o codigo do produto:");
                    String codigoProduto = scanner.next();
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.next();
                    System.out.println("Digite o preço do produto");
                    double precoProduto = scanner.nextDouble();

                    Produto produto = new Produto(codigoProduto, nomeProduto, precoProduto);

                    try {
                        cadastrarProduto(produto);
                        System.out.println("Produto cadastrado com sucesso");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Digite o CPF do cliente da venda:");
                    String cpfClienteVenda = scanner.next();
                    System.out.println("Digite o email do vendedor da venda:");
                    String emailVendedorVenda = scanner.next();
                    System.out.println("Digite o codigo do produto da venda:");
                    String codigoProdutoVenda = scanner.next();
                    System.out.println("Digite a quantidade dp produto da venda:");
                    int quantidadeProdutoVenda = scanner.nextInt();
                    System.out.println("Digite a data da venda:");
                    String dataVenda = scanner.next();

                    Cliente clienteVenda = null;
                    Vendedor vendedorVenda = null;
                    Produto produtoVenda = null;

                    //Percorre o conjunto de clientes e verifica se há um cliente como CPF informado
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfClienteVenda)) {
                            // Se encontrar, atribui o cliente á variavel clienteVenda
                            clienteVenda = c;
                            break;
                        }
                    }
                    // Percorre o conjunto de vendedores e verifica se há um vendedor com o e-mail informado
                    for (Vendedor v : vendedores) {
                        if (v.getEmail().equals(emailVendedorVenda)) {
                            vendedorVenda = v;
                            break;
                        }
                    }
                    // Percorre o conjunto de produtos e verifica se há um produto com o código informado
                    for (Produto p : produtos) {
                        if (p.getCodigo().equals(codigoProdutoVenda)) {
                            produtoVenda = p;
                            break;
                        }
                    }
                    Venda venda = new Venda(vendedorVenda, clienteVenda, produtoVenda, quantidadeProdutoVenda, dataVenda);

                    try {
                        cadastrarVenda(venda);
                        System.out.println("Venda cadastrada com sucesso");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    listarClientes();
                    break;
                case 6:
                    listarVendedores();
                    break;
                case 7:
                    listarProdutos();
                    break;
                case 8:
                    listarVendas();
                    break;
                case 9:
                    System.out.println("Digite o CPF do cliente:");
                    String cpfClientePesquisa = scanner.next();

                    try {
                        pesquisarComprasPorClientes(cpfClientePesquisa);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    System.out.println("Digite o email do vendedor:");
                    String emailVendedorPesquisa = scanner.next();

                    try {
                        pesquisarVendasPorVendedor(emailVendedorPesquisa);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Obrigada por usar o sistema de vendas");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opção != 0);
        scanner.close();
    }
}
