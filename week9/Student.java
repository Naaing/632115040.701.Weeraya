package week9;

//import java.util.Scanner;

public class Student 
{
    private String firstname = "Hello";
    private String lastname = "World";

    public String toString()
    {
        return "My first name "+firstname+" last name "+lastname;
    }

    public void setFirstName(String firstname)
    {
        /*
        Scanner inputF = new Scanner(System.in);
        System.out.print("input your first name : ");
        this.firstname = inputF.next();

        inputF.close();
        */

        this.firstname = firstname;
    }

    public String getFirstName()
    {
        return firstname;
    }

    public void setLastName(String lastname)
    {
        /*
        Scanner intputL = new Scanner(System.in);
        System.out.print("input your last name : ");
        this.lastname = intputL.next();

        intputL.close();
        */

        this.lastname = lastname;
    }

    public String getLastName()
    {
        return lastname;
    }

    public static void main(String[] args) 
    {
        Student p = new Student();
        p.setFirstName("Weeraya");
        p.setLastName("Konkam");
        System.out.println(p.toString());
    }
}
