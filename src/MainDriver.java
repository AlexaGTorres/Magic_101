import java.util.Scanner;

public class MainDriver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);//Create scanner object
        System.out.println("Welcome! Pick a character based on the numbers!" +
                "\n1: Ice" +
                "\n2: Fire" +
                "\n3: Electric");


        int userSel = scan.nextInt();//Get user number input
        while (userSel != 1 && userSel != 2 && userSel != 3)
        {

        }

        System.out.println("Test: " + userSel);
    }
}//End class MainDriver
