package Summer2022Thread;

public class SumThread implements Runnable{
    public int[] arr;
    public int i,r;
    public int sum=0;
    SumThread(int[]arr,int i,int r){
        this.arr=arr;
        this.i=i;
        this.r=r;
    }
    public void run(){
        for(int i=this.i;i<this.r;i++){
            sum+=arr[i];
        }
    }
}
