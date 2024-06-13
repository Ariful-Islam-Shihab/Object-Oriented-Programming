package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
//        try{
//            int[]arr=new int[5];
//            arr[5]=10;
//            int x=Integer.parseInt("abc");
//            int y=5/0;
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//            System.out.println("Next time try accessing right index");
//        }catch(NumberFormatException e){
//            System.out.println(e.getMessage());
//            System.out.println("It was a string");
//        }finally{
//            System.out.println("Hello from line 16");
//        }
//        System.out.println("After finally");
        firstmethod();
    }
    public static void firstmethod(){
        secondmethod();
    }
    public static void secondmethod(){
        thirdmethod();
    }
    public static void thirdmethod(){
        int x=5/0;
        System.out.println("Hola from thirdmethod");
    }
}
