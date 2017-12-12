import java.util.HashMap;

public class FakeJSInt_FakeJSValue_HashMap extends FakeJSValue{
	HashMap<Integer, FakeJSValue> val;
	
	public FakeJSInt_FakeJSValue_HashMap(HashMap<Integer, FakeJSValue> value){
		super(value);
		this.val = value;
	}
	
	public HashMap<Integer, FakeJSValue> getVal(){
		return val;
	}
	
	public void setVal(HashMap<Integer, FakeJSValue> val){
		setValue();
		this.val = val;
	}
	
	private void setValue(){
		super.value = val;
	}
}
