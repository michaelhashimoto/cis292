import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Lab04Test {

	public static void main(String[] args) {
		ArrayListClass arrayListClass = new UnorderedArrayList();

		arrayListClass.insert(new StringElement("one"));
		arrayListClass.insert(new StringElement("two"));
		arrayListClass.insert(new StringElement("three"));
		arrayListClass.insert(new StringElement("four"));
		arrayListClass.insert(new StringElement("five"));

		ArrayList arrayList = new ArrayList(Arrays.asList("one", "two", "three", "four", "five"));
		Vector vector = new Vector(Arrays.asList("one", "two", "three", "four", "five"));

		System.out.println("##");
		System.out.println("## ArrayListClass");
		System.out.println("##");
		System.out.println();
		arrayListClass.print();
		System.out.println();
		System.out.println("isEmpty:    " + arrayListClass.isEmpty());
		System.out.println("retrieveAt: " + arrayListClass.retrieveAt(1));
		System.out.println("seqSearch:  " + arrayListClass.seqSearch(new StringElement("three")));
		System.out.println("removeAt:   " + 3 + " (four)"); arrayListClass.removeAt(3);
		System.out.println("listSize:   " + arrayListClass.listSize());
		System.out.println();
		arrayListClass.print();
		System.out.println();

		System.out.println("##");
		System.out.println("## ArrayList");
		System.out.println("##");
		System.out.println();
		System.out.println(arrayList);
		System.out.println();
		System.out.println("isEmpty:    " + arrayList.isEmpty());
		System.out.println("get:        " + arrayList.get(1));
		System.out.println("indexOf:    " + arrayList.indexOf("three"));
		System.out.println("remove:     " + 3 + " (" + arrayList.remove(3) + ")");
		System.out.println("size:       " + arrayList.size());
		System.out.println();
		System.out.println(arrayList);
		System.out.println();

		System.out.println("##");
		System.out.println("## Vector");
		System.out.println("##");
		System.out.println();
		System.out.println(vector);
		System.out.println();
		System.out.println("isEmpty:    " + vector.isEmpty());
		System.out.println("get:        " + vector.get(1));
		System.out.println("indexOf:    " + vector.indexOf("three"));
		System.out.println("remove:     " + 3 + " (" + vector.remove(3) + ")");
		System.out.println("size:       " + vector.size());
		System.out.println();
		System.out.println(vector);
	}

}