public class HistoryNode {
    String url;
    HistoryNode next;

    public HistoryNode(String url) {
        this.url = url;
        this.next = null;
    }

    @Override
    public String toString() {
        return url;
    }
}