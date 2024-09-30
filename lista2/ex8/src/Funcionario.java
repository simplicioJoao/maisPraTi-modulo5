// Classe abstrata Funcionario
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato para calcular salário
    public abstract double calcularSalario();

    // Método abstrato para calcular bônus
    public abstract double calcularBonus();

    public String getNome() {
        return nome;
    }
}

