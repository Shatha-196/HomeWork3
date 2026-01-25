package Queue;

import DoublyLinkedList.DoublyLinkedList;

public class DQueue<E> implements Queue<E> {
        DoublyLinkedList<E> list=new DoublyLinkedList<E>();
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
            list.addLast(data);


        }

        @Override
        public E front() {
            return list.getFirest();
        }

        @Override
        public E dequeue() {
            return list.removeFirest();
        }
    }


