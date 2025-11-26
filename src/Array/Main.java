package Array;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     Arrayss arr=new Arrayss();
     int []number=new int[5];
     System.out.println("enter"+number.length+"numbers");
     for(int i=0; i<=number.length;i++)
         number[i]=s.nextInt();
     arr.travers(number);
     int[]numbers={1,2,3,4,5};
     //arr.delete(numbers,2);
    //arr.update(numbers,2,7);
        arr.shiftleftd(numbers,2);
    }
}