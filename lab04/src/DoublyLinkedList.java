

class DoublyLinkedList
{
	protected class DoublyLinkedListNode
    {
        DataElement info;
        DoublyLinkedListNode next;
        DoublyLinkedListNode back;
    }

    protected int count;
    protected DoublyLinkedListNode first;
    protected DoublyLinkedListNode last;

    public DoublyLinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean isEmptyList() {
        return(first == null);
    }

    public void initializeList() {
        first = null;
        last = null;
        count = 0;
    }

    public int length() {
        return count;
    }

    public void print() {
        DoublyLinkedListNode current;

        current = first;

        while (current != null) {
           System.out.print(current.info + "  ");
           current = current.next;
        }
    }

    public void reversePrint() {
          DoublyLinkedListNode current;

          current = last;

          while (current != null) {
              System.out.print(current.info + "  ");
              current = current.back;
          }
    }

    public boolean search(DataElement searchItem) {
        boolean found;
        DoublyLinkedListNode current;

        found = false;
        current = first;

        while(current != null && !found) {
            if (current.info.compareTo(searchItem) >= 0) {
               found = true;
            }
            else {
            	current = current.next;
            }
        }

        if (found) {
           found = current.info.equals(searchItem);
        }

        return found;
    }

    public DataElement front() {
        DataElement temp = first.info.getCopy();
        return temp;
    }

    public DataElement back() {
        DataElement temp = first.info.getCopy();
        return temp;
    }

    public void insertNode(DataElement insertItem) {
        DoublyLinkedListNode current;
        DoublyLinkedListNode trailCurrent = null;

        DoublyLinkedListNode newNode;
        boolean found;

        newNode = new DoublyLinkedListNode();

        newNode.info = insertItem.getCopy();
        newNode.next = null;
        newNode.back = null;

        if(first == null) {
           first = newNode;
           last = newNode;
           count++;
        }
        else {
            found = false;
            current = first;

            while(current != null && !found) {
                if (current.info.compareTo(insertItem) >= 0) {
                    found = true;
                }
                else {
                    trailCurrent = current;
                    current = current.next;
                }
        	}

            if(current == first) {
                first.back = newNode;
                newNode.next = first;
                first = newNode;
                count++;
            }
            else {
                if(current != null) {
                    trailCurrent.next = newNode;
                    newNode.back = trailCurrent;
                    newNode.next = current;
                    current.back = newNode;
                }
                else {
                    trailCurrent.next = newNode;
                    newNode.back = trailCurrent;
                    last = newNode;
                }

                count++;
            }
        }
    }

    public void deleteNode(DataElement deleteItem) {
        DoublyLinkedListNode current;
        DoublyLinkedListNode trailCurrent;

        boolean found;

        if(first == null) {
            System.err.println("Cannot delete from an empty list.");
        }
        else {
            if (first.info.equals(deleteItem)) {
                current = first;
                first = first.next;

                if(first != null) {
                    first.back = null;
                }
                else {
                    last = null;
                }

                count--;
            }
            else {
                found = false;
                current = first;

                while (current != null && !found) {
                    if(current.info.compareTo(deleteItem) >= 0) {
                        found = true;
                    }
                    else {
                        current = current.next;
                    }
                }

                if (current == null) {
                    System.out.println(
                    	"The item to be deleted is not in the list.");
                }
                else {
                    if (current.info.equals(deleteItem)) {
                        trailCurrent = current.back;
                        trailCurrent.next = current.next;

                        if(current.next != null) {
                            current.next.back = trailCurrent;
                        }

                        if(current == last) {
                            last = trailCurrent;
                        }

                        count--;
                    }
                    else {
                        System.out.println(
                        	"The item to be deleted is not in list.");
                    }
                }
            }
        }
    }

    @SuppressWarnings("unused")
	private void copy(DoublyLinkedList otherList) {
        System.out.println(
        	"The definition of the method copy is left as an exercise");
    }

    public DoublyLinkedList(DoublyLinkedList otherList) {
        System.out.println(
        	"The definition of the copy constructoris left as an exercise");
    }

    public void copyList(DoublyLinkedList otherList) {
        System.out.println(
        	"The definition of the method copyList is left as an exercise");
    }
}