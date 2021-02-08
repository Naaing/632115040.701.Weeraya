package week9;

public class Person 
{
    String name;
    int bornYear;

    public Person(String name, int bornYear)
    {
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce()
    {
        System.out.print("My name is "+name+", ");
        System.out.println("I was born in "+bornYear+".");
    }
}

class Sheriff extends Person
{
    String workState; 

    public Sheriff(String name, int bornYear, String workState) 
    {
        super(name, bornYear);
        this.workState = workState;
    }
    
    public void introduce()
    {
        super.introduce();
        System.out.println("I'm a "+workState);
        System.out.println("-----------------------------------------------------");
    }
}