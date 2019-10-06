import java.util.Scanner;

public class inputClass{
    
    
    public static String input(String x){
        Scanner in = new Scanner(System.in); 
        x = in.nextLine();
        in.close();
        return x;
    }
}