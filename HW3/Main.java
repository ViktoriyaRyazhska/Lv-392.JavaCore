import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) throws IOException {
        /*LocalDate born=LocalDate.of(1999,8,11);
        LocalDate now=LocalDate.of(2019,3,13);
        Person p=new Person();

        int age=p.calculateAge(born,now);
        System.out.println(age);
        */
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        Person p1=new Person();
        p1.setBirthYear(1999);
        p1.setName("Yurii");
        p1.setStory(in.readLine());
        Person p2=new Person();
        p2.setBirthYear(1989);
        p2.setName("Nazar");
        p2.setStory(in.readLine());
        Person p3=new Person();
        p3.setBirthYear(1978);
        p3.setName("Galya");
        p3.setStory(in.readLine());
        Person p4=new Person();
        p4.setBirthYear(2001);
        p4.setName("Sveta");
        p4.setStory(in.readLine());
        Person p5=new Person();
        p5.setBirthYear(2001);
        p5.setName("Petro");
        p5.setStory(in.readLine());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);




    }
}
