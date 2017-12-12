import java.util.HashMap;

public class FakeJSWindow extends FakeJSValue {
	
	HashMap<String, FakeJSValue> variable;
	HashMap<String, FakeJSFunction> function;
	
	public FakeJSWindow(HashMap<String, FakeJSValue> variable, HashMap<String, FakeJSFunction> function) {
		super(variable);
		this.variable = variable;
		this.function = function;
	}

	public HashMap<String, FakeJSValue> getVariable() {
		return variable;
	}

	public void setVariable(HashMap<String, FakeJSValue> variable) {
		this.variable = variable;
	}

	public HashMap<String, FakeJSFunction> getFunction() {
		return function;
	}

	public void setFunction(HashMap<String, FakeJSFunction> function) {
		this.function = function;
	}
	
	public void putVar(String key, FakeJSValue val){
		variable.put(key, val);
	}
	
	public FakeJSValue getVar(String key){
		return variable.get(key);
	}
	
	public void removeVar(String key){
		variable.remove(key);
	}
	
	public void putFunc(String key, FakeJSFunction func){
		function.put(key, func);
	}
	
	public FakeJSFunction getFunc(String key){
		return function.get(key);
	}
	
	public void removeFunc(String key){
		function.remove(key);
	}

}
