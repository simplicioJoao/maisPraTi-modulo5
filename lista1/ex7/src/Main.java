import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrinterQueue printerQueue = new PrinterQueue();
        int option;

        do {
            System.out.println("\n----- Sistema de Gerenciamento de Impressões -----");
            System.out.println("1. Adicionar trabalho de impressão");
            System.out.println("2. Processar próximo trabalho de impressão");
            System.out.println("3. Mostrar fila de trabalhos de impressão");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (option) {
                case 1:
                    System.out.print("Digite a descrição do trabalho de impressão: ");
                    String description = scanner.nextLine();
                    printerQueue.addPrintJob(description);
                    break;
                case 2:
                    printerQueue.processNextJob();
                    break;
                case 3:
                    printerQueue.showQueue();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 4);

        scanner.close();
    }
}