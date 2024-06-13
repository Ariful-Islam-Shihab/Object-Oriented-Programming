import java.util.InputMismatchException;

public class Experiment4 {
    public static void main(String[] args) {
        try{
            System.out.println(A());
        }catch (Exception e){
            System.out.println("Inside main");
            System.out.println(e.getClass());
        }
    }
    static public boolean A() throws ClassNotFoundException{
        try{
            B();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
    static int B() throws ClassNotFoundException{
        try{
            C();
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    static double C() throws ClassNotFoundException{
        try {
            D();
        }catch (ClassNotFoundException e){
            System.out.println(e.getClass());
        }
        return 0;
    }
    static void D() throws ClassNotFoundException{
        throw new UncheckedUserDefinedException("Unchecked");
    }
}
//throw -> one who throws
//throws -> one that tells
