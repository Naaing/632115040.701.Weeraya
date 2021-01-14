package week6;
//Weeraya konkam 632115040
public class Person
{
    String name;
    int age;
    String gender;
    String job;

    Person()
    {

    }

    Person(String name, int age, String gender, String job)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    public void introduce()
    {
        System.out.println("My name is "+name);
        System.out.println("My gender is "+gender);
    }
}