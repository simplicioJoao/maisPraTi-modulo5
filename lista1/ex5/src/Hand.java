public class Hand {
    private Card head;
    private Card tail;

    public Hand() {
        this.head = null;
        this.tail = null;
    }

    // Adiciona uma carta à mão do jogador
    public void addCard(String cardValue) {
        Card newCard = new Card(cardValue);

        if (head == null) {
            head = newCard;
            tail = newCard;
        } else {
            tail.next = newCard;
            newCard.prev = tail;
            tail = newCard;
        }
        System.out.println("Carta adicionada: " + cardValue);
    }

    // Remove uma carta da mão
    public void removeCard(String cardValue) {
        if (head == null) {
            System.out.println("A mão está vazia.");
            return;
        }

        Card current = head;
        while (current != null && !current.value.equals(cardValue)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Carta não encontrada.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Carta removida: " + cardValue);
    }

    // Reorganiza as cartas, movendo uma carta para o início
    public void moveCardToFront(String cardValue) {
        if (head == null || head.value.equals(cardValue)) {
            System.out.println("Carta já está no início ou mão vazia.");
            return;
        }

        Card current = head;
        while (current != null && !current.value.equals(cardValue)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Carta não encontrada.");
            return;
        }

        // Remover a carta da posição atual
        if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        // Colocar a carta no início
        current.next = head;
        head.prev = current;
        current.prev = null;
        head = current;

        System.out.println("Carta movida para o início: " + cardValue);
    }

    // Exibe a mão do jogador
    public void showHand() {
        if (head == null) {
            System.out.println("Mão está vazia.");
            return;
        }

        Card current = head;
        System.out.println("Mão do jogador:");
        while (current != null) {
            System.out.print(current.value + (current.next != null ? " -> " : "\n"));
            current = current.next;
        }
    }
}