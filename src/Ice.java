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

    @Override
    public String toString()
    {
        return "Wizard Name: " + name +
                "\n Speed Level: " + speedLevel +
                "\n Power Level: " + powerLevel +
                "\n Snowball Amount: " + snowballNum +
                "\n Spear Amount: " + spearNum +
                "\n Golem Name: " + golemName;
    }
}//end class ice
