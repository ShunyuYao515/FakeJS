
public abstract class FakeJSValue {
	
	Object value;
	
	public FakeJSValue(Object value){
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(FakeJSValue value) {
		this.value = value;
	}
	
	
}
