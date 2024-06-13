import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner br=new Scanner("person.txt");
        ArrayList<Person>list =new ArrayList<>();
        while(br.hasNext()){
            String line= br.nextLine();
            String[] parts=line.split("/");
            System.out.println(parts[0]);
//            System.out.println(parts[1]);
//            System.out.println(parts[2]);
//            int id=Integer.parseInt(parts[0]);
//            int age=Integer.parseInt(parts[1]);
//            String name=parts[2];
//            Person p=new Person(id,age,name);
//            list.add(p);
        }
        for(Person p:list){
            System.out.println(p.age+" "+p.id+" "+p.name);
        }
        br.close();
    }
}
