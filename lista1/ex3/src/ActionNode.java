public class ActionNode {
    String action;
    ActionNode next;

    public ActionNode(String action) {
        this.action = action;
        this.next = null;
    }

    @Override
    public String toString() {
        return action;
    }
}