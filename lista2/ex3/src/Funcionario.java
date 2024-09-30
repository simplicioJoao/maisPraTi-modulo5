// Classe base Funcionario
public class Funcionario {
    // Atributos protegidos para serem acessados pelas subclasses
    protected String nome;
    protected double salario;

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para calcular bônus - será sobrescrito nas subclasses
    public double calcularBonus() {
        return 0.0;
    }

    // Método para retornar informações do funcionário
    public String getInfo() {
        return "Nome: " + nome + ", Salário: " + salario;
    }
}

