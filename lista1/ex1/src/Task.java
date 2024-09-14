public class Task {
    int id;
    String description;
    boolean isCompleted;
    Task next;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
        this.next = null;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - " + (isCompleted ? "[X] " : "[ ] ") + description;
    }
}
