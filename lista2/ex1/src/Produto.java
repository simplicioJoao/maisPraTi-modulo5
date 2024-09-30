public class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco); // Validação aplicada ao preço
        setQuantidadeEstoque(quantidadeEstoque); // Validação aplicada à quantidade
    }

    // Métodos públicos para acessar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    // Método público para modificar o preço, garantindo que não seja negativo
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Método público para modificar a quantidade, garantindo que não seja negativa
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }
}