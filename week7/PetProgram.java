package week7;

public class PetProgram
{
    String name, species, color;
    int age;

    PetProgram()
    {

    }

    PetProgram(String name, String species, String color, int age)
    {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Pets()
    {
        System.out.println("Name : "+name+", Species : "+species+", Color : "+color+ ", Age : "+age);
    }
}