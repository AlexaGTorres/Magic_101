import java.util.Scanner;

public class MainDriver
{
    public static void main(String[] args)
    {
        String wizName, wizGolemName, wizPhoenixName, wizGiantName, friendName;
        int wizPowerLev, wizSpeedLev,wizSnowballAmount, wizSpearAmount, wizFireballsAmount, wizSlashAbility, wizZappiesAmount, wizCloudsAmount, friendAge;
        Scanner scan = new Scanner (System.in);//Create scanner object
        System.out.println("Welcome! Pick a character based on the numbers!" +
                "\n1: Ice" +
                "\n2: Fire" +
                "\n3: Electric" +
                "\n4: A friend!");


        int userSel = scan.nextInt();//Get user number input
        if (userSel == 1)
        {
            System.out.println("Enter a name for your wizard: ");
            wizName = scan.next();

            System.out.println("How fast is your wizard going to be on a scale of 1-5?: ");
            wizSpeedLev = scan.nextInt();

            System.out.println("How much power does your wizard have on a scale of 1-5?: ");
            wizPowerLev = scan.nextInt();

            System.out.println("How many snowballs will your wizard fire at once on a scale of 1-3?: ");
            wizSnowballAmount = scan.nextInt();

            System.out.println("How many spears will be shot at once on a scale 1-2?: ");
            wizSpearAmount = scan.nextInt();

            System.out.println("Finally, what will you name your golem?: ");
            wizGolemName = scan.next();

            Ice iceWiz = new Ice (wizName, wizSpeedLev, wizPowerLev, wizSnowballAmount, wizSpearAmount, wizGolemName);
            System.out.println(iceWiz);
        }//Ice
        else if (userSel == 2)
        {
            System.out.println("Enter a name for your wizard: ");
            wizName = scan.next();

            System.out.println("How fast is your wizard going to be on a scale of 1-5?: ");
            wizSpeedLev = scan.nextInt();

            System.out.println("How much power does your wizard have on a scale of 1-5?: ");
            wizPowerLev = scan.nextInt();

            System.out.println("How many fireballs will your wizard fire at once on a scale of 1-3?: ");
            wizFireballsAmount = scan.nextInt();

            System.out.println("How many slashes do you want on a scale of 1-4?: ");
            wizSlashAbility = scan.nextInt();

            System.out.println("Finally, what will you name your phoenix?: ");
            wizPhoenixName = scan.next();

            Fire fireWiz = new Fire (wizName, wizSpeedLev, wizPowerLev, wizFireballsAmount, wizSlashAbility, wizPhoenixName);
            System.out.println(fireWiz);
        }//Fire
        else if (userSel == 3)
        {
            System.out.println("Enter a name for your wizard: ");
            wizName = scan.next();

            System.out.println("How fast is your wizard going to be on a scale of 1-5?: ");
            wizSpeedLev = scan.nextInt();

            System.out.println("How much power does your wizard have on a scale of 1-5?: ");
            wizPowerLev = scan.nextInt();

            System.out.println("How many zappies will your wizard fire at once on a scale of 1-3?: ");
            wizZappiesAmount = scan.nextInt();

            System.out.println("How many clouds will be appear at once on a scale 1-2?: ");
            wizCloudsAmount = scan.nextInt();

            System.out.println("Finally, what will you name your giant?: ");
            wizGiantName = scan.next();

            Electric electricWiz = new Electric (wizName, wizSpeedLev, wizPowerLev, wizZappiesAmount, wizCloudsAmount, wizGiantName);
            System.out.println(electricWiz);
        }//Electric
        else if (userSel == 4)
        {
            System.out.println("Enter a name for your friend: ");
            friendName = scan.next();

            System.out.println("How old is your friend?: ");
            friendAge = scan.nextInt();

            Friend friendThing = new Friend (friendName, friendAge);
            System.out.println(friendThing);
        }//A friend
    }//end main method
}//End class MainDriver
