
public class FakeJSReturn extends FakeJSValue {
	
	FakeJSValue val;
	
	public FakeJSReturn(FakeJSValue value){
		super(value);
		this.val = value;
	}
	
	public FakeJSValue getVal(){
		return val;
	}
	
	public void setVal(FakeJSValue val){
		setValue();
		this.val = val;
	}
	
	private void setValue(){
		super.value = val;
	}
}
	
