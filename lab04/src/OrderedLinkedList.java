public class OrderedLinkedList extends LinkedListClass {

    public OrderedLinkedList() {
        super();
    }

    public OrderedLinkedList(OrderedLinkedList otherList) {
        super(otherList);
    }

    public boolean search(DataElement searchItem) {
        LinkedListNode current;
        boolean found;
        current = first;
        found = false;

        while(current != null && !found )
            if(current.info.compareTo(searchItem) >= 0)
                found = true;
            else
                current = current.link;

        if(found)
           found = current.info.equals(searchItem);

        return found;
    }

    public void insertNode(DataElement insertItem)
    {
        LinkedListNode current;
        LinkedListNode trailCurrent;
        LinkedListNode newNode;

        boolean  found;

        newNode = new LinkedListNode();
        newNode.info = insertItem.getCopy();

        newNode.link = null;

        if(first == null) {
           first = newNode;
           count++;
        }
        else {
           trailCurrent = first;
           current = first;
           found = false;

           while(current != null && !found)
                if(current.info.compareTo(insertItem) >= 0)
                   found = true;
                else
                {
                   trailCurrent = current;
                   current = current.link;
                }

           if(current == first)
           {
              newNode.link = first;
              first = newNode;
              count++;
           }
           else
           {
              trailCurrent.link = newNode;
              newNode.link = current;
              count++;
           }
        }
    }

    public void deleteNode(DataElement deleteItem)
    {
       LinkedListNode current;
       LinkedListNode trailCurrent;
       boolean found;

       if (first == null) {
           System.err.println("Cannot delete from an empty list.");
           
           return;
       }

       if (first.info.equals(deleteItem)) {
          first = first.link;

          count--;
          
          return;
       }

      found = false;

      trailCurrent = first;
      current = first.link;

      while (current != null && !found) {
          if (current.info.compareTo(deleteItem) >= 0) {
             found = true;
          }
          else {
             trailCurrent = current;
             current = current.link;
          }
      }

      if (current == null) {
         System.out.println("Item to be deleted is not in the list.");
         
         return;
      }

      if (current.info.equals(deleteItem)) {
         if (first == current) {
            first = first.link;

            count--;
         }
         else {
            trailCurrent.link = current.link;

            count--;
         }
         
         return;
      }

      System.out.println("Item to be deleted is not in the list.");
    }
}
