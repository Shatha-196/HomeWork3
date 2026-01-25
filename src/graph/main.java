package graph;

public class main {
    public static void main(String[] args) {
        adjancecylist adjlist=new adjancecylist(3);
        adjlist.addedges(0,1);
        adjlist.addedges(0,2);
        adjlist.addedges(2,1);
        adjlist.display();

    }
}
