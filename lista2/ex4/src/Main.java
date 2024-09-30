public class Main {
    public static void main(String[] args) {
        // Criando objetos de Gerente e Desenvolvedor
        Gerente gerente = new Gerente("Alice", 8000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bob", 5000.00);

        // Chamando o método trabalhar() para cada tipo de funcionário
        gerente.trabalhar();
        desenvolvedor.trabalhar();
    }
}