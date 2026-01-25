package Queue;
import SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E> {
    singlyLinkedList<E> list=new singlyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(E data) {
      list.addlast(data);

    }

    @Override
    public E front() {
        return list.getFirst();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
}
