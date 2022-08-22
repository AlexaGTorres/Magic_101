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

    @Override
    public String toString()
    {
        return " Wizard Name: " + name +
                "\n Speed Level: " + speedLevel +
                "\n Power Level: " + powerLevel +
                "\n Fireball Amount: " + fireballsNum +
                "\n Fireslashes: " + fireSlash +
                "\n Phoenix Name: " + phoenixName;
    }
}//end class fire
