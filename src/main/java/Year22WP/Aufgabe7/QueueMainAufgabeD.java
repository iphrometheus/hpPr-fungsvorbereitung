package Year22WP.Aufgabe7;

public class QueueMainAufgabeD {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("BB");
        q.enqueue("AA");
        q.enqueue("CC");
        q.enqueue("DD");
        q.enqueue("AZ");
        Queue<String> res = q.filter(e -> e.startsWith("A"));
        for (String string : res) {
            System.out.println(string);
        }
    }
}
