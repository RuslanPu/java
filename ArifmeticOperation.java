public class ArifmeticOperation{
    public static int resultOf(String znak, int chisloA,int chisloB, int result){
        switch (znak.charAt(0))
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
                ErrorAndForceClose.ForceClose("Arithmetic operation error");
        }
        return result;
    } 
}