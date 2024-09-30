public class Main {
    public static void main(String[] args) {
        // Criando um array de IMeioTransporte
        IMeioTransporte[] meiosDeTransporte = new IMeioTransporte[] {
                new Carro(),
                new Bicicleta(),
                new Trem()
        };

        // Iterando sobre o array e chamando acelerar() e frear() para cada objeto
        for (IMeioTransporte transporte : meiosDeTransporte) {
            transporte.acelerar();
            transporte.frear();
            System.out.println(); // Para dar espaço entre as execuções
        }
    }
}