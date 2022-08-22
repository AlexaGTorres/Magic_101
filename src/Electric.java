public class Electric extends Wizards
{
    int zappiesNum;
    int cloudsNum;
    String giantName;

    public Electric (String name, int speedLevel, double powerLevel, int zappiesNum, int cloudsNum, String giantName)
    {
        super(name, speedLevel, powerLevel);
        this.zappiesNum = zappiesNum;
        this.cloudsNum = cloudsNum;
        this.giantName = giantName;
    }

    @Override
    public String toString()
    {
        return " Wizard Name: " + name +
                "\n Speed Level: " + speedLevel +
                "\n Power Level: " + powerLevel +
                "\n Zappies Amount: " + zappiesNum +
                "\n Cloud Amount: " + cloudsNum +
                "\n Giant Name: " + giantName;
    }
}//end class electric
