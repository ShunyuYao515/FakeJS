import java.util.HashMap;
import java.util.Map;

public class FakeJSScope extends FakeJSValue{
	HashMap<String, FakeJSValue> val;
	
	public FakeJSScope(HashMap<String, FakeJSValue> value){
		super(value);
		this.val = value;
	}
	
	public HashMap<String, FakeJSValue> getVal(){
		return val;
	}
	
	public void setVal(HashMap<String, FakeJSValue> val){
		setValue();
		this.val = val;
	}
	
	private void setValue(){
		super.value = val;
	}
}
