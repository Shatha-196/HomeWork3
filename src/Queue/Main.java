package Queue;

import Stack.SlinkedStack;

public class Main {public static void main(String[] args) {
    LinkedQueue<Integer> lqueue=new LinkedQueue<Integer>();
    lqueue.front();
    lqueue.dequeue();
    lqueue.enqueue(3);



        System.out.println("the top is"+lqueue.front());
        while (!lqueue.isEmpty()){
            System.out.println("item removed:"+lqueue.dequeue());

        }


    }
}
