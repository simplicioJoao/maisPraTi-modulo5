// Subclasse Gerente
public class Gerente extends Funcionario {

    // Construtor da subclasse Gerente
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrita do método para calcular bônus do gerente (20%)
    @Override
    public double calcularBonus() {
        return this.salario * 0.20;
    }
}
