package Year22RP.Aufgabe7;

public class QueueMainC {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("AA");
        q.enqueue("CC");
        q.enqueue("EE");
        q.enqueue("ZZ");

        String min = Queue.min(q);
        System.out.println(min);
    }
}
