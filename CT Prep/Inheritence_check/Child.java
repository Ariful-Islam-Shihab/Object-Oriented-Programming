package Inheritence_cegck;

public class Child extends Parent{
    public Child(){
//        super(5);
//        super(5,6);
        System.out.println("Inside Childs constructor");
    }
    public Child(int x){
//        super(5);
        super(5,6);
        System.out.println("Inside Childs constructor");
    }

}
