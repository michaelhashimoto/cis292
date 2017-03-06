public class IntElement extends DataElement {
    protected int num;

    public IntElement() {
        num = 0;
    }

    public IntElement(int x) {
        num = x;
    }

    public IntElement(IntElement otherElement) {
        num = otherElement.num;
    }

    public void setNum(int x) {
        num = x;
    }

    public int getNum() {
        return num;
    }

    public boolean equals(DataElement otherElement) {
        IntElement temp = (IntElement) otherElement;

        return (num == temp.num);
    }

    public int compareTo(DataElement otherElement) {
        IntElement temp = (IntElement) otherElement;

        return (num - temp.num);
    }

    public void makeCopy(DataElement otherElement) {
        IntElement temp = (IntElement) otherElement;

        num = temp.num;
    }

    public DataElement getCopy() {
        IntElement temp = new IntElement(num);

        return temp;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
