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

    // Método para aplicar desconto no preço do produto
    public void aplicarDesconto(double porcentagem) throws IllegalArgumentException {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto inválido. A porcentagem de desconto deve estar entre 0 e 50.");
        }
        double desconto = preco * (porcentagem / 100);
        setPreco(preco - desconto);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Produto p1 = new Produto("Smartphone", 1500, 10);

        System.out.println("Preço antes do desconto: " + p1.getPreco());
        try {
            p1.aplicarDesconto(20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Preço após desconto: " + p1.getPreco());
    }
}