import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        int option;

        do {
            System.out.println("\n----- Gerenciador de Tarefas -----");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Mostrar tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (option) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    if (taskManager.isEmpty()) {
                        System.out.println("Lista de tarefas vazia. Não há tarefas para remover.");
                    } else {
                        System.out.print("Digite o ID da tarefa a remover: ");
                        int removeId = scanner.nextInt();
                        taskManager.removeTask(removeId);
                    }
                    break;
                case 3:
                    if (taskManager.isEmpty()) {
                        System.out.println("Lista de tarefas vazia. Não há tarefas para marcar como concluídas.");
                    } else {
                        System.out.print("Digite o ID da tarefa a marcar como concluída: ");
                        int completeId = scanner.nextInt();
                        taskManager.completeTask(completeId);
                    }
                    break;
                case 4:
                    System.out.println("Lista de Tarefas:");
                    taskManager.showTasks();
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