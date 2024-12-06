package Year20WP;

public class QueueMainD {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
            q.enqueue("AA");
            q.enqueue("AC");
            q.enqueue("EE");
            q.enqueue("ZZ");
            q.enqueue("AZ");

        Queue<String> q2 = q.filter(e -> e.startsWith("A"));
        for (String s : q2) {
            System.out.println(s);
        }
    }
}
