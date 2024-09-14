public class PrintJob {
    private String description;
    private int id;

    public PrintJob(String description, int id) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Trabalho de Impressão " + id + ": " + description;
    }
}