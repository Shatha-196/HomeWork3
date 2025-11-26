package Array;

public class Arrayss {
    public void travers(int[]number){
        for(int i=0 ;i<number.length ; i++)
            System.out.println("index["+i+"]"+number[i]);
    }
    public void r_travers(int []a){
        for( int i=a.length;i>=0;i--)
            System.out.println("indexes:"+a[i]);
    }
    public void update(int []a,int index,int value)
    {
        if(index<0 || index>=a.length)
         System.out.print("index not found");
        else
            a[index]=value;
    }
    public void delete(int []a,int index)
    {
        if(index<0 || index>=a.length)
            System.out.print("index not found");
        else
            a[index]=0;
    }
}
