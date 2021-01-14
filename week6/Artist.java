package week6;
//Weeraya konkam 632115040
public class Artist extends Person
{
    String genra;

    Artist(String name, int age, String gender, String job)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    public void playMusic()
    {
        System.out.println(name+ " is playing "+ genra+" music");
    }
}
