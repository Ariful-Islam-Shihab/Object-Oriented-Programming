public class Experiment1 {
    public static void main(String[] args) {
        int x=5,y=0;
        int[] arr=new int[]{1,2,3};
        try{
            int z=x/y;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("In finally block");
            for(int i:arr){
                System.out.println(i);
            }
        }
        System.out.println("Last line");
    }
}
