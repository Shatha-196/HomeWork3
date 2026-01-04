package circulylinkedlist;

public class main {
    public static void main(String[] args) {
        circul<String> clist=new circul<String>();
        clist.addfirst("afnan");
        clist.addfirst("aalia");
        clist.addlast("asma");
        clist.addlast("aber");
        clist.addfirst("huda");
        clist.removelast();
        clist.display();
    }
}
