package week6;
//Weeraya konkam 632115040
public class Artist extends Person
{
    String genra;
    String job;

    Artist(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getJob()
    {
        return job;
    }

    public void setJob(String newJob)
    {
        this.job = job + " "+ newJob ;
    }

    public void playMusic()
    {
        System.out.println(name+ " is playing "+ genra+" music");
        System.out.println("Job is "+getJob());
    }
}
