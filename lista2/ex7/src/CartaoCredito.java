// Classe concreta CartaoCredito que herda de FormaPagamento
public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$" + valor + " com Cartão de Crédito.");
        } else {
            System.out.println("Cartão de Crédito inválido!");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Simulação de validação do número do cartão (deve ter 16 dígitos, por exemplo)
        return numeroCartao != null && numeroCartao.length() == 16;
    }
}
