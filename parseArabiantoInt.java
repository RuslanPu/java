import java.lang.String;
public class parseArabiantoInt{
    
    public static int checkArabianSymbol(String ValueOfLine){
        int LineToInt = 0;
        switch (ValueOfLine) {
            case "I":
                LineToInt = 1;
            break;
            case "II":
                LineToInt = 2;
            break;
            case "III":
                LineToInt = 3;
            break;
            case "IV":
                LineToInt = 4;
            break;
            case "V":
                LineToInt = 5;
            break;
            case "VV":
                LineToInt = 10;
            break;
            case "VI":
                LineToInt = 6;
            break;
            case "VII":
                LineToInt = 7;
            break;
            case "IIX":
                LineToInt = 8;
            break;
            case "IX":
                LineToInt = 9;
            break;
            case "X":
                LineToInt = 10;
            break;
            
        }
        return LineToInt;
    }
}