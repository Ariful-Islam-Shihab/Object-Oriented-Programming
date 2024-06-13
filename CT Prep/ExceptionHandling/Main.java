public class Main {
    static int TestA() throws Exception{
        throw new Exception("Exception has been thrown from TestA");
    }
    static boolean TestC(boolean val) throws Exception{
        if(val == false){
            throw new Exception("Exception in TestC");
        }
        return false;
    }
    static void TestB() throws Exception{
        int a=5;
        try{
            a = TestA();
        }catch (Exception e){
            if(a == 0){
            System.out.println("Exception in TestB: a is zero.");
        }
        else{
            System.out.println("You should figure out the value of a: " + a);
            throw new Exception("Exception from else clause in TestB");
        }
        }
    }
    public static void main(String[] args) {
        try{
            TestC(false);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            try{
                TestB();
            }
            catch(Exception e1){
                System.out.println(e1.getMessage());
            }
        }
    }
}