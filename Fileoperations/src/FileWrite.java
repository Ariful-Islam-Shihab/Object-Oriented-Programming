import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Employee[] employees=new Employee[n];
        for(int i=0;i<n;i++){
            String name=sc.next();
            String id=sc.next();
            double sum=0;
            double[] performance=new double[6];
            for(int j=0;j<6;j++){
                performance[j]=sc.nextDouble();
                sum+=performance[j];
            }
            double average=sum/6.0;
            employees[i]=new Employee(name,id,average);
        }
        try{
            File file=new File("Employee.txt");
            PrintWriter pr=new PrintWriter(file);
            for(int i=0;i<n;i++){
                pr.println(employees[i].name);
                pr.println(employees[i].id);
                pr.println(employees[i].average);
            }
            pr.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
