import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    private Queue<PrintJob> printQueue;
    private int nextId;

    public PrinterQueue() {
        this.printQueue = new LinkedList<>();
        this.nextId = 1;
    }

    // Adiciona um novo trabalho de impressão à fila
    public void addPrintJob(String description) {
        PrintJob newJob = new PrintJob(description, nextId++);
        printQueue.add(newJob);
        System.out.println("Trabalho de impressão adicionado à fila. ID: " + newJob.getId() + ", Descrição: " + newJob.getDescription());
    }

    // Processa o próximo trabalho de impressão na fila
    public void processNextJob() {
        if (printQueue.isEmpty()) {
            System.out.println("Nenhum trabalho de impressão na fila.");
        } else {
            PrintJob nextJob = printQueue.poll();
            System.out.println("Processando " + nextJob.getDescription() + ". ID: " + nextJob.getId());
        }
    }

    // Exibe os trabalhos de impressão na fila
    public void showQueue() {
        if (printQueue.isEmpty()) {
            System.out.println("Nenhum trabalho de impressão na fila.");
        } else {
            System.out.println("Trabalhos de impressão na fila:");
            for (PrintJob job : printQueue) {
                System.out.println(job);
            }
        }
    }
}