// Classe abstrata FormaPagamento
public abstract class FormaPagamento {
    // Método abstrato para processar o pagamento
    public abstract void processarPagamento(double valor);

    // Método abstrato para validar o pagamento
    public abstract boolean validarPagamento();
}

