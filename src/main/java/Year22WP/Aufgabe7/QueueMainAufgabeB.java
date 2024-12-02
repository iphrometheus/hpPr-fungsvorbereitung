package Year22WP.Aufgabe7;

public class QueueMainAufgabeB {
    public static void main(String[] args) {
        Queue<Integer> d = new Queue<>();
        d.enqueue(1);
        d.enqueue(2);
        d.enqueue(4);
        d.enqueue(9);
        for(Integer e : d){
            System.out.println(e);
        }
    }
}
