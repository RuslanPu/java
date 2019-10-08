public class CheckConditionForInput{
    public static void conditionFoSeparate(String[] x){
        if (x.length !=3)
            {
                ErrorAndForceClose.ForceClose("Separate error");
            } 
    }
    public static void conditionForNumberFromOneToTen(int chisloA, int chisloB){
        if (chisloA > 10 || chisloA < 1 || chisloB > 10 || chisloB < 1)
        {
            ErrorAndForceClose.ForceClose("Condition error: Number must From One To Ten");
        }
    }   


}