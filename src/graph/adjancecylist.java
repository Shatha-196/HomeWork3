package graph;

import Stack.SinglyLinkedList;

public class adjancecylist {
    private SinglyLinkedList<Integer> []adjlist;
    private int vartices;

    private int edges;
    public adjancecylist(int nodes) {
        vartices=nodes;
        edges= 0;
        adjlist=new SinglyLinkedList[nodes];
        for (int v=0 ; v< adjlist.length ; v++){
            adjlist[v]=new SinglyLinkedList<Integer>();
        }

    }
    public void addedges(int from,int to){
        adjlist[from].addlast(to);
        adjlist[to].addlast(from);
        edges++;
    }
    public void display(){
        System.out.println(vartices + "v" + edges +"e");
        for(int y=0;y<vartices;y++){
            System.out.print(y +":");
            adjlist[y].display();
        }
    }



}
