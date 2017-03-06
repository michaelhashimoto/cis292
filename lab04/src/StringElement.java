public class StringElement extends DataElement {

	protected String str;
	
	public StringElement() {
		str = null;
	}

	public StringElement(String s) {
		str = s;
	}

	public StringElement(StringElement otherString) {
		str = otherString.str;
	}

	public void setString(String x) {
		str = x;
	}

	public boolean equals(DataElement otherElement) {
		StringElement temp = (StringElement) otherElement;

		return (str.compareTo(temp.str) == 0);
	}

	public int compareTo(DataElement otherElement) {
		StringElement temp = (StringElement) otherElement;

		return (str.compareTo(temp.str));
	}

	public void makeCopy(DataElement otherElement) {
		StringElement temp = (StringElement) otherElement;

		str = new String(temp.str);
	}

	public DataElement getCopy() {
		StringElement temp = new StringElement(str);

		return temp;
	}

	@Override
	public String toString() {
		return str;
	}
}

