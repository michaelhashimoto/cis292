class DoublyLinkedListTest {

	public static void main(String args[]) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList(
            doublyLinkedList);

        doublyLinkedList.insertNode(new IntElement(1));
        doublyLinkedList.insertNode(new IntElement(2));
        doublyLinkedList.insertNode(new IntElement(3));
        doublyLinkedList.insertNode(new IntElement(4));
        doublyLinkedList.insertNode(new IntElement(5));
        doublyLinkedList.insertNode(new IntElement(6));
        doublyLinkedList.insertNode(new IntElement(7));

		System.out.println(doublyLinkedList);
        System.out.println("isEmptyList: " + doublyLinkedList.isEmptyList());
        System.out.println("length:      " + doublyLinkedList.length());
        System.out.println("front:       " + doublyLinkedList.front());
        System.out.println("back:        " + doublyLinkedList.back());

        doublyLinkedList.print();
        System.out.println();
        doublyLinkedList.reversePrint();
        System.out.println();
        doublyLinkedList.deleteNode(new IntElement(4));

        System.out.println("--------------------------");

		System.out.println(doublyLinkedList);
        System.out.println("isEmptyList: " + doublyLinkedList.isEmptyList());
        System.out.println("length:      " + doublyLinkedList.length());
        System.out.println("front:       " + doublyLinkedList.front());
        System.out.println("back:        " + doublyLinkedList.back());

        doublyLinkedList.print();
        System.out.println();
        doublyLinkedList2.print();
        System.out.println();
	}

}