package week7;

public class PetData extends PetProgram
{
    String WhatPets, size, type, skill, country, speak, fly;
    PetData(String name, String species, String color, int age)
    {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void animal()
    {
        System.out.println("\n"+WhatPets);
    }

    public void Run()
    {
        System.out.println(WhatPets+" "+name+" is run to the jungle");
    }

    public void Bark()
    {
        System.out.println(size);
    }

    public void Hair()
    {
        if (type.matches("Short hair"))
        {
            System.out.println("Short hair : true");
        }
        else
        {
            System.out.println("Short hair : false");
        }
    }

    public void IsSwimToTheSea()
    {
        System.out.println(WhatPets+" "+name+" is swim to the sea");
        System.out.println(size);
    }

    public void SwimFast()
    {
        if (skill.matches("Swim fast"))
        {
            System.out.println("Swim fast : true");
        }
        else
        {
            System.out.println("Swim fast : false");
        }
    }

    public void Water()
    {
        if (type.matches("Salt water"))
        {
            System.out.println("Salt water : true");
        }
        else
        {
            System.out.println("Salt water : false");
        }
    }

    public void Speak()
    {
        System.out.println(WhatPets+" "+speak);
    }

    public void CheckCountry()
    {
        System.out.println("Country : "+country);
    }

    public void IsCanFly()
    {
        System.out.println(WhatPets+" is "+fly);
    }
}
