// Subclasse Desenvolvedor
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrevendo o método trabalhar() para o Desenvolvedor
    @Override
    public void trabalhar() {
        System.out.println(nome + " está escrevendo código.");
    }
}
