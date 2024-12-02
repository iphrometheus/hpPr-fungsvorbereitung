package Year22WP.Aufgabe7;

public class QueueMainAufgabeE {
    public static void main(String[] args) {
        Queue<String> empfaenger = new Queue<>();
        empfaenger.enqueue("Alva");
        empfaenger.enqueue("Berit");
        empfaenger.enqueue("Carlson");
        Queue<Long> preise = new Queue<>();
        preise.enqueue(1000L);
        preise.enqueue(8500L);
        preise.enqueue(3200L);
        Queue<Geschenk> geschenke = Queue.combine(empfaenger, preise, Geschenk::new);

        for (Geschenk geschenk : geschenke) {
            System.out.println(geschenk.toString());
        }
    }
}
