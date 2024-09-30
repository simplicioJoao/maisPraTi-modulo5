public class Main {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto2 = new Produto("Smartphone", 2000.0, 8);

        // Exibindo as informações do produto
        System.out.println("Nome do produto: " + produto2.getNome());
        System.out.println("Preço do produto: " + produto2.getPreco());
        System.out.println("Quantidade em estoque: " + produto2.getQuantidadeEstoque());

        // Aplicando um desconto válido de 20%
        try {
            produto2.aplicarDesconto(20); // Aplicando desconto de 20%
            System.out.println("Preço após aplicar 20% de desconto: " + produto2.getPreco());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Tentando aplicar um desconto inválido de 60%
        try {
            produto2.aplicarDesconto(60); // Tentando aplicar desconto maior que 50%
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Tentando aplicar um desconto negativo
        try {
            produto2.aplicarDesconto(-10); // Tentando aplicar desconto negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}