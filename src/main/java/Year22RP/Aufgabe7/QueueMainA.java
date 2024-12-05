package Year22RP.Aufgabe7;

public class QueueMainA {
    public static void main(String[] args) {
        Queue<Double> q = new Queue<>();
        q.enqueue(1.0);
        q.enqueue(2.0);
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.getFirst());
    }
}
