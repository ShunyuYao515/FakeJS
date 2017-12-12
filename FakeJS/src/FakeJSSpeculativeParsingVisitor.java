import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class FakeJSSpeculativeParsingVisitor extends FakeJSBaseVisitor<FakeJSValue> {
	
	HashMap<String, FakeJSValue> scopeTT = new HashMap<String, FakeJSValue>();
	
	@Override public FakeJSValue visitCode_block(FakeJSParser.Code_blockContext ctx) {
		
		visit(ctx.code_content());
		visit(ctx.code_blockP());
		HashMap<String, FakeJSValue> scopeT = scopeTT;
		FakeJSValue scope = new FakeJSScope(scopeT);
		return scope;
		
	}
	
	@Override public FakeJSValue visitCod_cont_stat_SUB(FakeJSParser.Cod_cont_stat_SUBContext ctx){
		visit(ctx.code_statement());
		return null;
	}
	
	@Override public FakeJSValue visitCod_cont_if_SUB(FakeJSParser.Cod_cont_if_SUBContext ctx){
		visit(ctx.if_block());
		return null;
	}
	
	@Override public FakeJSValue visitCod_cont_loop_SUB(FakeJSParser.Cod_cont_loop_SUBContext ctx){
		visit(ctx.loop_block());
		return null;
	}
	
	@Override public FakeJSValue visitCod_cont_func_SUB(FakeJSParser.Cod_cont_func_SUBContext ctx){
		visit(ctx.function_definition());
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_asn_SUB(FakeJSParser.Cod_stat_asn_SUBContext ctx) {
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_bool_asn_SUB(FakeJSParser.Cod_stat_bool_asn_SUBContext ctx) {
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_dclr_SUB(FakeJSParser.Cod_stat_dclr_SUBContext ctx) {
		visit(ctx.declaration());
		return null;
	}
	
	@Override public FakeJSValue visitDclr_m_SUB(FakeJSParser.Dclr_m_SUBContext ctx){
		String id = ctx.id().ID().getText();
		scopeTT.put(id, null);
		
		visit(ctx.declarationP());
		return null;
	}
	
	@Override public FakeJSValue visitDclr_s_SUB(FakeJSParser.Dclr_s_SUBContext ctx) {
		String id = ctx.id().ID().getText();

		scopeTT.put(id, null);
		return null;
	}
	
	@Override public FakeJSValue visitDclrP_SUB(FakeJSParser.DclrP_SUBContext ctx) {
		String id = ctx.id().ID().getText();
		
		scopeTT.put(id, null);
		visit(ctx.declarationP());
		return null;
	}

	@Override public FakeJSValue visitCod_stat_dclr_asn_SUB(FakeJSParser.Cod_stat_dclr_asn_SUBContext ctx) {
		visit(ctx.declaration_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitDclr_asn_m_SUB(FakeJSParser.Dclr_asn_m_SUBContext ctx) {
		visit(ctx.assignmentP());
		visit(ctx.declaration_assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitDclr_asn_s_SUB(FakeJSParser.Dclr_asn_s_SUBContext ctx) {
		visit(ctx.assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitDclr_asnP_SUB(FakeJSParser.Dclr_asnP_SUBContext ctx) {
		visit(ctx.assignmentP());
		visit(ctx.declaration_assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitAssignmentP(FakeJSParser.AssignmentPContext ctx){
		String id = ctx.id().ID().getText();
		
		scopeTT.put(id, null);
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_bool_dclr_asn_SUB(FakeJSParser.Cod_stat_bool_dclr_asn_SUBContext ctx) {
		visit(ctx.boolean_declaration_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitBool_dclr_asn_m_SUB(FakeJSParser.Bool_dclr_asn_m_SUBContext ctx) {
		visit(ctx.boolean_assignmentP());
		visit(ctx.boolean_declaration_assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitBool_dclr_asn_s_SUB(FakeJSParser.Bool_dclr_asn_s_SUBContext ctx) {
		visit(ctx.boolean_assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitBool_dclr_asnP_SUB(FakeJSParser.Bool_dclr_asnP_SUBContext ctx) {
		visit(ctx.boolean_assignmentP());
		visit(ctx.boolean_declaration_assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_new_dclr_asn_SUB(FakeJSParser.Cod_stat_new_dclr_asn_SUBContext ctx){
		visit(ctx.new_declaration_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitNew_declaration_assignment(FakeJSParser.New_declaration_assignmentContext ctx){
		String id = ctx.id().ID().getText();
		
		scopeTT.put(id, null);
		return null;
	}
	
	@Override public FakeJSValue visitBoolean_assignmentP(FakeJSParser.Boolean_assignmentPContext ctx) {
		String id = ctx.id().ID().getText();
		
		scopeTT.put(id, null);
		return null;
	}
	
	@Override public FakeJSValue visitIf_block(FakeJSParser.If_blockContext ctx) {
		visit(ctx.sub_code_block());
		visit(ctx.sub_if_block());
		return null;
	}
	
	@Override public FakeJSValue visitIf_block_else_if_SUB(FakeJSParser.If_block_else_if_SUBContext ctx){
		visit(ctx.if_block());
		return null;
	}
	
	@Override public FakeJSValue visitIf_block_else_SUB(FakeJSParser.If_block_else_SUBContext ctx){
		visit(ctx.sub_code_block());
		return null;
	}
	
	@Override public FakeJSValue visitSub_cod_block_SUB(FakeJSParser.Sub_cod_block_SUBContext ctx){
		visit(ctx.code_block());
		return null;
	}
	
	@Override public FakeJSValue visitLoop_block_while_SUB(FakeJSParser.Loop_block_while_SUBContext ctx){
		visit(ctx.sub_code_block());
		return null;
	}
	
	@Override public FakeJSValue visitLoop_block_for_SUB(FakeJSParser.Loop_block_for_SUBContext ctx){
		visit(ctx.for_loop_prestatement());
		visit(ctx.for_loop_wrap());
		visit(ctx.sub_code_block());
		return null;
	}
	
	@Override public FakeJSValue visitFor_loop_prestatement_SUB(FakeJSParser.For_loop_prestatement_SUBContext ctx){
		visit(ctx.code_statement());
		return null;
	}
	
	@Override public FakeJSValue visitFor_loop_wrap_SUB(FakeJSParser.For_loop_wrap_SUBContext ctx){
		visit(ctx.code_statement());
		return null;
	}
	
	@Override public FakeJSValue visitFunction_definition(FakeJSParser.Function_definitionContext ctx){
		String id = ctx.id().ID().getText();
		
		scopeTT.put(id, null);
		return null;
	}
}


