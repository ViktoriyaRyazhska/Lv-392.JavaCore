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


        Person p1=new Person();
        p1.setBirthYear(1999);
        p1.setName("Yurii");
        p1.setStory(p1.input());
        Person p2=new Person();
        p2.setBirthYear(1989);
        p2.setName("Nazar");
        p2.setStory(p2.input());
        Person p3=new Person("Marko",1978);
       p3.setStory(p3.input());
        Person p4=new Person();
        p4.setBirthYear(2001);
        p4.setName("Sveta");
        p4.setStory(p4.input());
        Person p5=new Person("Petro",2001);
        p5.setStory(p5.input());

        //p5.setStory(in.readLine());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);




    }
}
