public class TextEditor {
    private ActionNode current;
    private ActionNode lastAction;  // Ponteiro que indica a última ação realizada (para controlar o redo)

    public TextEditor() {
        this.current = null;
        this.lastAction = null;
    }

    // Adiciona uma nova ação ao histórico
    public void addAction(String action) {
        ActionNode newNode = new ActionNode(action);
        if (current == null) {
            current = newNode;
        } else {
            newNode.prev = current;
            current.next = newNode;
            current = newNode;
        }
        lastAction = current;  // Atualiza a última ação possível para refazer
        System.out.println("Ação realizada: " + action);
    }

    // Desfaz a última ação
    public void undoAction() {
        if (current == null) {
            System.out.println("Nenhuma ação para desfazer.");
        } else {
            System.out.println("Desfazendo ação: " + current.action);
            current = current.prev;
        }
    }

    // Refaz a ação desfeita
    public void redoAction() {
        if (current == lastAction) {
            System.out.println("Nenhuma ação para refazer.");
        } else if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Refazendo ação: " + current.action);
        } else if (current == null) {
            current = lastAction; // Refazer a primeira ação se todas foram desfeitas
            System.out.println("Refazendo ação: " + current.action);
        }
    }

    // Exibe o histórico de ações até o ponto atual
    public void showHistory() {
        if (current == null) {
            System.out.println("Nenhuma ação realizada.");
            return;
        }

        ActionNode temp = current;
        System.out.println("Histórico de ações:");
        while (temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            System.out.println(temp.action + (temp == current ? " <- Atual" : ""));
            temp = temp.next;
        }
    }
}