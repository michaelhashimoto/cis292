import java.util.Vector;

public class VectorTest {

	public static void main(String args[])
	{
		Vector vector = new Vector();

		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");

		System.out.println(vector);

		vector.add("Five");

		System.out.println(vector);

		vector.insertElementAt("Six", 1);

		System.out.println(vector);
	}

}