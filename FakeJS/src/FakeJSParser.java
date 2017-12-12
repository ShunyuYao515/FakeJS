// Generated from FakeJS.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FakeJSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQL_EQL=5, NOT_EQL=6, AND_AND=7, OR_OR=8, 
		EQL=9, SEMICOLON=10, COMMA=11, L_BRACKET=12, R_BRACKET=13, L_CURV_BRACKET=14, 
		R_CURV_BRACKET=15, DOT=16, VAR=17, FUNCTION=18, RETURN=19, NEW=20, IF=21, 
		ELSE=22, WHILE=23, FOR=24, THIS=25, WS=26, TRUE=27, FALSE=28, INTEGER=29, 
		STRING=30, ID=31;
	public static final int
		RULE_start = 0, RULE_code_block = 1, RULE_code_content = 2, RULE_code_statement = 3, 
		RULE_declaration = 4, RULE_declarationP = 5, RULE_assignment = 6, RULE_assignmentP = 7, 
		RULE_declaration_assignment = 8, RULE_declaration_assignmentP = 9, RULE_boolean_assignment = 10, 
		RULE_boolean_assignmentP = 11, RULE_boolean_declaration_assignment = 12, 
		RULE_boolean_declaration_assignmentP = 13, RULE_new_assignment = 14, RULE_new_declaration_assignment = 15, 
		RULE_object_assignment = 16, RULE_object_property_assignment = 17, RULE_code_blockP = 18, 
		RULE_arithmetic_expression = 19, RULE_estimation_block = 20, RULE_sub_code_block = 21, 
		RULE_if_block = 22, RULE_sub_if_block = 23, RULE_loop_block = 24, RULE_for_loop_prestatement = 25, 
		RULE_for_loop_wrap = 26, RULE_function_definition = 27, RULE_function_definition_argument = 28, 
		RULE_function_definition_argumentP = 29, RULE_function_execution = 30, 
		RULE_constructor_execution = 31, RULE_function_execution_argument = 32, 
		RULE_function_execution_argumentP = 33, RULE_object_property = 34, RULE_object_propertyP = 35, 
		RULE_comparison_expression = 36, RULE_t1_math_operator = 37, RULE_t2_math_operator = 38, 
		RULE_t2_comp_operator = 39, RULE_t6_comp_operator = 40, RULE_t7_comp_operator = 41, 
		RULE_sl_boolean = 42, RULE_integer = 43, RULE_string = 44, RULE_id = 45, 
		RULE_sl_true = 46, RULE_sl_false = 47, RULE_multiplication = 48, RULE_division = 49, 
		RULE_addition = 50, RULE_subtraction = 51, RULE_equal_equal = 52, RULE_not_equal = 53, 
		RULE_and_and = 54, RULE_or_or = 55, RULE_equal = 56, RULE_semicolon = 57, 
		RULE_comma = 58, RULE_var = 59, RULE_function = 60, RULE_sl_return = 61, 
		RULE_sl_new = 62, RULE_sl_if = 63, RULE_sl_else = 64, RULE_sl_while = 65, 
		RULE_sl_for = 66, RULE_sl_this = 67, RULE_l_bracket = 68, RULE_r_bracket = 69, 
		RULE_l_curv_bracket = 70, RULE_r_curv_bracket = 71, RULE_dot = 72;
	public static final String[] ruleNames = {
		"start", "code_block", "code_content", "code_statement", "declaration", 
		"declarationP", "assignment", "assignmentP", "declaration_assignment", 
		"declaration_assignmentP", "boolean_assignment", "boolean_assignmentP", 
		"boolean_declaration_assignment", "boolean_declaration_assignmentP", "new_assignment", 
		"new_declaration_assignment", "object_assignment", "object_property_assignment", 
		"code_blockP", "arithmetic_expression", "estimation_block", "sub_code_block", 
		"if_block", "sub_if_block", "loop_block", "for_loop_prestatement", "for_loop_wrap", 
		"function_definition", "function_definition_argument", "function_definition_argumentP", 
		"function_execution", "constructor_execution", "function_execution_argument", 
		"function_execution_argumentP", "object_property", "object_propertyP", 
		"comparison_expression", "t1_math_operator", "t2_math_operator", "t2_comp_operator", 
		"t6_comp_operator", "t7_comp_operator", "sl_boolean", "integer", "string", 
		"id", "sl_true", "sl_false", "multiplication", "division", "addition", 
		"subtraction", "equal_equal", "not_equal", "and_and", "or_or", "equal", 
		"semicolon", "comma", "var", "function", "sl_return", "sl_new", "sl_if", 
		"sl_else", "sl_while", "sl_for", "sl_this", "l_bracket", "r_bracket", 
		"l_curv_bracket", "r_curv_bracket", "dot"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'&&'", "'||'", "'='", 
		"';'", "','", "'('", "')'", "'{'", "'}'", "'.'", "'var'", "'function'", 
		"'return'", "'new'", "'if'", "'else'", "'while'", "'for'", "'this'", null, 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MUL", "DIV", "ADD", "SUB", "EQL_EQL", "NOT_EQL", "AND_AND", "OR_OR", 
		"EQL", "SEMICOLON", "COMMA", "L_BRACKET", "R_BRACKET", "L_CURV_BRACKET", 
		"R_CURV_BRACKET", "DOT", "VAR", "FUNCTION", "RETURN", "NEW", "IF", "ELSE", 
		"WHILE", "FOR", "THIS", "WS", "TRUE", "FALSE", "INTEGER", "STRING", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FakeJS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FakeJSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public Code_contentContext code_content() {
			return getRuleContext(Code_contentContext.class,0);
		}
		public Code_blockPContext code_blockP() {
			return getRuleContext(Code_blockPContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			code_content();
			setState(149);
			code_blockP();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_contentContext extends ParserRuleContext {
		public Code_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_content; }
	 
		public Code_contentContext() { }
		public void copyFrom(Code_contentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cod_cont_loop_SUBContext extends Code_contentContext {
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public Cod_cont_loop_SUBContext(Code_contentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_cont_loop_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_cont_func_SUBContext extends Code_contentContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Cod_cont_func_SUBContext(Code_contentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_cont_func_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_cont_if_SUBContext extends Code_contentContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Cod_cont_if_SUBContext(Code_contentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_cont_if_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_cont_stat_SUBContext extends Code_contentContext {
		public Code_statementContext code_statement() {
			return getRuleContext(Code_statementContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public Cod_cont_stat_SUBContext(Code_contentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_cont_stat_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_contentContext code_content() throws RecognitionException {
		Code_contentContext _localctx = new Code_contentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code_content);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case VAR:
			case RETURN:
			case THIS:
			case ID:
				_localctx = new Cod_cont_stat_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				code_statement();
				setState(152);
				semicolon();
				}
				break;
			case IF:
				_localctx = new Cod_cont_if_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				if_block();
				}
				break;
			case WHILE:
			case FOR:
				_localctx = new Cod_cont_loop_SUBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				loop_block();
				}
				break;
			case FUNCTION:
				_localctx = new Cod_cont_func_SUBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				function_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_statementContext extends ParserRuleContext {
		public Code_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_statement; }
	 
		public Code_statementContext() { }
		public void copyFrom(Code_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cod_stat_bool_dclr_asn_SUBContext extends Code_statementContext {
		public Boolean_declaration_assignmentContext boolean_declaration_assignment() {
			return getRuleContext(Boolean_declaration_assignmentContext.class,0);
		}
		public Cod_stat_bool_dclr_asn_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_bool_dclr_asn_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_dclr_SUBContext extends Code_statementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Cod_stat_dclr_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_dclr_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_obj_asn_SUBContext extends Code_statementContext {
		public Object_assignmentContext object_assignment() {
			return getRuleContext(Object_assignmentContext.class,0);
		}
		public Cod_stat_obj_asn_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_obj_asn_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_new_dclr_asn_SUBContext extends Code_statementContext {
		public New_declaration_assignmentContext new_declaration_assignment() {
			return getRuleContext(New_declaration_assignmentContext.class,0);
		}
		public Cod_stat_new_dclr_asn_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_new_dclr_asn_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_func_exe_SUBContext extends Code_statementContext {
		public Function_executionContext function_execution() {
			return getRuleContext(Function_executionContext.class,0);
		}
		public Cod_stat_func_exe_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_func_exe_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_dclr_asn_SUBContext extends Code_statementContext {
		public Declaration_assignmentContext declaration_assignment() {
			return getRuleContext(Declaration_assignmentContext.class,0);
		}
		public Cod_stat_dclr_asn_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_dclr_asn_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_ret_a_e_SUBContext extends Code_statementContext {
		public Sl_returnContext sl_return() {
			return getRuleContext(Sl_returnContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Cod_stat_ret_a_e_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_ret_a_e_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_bool_asn_SUBContext extends Code_statementContext {
		public Boolean_assignmentContext boolean_assignment() {
			return getRuleContext(Boolean_assignmentContext.class,0);
		}
		public Cod_stat_bool_asn_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_bool_asn_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_asn_SUBContext extends Code_statementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Cod_stat_asn_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_asn_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_ret_c_e_SUBContext extends Code_statementContext {
		public Sl_returnContext sl_return() {
			return getRuleContext(Sl_returnContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Cod_stat_ret_c_e_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_ret_c_e_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cod_stat_new_asn_SUBContext extends Code_statementContext {
		public New_assignmentContext new_assignment() {
			return getRuleContext(New_assignmentContext.class,0);
		}
		public Cod_stat_new_asn_SUBContext(Code_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCod_stat_new_asn_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_statementContext code_statement() throws RecognitionException {
		Code_statementContext _localctx = new Code_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code_statement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Cod_stat_dclr_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				declaration();
				}
				break;
			case 2:
				_localctx = new Cod_stat_asn_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				assignment();
				}
				break;
			case 3:
				_localctx = new Cod_stat_dclr_asn_SUBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				declaration_assignment();
				}
				break;
			case 4:
				_localctx = new Cod_stat_bool_asn_SUBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				boolean_assignment();
				}
				break;
			case 5:
				_localctx = new Cod_stat_bool_dclr_asn_SUBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				boolean_declaration_assignment();
				}
				break;
			case 6:
				_localctx = new Cod_stat_func_exe_SUBContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				function_execution();
				}
				break;
			case 7:
				_localctx = new Cod_stat_ret_a_e_SUBContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				sl_return();
				setState(166);
				arithmetic_expression(0);
				}
				break;
			case 8:
				_localctx = new Cod_stat_ret_c_e_SUBContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				sl_return();
				setState(169);
				comparison_expression(0);
				}
				break;
			case 9:
				_localctx = new Cod_stat_new_asn_SUBContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(171);
				new_assignment();
				}
				break;
			case 10:
				_localctx = new Cod_stat_new_dclr_asn_SUBContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				new_declaration_assignment();
				}
				break;
			case 11:
				_localctx = new Cod_stat_obj_asn_SUBContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(173);
				object_assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dclr_m_SUBContext extends DeclarationContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DeclarationPContext declarationP() {
			return getRuleContext(DeclarationPContext.class,0);
		}
		public Dclr_m_SUBContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclr_m_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dclr_s_SUBContext extends DeclarationContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Dclr_s_SUBContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclr_s_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Dclr_m_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				var();
				setState(177);
				id();
				setState(178);
				declarationP();
				}
				break;
			case 2:
				_localctx = new Dclr_s_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				var();
				setState(181);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationPContext extends ParserRuleContext {
		public DeclarationPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationP; }
	 
		public DeclarationPContext() { }
		public void copyFrom(DeclarationPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DclrP_SUBContext extends DeclarationPContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DeclarationPContext declarationP() {
			return getRuleContext(DeclarationPContext.class,0);
		}
		public DclrP_SUBContext(DeclarationPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclrP_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DclrP_ENDContext extends DeclarationPContext {
		public DclrP_ENDContext(DeclarationPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclrP_END(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationPContext declarationP() throws RecognitionException {
		DeclarationPContext _localctx = new DeclarationPContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationP);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new DclrP_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				comma();
				setState(186);
				id();
				setState(187);
				declarationP();
				}
				break;
			case SEMICOLON:
			case R_BRACKET:
				_localctx = new DclrP_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Asn_m_SUBContext extends AssignmentContext {
		public AssignmentPContext assignmentP() {
			return getRuleContext(AssignmentPContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Asn_m_SUBContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitAsn_m_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Asn_s_SUBContext extends AssignmentContext {
		public AssignmentPContext assignmentP() {
			return getRuleContext(AssignmentPContext.class,0);
		}
		public Asn_s_SUBContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitAsn_s_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Asn_m_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				assignmentP();
				setState(193);
				comma();
				setState(194);
				assignment();
				}
				break;
			case 2:
				_localctx = new Asn_s_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				assignmentP();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentPContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public AssignmentPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentP; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitAssignmentP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentPContext assignmentP() throws RecognitionException {
		AssignmentPContext _localctx = new AssignmentPContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			id();
			setState(200);
			equal();
			setState(201);
			arithmetic_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_assignmentContext extends ParserRuleContext {
		public Declaration_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_assignment; }
	 
		public Declaration_assignmentContext() { }
		public void copyFrom(Declaration_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dclr_asn_m_SUBContext extends Declaration_assignmentContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignmentPContext assignmentP() {
			return getRuleContext(AssignmentPContext.class,0);
		}
		public Declaration_assignmentPContext declaration_assignmentP() {
			return getRuleContext(Declaration_assignmentPContext.class,0);
		}
		public Dclr_asn_m_SUBContext(Declaration_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclr_asn_m_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dclr_asn_s_SUBContext extends Declaration_assignmentContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignmentPContext assignmentP() {
			return getRuleContext(AssignmentPContext.class,0);
		}
		public Dclr_asn_s_SUBContext(Declaration_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclr_asn_s_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_assignmentContext declaration_assignment() throws RecognitionException {
		Declaration_assignmentContext _localctx = new Declaration_assignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration_assignment);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Dclr_asn_m_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				var();
				setState(204);
				assignmentP();
				setState(205);
				declaration_assignmentP();
				}
				break;
			case 2:
				_localctx = new Dclr_asn_s_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				var();
				setState(208);
				assignmentP();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_assignmentPContext extends ParserRuleContext {
		public Declaration_assignmentPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_assignmentP; }
	 
		public Declaration_assignmentPContext() { }
		public void copyFrom(Declaration_assignmentPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dclr_asnP_SUBContext extends Declaration_assignmentPContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public AssignmentPContext assignmentP() {
			return getRuleContext(AssignmentPContext.class,0);
		}
		public Declaration_assignmentPContext declaration_assignmentP() {
			return getRuleContext(Declaration_assignmentPContext.class,0);
		}
		public Dclr_asnP_SUBContext(Declaration_assignmentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclr_asnP_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dclr_asnP_ENDContext extends Declaration_assignmentPContext {
		public Dclr_asnP_ENDContext(Declaration_assignmentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDclr_asnP_END(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_assignmentPContext declaration_assignmentP() throws RecognitionException {
		Declaration_assignmentPContext _localctx = new Declaration_assignmentPContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration_assignmentP);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new Dclr_asnP_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				comma();
				setState(213);
				assignmentP();
				setState(214);
				declaration_assignmentP();
				}
				break;
			case SEMICOLON:
			case R_BRACKET:
				_localctx = new Dclr_asnP_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_assignmentContext extends ParserRuleContext {
		public Boolean_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_assignment; }
	 
		public Boolean_assignmentContext() { }
		public void copyFrom(Boolean_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bool_asn_m_SUBContext extends Boolean_assignmentContext {
		public Boolean_assignmentPContext boolean_assignmentP() {
			return getRuleContext(Boolean_assignmentPContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public Boolean_assignmentContext boolean_assignment() {
			return getRuleContext(Boolean_assignmentContext.class,0);
		}
		public Bool_asn_m_SUBContext(Boolean_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitBool_asn_m_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_asn_s_SUBContext extends Boolean_assignmentContext {
		public Boolean_assignmentPContext boolean_assignmentP() {
			return getRuleContext(Boolean_assignmentPContext.class,0);
		}
		public Bool_asn_s_SUBContext(Boolean_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitBool_asn_s_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_assignmentContext boolean_assignment() throws RecognitionException {
		Boolean_assignmentContext _localctx = new Boolean_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolean_assignment);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Bool_asn_m_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				boolean_assignmentP();
				setState(220);
				comma();
				setState(221);
				boolean_assignment();
				}
				break;
			case 2:
				_localctx = new Bool_asn_s_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				boolean_assignmentP();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_assignmentPContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Boolean_assignmentPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_assignmentP; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitBoolean_assignmentP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_assignmentPContext boolean_assignmentP() throws RecognitionException {
		Boolean_assignmentPContext _localctx = new Boolean_assignmentPContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolean_assignmentP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			id();
			setState(227);
			equal();
			setState(228);
			comparison_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_declaration_assignmentContext extends ParserRuleContext {
		public Boolean_declaration_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration_assignment; }
	 
		public Boolean_declaration_assignmentContext() { }
		public void copyFrom(Boolean_declaration_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bool_dclr_asn_s_SUBContext extends Boolean_declaration_assignmentContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Boolean_assignmentPContext boolean_assignmentP() {
			return getRuleContext(Boolean_assignmentPContext.class,0);
		}
		public Bool_dclr_asn_s_SUBContext(Boolean_declaration_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitBool_dclr_asn_s_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_dclr_asn_m_SUBContext extends Boolean_declaration_assignmentContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Boolean_assignmentPContext boolean_assignmentP() {
			return getRuleContext(Boolean_assignmentPContext.class,0);
		}
		public Boolean_declaration_assignmentPContext boolean_declaration_assignmentP() {
			return getRuleContext(Boolean_declaration_assignmentPContext.class,0);
		}
		public Bool_dclr_asn_m_SUBContext(Boolean_declaration_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitBool_dclr_asn_m_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_declaration_assignmentContext boolean_declaration_assignment() throws RecognitionException {
		Boolean_declaration_assignmentContext _localctx = new Boolean_declaration_assignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolean_declaration_assignment);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Bool_dclr_asn_m_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				var();
				setState(231);
				boolean_assignmentP();
				setState(232);
				boolean_declaration_assignmentP();
				}
				break;
			case 2:
				_localctx = new Bool_dclr_asn_s_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				var();
				setState(235);
				boolean_assignmentP();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_declaration_assignmentPContext extends ParserRuleContext {
		public Boolean_declaration_assignmentPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration_assignmentP; }
	 
		public Boolean_declaration_assignmentPContext() { }
		public void copyFrom(Boolean_declaration_assignmentPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bool_dclr_asnP_SUBContext extends Boolean_declaration_assignmentPContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public Boolean_assignmentPContext boolean_assignmentP() {
			return getRuleContext(Boolean_assignmentPContext.class,0);
		}
		public Boolean_declaration_assignmentPContext boolean_declaration_assignmentP() {
			return getRuleContext(Boolean_declaration_assignmentPContext.class,0);
		}
		public Bool_dclr_asnP_SUBContext(Boolean_declaration_assignmentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitBool_dclr_asnP_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_dclr_asnP_ENDContext extends Boolean_declaration_assignmentPContext {
		public Bool_dclr_asnP_ENDContext(Boolean_declaration_assignmentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitBool_dclr_asnP_END(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_declaration_assignmentPContext boolean_declaration_assignmentP() throws RecognitionException {
		Boolean_declaration_assignmentPContext _localctx = new Boolean_declaration_assignmentPContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolean_declaration_assignmentP);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new Bool_dclr_asnP_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				comma();
				setState(240);
				boolean_assignmentP();
				setState(241);
				boolean_declaration_assignmentP();
				}
				break;
			case SEMICOLON:
			case R_BRACKET:
				_localctx = new Bool_dclr_asnP_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_assignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Constructor_executionContext constructor_execution() {
			return getRuleContext(Constructor_executionContext.class,0);
		}
		public New_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitNew_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_assignmentContext new_assignment() throws RecognitionException {
		New_assignmentContext _localctx = new New_assignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_new_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			id();
			setState(247);
			equal();
			setState(248);
			constructor_execution();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_declaration_assignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Constructor_executionContext constructor_execution() {
			return getRuleContext(Constructor_executionContext.class,0);
		}
		public New_declaration_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_declaration_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitNew_declaration_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_declaration_assignmentContext new_declaration_assignment() throws RecognitionException {
		New_declaration_assignmentContext _localctx = new New_declaration_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_new_declaration_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			var();
			setState(251);
			id();
			setState(252);
			equal();
			setState(253);
			constructor_execution();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_assignmentContext extends ParserRuleContext {
		public Object_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_assignment; }
	 
		public Object_assignmentContext() { }
		public void copyFrom(Object_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Obj_asn_a_e_SUBContext extends Object_assignmentContext {
		public Object_property_assignmentContext object_property_assignment() {
			return getRuleContext(Object_property_assignmentContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Obj_asn_a_e_SUBContext(Object_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_asn_a_e_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Obj_asn_c_e_SUBContext extends Object_assignmentContext {
		public Object_property_assignmentContext object_property_assignment() {
			return getRuleContext(Object_property_assignmentContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Obj_asn_c_e_SUBContext(Object_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_asn_c_e_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_assignmentContext object_assignment() throws RecognitionException {
		Object_assignmentContext _localctx = new Object_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object_assignment);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Obj_asn_a_e_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				object_property_assignment();
				setState(256);
				equal();
				setState(257);
				arithmetic_expression(0);
				}
				break;
			case 2:
				_localctx = new Obj_asn_c_e_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				object_property_assignment();
				setState(260);
				equal();
				setState(261);
				comparison_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_property_assignmentContext extends ParserRuleContext {
		public Object_property_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_property_assignment; }
	 
		public Object_property_assignmentContext() { }
		public void copyFrom(Object_property_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Obj_prp_asn_id_SUBContext extends Object_property_assignmentContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public Object_propertyPContext object_propertyP() {
			return getRuleContext(Object_propertyPContext.class,0);
		}
		public Obj_prp_asn_id_SUBContext(Object_property_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_prp_asn_id_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Obj_prp_asn_this_SUBContext extends Object_property_assignmentContext {
		public Sl_thisContext sl_this() {
			return getRuleContext(Sl_thisContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Object_propertyPContext object_propertyP() {
			return getRuleContext(Object_propertyPContext.class,0);
		}
		public Obj_prp_asn_this_SUBContext(Object_property_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_prp_asn_this_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_property_assignmentContext object_property_assignment() throws RecognitionException {
		Object_property_assignmentContext _localctx = new Object_property_assignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_object_property_assignment);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Obj_prp_asn_id_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				id();
				setState(266);
				dot();
				setState(267);
				id();
				setState(268);
				object_propertyP();
				}
				break;
			case THIS:
				_localctx = new Obj_prp_asn_this_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				sl_this();
				setState(271);
				dot();
				setState(272);
				id();
				setState(273);
				object_propertyP();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockPContext extends ParserRuleContext {
		public Code_blockPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_blockP; }
	 
		public Code_blockPContext() { }
		public void copyFrom(Code_blockPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Code_block_SUBContext extends Code_blockPContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Code_block_SUBContext(Code_blockPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCode_block_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Code_block_ENDContext extends Code_blockPContext {
		public Code_block_ENDContext(Code_blockPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitCode_block_END(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockPContext code_blockP() throws RecognitionException {
		Code_blockPContext _localctx = new Code_blockPContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_code_blockP);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case VAR:
			case FUNCTION:
			case RETURN:
			case IF:
			case WHILE:
			case FOR:
			case THIS:
			case ID:
				_localctx = new Code_block_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				code_block();
				}
				break;
			case EOF:
			case R_CURV_BRACKET:
				_localctx = new Code_block_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
	 
		public Arithmetic_expressionContext() { }
		public void copyFrom(Arithmetic_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class A_e_obj_prp_ATOMContext extends Arithmetic_expressionContext {
		public Object_propertyContext object_property() {
			return getRuleContext(Object_propertyContext.class,0);
		}
		public A_e_obj_prp_ATOMContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_obj_prp_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class A_e_t1_SUBContext extends Arithmetic_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public T1_math_operatorContext t1_math_operator() {
			return getRuleContext(T1_math_operatorContext.class,0);
		}
		public A_e_t1_SUBContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_t1_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class A_e_int_ATOMContext extends Arithmetic_expressionContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public A_e_int_ATOMContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_int_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class A_e_id_ATOMContext extends Arithmetic_expressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public A_e_id_ATOMContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_id_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class A_e_func_exe_ATOMContext extends Arithmetic_expressionContext {
		public Function_executionContext function_execution() {
			return getRuleContext(Function_executionContext.class,0);
		}
		public A_e_func_exe_ATOMContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_func_exe_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class A_e_t2_SUBContext extends Arithmetic_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public T2_math_operatorContext t2_math_operator() {
			return getRuleContext(T2_math_operatorContext.class,0);
		}
		public A_e_t2_SUBContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_t2_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class A_e_brkt_SUBContext extends Arithmetic_expressionContext {
		public L_bracketContext l_bracket() {
			return getRuleContext(L_bracketContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public R_bracketContext r_bracket() {
			return getRuleContext(R_bracketContext.class,0);
		}
		public A_e_brkt_SUBContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_brkt_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class A_e_str_ATOMContext extends Arithmetic_expressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public A_e_str_ATOMContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitA_e_str_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new A_e_id_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(282);
				id();
				}
				break;
			case 2:
				{
				_localctx = new A_e_int_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				integer();
				}
				break;
			case 3:
				{
				_localctx = new A_e_str_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				string();
				}
				break;
			case 4:
				{
				_localctx = new A_e_func_exe_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				function_execution();
				}
				break;
			case 5:
				{
				_localctx = new A_e_obj_prp_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				object_property();
				}
				break;
			case 6:
				{
				_localctx = new A_e_brkt_SUBContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				l_bracket();
				setState(288);
				arithmetic_expression(0);
				setState(289);
				r_bracket();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new A_e_t1_SUBContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(293);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(294);
						t1_math_operator();
						setState(295);
						arithmetic_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new A_e_t2_SUBContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(297);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(298);
						t2_math_operator();
						setState(299);
						arithmetic_expression(3);
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Estimation_blockContext extends ParserRuleContext {
		public L_bracketContext l_bracket() {
			return getRuleContext(L_bracketContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public R_bracketContext r_bracket() {
			return getRuleContext(R_bracketContext.class,0);
		}
		public Estimation_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estimation_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitEstimation_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estimation_blockContext estimation_block() throws RecognitionException {
		Estimation_blockContext _localctx = new Estimation_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_estimation_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			l_bracket();
			setState(307);
			comparison_expression(0);
			setState(308);
			r_bracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_code_blockContext extends ParserRuleContext {
		public Sub_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_code_block; }
	 
		public Sub_code_blockContext() { }
		public void copyFrom(Sub_code_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sub_cod_block_epsl_SUBContext extends Sub_code_blockContext {
		public L_curv_bracketContext l_curv_bracket() {
			return getRuleContext(L_curv_bracketContext.class,0);
		}
		public R_curv_bracketContext r_curv_bracket() {
			return getRuleContext(R_curv_bracketContext.class,0);
		}
		public Sub_cod_block_epsl_SUBContext(Sub_code_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSub_cod_block_epsl_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sub_cod_block_SUBContext extends Sub_code_blockContext {
		public L_curv_bracketContext l_curv_bracket() {
			return getRuleContext(L_curv_bracketContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public R_curv_bracketContext r_curv_bracket() {
			return getRuleContext(R_curv_bracketContext.class,0);
		}
		public Sub_cod_block_SUBContext(Sub_code_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSub_cod_block_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_code_blockContext sub_code_block() throws RecognitionException {
		Sub_code_blockContext _localctx = new Sub_code_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sub_code_block);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Sub_cod_block_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				l_curv_bracket();
				setState(311);
				code_block();
				setState(312);
				r_curv_bracket();
				}
				break;
			case 2:
				_localctx = new Sub_cod_block_epsl_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				l_curv_bracket();
				setState(315);
				r_curv_bracket();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public Sl_ifContext sl_if() {
			return getRuleContext(Sl_ifContext.class,0);
		}
		public Estimation_blockContext estimation_block() {
			return getRuleContext(Estimation_blockContext.class,0);
		}
		public Sub_code_blockContext sub_code_block() {
			return getRuleContext(Sub_code_blockContext.class,0);
		}
		public Sub_if_blockContext sub_if_block() {
			return getRuleContext(Sub_if_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			sl_if();
			setState(320);
			estimation_block();
			setState(321);
			sub_code_block();
			setState(322);
			sub_if_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_if_blockContext extends ParserRuleContext {
		public Sub_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_if_block; }
	 
		public Sub_if_blockContext() { }
		public void copyFrom(Sub_if_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_block_else_if_SUBContext extends Sub_if_blockContext {
		public Sl_elseContext sl_else() {
			return getRuleContext(Sl_elseContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public If_block_else_if_SUBContext(Sub_if_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitIf_block_else_if_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_block_ENDContext extends Sub_if_blockContext {
		public If_block_ENDContext(Sub_if_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitIf_block_END(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_block_else_SUBContext extends Sub_if_blockContext {
		public Sl_elseContext sl_else() {
			return getRuleContext(Sl_elseContext.class,0);
		}
		public Sub_code_blockContext sub_code_block() {
			return getRuleContext(Sub_code_blockContext.class,0);
		}
		public If_block_else_SUBContext(Sub_if_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitIf_block_else_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_if_blockContext sub_if_block() throws RecognitionException {
		Sub_if_blockContext _localctx = new Sub_if_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sub_if_block);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new If_block_else_if_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				sl_else();
				setState(325);
				if_block();
				}
				break;
			case 2:
				_localctx = new If_block_else_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				sl_else();
				setState(328);
				sub_code_block();
				}
				break;
			case 3:
				_localctx = new If_block_ENDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_blockContext extends ParserRuleContext {
		public Loop_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_block; }
	 
		public Loop_blockContext() { }
		public void copyFrom(Loop_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Loop_block_while_SUBContext extends Loop_blockContext {
		public Sl_whileContext sl_while() {
			return getRuleContext(Sl_whileContext.class,0);
		}
		public Estimation_blockContext estimation_block() {
			return getRuleContext(Estimation_blockContext.class,0);
		}
		public Sub_code_blockContext sub_code_block() {
			return getRuleContext(Sub_code_blockContext.class,0);
		}
		public Loop_block_while_SUBContext(Loop_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitLoop_block_while_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Loop_block_for_SUBContext extends Loop_blockContext {
		public Sl_forContext sl_for() {
			return getRuleContext(Sl_forContext.class,0);
		}
		public L_bracketContext l_bracket() {
			return getRuleContext(L_bracketContext.class,0);
		}
		public For_loop_prestatementContext for_loop_prestatement() {
			return getRuleContext(For_loop_prestatementContext.class,0);
		}
		public List<SemicolonContext> semicolon() {
			return getRuleContexts(SemicolonContext.class);
		}
		public SemicolonContext semicolon(int i) {
			return getRuleContext(SemicolonContext.class,i);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public For_loop_wrapContext for_loop_wrap() {
			return getRuleContext(For_loop_wrapContext.class,0);
		}
		public R_bracketContext r_bracket() {
			return getRuleContext(R_bracketContext.class,0);
		}
		public Sub_code_blockContext sub_code_block() {
			return getRuleContext(Sub_code_blockContext.class,0);
		}
		public Loop_block_for_SUBContext(Loop_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitLoop_block_for_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_blockContext loop_block() throws RecognitionException {
		Loop_blockContext _localctx = new Loop_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop_block);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new Loop_block_while_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				sl_while();
				setState(334);
				estimation_block();
				setState(335);
				sub_code_block();
				}
				break;
			case FOR:
				_localctx = new Loop_block_for_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				sl_for();
				setState(338);
				l_bracket();
				setState(339);
				for_loop_prestatement();
				setState(340);
				semicolon();
				setState(341);
				comparison_expression(0);
				setState(342);
				semicolon();
				setState(343);
				for_loop_wrap();
				setState(344);
				r_bracket();
				setState(345);
				sub_code_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loop_prestatementContext extends ParserRuleContext {
		public For_loop_prestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_prestatement; }
	 
		public For_loop_prestatementContext() { }
		public void copyFrom(For_loop_prestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class For_loop_prestatement_ENDContext extends For_loop_prestatementContext {
		public For_loop_prestatement_ENDContext(For_loop_prestatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFor_loop_prestatement_END(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_loop_prestatement_SUBContext extends For_loop_prestatementContext {
		public Code_statementContext code_statement() {
			return getRuleContext(Code_statementContext.class,0);
		}
		public For_loop_prestatement_SUBContext(For_loop_prestatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFor_loop_prestatement_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_prestatementContext for_loop_prestatement() throws RecognitionException {
		For_loop_prestatementContext _localctx = new For_loop_prestatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_loop_prestatement);
		try {
			setState(351);
			switch (_input.LA(1)) {
			case VAR:
			case RETURN:
			case THIS:
			case ID:
				_localctx = new For_loop_prestatement_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				code_statement();
				}
				break;
			case SEMICOLON:
				_localctx = new For_loop_prestatement_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loop_wrapContext extends ParserRuleContext {
		public For_loop_wrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_wrap; }
	 
		public For_loop_wrapContext() { }
		public void copyFrom(For_loop_wrapContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class For_loop_wrap_ENDContext extends For_loop_wrapContext {
		public For_loop_wrap_ENDContext(For_loop_wrapContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFor_loop_wrap_END(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_loop_wrap_SUBContext extends For_loop_wrapContext {
		public Code_statementContext code_statement() {
			return getRuleContext(Code_statementContext.class,0);
		}
		public For_loop_wrap_SUBContext(For_loop_wrapContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFor_loop_wrap_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_wrapContext for_loop_wrap() throws RecognitionException {
		For_loop_wrapContext _localctx = new For_loop_wrapContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_loop_wrap);
		try {
			setState(355);
			switch (_input.LA(1)) {
			case VAR:
			case RETURN:
			case THIS:
			case ID:
				_localctx = new For_loop_wrap_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				code_statement();
				}
				break;
			case R_BRACKET:
				_localctx = new For_loop_wrap_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public L_bracketContext l_bracket() {
			return getRuleContext(L_bracketContext.class,0);
		}
		public Function_definition_argumentContext function_definition_argument() {
			return getRuleContext(Function_definition_argumentContext.class,0);
		}
		public R_bracketContext r_bracket() {
			return getRuleContext(R_bracketContext.class,0);
		}
		public Sub_code_blockContext sub_code_block() {
			return getRuleContext(Sub_code_blockContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			function();
			setState(358);
			id();
			setState(359);
			l_bracket();
			setState(360);
			function_definition_argument();
			setState(361);
			r_bracket();
			setState(362);
			sub_code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_argumentContext extends ParserRuleContext {
		public Function_definition_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_argument; }
	 
		public Function_definition_argumentContext() { }
		public void copyFrom(Function_definition_argumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Func_def_arg_ENDContext extends Function_definition_argumentContext {
		public Func_def_arg_ENDContext(Function_definition_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_def_arg_END(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_def_arg_SUBContext extends Function_definition_argumentContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_definition_argumentPContext function_definition_argumentP() {
			return getRuleContext(Function_definition_argumentPContext.class,0);
		}
		public Func_def_arg_SUBContext(Function_definition_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_def_arg_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_argumentContext function_definition_argument() throws RecognitionException {
		Function_definition_argumentContext _localctx = new Function_definition_argumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_definition_argument);
		try {
			setState(368);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Func_def_arg_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				id();
				setState(365);
				function_definition_argumentP();
				}
				break;
			case R_BRACKET:
				_localctx = new Func_def_arg_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_argumentPContext extends ParserRuleContext {
		public Function_definition_argumentPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_argumentP; }
	 
		public Function_definition_argumentPContext() { }
		public void copyFrom(Function_definition_argumentPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Func_def_argP_ENDContext extends Function_definition_argumentPContext {
		public Func_def_argP_ENDContext(Function_definition_argumentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_def_argP_END(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_def_argP_SUBContext extends Function_definition_argumentPContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_definition_argumentPContext function_definition_argumentP() {
			return getRuleContext(Function_definition_argumentPContext.class,0);
		}
		public Func_def_argP_SUBContext(Function_definition_argumentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_def_argP_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_argumentPContext function_definition_argumentP() throws RecognitionException {
		Function_definition_argumentPContext _localctx = new Function_definition_argumentPContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_definition_argumentP);
		try {
			setState(375);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new Func_def_argP_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				comma();
				setState(371);
				id();
				setState(372);
				function_definition_argumentP();
				}
				break;
			case R_BRACKET:
				_localctx = new Func_def_argP_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_executionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public L_bracketContext l_bracket() {
			return getRuleContext(L_bracketContext.class,0);
		}
		public Function_execution_argumentContext function_execution_argument() {
			return getRuleContext(Function_execution_argumentContext.class,0);
		}
		public R_bracketContext r_bracket() {
			return getRuleContext(R_bracketContext.class,0);
		}
		public Function_executionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_execution; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunction_execution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_executionContext function_execution() throws RecognitionException {
		Function_executionContext _localctx = new Function_executionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_execution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			id();
			setState(378);
			l_bracket();
			setState(379);
			function_execution_argument();
			setState(380);
			r_bracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_executionContext extends ParserRuleContext {
		public Sl_newContext sl_new() {
			return getRuleContext(Sl_newContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public L_bracketContext l_bracket() {
			return getRuleContext(L_bracketContext.class,0);
		}
		public Function_execution_argumentContext function_execution_argument() {
			return getRuleContext(Function_execution_argumentContext.class,0);
		}
		public R_bracketContext r_bracket() {
			return getRuleContext(R_bracketContext.class,0);
		}
		public Constructor_executionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_execution; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitConstructor_execution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_executionContext constructor_execution() throws RecognitionException {
		Constructor_executionContext _localctx = new Constructor_executionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constructor_execution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			sl_new();
			setState(383);
			id();
			setState(384);
			l_bracket();
			setState(385);
			function_execution_argument();
			setState(386);
			r_bracket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_execution_argumentContext extends ParserRuleContext {
		public Function_execution_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_execution_argument; }
	 
		public Function_execution_argumentContext() { }
		public void copyFrom(Function_execution_argumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Func_exe_arg_ENDContext extends Function_execution_argumentContext {
		public Func_exe_arg_ENDContext(Function_execution_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_exe_arg_END(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_exe_arg_a_e_SUBContext extends Function_execution_argumentContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Function_execution_argumentPContext function_execution_argumentP() {
			return getRuleContext(Function_execution_argumentPContext.class,0);
		}
		public Func_exe_arg_a_e_SUBContext(Function_execution_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_exe_arg_a_e_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_exe_arg_c_e_SUBContext extends Function_execution_argumentContext {
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Function_execution_argumentPContext function_execution_argumentP() {
			return getRuleContext(Function_execution_argumentPContext.class,0);
		}
		public Func_exe_arg_c_e_SUBContext(Function_execution_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_exe_arg_c_e_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_exe_arg_id_SUBContext extends Function_execution_argumentContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_execution_argumentPContext function_execution_argumentP() {
			return getRuleContext(Function_execution_argumentPContext.class,0);
		}
		public Func_exe_arg_id_SUBContext(Function_execution_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_exe_arg_id_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_execution_argumentContext function_execution_argument() throws RecognitionException {
		Function_execution_argumentContext _localctx = new Function_execution_argumentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_execution_argument);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Func_exe_arg_a_e_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				arithmetic_expression(0);
				setState(389);
				function_execution_argumentP();
				}
				break;
			case 2:
				_localctx = new Func_exe_arg_c_e_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				comparison_expression(0);
				setState(392);
				function_execution_argumentP();
				}
				break;
			case 3:
				_localctx = new Func_exe_arg_id_SUBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				id();
				setState(395);
				function_execution_argumentP();
				}
				break;
			case 4:
				_localctx = new Func_exe_arg_ENDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_execution_argumentPContext extends ParserRuleContext {
		public Function_execution_argumentPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_execution_argumentP; }
	 
		public Function_execution_argumentPContext() { }
		public void copyFrom(Function_execution_argumentPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Func_exe_argP_ENDContext extends Function_execution_argumentPContext {
		public Func_exe_argP_ENDContext(Function_execution_argumentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_exe_argP_END(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_exe_argP_SUBContext extends Function_execution_argumentPContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public Function_execution_argumentContext function_execution_argument() {
			return getRuleContext(Function_execution_argumentContext.class,0);
		}
		public Func_exe_argP_SUBContext(Function_execution_argumentPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunc_exe_argP_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_execution_argumentPContext function_execution_argumentP() throws RecognitionException {
		Function_execution_argumentPContext _localctx = new Function_execution_argumentPContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_execution_argumentP);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new Func_exe_argP_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				comma();
				setState(401);
				function_execution_argument();
				}
				break;
			case R_BRACKET:
				_localctx = new Func_exe_argP_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_propertyContext extends ParserRuleContext {
		public Object_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_property; }
	 
		public Object_propertyContext() { }
		public void copyFrom(Object_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Obj_prp_id_SUBContext extends Object_propertyContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public Object_propertyPContext object_propertyP() {
			return getRuleContext(Object_propertyPContext.class,0);
		}
		public Obj_prp_id_SUBContext(Object_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_prp_id_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Obj_prp_this_SUBContext extends Object_propertyContext {
		public Sl_thisContext sl_this() {
			return getRuleContext(Sl_thisContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Object_propertyPContext object_propertyP() {
			return getRuleContext(Object_propertyPContext.class,0);
		}
		public Obj_prp_this_SUBContext(Object_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_prp_this_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_propertyContext object_property() throws RecognitionException {
		Object_propertyContext _localctx = new Object_propertyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_object_property);
		try {
			setState(416);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Obj_prp_id_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				id();
				setState(407);
				dot();
				setState(408);
				id();
				setState(409);
				object_propertyP();
				}
				break;
			case THIS:
				_localctx = new Obj_prp_this_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				sl_this();
				setState(412);
				dot();
				setState(413);
				id();
				setState(414);
				object_propertyP();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_propertyPContext extends ParserRuleContext {
		public Object_propertyPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_propertyP; }
	 
		public Object_propertyPContext() { }
		public void copyFrom(Object_propertyPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Obj_prpP_SUBContext extends Object_propertyPContext {
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Object_propertyPContext object_propertyP() {
			return getRuleContext(Object_propertyPContext.class,0);
		}
		public Obj_prpP_SUBContext(Object_propertyPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_prpP_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Obj_prpP_ENDContext extends Object_propertyPContext {
		public Obj_prpP_ENDContext(Object_propertyPContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitObj_prpP_END(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_propertyPContext object_propertyP() throws RecognitionException {
		Object_propertyPContext _localctx = new Object_propertyPContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_object_propertyP);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Obj_prpP_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				dot();
				setState(419);
				id();
				setState(420);
				object_propertyP();
				}
				break;
			case 2:
				_localctx = new Obj_prpP_ENDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_expressionContext extends ParserRuleContext {
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
	 
		public Comparison_expressionContext() { }
		public void copyFrom(Comparison_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class C_e_bool_ATOMContext extends Comparison_expressionContext {
		public Sl_booleanContext sl_boolean() {
			return getRuleContext(Sl_booleanContext.class,0);
		}
		public C_e_bool_ATOMContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitC_e_bool_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C_e_id_ATOMContext extends Comparison_expressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public C_e_id_ATOMContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitC_e_id_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C_e_t7_SUBContext extends Comparison_expressionContext {
		public List<Comparison_expressionContext> comparison_expression() {
			return getRuleContexts(Comparison_expressionContext.class);
		}
		public Comparison_expressionContext comparison_expression(int i) {
			return getRuleContext(Comparison_expressionContext.class,i);
		}
		public T7_comp_operatorContext t7_comp_operator() {
			return getRuleContext(T7_comp_operatorContext.class,0);
		}
		public C_e_t7_SUBContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitC_e_t7_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C_e_t6_SUBContext extends Comparison_expressionContext {
		public List<Comparison_expressionContext> comparison_expression() {
			return getRuleContexts(Comparison_expressionContext.class);
		}
		public Comparison_expressionContext comparison_expression(int i) {
			return getRuleContext(Comparison_expressionContext.class,i);
		}
		public T6_comp_operatorContext t6_comp_operator() {
			return getRuleContext(T6_comp_operatorContext.class,0);
		}
		public C_e_t6_SUBContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitC_e_t6_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C_e_t2_SUBContext extends Comparison_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public T2_comp_operatorContext t2_comp_operator() {
			return getRuleContext(T2_comp_operatorContext.class,0);
		}
		public C_e_t2_SUBContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitC_e_t2_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C_e_func_exe_ATOMContext extends Comparison_expressionContext {
		public Function_executionContext function_execution() {
			return getRuleContext(Function_executionContext.class,0);
		}
		public C_e_func_exe_ATOMContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitC_e_func_exe_ATOM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C_e_brkt_SUBContext extends Comparison_expressionContext {
		public L_bracketContext l_bracket() {
			return getRuleContext(L_bracketContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public R_bracketContext r_bracket() {
			return getRuleContext(R_bracketContext.class,0);
		}
		public C_e_brkt_SUBContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitC_e_brkt_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		return comparison_expression(0);
	}

	private Comparison_expressionContext comparison_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, _parentState);
		Comparison_expressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_comparison_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new C_e_id_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(426);
				id();
				}
				break;
			case 2:
				{
				_localctx = new C_e_bool_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(427);
				sl_boolean();
				}
				break;
			case 3:
				{
				_localctx = new C_e_func_exe_ATOMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				function_execution();
				}
				break;
			case 4:
				{
				_localctx = new C_e_t2_SUBContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(429);
				arithmetic_expression(0);
				setState(430);
				t2_comp_operator();
				setState(431);
				arithmetic_expression(0);
				}
				break;
			case 5:
				{
				_localctx = new C_e_brkt_SUBContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(433);
				l_bracket();
				setState(434);
				comparison_expression(0);
				setState(435);
				r_bracket();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(447);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new C_e_t6_SUBContext(new Comparison_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expression);
						setState(439);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(440);
						t6_comp_operator();
						setState(441);
						comparison_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new C_e_t7_SUBContext(new Comparison_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_expression);
						setState(443);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(444);
						t7_comp_operator();
						setState(445);
						comparison_expression(3);
						}
						break;
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class T1_math_operatorContext extends ParserRuleContext {
		public T1_math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t1_math_operator; }
	 
		public T1_math_operatorContext() { }
		public void copyFrom(T1_math_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends T1_math_operatorContext {
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public DivContext(T1_math_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends T1_math_operatorContext {
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public MulContext(T1_math_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T1_math_operatorContext t1_math_operator() throws RecognitionException {
		T1_math_operatorContext _localctx = new T1_math_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_t1_math_operator);
		try {
			setState(454);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				multiplication();
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				division();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T2_math_operatorContext extends ParserRuleContext {
		public T2_math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2_math_operator; }
	 
		public T2_math_operatorContext() { }
		public void copyFrom(T2_math_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends T2_math_operatorContext {
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public AddContext(T2_math_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends T2_math_operatorContext {
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public SubContext(T2_math_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T2_math_operatorContext t2_math_operator() throws RecognitionException {
		T2_math_operatorContext _localctx = new T2_math_operatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_t2_math_operator);
		try {
			setState(458);
			switch (_input.LA(1)) {
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				addition();
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				subtraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T2_comp_operatorContext extends ParserRuleContext {
		public T2_comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2_comp_operator; }
	 
		public T2_comp_operatorContext() { }
		public void copyFrom(T2_comp_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Not_eqlContext extends T2_comp_operatorContext {
		public Not_equalContext not_equal() {
			return getRuleContext(Not_equalContext.class,0);
		}
		public Not_eqlContext(T2_comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitNot_eql(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eql_eqlContext extends T2_comp_operatorContext {
		public Equal_equalContext equal_equal() {
			return getRuleContext(Equal_equalContext.class,0);
		}
		public Eql_eqlContext(T2_comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitEql_eql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T2_comp_operatorContext t2_comp_operator() throws RecognitionException {
		T2_comp_operatorContext _localctx = new T2_comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_t2_comp_operator);
		try {
			setState(462);
			switch (_input.LA(1)) {
			case EQL_EQL:
				_localctx = new Eql_eqlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				equal_equal();
				}
				break;
			case NOT_EQL:
				_localctx = new Not_eqlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				not_equal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T6_comp_operatorContext extends ParserRuleContext {
		public And_andContext and_and() {
			return getRuleContext(And_andContext.class,0);
		}
		public T6_comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t6_comp_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitT6_comp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T6_comp_operatorContext t6_comp_operator() throws RecognitionException {
		T6_comp_operatorContext _localctx = new T6_comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_t6_comp_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			and_and();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T7_comp_operatorContext extends ParserRuleContext {
		public Or_orContext or_or() {
			return getRuleContext(Or_orContext.class,0);
		}
		public T7_comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t7_comp_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitT7_comp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T7_comp_operatorContext t7_comp_operator() throws RecognitionException {
		T7_comp_operatorContext _localctx = new T7_comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_t7_comp_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			or_or();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_booleanContext extends ParserRuleContext {
		public Sl_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_boolean; }
	 
		public Sl_booleanContext() { }
		public void copyFrom(Sl_booleanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sl_boolean_true_SUBContext extends Sl_booleanContext {
		public Sl_trueContext sl_true() {
			return getRuleContext(Sl_trueContext.class,0);
		}
		public Sl_boolean_true_SUBContext(Sl_booleanContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_boolean_true_SUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sl_boolean_false_SUBContext extends Sl_booleanContext {
		public Sl_falseContext sl_false() {
			return getRuleContext(Sl_falseContext.class,0);
		}
		public Sl_boolean_false_SUBContext(Sl_booleanContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_boolean_false_SUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_booleanContext sl_boolean() throws RecognitionException {
		Sl_booleanContext _localctx = new Sl_booleanContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sl_boolean);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new Sl_boolean_true_SUBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				sl_true();
				}
				break;
			case FALSE:
				_localctx = new Sl_boolean_false_SUBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				sl_false();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(FakeJSParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FakeJSParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FakeJSParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_trueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FakeJSParser.TRUE, 0); }
		public Sl_trueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_true; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_true(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_trueContext sl_true() throws RecognitionException {
		Sl_trueContext _localctx = new Sl_trueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sl_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_falseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(FakeJSParser.FALSE, 0); }
		public Sl_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_false; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_falseContext sl_false() throws RecognitionException {
		Sl_falseContext _localctx = new Sl_falseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sl_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicationContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(FakeJSParser.MUL, 0); }
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_multiplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(FakeJSParser.DIV, 0); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(FakeJSParser.ADD, 0); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(ADD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtractionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(FakeJSParser.SUB, 0); }
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		SubtractionContext _localctx = new SubtractionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subtraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equal_equalContext extends ParserRuleContext {
		public TerminalNode EQL_EQL() { return getToken(FakeJSParser.EQL_EQL, 0); }
		public Equal_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitEqual_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_equalContext equal_equal() throws RecognitionException {
		Equal_equalContext _localctx = new Equal_equalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_equal_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(EQL_EQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equalContext extends ParserRuleContext {
		public TerminalNode NOT_EQL() { return getToken(FakeJSParser.NOT_EQL, 0); }
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitNot_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(NOT_EQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_andContext extends ParserRuleContext {
		public TerminalNode AND_AND() { return getToken(FakeJSParser.AND_AND, 0); }
		public And_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitAnd_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_andContext and_and() throws RecognitionException {
		And_andContext _localctx = new And_andContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_and_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(AND_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_orContext extends ParserRuleContext {
		public TerminalNode OR_OR() { return getToken(FakeJSParser.OR_OR, 0); }
		public Or_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_or; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitOr_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_orContext or_or() throws RecognitionException {
		Or_orContext _localctx = new Or_orContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_or_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(OR_OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(FakeJSParser.EQL, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(EQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FakeJSParser.SEMICOLON, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(FakeJSParser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(FakeJSParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FakeJSParser.FUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FakeJSParser.RETURN, 0); }
		public Sl_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_returnContext sl_return() throws RecognitionException {
		Sl_returnContext _localctx = new Sl_returnContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sl_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_newContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FakeJSParser.NEW, 0); }
		public Sl_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_new; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_new(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_newContext sl_new() throws RecognitionException {
		Sl_newContext _localctx = new Sl_newContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sl_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(NEW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FakeJSParser.IF, 0); }
		public Sl_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_ifContext sl_if() throws RecognitionException {
		Sl_ifContext _localctx = new Sl_ifContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sl_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FakeJSParser.ELSE, 0); }
		public Sl_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_elseContext sl_else() throws RecognitionException {
		Sl_elseContext _localctx = new Sl_elseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_sl_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FakeJSParser.WHILE, 0); }
		public Sl_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_whileContext sl_while() throws RecognitionException {
		Sl_whileContext _localctx = new Sl_whileContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sl_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(WHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FakeJSParser.FOR, 0); }
		public Sl_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_forContext sl_for() throws RecognitionException {
		Sl_forContext _localctx = new Sl_forContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sl_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sl_thisContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(FakeJSParser.THIS, 0); }
		public Sl_thisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_this; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitSl_this(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_thisContext sl_this() throws RecognitionException {
		Sl_thisContext _localctx = new Sl_thisContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sl_this);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L_bracketContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(FakeJSParser.L_BRACKET, 0); }
		public L_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_bracket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitL_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_bracketContext l_bracket() throws RecognitionException {
		L_bracketContext _localctx = new L_bracketContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_l_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(L_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_bracketContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(FakeJSParser.R_BRACKET, 0); }
		public R_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_bracket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitR_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_bracketContext r_bracket() throws RecognitionException {
		R_bracketContext _localctx = new R_bracketContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_r_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L_curv_bracketContext extends ParserRuleContext {
		public TerminalNode L_CURV_BRACKET() { return getToken(FakeJSParser.L_CURV_BRACKET, 0); }
		public L_curv_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_curv_bracket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitL_curv_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_curv_bracketContext l_curv_bracket() throws RecognitionException {
		L_curv_bracketContext _localctx = new L_curv_bracketContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_l_curv_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(L_CURV_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_curv_bracketContext extends ParserRuleContext {
		public TerminalNode R_CURV_BRACKET() { return getToken(FakeJSParser.R_CURV_BRACKET, 0); }
		public R_curv_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_curv_bracket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitR_curv_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_curv_bracketContext r_curv_bracket() throws RecognitionException {
		R_curv_bracketContext _localctx = new R_curv_bracketContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_r_curv_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(R_CURV_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(FakeJSParser.DOT, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FakeJSVisitor ) return ((FakeJSVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		case 36:
			return comparison_expression_sempred((Comparison_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comparison_expression_sempred(Comparison_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0217\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a0\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b1\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ba\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00c1"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00c8\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00d5\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00dc\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00e3\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00f0\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u010a\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0116\n\23\3\24\3\24\5\24\u011a\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0126\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0130\n\25\f\25\16\25\u0133\13\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0140\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014e\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u015e\n\32\3\33\3\33\5\33\u0162\n\33\3\34\3\34\5\34\u0166\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0173\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u017a\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0191\n\"\3#\3#\3#\3#\5#"+
		"\u0197\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01a3\n$\3%\3%\3%\3%\3%\5%"+
		"\u01aa\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b8\n&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\7&\u01c2\n&\f&\16&\u01c5\13&\3\'\3\'\5\'\u01c9\n\'\3(\3("+
		"\5(\u01cd\n(\3)\3)\5)\u01d1\n)\3*\3*\3+\3+\3,\3,\5,\u01d9\n,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\2"+
		"\4(JK\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\2\2\u0204\2\u0094\3\2\2\2\4\u0096\3\2\2\2\6\u009f"+
		"\3\2\2\2\b\u00b0\3\2\2\2\n\u00b9\3\2\2\2\f\u00c0\3\2\2\2\16\u00c7\3\2"+
		"\2\2\20\u00c9\3\2\2\2\22\u00d4\3\2\2\2\24\u00db\3\2\2\2\26\u00e2\3\2\2"+
		"\2\30\u00e4\3\2\2\2\32\u00ef\3\2\2\2\34\u00f6\3\2\2\2\36\u00f8\3\2\2\2"+
		" \u00fc\3\2\2\2\"\u0109\3\2\2\2$\u0115\3\2\2\2&\u0119\3\2\2\2(\u0125\3"+
		"\2\2\2*\u0134\3\2\2\2,\u013f\3\2\2\2.\u0141\3\2\2\2\60\u014d\3\2\2\2\62"+
		"\u015d\3\2\2\2\64\u0161\3\2\2\2\66\u0165\3\2\2\28\u0167\3\2\2\2:\u0172"+
		"\3\2\2\2<\u0179\3\2\2\2>\u017b\3\2\2\2@\u0180\3\2\2\2B\u0190\3\2\2\2D"+
		"\u0196\3\2\2\2F\u01a2\3\2\2\2H\u01a9\3\2\2\2J\u01b7\3\2\2\2L\u01c8\3\2"+
		"\2\2N\u01cc\3\2\2\2P\u01d0\3\2\2\2R\u01d2\3\2\2\2T\u01d4\3\2\2\2V\u01d8"+
		"\3\2\2\2X\u01da\3\2\2\2Z\u01dc\3\2\2\2\\\u01de\3\2\2\2^\u01e0\3\2\2\2"+
		"`\u01e2\3\2\2\2b\u01e4\3\2\2\2d\u01e6\3\2\2\2f\u01e8\3\2\2\2h\u01ea\3"+
		"\2\2\2j\u01ec\3\2\2\2l\u01ee\3\2\2\2n\u01f0\3\2\2\2p\u01f2\3\2\2\2r\u01f4"+
		"\3\2\2\2t\u01f6\3\2\2\2v\u01f8\3\2\2\2x\u01fa\3\2\2\2z\u01fc\3\2\2\2|"+
		"\u01fe\3\2\2\2~\u0200\3\2\2\2\u0080\u0202\3\2\2\2\u0082\u0204\3\2\2\2"+
		"\u0084\u0206\3\2\2\2\u0086\u0208\3\2\2\2\u0088\u020a\3\2\2\2\u008a\u020c"+
		"\3\2\2\2\u008c\u020e\3\2\2\2\u008e\u0210\3\2\2\2\u0090\u0212\3\2\2\2\u0092"+
		"\u0214\3\2\2\2\u0094\u0095\5\4\3\2\u0095\3\3\2\2\2\u0096\u0097\5\6\4\2"+
		"\u0097\u0098\5&\24\2\u0098\5\3\2\2\2\u0099\u009a\5\b\5\2\u009a\u009b\5"+
		"t;\2\u009b\u00a0\3\2\2\2\u009c\u00a0\5.\30\2\u009d\u00a0\5\62\32\2\u009e"+
		"\u00a0\58\35\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\7\3\2\2\2\u00a1\u00b1\5\n\6\2\u00a2\u00b1"+
		"\5\16\b\2\u00a3\u00b1\5\22\n\2\u00a4\u00b1\5\26\f\2\u00a5\u00b1\5\32\16"+
		"\2\u00a6\u00b1\5> \2\u00a7\u00a8\5|?\2\u00a8\u00a9\5(\25\2\u00a9\u00b1"+
		"\3\2\2\2\u00aa\u00ab\5|?\2\u00ab\u00ac\5J&\2\u00ac\u00b1\3\2\2\2\u00ad"+
		"\u00b1\5\36\20\2\u00ae\u00b1\5 \21\2\u00af\u00b1\5\"\22\2\u00b0\u00a1"+
		"\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00a3\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0"+
		"\u00a5\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00aa\3\2"+
		"\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\t\3\2\2\2\u00b2\u00b3\5x=\2\u00b3\u00b4\5\\/\2\u00b4\u00b5\5\f\7\2\u00b5"+
		"\u00ba\3\2\2\2\u00b6\u00b7\5x=\2\u00b7\u00b8\5\\/\2\u00b8\u00ba\3\2\2"+
		"\2\u00b9\u00b2\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\13\3\2\2\2\u00bb\u00bc"+
		"\5v<\2\u00bc\u00bd\5\\/\2\u00bd\u00be\5\f\7\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\r\3\2\2\2"+
		"\u00c2\u00c3\5\20\t\2\u00c3\u00c4\5v<\2\u00c4\u00c5\5\16\b\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c8\5\20\t\2\u00c7\u00c2\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\17\3\2\2\2\u00c9\u00ca\5\\/\2\u00ca\u00cb\5r:\2\u00cb\u00cc\5("+
		"\25\2\u00cc\21\3\2\2\2\u00cd\u00ce\5x=\2\u00ce\u00cf\5\20\t\2\u00cf\u00d0"+
		"\5\24\13\2\u00d0\u00d5\3\2\2\2\u00d1\u00d2\5x=\2\u00d2\u00d3\5\20\t\2"+
		"\u00d3\u00d5\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\23"+
		"\3\2\2\2\u00d6\u00d7\5v<\2\u00d7\u00d8\5\20\t\2\u00d8\u00d9\5\24\13\2"+
		"\u00d9\u00dc\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\25\3\2\2\2\u00dd\u00de\5\30\r\2\u00de\u00df\5v<\2\u00df"+
		"\u00e0\5\26\f\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3\5\30\r\2\u00e2\u00dd\3"+
		"\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\27\3\2\2\2\u00e4\u00e5\5\\/\2\u00e5\u00e6"+
		"\5r:\2\u00e6\u00e7\5J&\2\u00e7\31\3\2\2\2\u00e8\u00e9\5x=\2\u00e9\u00ea"+
		"\5\30\r\2\u00ea\u00eb\5\34\17\2\u00eb\u00f0\3\2\2\2\u00ec\u00ed\5x=\2"+
		"\u00ed\u00ee\5\30\r\2\u00ee\u00f0\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00ec"+
		"\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\5v<\2\u00f2\u00f3\5\30\r\2\u00f3"+
		"\u00f4\5\34\17\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f1\3"+
		"\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\5\\/\2\u00f9\u00fa"+
		"\5r:\2\u00fa\u00fb\5@!\2\u00fb\37\3\2\2\2\u00fc\u00fd\5x=\2\u00fd\u00fe"+
		"\5\\/\2\u00fe\u00ff\5r:\2\u00ff\u0100\5@!\2\u0100!\3\2\2\2\u0101\u0102"+
		"\5$\23\2\u0102\u0103\5r:\2\u0103\u0104\5(\25\2\u0104\u010a\3\2\2\2\u0105"+
		"\u0106\5$\23\2\u0106\u0107\5r:\2\u0107\u0108\5J&\2\u0108\u010a\3\2\2\2"+
		"\u0109\u0101\3\2\2\2\u0109\u0105\3\2\2\2\u010a#\3\2\2\2\u010b\u010c\5"+
		"\\/\2\u010c\u010d\5\u0092J\2\u010d\u010e\5\\/\2\u010e\u010f\5H%\2\u010f"+
		"\u0116\3\2\2\2\u0110\u0111\5\u0088E\2\u0111\u0112\5\u0092J\2\u0112\u0113"+
		"\5\\/\2\u0113\u0114\5H%\2\u0114\u0116\3\2\2\2\u0115\u010b\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0116%\3\2\2\2\u0117\u011a\5\4\3\2\u0118\u011a\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\'\3\2\2\2\u011b\u011c\b"+
		"\25\1\2\u011c\u0126\5\\/\2\u011d\u0126\5X-\2\u011e\u0126\5Z.\2\u011f\u0126"+
		"\5> \2\u0120\u0126\5F$\2\u0121\u0122\5\u008aF\2\u0122\u0123\5(\25\2\u0123"+
		"\u0124\5\u008cG\2\u0124\u0126\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u011d"+
		"\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0126\u0131\3\2\2\2\u0127\u0128\f\5\2\2\u0128\u0129\5L"+
		"\'\2\u0129\u012a\5(\25\6\u012a\u0130\3\2\2\2\u012b\u012c\f\4\2\2\u012c"+
		"\u012d\5N(\2\u012d\u012e\5(\25\5\u012e\u0130\3\2\2\2\u012f\u0127\3\2\2"+
		"\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132)\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5\u008aF\2\u0135"+
		"\u0136\5J&\2\u0136\u0137\5\u008cG\2\u0137+\3\2\2\2\u0138\u0139\5\u008e"+
		"H\2\u0139\u013a\5\4\3\2\u013a\u013b\5\u0090I\2\u013b\u0140\3\2\2\2\u013c"+
		"\u013d\5\u008eH\2\u013d\u013e\5\u0090I\2\u013e\u0140\3\2\2\2\u013f\u0138"+
		"\3\2\2\2\u013f\u013c\3\2\2\2\u0140-\3\2\2\2\u0141\u0142\5\u0080A\2\u0142"+
		"\u0143\5*\26\2\u0143\u0144\5,\27\2\u0144\u0145\5\60\31\2\u0145/\3\2\2"+
		"\2\u0146\u0147\5\u0082B\2\u0147\u0148\5.\30\2\u0148\u014e\3\2\2\2\u0149"+
		"\u014a\5\u0082B\2\u014a\u014b\5,\27\2\u014b\u014e\3\2\2\2\u014c\u014e"+
		"\3\2\2\2\u014d\u0146\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\61\3\2\2\2\u014f\u0150\5\u0084C\2\u0150\u0151\5*\26\2\u0151\u0152\5,"+
		"\27\2\u0152\u015e\3\2\2\2\u0153\u0154\5\u0086D\2\u0154\u0155\5\u008aF"+
		"\2\u0155\u0156\5\64\33\2\u0156\u0157\5t;\2\u0157\u0158\5J&\2\u0158\u0159"+
		"\5t;\2\u0159\u015a\5\66\34\2\u015a\u015b\5\u008cG\2\u015b\u015c\5,\27"+
		"\2\u015c\u015e\3\2\2\2\u015d\u014f\3\2\2\2\u015d\u0153\3\2\2\2\u015e\63"+
		"\3\2\2\2\u015f\u0162\5\b\5\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162\65\3\2\2\2\u0163\u0166\5\b\5\2\u0164\u0166\3\2\2"+
		"\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\67\3\2\2\2\u0167\u0168"+
		"\5z>\2\u0168\u0169\5\\/\2\u0169\u016a\5\u008aF\2\u016a\u016b\5:\36\2\u016b"+
		"\u016c\5\u008cG\2\u016c\u016d\5,\27\2\u016d9\3\2\2\2\u016e\u016f\5\\/"+
		"\2\u016f\u0170\5<\37\2\u0170\u0173\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u016e"+
		"\3\2\2\2\u0172\u0171\3\2\2\2\u0173;\3\2\2\2\u0174\u0175\5v<\2\u0175\u0176"+
		"\5\\/\2\u0176\u0177\5<\37\2\u0177\u017a\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0174\3\2\2\2\u0179\u0178\3\2\2\2\u017a=\3\2\2\2\u017b\u017c\5\\/\2\u017c"+
		"\u017d\5\u008aF\2\u017d\u017e\5B\"\2\u017e\u017f\5\u008cG\2\u017f?\3\2"+
		"\2\2\u0180\u0181\5~@\2\u0181\u0182\5\\/\2\u0182\u0183\5\u008aF\2\u0183"+
		"\u0184\5B\"\2\u0184\u0185\5\u008cG\2\u0185A\3\2\2\2\u0186\u0187\5(\25"+
		"\2\u0187\u0188\5D#\2\u0188\u0191\3\2\2\2\u0189\u018a\5J&\2\u018a\u018b"+
		"\5D#\2\u018b\u0191\3\2\2\2\u018c\u018d\5\\/\2\u018d\u018e\5D#\2\u018e"+
		"\u0191\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0186\3\2\2\2\u0190\u0189\3\2"+
		"\2\2\u0190\u018c\3\2\2\2\u0190\u018f\3\2\2\2\u0191C\3\2\2\2\u0192\u0193"+
		"\5v<\2\u0193\u0194\5B\"\2\u0194\u0197\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0192\3\2\2\2\u0196\u0195\3\2\2\2\u0197E\3\2\2\2\u0198\u0199\5\\/\2\u0199"+
		"\u019a\5\u0092J\2\u019a\u019b\5\\/\2\u019b\u019c\5H%\2\u019c\u01a3\3\2"+
		"\2\2\u019d\u019e\5\u0088E\2\u019e\u019f\5\u0092J\2\u019f\u01a0\5\\/\2"+
		"\u01a0\u01a1\5H%\2\u01a1\u01a3\3\2\2\2\u01a2\u0198\3\2\2\2\u01a2\u019d"+
		"\3\2\2\2\u01a3G\3\2\2\2\u01a4\u01a5\5\u0092J\2\u01a5\u01a6\5\\/\2\u01a6"+
		"\u01a7\5H%\2\u01a7\u01aa\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a4\3\2\2"+
		"\2\u01a9\u01a8\3\2\2\2\u01aaI\3\2\2\2\u01ab\u01ac\b&\1\2\u01ac\u01b8\5"+
		"\\/\2\u01ad\u01b8\5V,\2\u01ae\u01b8\5> \2\u01af\u01b0\5(\25\2\u01b0\u01b1"+
		"\5P)\2\u01b1\u01b2\5(\25\2\u01b2\u01b8\3\2\2\2\u01b3\u01b4\5\u008aF\2"+
		"\u01b4\u01b5\5J&\2\u01b5\u01b6\5\u008cG\2\u01b6\u01b8\3\2\2\2\u01b7\u01ab"+
		"\3\2\2\2\u01b7\u01ad\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7"+
		"\u01b3\3\2\2\2\u01b8\u01c3\3\2\2\2\u01b9\u01ba\f\5\2\2\u01ba\u01bb\5R"+
		"*\2\u01bb\u01bc\5J&\6\u01bc\u01c2\3\2\2\2\u01bd\u01be\f\4\2\2\u01be\u01bf"+
		"\5T+\2\u01bf\u01c0\5J&\5\u01c0\u01c2\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1"+
		"\u01bd\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4K\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\5b\62\2\u01c7\u01c9"+
		"\5d\63\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9M\3\2\2\2\u01ca"+
		"\u01cd\5f\64\2\u01cb\u01cd\5h\65\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2"+
		"\2\2\u01cdO\3\2\2\2\u01ce\u01d1\5j\66\2\u01cf\u01d1\5l\67\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1Q\3\2\2\2\u01d2\u01d3\5n8\2\u01d3S\3"+
		"\2\2\2\u01d4\u01d5\5p9\2\u01d5U\3\2\2\2\u01d6\u01d9\5^\60\2\u01d7\u01d9"+
		"\5`\61\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9W\3\2\2\2\u01da"+
		"\u01db\7\37\2\2\u01dbY\3\2\2\2\u01dc\u01dd\7 \2\2\u01dd[\3\2\2\2\u01de"+
		"\u01df\7!\2\2\u01df]\3\2\2\2\u01e0\u01e1\7\35\2\2\u01e1_\3\2\2\2\u01e2"+
		"\u01e3\7\36\2\2\u01e3a\3\2\2\2\u01e4\u01e5\7\3\2\2\u01e5c\3\2\2\2\u01e6"+
		"\u01e7\7\4\2\2\u01e7e\3\2\2\2\u01e8\u01e9\7\5\2\2\u01e9g\3\2\2\2\u01ea"+
		"\u01eb\7\6\2\2\u01ebi\3\2\2\2\u01ec\u01ed\7\7\2\2\u01edk\3\2\2\2\u01ee"+
		"\u01ef\7\b\2\2\u01efm\3\2\2\2\u01f0\u01f1\7\t\2\2\u01f1o\3\2\2\2\u01f2"+
		"\u01f3\7\n\2\2\u01f3q\3\2\2\2\u01f4\u01f5\7\13\2\2\u01f5s\3\2\2\2\u01f6"+
		"\u01f7\7\f\2\2\u01f7u\3\2\2\2\u01f8\u01f9\7\r\2\2\u01f9w\3\2\2\2\u01fa"+
		"\u01fb\7\23\2\2\u01fby\3\2\2\2\u01fc\u01fd\7\24\2\2\u01fd{\3\2\2\2\u01fe"+
		"\u01ff\7\25\2\2\u01ff}\3\2\2\2\u0200\u0201\7\26\2\2\u0201\177\3\2\2\2"+
		"\u0202\u0203\7\27\2\2\u0203\u0081\3\2\2\2\u0204\u0205\7\30\2\2\u0205\u0083"+
		"\3\2\2\2\u0206\u0207\7\31\2\2\u0207\u0085\3\2\2\2\u0208\u0209\7\32\2\2"+
		"\u0209\u0087\3\2\2\2\u020a\u020b\7\33\2\2\u020b\u0089\3\2\2\2\u020c\u020d"+
		"\7\16\2\2\u020d\u008b\3\2\2\2\u020e\u020f\7\17\2\2\u020f\u008d\3\2\2\2"+
		"\u0210\u0211\7\20\2\2\u0211\u008f\3\2\2\2\u0212\u0213\7\21\2\2\u0213\u0091"+
		"\3\2\2\2\u0214\u0215\7\22\2\2\u0215\u0093\3\2\2\2$\u009f\u00b0\u00b9\u00c0"+
		"\u00c7\u00d4\u00db\u00e2\u00ef\u00f6\u0109\u0115\u0119\u0125\u012f\u0131"+
		"\u013f\u014d\u015d\u0161\u0165\u0172\u0179\u0190\u0196\u01a2\u01a9\u01b7"+
		"\u01c1\u01c3\u01c8\u01cc\u01d0\u01d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}