package week6;
//Weeraya konkam 632115040
public class InheritanceExample 
{
    public static void main(String[] args) 
    {
        Artist art = new Artist("Ning", 18, "F");

        art.genra = "K-POP";
        art.setJob("doctor");
        art.setJob("engineer");
        art.setJob("student");
        art.setJob("CEO");
        art.setJob("veterinarian");
        art.introduce();
        art.playMusic();
    }
}
