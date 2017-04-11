public class RecursionTest {

	public static void main(String[] args) {
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(largest(new int[] {5, 10, 12, 8, 20}));

		LinkedListNode lln = new LinkedListNode(new LinkedListNode(), "one");
	}

	public static int factorial(int n) {
		if (n < 0) {
			throw new RuntimeException("No negative numbers allowed.");
		}

		if (n > 0) {
			return n * factorial(n - 1);
		}

		return 1;
	}

	public static int largest(int[] list) {
		return _largest(list, 0, list.length - 1);
	}

	private void reversePrint(LinkedListNode current)
	{
	    if(current != null)
	    {
	       reversePrint(current.link);

	       System.out.println(current.info);
	   }

	   System.out.println();
	}

	private static int _largest(
		int[] list, int lowerIndex, int upperIndex) {

		int max;

		if (lowerIndex == upperIndex) {
			return list[lowerIndex];
		}
		else {
			max = _largest(list, lowerIndex + 1, upperIndex);

			if (list[lowerIndex] >= max) {
				return list[lowerIndex];
			}
			else {
				return max;
			}
		}
	}
}

class LinkedListNode {

	public LinkedListNode() {
		link = null;
		info = null;
	}

	public LinkedListNode(LinkedListNode linkedListNode, Object o) {
		link = linkedListNode;
		info = o;
	}

	LinkedListNode link;
	Object info;
}
