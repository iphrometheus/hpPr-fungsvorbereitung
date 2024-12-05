package Year22RP.Aufgabe7;

public class QueueMainE {
    public static void main(String[] args) {
        Queue<String> names = new Queue<>();
        names.enqueue("Reifen");
        names.enqueue("Lenkrad");
        names.enqueue("Motor");
        Queue<Long> prices = new Queue<>();
        prices.enqueue(100000L);
        prices.enqueue(4000L);
        prices.enqueue(2000L);
        Queue<Part> parts = Queue.combines(names, prices, Part::new);
        while (!parts.isEmpty()) {
            System.out.println(parts.dequeue());
        }
    }
}
