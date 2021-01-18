package week7;

public class ShowPetData 
{
    public static void main(String[] args) 
    {
        PetData dog = new PetData("Lucky", "Pooddle", "brown", 2);
        dog.WhatPets = "My Dog";
        dog.size = "Small bark Box Box!!";
        dog.type = "Short hair";
        dog.animal();
        dog.Pets();
        dog.Run();
        dog.Bark();
        dog.Hair();

        PetData fish = new PetData("ABC", "Clown fish", "orange", 1);
        fish.WhatPets = "My fish";
        fish.size = "Small";
        fish.type = "Salt water";
        fish.skill = "Swim fast";
        fish.animal();
        fish.Pets();
        fish.IsSwimToTheSea();
        fish.SwimFast();
        fish.Water();

        PetData bird = new PetData("EFG", "Parrot", "Green", 2);
        bird.WhatPets = "My bird";
        bird.speak = "can speak";
        bird.fly = "can fly";
        bird.country = "South America";
        bird.animal();
        bird.Pets();
        bird.Speak();
        bird.CheckCountry();
        bird.IsCanFly();
    }
}
