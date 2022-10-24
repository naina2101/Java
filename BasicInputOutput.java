import java.util.*;

public class BasicInputOutput {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        String inputString = a.nextLine();
        System.out.println("Hello, World.");
        System.out.println(inputString);
        a.close();
    }
    
}
