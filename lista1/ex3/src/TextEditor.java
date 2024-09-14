public class TextEditor {
    private ActionNode head;

    public TextEditor() {
        this.head = null;
    }

    // Adiciona uma nova ação de edição ao histórico
    public void addAction(String action) {
        ActionNode newAction = new ActionNode(action);
        if (head == null) {
            head = newAction;
        } else {
            newAction.next = head;
            head = newAction;
        }
        System.out.println("Ação realizada: " + action);
    }

    // Desfaz a última ação de edição
    public void undoAction() {
        if (head == null) {
            System.out.println("Nenhuma ação para desfazer.");
        } else {
            System.out.println("Desfazendo ação: " + head.action);
            head = head.next;
        }
    }

    // Exibe todas as ações no histórico
    public void showActions() {
        if (head == null) {
            System.out.println("Nenhuma ação realizada.");
            return;
        }

        ActionNode current = head;
        System.out.println("Histórico de ações:");
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Verifica se há ações no histórico
    public boolean hasActions() {
        return head != null;
    }
}