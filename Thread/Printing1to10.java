public class Printing1to10 implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        Printing1to10 p1=new Printing1to10();
        Thread t1=new Thread(p1);
        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        return;
    }
}
