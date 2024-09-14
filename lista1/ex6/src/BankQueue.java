import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    private Queue<Client> clientQueue;
    private int nextId;

    public BankQueue() {
        this.clientQueue = new LinkedList<>();
        this.nextId = 1;
    }

    // Adiciona um cliente à fila de atendimento
    public void addClient(String name) {
        Client newClient = new Client(name, nextId++);
        clientQueue.add(newClient);
        System.out.println(newClient.getName() + " entrou na fila. ID: " + newClient.getId());
    }

    // Chama o próximo cliente para atendimento
    public void callNextClient() {
        if (clientQueue.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
        } else {
            Client nextClient = clientQueue.poll();
            System.out.println("Chamando " + nextClient.getName() + " para atendimento. ID: " + nextClient.getId());
        }
    }

    // Exibe os clientes na fila
    public void showQueue() {
        if (clientQueue.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
        } else {
            System.out.println("Clientes na fila:");
            for (Client client : clientQueue) {
                System.out.println(client);
            }
        }
    }
}