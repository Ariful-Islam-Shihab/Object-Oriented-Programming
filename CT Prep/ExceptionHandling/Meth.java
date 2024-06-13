package ExceptionHandling;

public class Meth {
    public int divide(int a, int b) throws DivbyZero{
        if(b==0)
            throw new DivbyZero("The denominator cannot be zero!");
        return a/b;
    }
}
class test {
    static int x;
    public static void main(String[] args) {
        Meth m = new Meth();
//        int a;
        System.out.println(x);
        int n = 4;
        int d = 0;
        try{
        System.out.println(m.divide(n,d));
        }catch (DivbyZero e){
            System.out.println(e.getMessage());
        }finally {
        System.out.println("Complete"); //this line should be always executed
        }
    }
}
class DivbyZero extends ArithmeticException{
    public DivbyZero(String s){
        super(s);
    }
}
