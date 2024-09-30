// Classe concreta Pix que herda de FormaPagamento
public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$" + valor + " via Pix.");
        } else {
            System.out.println("Chave Pix inválida!");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Simulação de validação da chave Pix (pode ser CPF ou email, por exemplo)
        return chavePix != null && !chavePix.isEmpty();
    }
}
