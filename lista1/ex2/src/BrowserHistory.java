public class BrowserHistory {
    private HistoryNode head;
    private int size;
    private int maxSize;

    public BrowserHistory(int maxSize) {
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Adiciona uma nova URL ao histórico
    public void visitUrl(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (head == null) {
            head = newNode;
        } else {
            HistoryNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;

        // Se o tamanho exceder o máximo, remove a URL mais antiga (head)
        if (size > maxSize) {
            removeOldestUrl();
        }

        System.out.println("Visitou: " + url);
    }

    // Remove a URL mais antiga (no início da lista)
    private void removeOldestUrl() {
        if (head != null) {
            System.out.println("Removendo a URL mais antiga: " + head.url);
            head = head.next;
            size--;
        }
    }

    // Exibe o histórico de navegação
    public void showHistory() {
        if (head == null) {
            System.out.println("Histórico vazio.");
            return;
        }

        HistoryNode current = head;
        System.out.println("Histórico de navegação:");
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Verifica se o histórico está vazio
    public boolean isEmpty() {
        return head == null;
    }
}
