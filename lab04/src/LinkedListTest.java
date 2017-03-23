import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		UnorderedLinkedList linkedListClass = new UnorderedLinkedList();

		linkedListClass.insertLast(new StringElement("one"));
		linkedListClass.insertLast(new StringElement("two"));
		linkedListClass.insertLast(new StringElement("three"));
		linkedListClass.insertLast(new StringElement("four"));
		linkedListClass.insertLast(new StringElement("five"));
		linkedListClass.insertLast(new StringElement("one"));
		linkedListClass.insertLast(new StringElement("aaa"));

		System.out.println();
		System.out.println("##");
		System.out.println("## LinkedListClass");
		System.out.println("##");

		System.out.println();
		linkedListClass.print();
		System.out.println();
		System.out.println(linkedListClass.front());
		System.out.println(linkedListClass.back());
		System.out.println(linkedListClass.length());
		
		linkedListClass.deleteAll(new StringElement("one"));

		System.out.println();
		linkedListClass.print();
		System.out.println();
		System.out.println(linkedListClass.front());
		System.out.println(linkedListClass.back());
		System.out.println(linkedListClass.length());

		linkedListClass.deleteSmallest();

		System.out.println();
		linkedListClass.print();
		System.out.println();
		System.out.println(linkedListClass.front());
		System.out.println(linkedListClass.back());
		System.out.println(linkedListClass.length());
	}

}