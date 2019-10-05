import java.util.Scanner;
import java.io;
import java.lang.String;

class MainProject
{   
    public static void main(String[] args) 
    {        
        //Input
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        in.close();

        Process(line);
    }

    private static void Process(String line)
    {
        //Parsing
        String[] subStr = line.split(" ");
        if (subStr.length != 3)
        {
            ForceClose();
        }

        //Try parse to arabian
        int chisloA = 0;
        int chisloB = 0;
        chisloA = ArabianHelper.romanToDecimal(subStr[0]);
        chisloB = ArabianHelper.romanToDecimal(subStr[2]);

        //Try parse to int
        if (chisloA == 0 || chisloB == 0)
        {
            try
            {
                chisloA = Integer.parseInt(subStr[0]);
                chisloB = Integer.parseInt(subStr[2]);
            }
            catch (NumberFormatException nfe)
            {
                ForceClose();
            }
        }

        //Check condition
        if (chisloA > 10 || chisloA < 1 || chisloB > 10 || chisloB < 1)
        {
            ForceClose();
        }

        int result = 0;
        switch (subStr[1].charAt(0))
        {
            case '+':
                result = chisloA + chisloB;
                break;
            case '-':
                result = chisloA - chisloB;
                break;
            case '*':
                result = chisloA * chisloB;
                break;
            case '/':
                result = chisloA / chisloB;
                break;
            default:
                ForceClose();
        }
		System.out.print(result);
    }

    private static void ForceClose()
    {
        System.out.println("Something went wrong.");
        System.exit(0);
    }
}