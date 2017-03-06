public class UnorderedArrayList extends ArrayListClass {

    public UnorderedArrayList(int size) {
          super(size);
    }

    public UnorderedArrayList() {
        super();
    }

    public UnorderedArrayList(UnorderedArrayList otherList) {
        super(otherList);
    }

    public int seqSearch(DataElement searchItem) {
          int loc;
          boolean found = false;

          for (loc = 0; loc < length; loc++) {
              if (list[loc].equals(searchItem)) {
                    found = true;
                    break;
              }
          }
          
          if (found) {
        	  return loc;
          }
          else {
        	  return -1;
          }
    }

    public void insert(DataElement insertItem) {
        int loc;
        
        if (length == 0) {
        	list[length++] = insertItem.getCopy();
        }
        else {
        	if (length == maxSize) {
                System.err.println("Cannot insert in a full list.");
        	}
        	else {
                loc = seqSearch(insertItem);

                if (loc == -1) {
                    list[length++] = insertItem.getCopy();
                }
                else {
                    System.err.println(
                    	"The item to be inserted is already in the list. No duplicates are allowed.");
                }
        	}
        }
    }

    public void remove(DataElement removeItem) {
		int loc;

		if(length == 0) {
			System.err.println("Cannot delete from an empty list.");
		}
		else {
			loc = seqSearch(removeItem);
	
			if (loc != -1) {
				removeAt(loc);
			}
			else {
				System.out.println(
					"The item to be deleted is not in the list.");
			}
		}
    }
}