public class Friend
{
    String name;
    int age;

    public Friend (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return " Friend Name: " + name +
                "\n Friend Age: " + age;
    }
}//end class friend
