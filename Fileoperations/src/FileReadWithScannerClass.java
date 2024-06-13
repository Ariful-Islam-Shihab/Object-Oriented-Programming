import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadWithScannerClass {
    public static void main(String[] args) {
        try {
            File input=new File("C:\\Users\\88016\\Desktop\\Java\\Fileoperations\\Employee.txt");
            Scanner sc = new Scanner(input);
            PrintWriter pr = new PrintWriter("increment.txt");
            while (sc.hasNext()) {
                String name = sc.next();
                String id = sc.next();
                double performence = sc.nextDouble();
                if (performence > 75){
                    pr.println(name);
                    System.out.println(name+" "+id);
                }
            }

            sc.close();
            pr.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
