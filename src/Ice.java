public class Ice extends Wizards
{
    int snowballNum;
    int spearNum;
    String golemName;

    public Ice (String name, int speedLevel, double powerLevel, int snowballNum, int spearNum, String golemName)
    {
        super(name, speedLevel, powerLevel);
        this.snowballNum = snowballNum;
        this.spearNum = spearNum;
        this.golemName = golemName;
    }
}//end class ice
