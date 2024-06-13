public class Experiment2 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int y=0;
        try{
            int z=arr[5]/y;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
//        int z=arr[5]/y;
        System.out.println("Last line");
    }
}
