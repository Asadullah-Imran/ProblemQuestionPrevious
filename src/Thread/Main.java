package Thread;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n=scanner.nextInt();
        int [] a= new int[n];
        int total_sum=0;

        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }

            //write your code here
            int parts=a.length/3;

            SumThread sumThread1= new SumThread(a,0,parts-1);
            SumThread sumThread2= new SumThread(a,parts,(2*parts)-1);
            SumThread sumThread3= new SumThread(a,2*parts,(3*parts)-1);

            Thread thread1= new Thread(sumThread1);
            Thread thread2= new Thread(sumThread2);
            Thread thread3= new Thread(sumThread3);

            thread1.start();
            thread2.start();
            thread3.start();

        try{
        thread1.join();
        thread2.join();
        thread3.join();

        }catch (InterruptedException e){
            System.out.println("Interuppted");
        }



            total_sum=sumThread1.sum+sumThread2.sum+sumThread3.sum;



            System.out.println("Total sum: "+total_sum);
    }
}