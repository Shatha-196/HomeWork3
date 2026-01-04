package singlylinkedlist;

public class singllist<E> {
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;
public int size(){
    return size;
}
public boolean isempty(){
    return size()==0;
}
public void addfirst(E data){
    Node<E> newnode=new Node(data,head);
    head=newnode;
    if(isempty())
        tail=head;
    size++;
}
public E getfirst(){
    if (isempty())
        return null;
    return head.getData();
}
//نوع بيانات Eعشان تخزن القيمه المحذوفه
public E removefirst(){
    if (isempty())
        return null;
    //هذا الكود للتخزين القيمه المحذوفه
    E delete =head.getData();
    head=head.getNext();
    size--;
    if(isempty())
        tail=head;
    return delete;

}
public void addlast(E data){
    Node<E> newnode= new Node(data,null);
    if(isempty())
        head=newnode;
    else
        tail.setNext(newnode);
    tail=newnode;
    size++;
}
public E getlast() {
    if (isempty())
        return null;
    return tail.getData();
}
public E removelast(){
    if (isempty())
        return null;
    E delete=tail.getData();
    if(head == tail)
        head=tail=null;
    else{
        Node<E> temp=head;
        while(temp.getNext() != tail){
            temp=temp.getNext();
        }
        temp.setNext(null);
        tail=temp;
    }
    size--;
    return delete;
}
public void display(){}

public void  addinposition(E data,int position) {
    if (position < 1 || position > size + 1) {
        throw new IllegalArgumentException("INVALID POSITION");

    }
    if (position == 1) {
        addfirst(data);
        return;
    } else {
        Node<E> newnode = new Node(data, null);
        Node<E> temp = head;
        int count = 1;
        while (count < position - 1) {
            temp = temp.getNext();
            count++;
        }
        newnode.setNext(temp.getNext());
        temp.setNext(newnode);
    }
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

        public Node<E> getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
