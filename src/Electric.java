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
}//end class electric
