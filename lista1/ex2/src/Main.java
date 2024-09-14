import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho máximo do histórico: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        BrowserHistory history = new BrowserHistory(maxSize);
        int option;

        do {
            System.out.println("\n----- Simulador de Histórico de Navegação -----");
            System.out.println("1. Visitar nova URL");
            System.out.println("2. Mostrar histórico");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (option) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    history.visitUrl(url);
                    break;
                case 2:
                    history.showHistory();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 3);

        scanner.close();
    }
}