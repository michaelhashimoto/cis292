import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedListClass linkedListClass = new UnorderedLinkedList();

		linkedListClass.insertLast(new StringElement("one"));
		linkedListClass.insertLast(new StringElement("two"));
		linkedListClass.insertLast(new StringElement("three"));
		linkedListClass.insertLast(new StringElement("four"));
		linkedListClass.insertLast(new StringElement("five"));

		LinkedList linkedList = new LinkedList(
			Arrays.asList("one", "two", "three", "four", "five"));

		System.out.println();
		System.out.println("##");
		System.out.println("## LinkedListClass");
		System.out.println("##");
		System.out.println();
		linkedListClass.print();
		System.out.println();
		System.out.println();

		System.out.println("##");
		System.out.println("## LinkedList");
		System.out.println("##");
		System.out.println();
		System.out.println(linkedList);
		System.out.println();
	}

}