package week10;

public class Human 
{
    public void hit(Animal animal)
    {
        System.out.println(animal.roar());
    }

    public static void main(String[] args) 
    {
        Animal dog = new Dog(); //Q1 ทำไมให้Dog()กับdogได้ Ans>dog in Animal type is assign a new value, for exemple Animal dog = new Dog(); is means dog will display value of Dog class 
        Human human = new Human();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog); //Q2 ผลลัพท์เดียวกัน? ทำไม?

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog); //Q2 Ans>not display because receive value from different class

        dog = new Fish();
        System.out.println("The third calling hit(Animal)");
        human.hit(dog);
    }
}
