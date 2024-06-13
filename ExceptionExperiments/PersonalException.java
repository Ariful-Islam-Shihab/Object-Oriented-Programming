import java.util.Scanner;

public class PersonalException {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
//        try{
//            if(x>10)
//                throw new UserDefinedException("Your input is greater than 10");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        if(x==0)
            throw new UncheckedUserDefinedException("The number is zero");
    }
}
