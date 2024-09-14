import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hand hand = new Hand();
        int option;

        do {
            System.out.println("\n----- Jogo de Cartas -----");
            System.out.println("1. Adicionar carta à mão");
            System.out.println("2. Remover carta da mão");
            System.out.println("3. Mover carta para o início");
            System.out.println("4. Mostrar mão do jogador");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (option) {
                case 1:
                    System.out.print("Digite o valor da carta para adicionar (ex: 'Ás de Espadas'): ");
                    String cardValue = scanner.nextLine();
                    hand.addCard(cardValue);
                    break;
                case 2:
                    System.out.print("Digite o valor da carta para remover: ");
                    String removeCardValue = scanner.nextLine();
                    hand.removeCard(removeCardValue);
                    break;
                case 3:
                    System.out.print("Digite o valor da carta para mover para o início: ");
                    String moveCardValue = scanner.nextLine();
                    hand.moveCardToFront(moveCardValue);
                    break;
                case 4:
                    hand.showHand();
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