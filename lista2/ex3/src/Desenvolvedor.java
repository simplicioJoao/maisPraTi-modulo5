// Subclasse Desenvolvedor
public class Desenvolvedor extends Funcionario {

    // Construtor da subclasse Desenvolvedor
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrita do método para calcular bônus do desenvolvedor (10%)
    @Override
    public double calcularBonus() {
        return this.salario * 0.10;
    }
}
