package singlylinkedlist;

public class singllist<E> {
    private node<E> head=null;
    private node<E> tail=null;
    private int size=0;
public int size(){
    return size;
}
public boolean isempty(){
    return size()==0;
}





class node<E>{
    private  E data;
    private  node<E>next;

    public node(E data, node<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public node<E> getNext() {
        return next;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(node<E> next) {
        this.next = next;
    }
}
}
