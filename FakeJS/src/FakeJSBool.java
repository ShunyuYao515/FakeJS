
public class FakeJSBool extends FakeJSValue{

	boolean val;

	public FakeJSBool(boolean value) {
		super(value);
		val = value;
	}
		
	public boolean getVal() {
		return val;
	}

	public void setVal(boolean val) {
		setValue();
		this.val = val;
	}
	
	private void setValue(){
		super.value = val;
	}
	
}