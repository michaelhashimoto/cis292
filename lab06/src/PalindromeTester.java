import java.util.Scanner;

public class PalindromeTester
{

    // Decription:
    //    PalindromeEvaluator.isPalindrome tester class.
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String line = null;

        System.out.println("\nPlease input a value to be evaluated as a palindrome (To exit enter no input and press [enter]):\n");

        while (true)
        {
            line = scanner.nextLine();

            if (line.equals(""))
            {
                break;
            }

            try
            {
                System.out.printf("%-5b: %s\n\n", PalindromeEvaluator.isPalindrome(line), line);
            }
            catch (RuntimeException re)
            {
                System.out.printf("%-5s: %s\n\n", "ERROR", re.getMessage());
            }
        }

        System.out.println("Program COMPLETED!");
    }

}