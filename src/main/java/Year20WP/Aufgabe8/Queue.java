package Year20WP.Aufgabe8;

import java.util.Iterator;

public class Queue<E> implements Iterable<E> {

    /// Aufgabe A
    private SSL<E> head;
    private SSL<E> tail;

    private static class SSL<E> {
        E element;
        SSL<E> next;

        SSL(E element, SSL<E> next){
            this.element = element;
            this.next = next;
        }
    }

    public void enqueue(E ele){
        if(ele == null) return;
        if(head == null){
            head = tail = new SSL<>(ele, null);
        }else{
            tail.next = new SSL<>(ele, null);
            tail = tail.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public E getFirst(){
        return head.element;
    }

    public E dequeue(){
        E tmp = head.element;
        head = head.next;
        return tmp;
    }

    /// Aufgabe B

    public Iterator<E> iterator(){
        return new QIter();
    }

    private class QIter implements Iterator<E>{
        private SSL<E> iter = head;
        
        @Override
        public boolean hasNext(){
            return iter != null;
        }

        @Override
        public E next(){
            E tmp = iter.element;
            iter = iter.next;
            return tmp;
        }

    }

    /// Aufgabe C

    static <E extends Comparable<E>> E max(Queue<E> queue){
        if(queue == null || queue.isEmpty()) throw new IllegalArgumentException();

        E max = queue.head.element;

        for(E i: queue){
            if(i.compareTo(max) > 0){
                max = i;
            }
        }
        return max;
    }

    /// Aufgabe D
    
    Queue<E> filter(Predicate<E> f){
        Queue<E> ret = new Queue<>();
        for(E i : this){
            if(f.test(i)) ret.enqueue(i);
        }
        return ret;
    }

    /// Aufgabe E
    
    <O> Queue<O> map(Function<E,O> f){
        Queue<O> q = new Queue<>();
        for(E z:  this){
            O tmp = f.apply(z);
            q.enqueue(tmp);
        }
        return q;
    }
}
