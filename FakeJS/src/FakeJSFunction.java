import java.util.HashMap;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class FakeJSFunction extends FakeJSObject{
	
	FakeJSInt_FakeJSValue_HashMap arguments;
	ParseTree val;
	
	public FakeJSFunction(FakeJSInt_FakeJSValue_HashMap arguments, ParseTree value){
		super(new HashMap<String, FakeJSValue>(), new HashMap<String, FakeJSFunction>());
		this.val = value;
		this.arguments = arguments;
	}
	
	public FakeJSInt_FakeJSValue_HashMap getArguments() {
		return arguments;
	}

	public void setArguments(FakeJSInt_FakeJSValue_HashMap arguments) {
		this.arguments = arguments;
	}

	public ParseTree getVal() {
		return val;
	}

	public void setVal(ParseTree val) {
		setValue();
		this.val = val;
	}
	
	private void setValue(){
		super.value = val;
	}
	
}
