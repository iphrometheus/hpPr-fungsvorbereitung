package Year20WP.Aufgabe8;

import java.util.Iterator;

public class Queue<E> implements Iterable<E> {
    private SSL<E> head;
    private SSL<E> tail;

    private static class SSL<E> {
        public E element;
        public SSL<E> next;
        SSL(E ele, SSL<E> next){
            this.element = ele;
            this.next = next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(E ele){
        if(ele == null) return;
        if(isEmpty()){
            head = tail = new SSL<>(ele, null);
        } else {
            tail.next = new SSL<>(ele, null);
            tail = tail.next;
        }
    }

    public E dequeue(){
        E tmp = head.element;
        head = head.next;
        return tmp;
    }

    public E getFirst(){
        return head.element;
    }

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

    public static <Z extends Comparable<Z>> Z max(Queue<Z> q){
        if(q == null || q.isEmpty()) throw new IllegalArgumentException();
        Z max = q.getFirst();
        for(Z z: q){
            if(z.compareTo(max) > 0){
                max = z;
            }
        }
        return max;
    }

    public Queue<E> filter(Predicate<E> f){
        Queue<E> ret = new Queue<>();
        for(E z : this){
            if(f.test(z)) ret.enqueue(z);
        }
        return ret;
    } 

    public <Z> Queue<Z> map(Function<E,Z> f){
        Queue<Z> ret = new Queue<>();
        for(E z : this){
            ret.enqueue(f.apply(z));
        }
        return ret;
    }
}
