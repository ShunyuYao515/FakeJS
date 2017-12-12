
public class FakeJSInteger extends FakeJSNumber{

	int val;

	public FakeJSInteger(int value) {
		super(value);
		val = Integer.valueOf(value);
	}
		
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		setValue();
		this.val = val;
	}
	
	private void setValue(){
		super.value = val;
	}
	
}
