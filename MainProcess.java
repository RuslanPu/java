public class MainProcess{
    public static void Process(String x)
    {
        //separator on 3 elements
        String[] subStr = SeparatorInput.functionSeparate(x);
        if (subStr.length != 3)
        {
            
            ErrorAndForceClose.ForceClose("Separate error");
            
        }

        //Try parse to arabian
        int chisloA = 0;
        int chisloB = 0;
        chisloA = parseArabiantoInt.checkArabianSymbol(subStr[0]);
        chisloB = parseArabiantoInt.checkArabianSymbol((subStr[2]));

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
                ErrorAndForceClose.ForceClose("ParseInt error");
                
            }
        }

        //Check condition
        if (chisloA > 10 || chisloA < 1 || chisloB > 10 || chisloB < 1)
        {
            ErrorAndForceClose.ForceClose("Condition error");
            
        }
        //result from arithmetic operations
        int result = 0;
        result = ArifmeticOperation.resultOf(subStr[1],chisloA, chisloB, result);
		System.out.print(result);
    }
}