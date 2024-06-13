public class Main {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        TestClass t1=new TestClass(10,20);
        t1.someMethod();
        TestClass t2=new TestClass(20);
        t2.someMethod();
//        TestClass t3=new TestClass();
//        t3.someMethod();
    }
}
//Inside Main
//I'm inside 1st static block
//I'm inside 2nd static block
//I'm an empty block
//I'm second empty block
//I'm default constructor
//I'm inside the constructor
//2 variable constructor
//I'm inside some method
//I've value 10
//I'm an empty block
//I'm 2nd empty block
//I'm default constructor
//I'm inside the constructor
//I'm inside some method
//I've value 20
//I'm an empty block
//I'm 2nd empty block
//I'm default constructor
//I'm inside some method
//I've value 0

