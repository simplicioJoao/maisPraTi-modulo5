public class Main {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto1 = new Produto("Notebook", 3000.0, 5);

        // Exibindo as informações do produto
        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço do produto: " + produto1.getPreco());
        System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEstoque());

        // Modificando os atributos do produto
        produto1.setPreco(2500.0);
        produto1.setQuantidadeEstoque(10);

        // Exibindo as informações atualizadas do produto
        System.out.println("Preço atualizado do produto: " + produto1.getPreco());
        System.out.println("Quantidade em estoque atualizada: " + produto1.getQuantidadeEstoque());

        // Testando uma atribuição inválida
        produto1.setPreco(-100.0);  // Deve mostrar a mensagem de preço inválido
        produto1.setQuantidadeEstoque(-5);  // Deve mostrar a mensagem de quantidade inválida
    }
}