import java.util.LinkedList;

public class UnorderedLinkList2 extends UnorderedLinkedList {
	
	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("one");
		linkedList.add("two");
		linkedList.add("three");
		linkedList.add("four");
		linkedList.add("five");

		System.out.println(linkedList);
		System.out.println(linkedList.indexOf("two"));
		System.out.println(linkedList.size());
		System.out.println(linkedList.iterator());

		/*UnorderedLinkedList linkedListClass = new UnorderedLinkedList();

		linkedListClass.insertLast(new StringElement("one"));
		linkedListClass.insertLast(new StringElement("two"));
		linkedListClass.insertLast(new StringElement("three"));
		linkedListClass.insertLast(new StringElement("four"));
		linkedListClass.insertLast(new StringElement("aaa"));
		linkedListClass.insertLast(new StringElement("five"));
		linkedListClass.insertLast(new StringElement("six"));
		linkedListClass.insertLast(new StringElement("seven"));
		linkedListClass.insertLast(new StringElement("eight"));
		linkedListClass.insertLast(new StringElement("nine"));
		linkedListClass.insertLast(new StringElement("ten"));
		linkedListClass.insertLast(new StringElement("aaa"));
		linkedListClass.insertLast(new IntElement(32));
		linkedListClass.insertLast(new IntElement(31));
		linkedListClass.insertLast(new IntElement(12));
		linkedListClass.insertLast(new IntElement(32));
		linkedListClass.insertLast(new IntElement(2));
		linkedListClass.insertLast(new IntElement(201));
		linkedListClass.insertLast(new IntElement(32));
		linkedListClass.insertLast(new IntElement(-1));

		linkedListClass.print();
		System.out.println();
		System.out.println(linkedListClass.length());

		linkedListClass.deleteSmallest();
		linkedListClass.print();
		System.out.println();
		System.out.println(linkedListClass.length());

		//linkedListClass.deleteAll(new StringElement("nine"));
		linkedListClass.deleteAll(new StringElement("nine"));
		linkedListClass.print();
		System.out.println();
		System.out.println(linkedListClass.length());*/
	}

}
