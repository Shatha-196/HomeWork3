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
    public void shiftleftd(int[]a,int index){
        //a.length-1 عشان ما ياخذ من الي بعده الي هومش موجود اصلا
        for(int i=index;i<a.length-1;i++)
            a[i]=a[i+1];
        a[a.length-1]= Integer.MIN_VALUE;
    }
    public int linersearch(int[]a,int n){
        for(int i=0;i<=a.length;i++){
            if(n == a[i])
                return i;
        }


        return -1;
    }

    public int binarysearch(int [] a,int s,int findex,int lindex){
        boolean fn;

        while(findex<=lindex){
             int mid=(findex=lindex)/2;
             if(s==a[mid])
                 return mid;
             if(s>a[mid])
                 findex=mid+1;
             if(s<a[mid])
                 lindex=mid-1;
         }
        return 0;
    }
    public int binarysearch(int [] a,int s){
        boolean fn;
        int findex=0;
        int lindex=a.length-1;
        while(findex<=lindex){
            int mid=(findex=lindex)/2;
            if(s==a[mid])
                return mid;
            if(s>a[mid])
                findex=mid+1;
            if(s<a[mid])
                lindex=mid-1;
        }
        return 0;
    }

}
