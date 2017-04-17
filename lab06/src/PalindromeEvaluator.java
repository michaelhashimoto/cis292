import java.util.LinkedList;
import java.util.Stack;

public class PalindromeEvaluator
{

    // Decription:
    //    Method to check whether a string is a palindrome.
    // Precondition:
    //    There must at least be 1 valid letter or number to give an evaluation.
    // Postcondition:
    //    Return true if the given string is a palindrom, and false if it is not.
    public static boolean isPalindrome(String string)
    {
        string = _removeAllNonLetters(string);

        if (string.equals(""))
        {
            throw new RuntimeException("No valid characters to compare.");
        }

        LinkedList<Character> linkedList = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++)
        {
            Character character = string.charAt(i);

            linkedList.add(character);
            stack.push(character);
        }

        while (!linkedList.isEmpty())
        {
            Character linkedListCharacter = linkedList.removeFirst();
            Character stackCharacter = stack.pop();

            if (!linkedListCharacter.equals(stackCharacter))
            {
                return false;
            }
        }

        return true;
    }

    // Decription:
    //    Method to remove all characters that are not letters or digits.
    // Postcondition:
    //    Return only the letters and digits within a string.
    private static String _removeAllNonLetters(String string)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++)
        {
            Character character = string.charAt(i);

            if (Character.isLetter(character))
            {
                sb.append(Character.toLowerCase(character));
            }
        }

        return sb.toString();
    }

}