import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();

    // Método para adicionar funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para calcular a folha de pagamento
    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    // Método para promover um funcionário
    public void promoverFuncionario(Funcionario funcionario, Funcionario novoCargo) {
        funcionarios.remove(funcionario);
        funcionarios.add(novoCargo);
        System.out.println(funcionario.getNome() + " foi promovido!");
    }
}