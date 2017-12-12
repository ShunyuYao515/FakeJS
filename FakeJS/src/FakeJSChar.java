
public class FakeJSChar extends FakeJSString{

	public FakeJSChar(char value) {
		super(String.valueOf(value));
	}
	
	public void setValue(char value){
		super.setVal(String.valueOf(value));
	}
	
	public char getValue(char value){
		return super.getVal().charAt(0);
	}
}
