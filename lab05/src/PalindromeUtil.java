public class PalindromeUtil
{

    public static boolean isPalindrome(String s)
    {
        s = _removeAllNonLettersAndDigits(s);

        if (s.equals(""))
        {
            throw new RuntimeException("No valid characters to compare.");
        }

        return _isPalindrome(s);
    }

    private static boolean _isPalindrome(String s)
    {
        if (s.length() < 2)
        {
            return true;
        }

        char start = s.charAt(0);
        char end = s.charAt(s.length() - 1);

        if (start != end)
        {
            return false;
        }

        return _isPalindrome(s.substring(1, s.length() - 1));
    }

    private static String _removeAllNonLettersAndDigits(String s)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c))
            {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }

}