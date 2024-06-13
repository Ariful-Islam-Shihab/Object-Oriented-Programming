import java.util.ArrayList;
import java.util.Scanner;

public class Threadexperiment1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int start=1;
        int end=x/3;
        Factorization f1=new Factorization(start,x,x,list);
        Factorization f2=new Factorization(end+1,(x*2)/3,x,list);
        Thread t1=new Thread(f1);
        Thread t2=new Thread(f2);
        Thread t3=new Thread(new Factorization((end*2)/3,x,x,list));
//        t1.start();
//        t2.start();
//        t3.start();
//        Main thread executes immediately
//        f1.facts();
        try{
//            Sleep forcefully pauses a thread for the specified time
//            A better approach is to use wait for other threads to join this thread
//            Thread.sleep(1000);
            t2.join();
            t1.join();
            t3.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(list);
    }
}
