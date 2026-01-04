package circulylinkedlist;



public class circul<E> {


    private Node<E> tail;
    private int size;

    public circul() {
        size = 0;
        tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isempty() {
        return size() == 0;
    }

    public void addfirst(E data) {
        if (isempty()) {
            Node<E> newnode = new Node(data, null);
            tail = newnode;
            newnode.setNext(tail);
        } else {
            Node<E> newnode = new Node(data, null);
            tail.setNext(newnode);
        }
        size++;
    }

    public void addlast(E data) {
        addfirst(data);
        tail = tail.getNext();

    }

    public E getfirst() {
        if (isempty()) {
            return null;
        }
        return tail.getNext().getData();
    }

    public E getlast() {
        if (isempty()) {
            return null;
        }
        return tail.getData();
    }

    public E removefirst() {
        if (isempty())
            return null;
        E delete = tail.getNext().getData();
        if (tail == tail.getNext()) {
            tail = null;
        } else {
            tail.setNext(tail.getNext().getNext());
        }
        size--;
        return delete;
    }

    public E removelast() {
        if (isempty())
            return null;
        E delete = tail.getData();
        if (tail == tail.getNext()) {
            tail = null;
        } else {
            Node<E> temp=tail.getNext();
            while(temp.getNext()!=tail){
                temp=temp.getNext();
            }
            temp.setNext(tail.getNext());
            tail=temp;
        }
        size--;
        return delete;
    }
    public void display(){
        if(isempty()){
            System.out.println("list is empty");
             return;}
        Node<E> temp=tail.getNext();
        do {
            System.out.print(temp.getData()+"---->");
            temp=temp.getNext();
        }while (temp!=tail.getNext());
        System.out.print("go first("+temp.getData()+")");


    }



    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}
