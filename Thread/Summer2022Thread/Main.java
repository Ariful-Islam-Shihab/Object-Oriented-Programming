package Summer2022Thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int total_sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        // Write your codes here
        // ....................
        int start=0;
        int end=(n/3)-1;
        int start2=end+1;
        int end2=(n/3)*2-1;
        int start3=end2+1;
        int end3=n-1;
        SumThread s1=new SumThread(a,start,end);
        SumThread s2=new SumThread(a,start2,end2);
        SumThread s3=new SumThread(a,start3,end3);
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);
        Thread t3=new Thread(s3);
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        total_sum=s1.sum+s2.sum+s3.sum;
        System.out.println("Total Sum: " + total_sum);
    }
}