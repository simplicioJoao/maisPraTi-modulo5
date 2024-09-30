public class Main {
    public static void main(String[] args) {
        // Criando instâncias de diferentes formas de pagamento
        FormaPagamento cartao = new CartaoCredito("1234567812345678");
        FormaPagamento boleto = new Boleto("00190500954014481606906809350314337370000000100");
        FormaPagamento pix = new Pix("email@exemplo.com");

        // Processando pagamentos
        cartao.processarPagamento(200.0);
        boleto.processarPagamento(500.0);
        pix.processarPagamento(150.0);
    }
}