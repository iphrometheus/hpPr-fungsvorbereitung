package Year20WP.Aufgabe8;

public class QueueMainE {
    public static void main(String[] args) {
        Queue<String> que = new Queue<>();
        que.enqueue("ZZZZ");
        que.enqueue("AAA");
        que.enqueue("C");
        que.enqueue("aa");
        que.enqueue("eEE");
        Queue<Integer> mapped = que.map(String::length);
        for(Integer i : mapped) {
            System.out.println(i);
        }
    }
}
