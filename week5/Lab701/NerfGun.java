package week5.Lab701;

public class NerfGun
{
    private String L = "BANG!!!";
    private int Bang;
    private int Reload;
    private int ID;

    public NerfGun()
    {
        String L = "BANG!!!";
        int Bang = 0;
        int Reload = 0;
        int ID = 1;
        ID++;
    }

    public NerfGun(int i)
    {
        Reload = i;
        i = Reload;
    }
    
    
	public String fire()
    {
        System.out.println(L);
        if (L.matches("BANG!!!"))
        {
            Bang = 1;
        }
        return L;
    }

    public int getReload()
    {
        return Reload;
    }

    public void reload(int newReload)
    { 
        if (Reload > 15)
        {
            System.out.println("Error!! the ammunition is overload");
        }
        else
        {
            if (L == "BANG!!!")
            {
                newReload = newReload - Bang;
                Reload = Reload + newReload;
            }
            else
            {
                Reload = Reload + newReload;
            }
        }
    }

    public void displayGunID()
    {
        System.out.println("The ID of this gun is "+ ID);
        ID++;
    }

    public void displayNumOfAmmunition()
    {
        if (Reload > 15)
        {
            System.out.println("Error!! the ammunition is overload");
            System.out.println((Reload - Bang)+" bullet left");
        }
        else 
        {
            System.out.println((Reload)+" bullet left");
        }
    }
}