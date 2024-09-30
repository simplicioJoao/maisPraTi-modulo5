// Classe base Funcionario
public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método genérico trabalhar()
    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }
}

