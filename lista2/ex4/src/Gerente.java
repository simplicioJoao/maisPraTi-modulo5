// Subclasse Gerente
public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrevendo o método trabalhar() para o Gerente
    @Override
    public void trabalhar() {
        System.out.println(nome + " está gerenciando a equipe.");
    }
}
