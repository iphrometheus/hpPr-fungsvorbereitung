package Year22RP.Aufgabe7;

public class QueueMainB {
    public static void main(String[] args) {
        Queue<Integer> d = new Queue<>();
        d.enqueue(1);
        d.enqueue(3);
        d.enqueue(6);

        for(Integer i : d) {
            System.out.println(i);
        }
    }
}
