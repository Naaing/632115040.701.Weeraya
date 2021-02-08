package week9;

public class Testoverride1 
{
    public static void main(String[] args) 
    {
        /*
        Person person1;
        person1 = new Person("Mark", 2001);
        person1.introduce();

        Person person2 = new Sheriff("Mateo", 1988, "California");
        person2.introduce();
        */
        Person person1 = new Sheriff("Ball", 1977, "teacher and teach the students in CMU");
        person1.introduce();

        Person person2 = new Sheriff("Tu", 1954, "prime minister and work in Thailand.");
        person2.introduce();

        Person person3 = new Sheriff("Messi", 1987, "football player and work in Barcelona football club");
        person3.introduce();

        Person person4 = new Sheriff("Ning", 2002, "student in CMU.");
        person4.introduce();
    }
}
