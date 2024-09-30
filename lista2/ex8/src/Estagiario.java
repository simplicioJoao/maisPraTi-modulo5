// Classe Estagiario que herda de Funcionario
public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase; // Estagiários não recebem bônus
    }

    @Override
    public double calcularBonus() {
        return 0; // Sem bônus
    }
}
