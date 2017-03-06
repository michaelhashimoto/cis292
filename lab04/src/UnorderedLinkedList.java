
public class UnorderedLinkedList extends LinkedListClass
{

    public UnorderedLinkedList()
    {
        super();
    }

    public UnorderedLinkedList(UnorderedLinkedList otherList)
    {
        super(otherList);
    }

        //Method to determine whether searchItem is in
        //the list.
        //Postcondition: Returns true if searchItem is found
        //               in the list; false otherwise.
    public boolean search(DataElement searchItem)
    {
        LinkedListNode current; //variable to traverse the list
        boolean found;

        current = first;    //set current to point to the first
                            //node in the list

        found = false;    //set found to false

        while(current != null && !found) //search the list
            if(current.info.equals(searchItem))  //item is found
                found = true;
            else
               current = current.link; //make current point to
                                       //the next node
        return found;
    }


        //Method to delete deleteItem from the list.
        //Postcondition: If found, the node containing
        //               deleteItem is deleted from the
        //               list. Also first points to the first
        //               node, last points to the last
        //               node of the updated list, and count
        //               is decremented by 1.
    public void deleteNode(DataElement deleteItem)
    {
        LinkedListNode current; //variable to traverse the list
        LinkedListNode trailCurrent; //variable just before current
        boolean found;

        if(first == null)    //Case 1; the list is empty
           System.err.println("Cannot delete from an empty list.");
        else
        {
           if(first.info.equals(deleteItem)) //Case 2
           {
              first = first.link;

              if(first == null)    //the list had only one node
                 last = null;
              count--;
           }
           else  //search the list for the node with the given info
           {
              found = false;
              trailCurrent = first;   //set trailCurrent to point to
                                      //the first node
              current = first.link;   //set current to point to the
                                      //second node

              while(current != null && !found)
              {
                  if(current.info.equals(deleteItem))
                     found = true;
                  else
                  {
                      trailCurrent = current;
                      current = current.link;
                  }
              }//end while

              if(found) //Case 3; if found, delete the node
              {
                  count--;
                  trailCurrent.link = current.link;

                  if(last == current)   //node to be deleted was
                                        //the last node
                     last = trailCurrent;  //update the value of last
              }
              else
                 System.out.println("Item to be deleted is "
                                  + "not in the list.");
           }//end else
        }//end else
    }//end deleteNode


        //Method to delete all occurrences of element that have a specified info
        // value.
        //Precondition:  The deleteDataElement provided must match all other
        //                DataElement types otherwise it'll throw a
        //                ClassCastException.
        //Postcondition: If found, all nodes containing deleteItem are deleted
        //                from the list, and count is decremented by 1.
        //                Big-O time-complexity of "n".
    public void deleteAll(DataElement deleteDataElement)
    {
        LinkedListNode currentLinkedListNode = first;
        LinkedListNode previousLinkedListNode = first;

        while (currentLinkedListNode != null)
        {
            DataElement currentDataElement = currentLinkedListNode.info;

            if (deleteDataElement.equals(currentDataElement))
            {
                _deleteCurrentLinkedListNode(
                    previousLinkedListNode, currentLinkedListNode);
            }

            previousLinkedListNode = currentLinkedListNode;

            currentLinkedListNode = currentLinkedListNode.link;
        }
    }

        //Method to delete the first occurrence of the element with the smallest
        // info value.
        //Precondition:  There should be at least 1 item available to delete.
        //                The DataElements within this LinkedList must all be of
        //                the same type otherwise it will throw a
        //                ClassCastException
        //Postcondition: Traverse the UnorderedLinkedList one time
        //                and find the LinkedListNode with the
        //                smallest info value and delete that LinkedListNode.
        //                Count is then decremented by 1. If no items are found
        //                then display an error message saying there is an empty
        //                list.
        //                Big-O time-complexity of "n".
    public void deleteSmallest()
    {
        if (first == null)
        {
            System.err.println("Cannot delete from an empty list.");

            return;
        }

        LinkedListNode currentLinkedListNode = first;
        LinkedListNode previousLinkedListNode = first;
        LinkedListNode smallestCurrentLinkedLostNode = first;
        LinkedListNode smallestPreviousLinkedLostNode = first;

        while (currentLinkedListNode != null)
        {
            DataElement currentDataElement = currentLinkedListNode.info;
            DataElement smallestCurrentDataElement =
                smallestCurrentLinkedLostNode.info;

            if (currentDataElement.compareTo(smallestCurrentDataElement) < 0)
            {
                smallestCurrentLinkedLostNode = currentLinkedListNode;
                smallestPreviousLinkedLostNode = previousLinkedListNode;
            }

            previousLinkedListNode = currentLinkedListNode;

            currentLinkedListNode = currentLinkedListNode.link;
        }

        _deleteCurrentLinkedListNode(
            smallestPreviousLinkedLostNode, smallestCurrentLinkedLostNode);
    }

        //Method to delete the first occurrence of the element with the smallest
        // info value.
        //Precondition:  The method must be provided the previous and current
        //                nodes of the current node you'd like to delete.
        //Postcondition: Delete the current node from the UnorderedLinkedList,
        //                and count is decremented by 1.
        //                Big-O time-complexity of "1".
    private void _deleteCurrentLinkedListNode(
        LinkedListNode previousLinkedListNode,
        LinkedListNode currentLinkedListNode)
    {

        LinkedListNode nextLinkedListNode = currentLinkedListNode.link;

        if (first.equals(currentLinkedListNode))
        {
            first = nextLinkedListNode;

            count--;

            return;
        }

        previousLinkedListNode.link = nextLinkedListNode;

        count--;
    }
}
