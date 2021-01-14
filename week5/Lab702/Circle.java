package week5.Lab702;

public class Circle 
{
    public static void main(String[] args) 
    {
        double x1 = 0.00;
        double y1 = 0.00;
        double r1 = 2.00;
        double AC1;// = Math.PI * Math.pow(r1, 2);
        double CC1;// = Math.PI * 2 * r1;
        if (r1 < 0.00)
        {
            AC1 = 0.00;
            CC1 = 0.00;
        }
        else
        {
            AC1 = Math.PI * Math.pow(r1, 2);
            CC1 = Math.PI * 2 * r1;
        }

        double x2 = 1.00;
        double y2 = 2.00;
        double r2 = 3.00;
        double AC2;// = Math.PI * Math.pow(r2, 2);
        double CC2;// = Math.PI * 2 * r2;
        if (r2 < 0.00)
        {
            AC2 = 0.00;
            CC2 = 0.00;
        }
        else
        {
            AC2 = Math.PI * Math.pow(r2, 2);
            CC2 = Math.PI * 2 * r2;
        }

        double x3 = 3.00;
        double y3 = 5.00;
        double r3 = 1.0;
        double AC3;// = Math.PI * Math.pow(r3, 2);
        double CC3;// = Math.PI * 2 * r3;
        if (r3 < 0.00)
        {
            AC3 = 0.00;
            CC3 = 0.00;
        }
        else
        {
            AC3 = Math.PI * Math.pow(r3, 2);
            CC3 = Math.PI * 2 * r3;
        }

        double x4 = -1.00;
        double y4 = -10.00;
        double r4 = -1.00;
        double AC4;// = Math.PI * Math.pow(r4, 2);
        double CC4;// = Math.PI * 2 * r4;
        if (r4 < 0.00)
        {
            AC4 = 0.00;
            CC4 = 0.00;
        }
        else
        {
            AC4 = Math.PI * Math.pow(r4, 2);
            CC4 = Math.PI * 2 * r4;
        }

        String C = intersect(x1, y1, r1, x2, y2, r2);
        String c = intersec(x1, y1, r1, x3, y3, r3);

        System.out.println("Area of cir1 = "+AC1);
        System.out.println("Circumferrene of cir1 = "+CC1);
        System.out.println("Area of cir2 = "+AC2);
        System.out.println("Circumferrene of cir2 = "+CC2);
        System.out.println("Area of cir3 = "+AC3);
        System.out.println("Circumferrene of cir3 = "+CC3);
        System.out.println("Area of cir4 = "+AC4);
        System.out.println("Circumferrene of cir4 = "+CC4);
        System.out.println("Is circle 1 intersec circle 2 : "+C);
        System.out.println("Is circle 1 intersec circle 3 : "+c);
    }

    public static String intersect(double x1, double y1, double r1, double x2, double y2, double r2)
    {
        double SqCase1_2 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        double RsqCase1_2 = (r1 + r2) * (r1 + r2);

        if (SqCase1_2 == RsqCase1_2)
        {
            return "true";
        }
        else if (SqCase1_2 > RsqCase1_2)
        {
            return "false";
        }
        else 
        {
            return "true";
        }
    }

    public static String intersec(double x1, double y1, double r1, double x3, double y3, double r3)
    {
        double SqCase1_3 = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
        double RsqCase1_3 = (r1 + r3) * (r1 + r3);

        if (SqCase1_3 == RsqCase1_3)
        {
            return "true";
        }
        else if (SqCase1_3 > RsqCase1_3)
        {
            return "false";
        }
        else 
        {
            return null;
        }
    }
}
