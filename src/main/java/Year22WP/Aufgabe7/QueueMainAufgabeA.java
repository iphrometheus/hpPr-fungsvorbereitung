package Year22WP.Aufgabe7;

public class QueueMainAufgabeA {
    public static void main(String[] args) {
        Queue<Double> queue = new Queue<>();
        queue.enqueue(1.0);
        System.out.println(queue.getFirst());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
    }
}
