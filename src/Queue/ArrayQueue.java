package Queue;

public class ArrayQueue<E> implements Queue<E> {
    private E arr[];
     private static final int CAPICTY=1000;
     private int f=0;
     private int size=0;

    public ArrayQueue() {
        //استدعاء الذي تحت
        this(CAPICTY);
    }

    public ArrayQueue(int c) {
        arr=(E[]) new Object[CAPICTY];
        f=0;
        size=0;
    }



    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(E data) {
        if(size()== arr.length){
            System.out.println("can't add queue is full"); }
        else{
            int av=(f+size)%arr.length;
            arr[av]=data;
            size++;
        }


    }

    @Override
    public E front() {
        if(isEmpty())return null;
        return arr[f];
    }

    @Override
    public E dequeue() {
       if(isEmpty()) return null;
       E delete=arr[f];
       arr[f]=null;
       f=f+1;
       size--;
       return delete;
    }
}
