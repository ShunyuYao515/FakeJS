
import java.util.HashMap;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		// create a lexer that feeds off of input CharStream
		FakeJSLexer lexer = new FakeJSLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		FakeJSParser parser = new FakeJSParser(tokens);
		ParseTree tree = parser.start(); // begin parsing at init rule
		FakeJSIntCalVisitor visitor = new FakeJSIntCalVisitor();
		visitor.visit(tree);
	}
}
