public class Main {
    public static void main(String[] args) {
        // Criando objetos de Gerente e Desenvolvedor
        Gerente gerente = new Gerente("Alice", 8000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bob", 5000.00);

        // Exibindo as informações e bônus de cada funcionário
        System.out.println(gerente.getInfo() + ", Bônus: " + gerente.calcularBonus());
        System.out.println(desenvolvedor.getInfo() + ", Bônus: " + desenvolvedor.calcularBonus());
    }
}