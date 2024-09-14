import java.util.LinkedList;
import java.util.Queue;

public class ProcessQueue {
    private Queue<Process> processQueue;
    private int nextId;

    public ProcessQueue() {
        this.processQueue = new LinkedList<>();
        this.nextId = 1;
    }

    // Adiciona um novo processo à fila
    public void addProcess(String name) {
        Process newProcess = new Process(name, nextId++);
        processQueue.add(newProcess);
        System.out.println("Processo adicionado à fila. ID: " + newProcess.getId() + ", Nome: " + newProcess.getName());
    }

    // Remove e executa o próximo processo na fila
    public void executeNextProcess() {
        if (processQueue.isEmpty()) {
            System.out.println("Nenhum processo na fila.");
        } else {
            Process nextProcess = processQueue.poll();
            System.out.println("Executando " + nextProcess.getName() + ". ID: " + nextProcess.getId());
        }
    }

    // Exibe os processos na fila
    public void showQueue() {
        if (processQueue.isEmpty()) {
            System.out.println("Nenhum processo na fila.");
        } else {
            System.out.println("Processos na fila:");
            for (Process process : processQueue) {
                System.out.println(process);
            }
        }
    }
}