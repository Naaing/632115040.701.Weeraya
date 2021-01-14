package week6;
//Weeraya konkam 632115040
public class InheritanceExample 
{
    public static void main(String[] args) 
    {
        Artist art = new Artist("Ning", 18, "F", "doctor"+" engineer"+" student"+" CEO"+" veterinarian");

        art.genra = "K-POP";
        art.introduce();
        art.playMusic();
    }
}
