import java.util.Scanner;

public class MainDriver
{
    public static void main(String[] args)
    {
        String wizName, wizGolemName;
        int wizPowerLev, wizSpeedLev,wizSnowballAmount, wizSpearAmount;
        Scanner scan = new Scanner (System.in);//Create scanner object
        System.out.println("Welcome! Pick a character based on the numbers!" +
                "\n1: Ice" +
                "\n2: Fire" +
                "\n3: Electric");


        int userSel = scan.nextInt();//Get user number input
        if (userSel == 1)
        {
            System.out.println("Enter a name for your wizard: ");
            wizName = scan.nextLine();

            System.out.println("How fast is your wizard going to be on a scale of 1-5?: ");
            wizSpeedLev = scan.nextLine();

            System.out.println("How much power does your wizard have on a scale of 1-5?: ");
            wizPowerLev = scan.nextInt();

            System.out.println("How many snowballs will your wizard fire at once on a scale of 1-3?: ");
            wizSnowballAmount = scan.nextInt();

            System.out.println("How many spears will be shot at once on a scale 1-2?: ");
            wizSpearAmount = scan.nextInt();

            System.out.println("Finally, what will you name your golem?: ");
            wizGolemName = scan.nextLine();

            Ice iceWiz = new Ice (wizName, wizSpeedLev, wizPowerLev, wizSnowballAmount, wizSpearAmount, wizGolemName);
            System.out.println(iceWiz);
        }
    }
}//End class MainDriver
