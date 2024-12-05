package Year21WP.Aufgabe7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue <V> implements Iterable<V> {
    private Element<V> head = null;
    private Element<V> tail = null;

    public static <V> Queue<V> of(V ... values){
        Queue<V> queue = new Queue<V>();
        if(values != null){
            Arrays.stream(values).forEach(queue::enqueue);
        }
        return queue;
    }

    public void enqueue(V v){
        if(v != null){
            if(tail == null){
                head = new Element<>(v);
                tail = head;
            }else {
                tail.next = new Element<>(v);
                tail = tail.next;
            }
        }
    }

    public V dequeue(){
        V v = head.element;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return v;
    }

    public V getFirst(){
        return head.element;
    }

    private static class Element<E>{
        private final E element;
        private Element<E> next = null;
        public Element(E element){
            this.element = element;
        }
    }

    public Iterator<V> iterator(){
        return new Qiter();
    }

    private class Qiter implements Iterator<V>{

        Element<V> iter = head;

        @Override
        public boolean hasNext(){
            return iter != null;
        }

        @Override
        public V next(){
            if(iter == null) throw new NoSuchElementException();
            V tmp = iter.element;
            iter = iter.next;
            return tmp;
        }
    }

    int sum (ToIntFunction<V> intFunc){
        int sum = 0;
        for(V i : this){
            sum += intFunc.applyAsInt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("ADDFS");
        q.enqueue("AS");
        q.enqueue("SFDS");
        q.enqueue("SFSFSFS");
        q.enqueue("ERWREWR");
        System.out.println(q.sum(String::length));
    }
}