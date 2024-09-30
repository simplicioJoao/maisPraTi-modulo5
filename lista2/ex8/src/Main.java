public class Main {
    public static void main(String[] args) {
        SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();

        // Criando diferentes tipos de funcionários
        Funcionario gerente = new Gerente("Alice", 8000);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 5000);
        Funcionario estagiario = new Estagiario("Carol", 2000);

        // Adicionando funcionários ao sistema
        sistema.adicionarFuncionario(gerente);
        sistema.adicionarFuncionario(desenvolvedor);
        sistema.adicionarFuncionario(estagiario);

        // Calculando a folha de pagamento
        System.out.println("Folha de pagamento total: R$" + sistema.calcularFolhaPagamento());

        // Promovendo o estagiário para desenvolvedor
        sistema.promoverFuncionario(estagiario, new Desenvolvedor("Carol", 4000));

        // Recalculando a folha de pagamento após promoção
        System.out.println("Nova folha de pagamento total: R$" + sistema.calcularFolhaPagamento());
    }
}