package Year20WP.Aufgabe8;

public class QueueMainC {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("AA");
        q.enqueue("CC");
        q.enqueue("EE");
        q.enqueue("ZZ");

        String min = Queue.max(q);
        System.out.println(min);
    }
}
