public class TaskManager {
    private Task head;
    private int taskIdCounter;

    public TaskManager() {
        this.head = null;
        this.taskIdCounter = 1;  // Inicializa o contador de ID
    }

    // Verifica se a lista está vazia
    public boolean isEmpty() {
        return head == null;
    }

    // Adiciona uma nova tarefa à lista
    public void addTask(String description) {
        Task newTask = new Task(taskIdCounter++, description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Tarefa adicionada: " + newTask);
    }

    // Remove uma tarefa pelo ID
    public void removeTask(int id) {
        if (head == null) {
            System.out.println("Lista de tarefas vazia.");
            return;
        }

        if (head.id == id) {
            System.out.println("Tarefa removida: " + head);
            head = head.next;
            return;
        }

        Task current = head;
        while (current.next != null && current.next.id != id) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Tarefa com ID " + id + " não encontrada.");
        } else {
            System.out.println("Tarefa removida: " + current.next);
            current.next = current.next.next;
        }
    }

    // Marca uma tarefa como concluída pelo ID
    public void completeTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.id == id) {
                if (current.isCompleted) {
                    System.out.println("A tarefa com ID " + id + " já está marcada como concluída.");
                } else {
                    current.markCompleted();
                    System.out.println("Tarefa marcada como concluída: " + current);
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Tarefa com ID " + id + " não encontrada.");
    }

    // Exibe todas as tarefas
    public void showTasks() {
        if (head == null) {
            System.out.println("Nenhuma tarefa adicionada.");
            return;
        }

        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
