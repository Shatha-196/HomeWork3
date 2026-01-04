package doublylinkedlist;

public class main {
    public static void main(String[] args) {
        doubly<Integer> dlist=new doubly<Integer>();
        dlist.addfirst(2);
        dlist.addlast(5);
        dlist.addfirst(1);
        dlist.addlast(3);
        dlist.addfirst(6);
        dlist.addlast(7);
        dlist.removefirst();
        dlist.removelast();
        dlist.display();

    }
}
