import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        try{
            try{
                String s="Abc";
                int x=Integer.parseInt(s);
            }catch (NumberFormatException e){
                System.out.println(e.getClass());
                try{
                int arr[]=new int[5];
                arr[5]=0;
                }catch(NumberFormatException ef){
                    System.out.println(ef.getMessage());
                }finally {
                    System.out.println("Finally from line 14");
                }

            }finally {
                System.out.println("Finally from line 20");
            }
        }catch (Exception e){
            System.out.println(e.getClass());
            try{
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();//abc
            }catch (NullPointerException nl){
                System.out.println(nl.getMessage());
            }finally {
                System.out.println("Finally from line 30");
            }
        }finally {
            System.out.println("Finally from line 33");
        }
    }
}
//Finally from line 20
//Number format exception
//Finally from line 30
//Finally from line 33
//InputMismatchException
//2
//NumberFormatException
//Finally from line 14
//Finally from line 20
//ArrayIndexOutOfBoundsException
//Finally from line 30
//Finally from line 33
//InputMismatchException->jvm