import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class PalindromeTest {

	public static void main (String[] args) throws IOException {
		String[] strings = {
			"abcdefghi", "maddam", "ma dd()a_1 *^#2-3m[", "abba", "12lamal93@",
			"Mr. Owl ate my metal worm."
		};

		for (String string : strings) {
			double x = 123.456;
			char c = 65;
			int i = 65;

			System.out.printf("%-5b: %s\n", palindrome(string), string);
		}
	}

	public static boolean palindrome(String s) {
		return _palindrome(_removeAllLetters(s));
	}

	public static boolean _palindrome(String s) {
		char start = s.charAt(0);
		char end = s.charAt(s.length() - 1);

		if (start != end) {
			return false;
		}

		if (s.length() >= 3) {
			return _palindrome(s.substring(1, s.length() - 1));
		}

		return true;
	}

	private static String _removeAllLetters(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				sb.append(Character.toLowerCase(c));
			}
		}

		return sb.toString();
	}

}