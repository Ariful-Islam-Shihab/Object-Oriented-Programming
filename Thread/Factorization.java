import java.util.ArrayList;

public class Factorization implements Runnable{
    int start,end,number;
    ArrayList<Integer>list;

    public Factorization(int start, int end, int number,ArrayList<Integer>list) {
        this.start = start;
        this.end = end;
        this.number = number;
        this.list=list;
    }
    public void run(){
        for(int i=start;i<=end;i++){
            if(number%i==0)
                list.add(i);
        }
    }
    public void facts(){
        for(int i=start;i<=end;i++){
            if(number%i==0)
                list.add(i);
        }
    }
}
