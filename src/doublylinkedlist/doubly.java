package doublylinkedlist;

public class doubly<E> {
    private Node<E> header;
    private Node<E> tailer;
    private int size;

    public doubly() {
        header = new Node(null,null,null);
        tailer =new Node(header,null,null);
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isempty() {
        return size() == 0;
    }
    private  void addbetween(Node<E> left ,E data,Node<E> right){
        Node<E> newnode=new Node(left,data,right);
        left.setNext(newnode);
        right.setPrev(newnode);
        size++;
    }
    public void addfirst(E data){
        addbetween( header ,data,header.getNext());
    }
    public void addlast(E data){
        addbetween( tailer.getPrev() ,data,tailer);
    }
    public E getfirst(){
        if ( isempty())return null;
        return header.getPrev().getData();
    }
    public E getlast(){
        if ( isempty())return null;
        return tailer.getPrev().getData();
    }
    private E remove(Node<E> delnode){
        if ( isempty())return null;
        E delete =delnode.getData();
        Node<E> left =delnode.getPrev();
        Node<E> right=delnode.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delete;

    }
    public E removefirst(){
        return remove(header.getNext());
    }
    public E removelast(){
        return remove(tailer.getPrev());
    }
    public void display(){
        if ( isempty())
            System.out.println("list is empty");
        Node<E> temp=header.getNext();
        System.out.println("null<-----header<--->");
        while (temp!=tailer){
            System.out.println(temp.getData()+"<--->");
            temp=temp.getNext();
            System.out.println("tailer----->");
        }
    }






    class Node<E>{
        private Node<E> prev;
        private E data;
        private Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
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
