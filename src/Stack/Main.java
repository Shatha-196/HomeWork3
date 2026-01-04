package Stack;

public class Main {
    public static void main(String[] args) {
        SlinkedStack<Integer> lstack= new SlinkedStack<Integer>();
        lstack.push(10);
        lstack.push(20);
        lstack.push(40);
        lstack.push(50);
        while (!lstack.isEmpty()){
            System.out.println(lstack.pop());
        }
    }
}
