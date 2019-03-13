import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name=null;
    private int birthYear;
    private String story;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthYear(int birthYear)
    {
        this.birthYear=birthYear;
    }
    public void setStory(String story)
    {
     this.story=story;
    }

public Person(){}

public Person(String name,int birthYear)
{
    this.name=name;
    this.birthYear=birthYear;
}

public int age() {
    int a = 2019 - birthYear;
    return a;
}

    public void changeName(String name){
        if(name!=null)
            this.name=name;
    }

   /* public int calculateAge(LocalDate born, LocalDate now) {
        Period age=Period.between(born,now);
        return age.getYears();
        */
   @Override
    public String toString()
   {
    return "Person "+name+" Age "+this.age()+" Story "+story+"";
   }
    }

