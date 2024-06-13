package Summer2016;
public class ThreadDread extends Thread {
    private int value;
    private int index;
    private int [] array;
    public ThreadDread(int value, int index, int[] array) {
        this.value = value;
        this.index = index;
        this.array = array;
    }
    public void run(){
        try {
            Thread.sleep((long) (Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        array[index]=value;
    }
    public static void main(String[] args) {
        int [] array= new int[3];
        Thread t1=new ThreadDread(10,0,array);
        Thread t2=new ThreadDread(20,1,array);
        Thread t3=new ThreadDread(30,2,array);
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(array[0]+array[1]+array[2]);
    }
}