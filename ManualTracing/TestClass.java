public class TestClass {
    int x;
    {
        System.out.println("I'm an empty block");
    }
    static{
        System.out.println("I'm inside 1st static block");
    }
    public TestClass(int x,int y){
        this(x);
        System.out.println("2 variable constructor");
    }
    public TestClass(int x) {
//        this();
        System.out.println("I'm inside the constructor");
        this.x = x;
    }
//    public TestClass(){
//        System.out.println("I'm default constructor");
//    }
    public void someMethod(){
        System.out.println("I'm inside some method");
        System.out.println("I've value "+x);
    }
    static{
        System.out.println("I'm inside 2nd static block");
    }

    {
        System.out.println("I'm 2nd empty block");
    }
}
