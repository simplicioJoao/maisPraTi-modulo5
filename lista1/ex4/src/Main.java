import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor textEditor = new TextEditor();
        int option;

        do {
            System.out.println("\n----- Editor de Texto -----");
            System.out.println("1. Adicionar ação de edição");
            System.out.println("2. Desfazer última ação");
            System.out.println("3. Refazer última ação desfeita");
            System.out.println("4. Mostrar histórico de ações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (option) {
                case 1:
                    System.out.print("Digite a ação de edição (ex: 'Adicionar texto', 'Remover palavra'): ");
                    String action = scanner.nextLine();
                    textEditor.addAction(action);
                    break;
                case 2:
                    textEditor.undoAction();
                    break;
                case 3:
                    textEditor.redoAction();
                    break;
                case 4:
                    textEditor.showHistory();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 5);

        scanner.close();
    }
}