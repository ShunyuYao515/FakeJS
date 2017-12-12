
public class FakeJSString extends FakeJSValue{

	String val;

	public FakeJSString(String value) {
		super(value);
		val = value;
	}
		
	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		setValue();
		this.val = val;
	}
	
	private void setValue(){
		super.value = val;
	}
	
}