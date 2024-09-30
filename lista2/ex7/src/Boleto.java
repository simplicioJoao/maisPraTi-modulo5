// Classe concreta Boleto que herda de FormaPagamento
public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$" + valor + " via Boleto.");
        } else {
            System.out.println("Boleto inválido!");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Simulação de validação do código de barras (por exemplo, 47 dígitos)
        return codigoBarras != null && codigoBarras.length() == 47;
    }
}
