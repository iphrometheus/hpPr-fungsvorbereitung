package Year22WP.Aufgabe7;

public class QueueMainAufgabeC {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("BB");
        q.enqueue("AA");
        q.enqueue("CC");
        q.enqueue("DD");
        String min = q.min(q);
        System.out.println(min);
    }
}
