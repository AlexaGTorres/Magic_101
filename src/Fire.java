public class Fire extends Wizards
{
    int fireballsNum;
    int fireSlash;
    String phoenixName;

    public Fire (String name, int speedLevel, double powerLevel, int fireballsNum, int fireSlash, String phoenixName)
    {
        super(name, speedLevel, powerLevel);
        this.fireballsNum = fireballsNum;
        this.fireSlash = fireSlash;
        this.phoenixName = phoenixName;
    }
}//end class fire
