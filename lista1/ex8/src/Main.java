import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessQueue processQueue = new ProcessQueue();
        int option;

        do {
            System.out.println("\n----- Fila de Processos -----");
            System.out.println("1. Adicionar processo");
            System.out.println("2. Executar próximo processo");
            System.out.println("3. Mostrar fila de processos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (option) {
                case 1:
                    System.out.print("Digite o nome do processo: ");
                    String name = scanner.nextLine();
                    processQueue.addProcess(name);
                    break;
                case 2:
                    processQueue.executeNextProcess();
                    break;
                case 3:
                    processQueue.showQueue();
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