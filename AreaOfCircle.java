import java.util.*;

public class AreaOfCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the radius of circle:");
        Scanner a = new Scanner(System.in);
        float r = a.nextFloat();
        float area;
        area = (22/7) * r * r;
        System.out.print("Area of the circle is:");
        System.out.println(area);
        a.close();
    }
    
}
