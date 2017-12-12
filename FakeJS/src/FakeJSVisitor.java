// Generated from FakeJS.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FakeJSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FakeJSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FakeJSParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(FakeJSParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_cont_stat_SUB}
	 * labeled alternative in {@link FakeJSParser#code_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_cont_stat_SUB(FakeJSParser.Cod_cont_stat_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_cont_if_SUB}
	 * labeled alternative in {@link FakeJSParser#code_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_cont_if_SUB(FakeJSParser.Cod_cont_if_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_cont_loop_SUB}
	 * labeled alternative in {@link FakeJSParser#code_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_cont_loop_SUB(FakeJSParser.Cod_cont_loop_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_cont_func_SUB}
	 * labeled alternative in {@link FakeJSParser#code_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_cont_func_SUB(FakeJSParser.Cod_cont_func_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_dclr_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_dclr_SUB(FakeJSParser.Cod_stat_dclr_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_asn_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_asn_SUB(FakeJSParser.Cod_stat_asn_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_dclr_asn_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_dclr_asn_SUB(FakeJSParser.Cod_stat_dclr_asn_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_bool_asn_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_bool_asn_SUB(FakeJSParser.Cod_stat_bool_asn_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_bool_dclr_asn_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_bool_dclr_asn_SUB(FakeJSParser.Cod_stat_bool_dclr_asn_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_func_exe_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_func_exe_SUB(FakeJSParser.Cod_stat_func_exe_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_ret_a_e_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_ret_a_e_SUB(FakeJSParser.Cod_stat_ret_a_e_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_ret_c_e_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_ret_c_e_SUB(FakeJSParser.Cod_stat_ret_c_e_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_new_asn_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_new_asn_SUB(FakeJSParser.Cod_stat_new_asn_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_new_dclr_asn_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_new_dclr_asn_SUB(FakeJSParser.Cod_stat_new_dclr_asn_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cod_stat_obj_asn_SUB}
	 * labeled alternative in {@link FakeJSParser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod_stat_obj_asn_SUB(FakeJSParser.Cod_stat_obj_asn_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclr_m_SUB}
	 * labeled alternative in {@link FakeJSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclr_m_SUB(FakeJSParser.Dclr_m_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclr_s_SUB}
	 * labeled alternative in {@link FakeJSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclr_s_SUB(FakeJSParser.Dclr_s_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclrP_SUB}
	 * labeled alternative in {@link FakeJSParser#declarationP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclrP_SUB(FakeJSParser.DclrP_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclrP_END}
	 * labeled alternative in {@link FakeJSParser#declarationP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclrP_END(FakeJSParser.DclrP_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asn_m_SUB}
	 * labeled alternative in {@link FakeJSParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsn_m_SUB(FakeJSParser.Asn_m_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asn_s_SUB}
	 * labeled alternative in {@link FakeJSParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsn_s_SUB(FakeJSParser.Asn_s_SUBContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#assignmentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentP(FakeJSParser.AssignmentPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclr_asn_m_SUB}
	 * labeled alternative in {@link FakeJSParser#declaration_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclr_asn_m_SUB(FakeJSParser.Dclr_asn_m_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclr_asn_s_SUB}
	 * labeled alternative in {@link FakeJSParser#declaration_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclr_asn_s_SUB(FakeJSParser.Dclr_asn_s_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclr_asnP_SUB}
	 * labeled alternative in {@link FakeJSParser#declaration_assignmentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclr_asnP_SUB(FakeJSParser.Dclr_asnP_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dclr_asnP_END}
	 * labeled alternative in {@link FakeJSParser#declaration_assignmentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclr_asnP_END(FakeJSParser.Dclr_asnP_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_asn_m_SUB}
	 * labeled alternative in {@link FakeJSParser#boolean_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_asn_m_SUB(FakeJSParser.Bool_asn_m_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_asn_s_SUB}
	 * labeled alternative in {@link FakeJSParser#boolean_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_asn_s_SUB(FakeJSParser.Bool_asn_s_SUBContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#boolean_assignmentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_assignmentP(FakeJSParser.Boolean_assignmentPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_dclr_asn_m_SUB}
	 * labeled alternative in {@link FakeJSParser#boolean_declaration_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_dclr_asn_m_SUB(FakeJSParser.Bool_dclr_asn_m_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_dclr_asn_s_SUB}
	 * labeled alternative in {@link FakeJSParser#boolean_declaration_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_dclr_asn_s_SUB(FakeJSParser.Bool_dclr_asn_s_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_dclr_asnP_SUB}
	 * labeled alternative in {@link FakeJSParser#boolean_declaration_assignmentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_dclr_asnP_SUB(FakeJSParser.Bool_dclr_asnP_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_dclr_asnP_END}
	 * labeled alternative in {@link FakeJSParser#boolean_declaration_assignmentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_dclr_asnP_END(FakeJSParser.Bool_dclr_asnP_ENDContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#new_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_assignment(FakeJSParser.New_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#new_declaration_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_declaration_assignment(FakeJSParser.New_declaration_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_asn_a_e_SUB}
	 * labeled alternative in {@link FakeJSParser#object_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_asn_a_e_SUB(FakeJSParser.Obj_asn_a_e_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_asn_c_e_SUB}
	 * labeled alternative in {@link FakeJSParser#object_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_asn_c_e_SUB(FakeJSParser.Obj_asn_c_e_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_prp_asn_id_SUB}
	 * labeled alternative in {@link FakeJSParser#object_property_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_prp_asn_id_SUB(FakeJSParser.Obj_prp_asn_id_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_prp_asn_this_SUB}
	 * labeled alternative in {@link FakeJSParser#object_property_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_prp_asn_this_SUB(FakeJSParser.Obj_prp_asn_this_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code code_block_SUB}
	 * labeled alternative in {@link FakeJSParser#code_blockP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block_SUB(FakeJSParser.Code_block_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code code_block_END}
	 * labeled alternative in {@link FakeJSParser#code_blockP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block_END(FakeJSParser.Code_block_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_obj_prp_ATOM}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_obj_prp_ATOM(FakeJSParser.A_e_obj_prp_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_t1_SUB}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_t1_SUB(FakeJSParser.A_e_t1_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_int_ATOM}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_int_ATOM(FakeJSParser.A_e_int_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_id_ATOM}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_id_ATOM(FakeJSParser.A_e_id_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_func_exe_ATOM}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_func_exe_ATOM(FakeJSParser.A_e_func_exe_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_t2_SUB}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_t2_SUB(FakeJSParser.A_e_t2_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_brkt_SUB}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_brkt_SUB(FakeJSParser.A_e_brkt_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a_e_str_ATOM}
	 * labeled alternative in {@link FakeJSParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_e_str_ATOM(FakeJSParser.A_e_str_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#estimation_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstimation_block(FakeJSParser.Estimation_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub_cod_block_SUB}
	 * labeled alternative in {@link FakeJSParser#sub_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_cod_block_SUB(FakeJSParser.Sub_cod_block_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub_cod_block_epsl_SUB}
	 * labeled alternative in {@link FakeJSParser#sub_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_cod_block_epsl_SUB(FakeJSParser.Sub_cod_block_epsl_SUBContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(FakeJSParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_block_else_if_SUB}
	 * labeled alternative in {@link FakeJSParser#sub_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block_else_if_SUB(FakeJSParser.If_block_else_if_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_block_else_SUB}
	 * labeled alternative in {@link FakeJSParser#sub_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block_else_SUB(FakeJSParser.If_block_else_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_block_END}
	 * labeled alternative in {@link FakeJSParser#sub_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block_END(FakeJSParser.If_block_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_block_while_SUB}
	 * labeled alternative in {@link FakeJSParser#loop_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_block_while_SUB(FakeJSParser.Loop_block_while_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_block_for_SUB}
	 * labeled alternative in {@link FakeJSParser#loop_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_block_for_SUB(FakeJSParser.Loop_block_for_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loop_prestatement_SUB}
	 * labeled alternative in {@link FakeJSParser#for_loop_prestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_prestatement_SUB(FakeJSParser.For_loop_prestatement_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loop_prestatement_END}
	 * labeled alternative in {@link FakeJSParser#for_loop_prestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_prestatement_END(FakeJSParser.For_loop_prestatement_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loop_wrap_SUB}
	 * labeled alternative in {@link FakeJSParser#for_loop_wrap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_wrap_SUB(FakeJSParser.For_loop_wrap_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loop_wrap_END}
	 * labeled alternative in {@link FakeJSParser#for_loop_wrap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_wrap_END(FakeJSParser.For_loop_wrap_ENDContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(FakeJSParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_def_arg_SUB}
	 * labeled alternative in {@link FakeJSParser#function_definition_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_arg_SUB(FakeJSParser.Func_def_arg_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_def_arg_END}
	 * labeled alternative in {@link FakeJSParser#function_definition_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_arg_END(FakeJSParser.Func_def_arg_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_def_argP_SUB}
	 * labeled alternative in {@link FakeJSParser#function_definition_argumentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_argP_SUB(FakeJSParser.Func_def_argP_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_def_argP_END}
	 * labeled alternative in {@link FakeJSParser#function_definition_argumentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_argP_END(FakeJSParser.Func_def_argP_ENDContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#function_execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_execution(FakeJSParser.Function_executionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#constructor_execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_execution(FakeJSParser.Constructor_executionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_exe_arg_a_e_SUB}
	 * labeled alternative in {@link FakeJSParser#function_execution_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_exe_arg_a_e_SUB(FakeJSParser.Func_exe_arg_a_e_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_exe_arg_c_e_SUB}
	 * labeled alternative in {@link FakeJSParser#function_execution_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_exe_arg_c_e_SUB(FakeJSParser.Func_exe_arg_c_e_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_exe_arg_id_SUB}
	 * labeled alternative in {@link FakeJSParser#function_execution_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_exe_arg_id_SUB(FakeJSParser.Func_exe_arg_id_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_exe_arg_END}
	 * labeled alternative in {@link FakeJSParser#function_execution_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_exe_arg_END(FakeJSParser.Func_exe_arg_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_exe_argP_SUB}
	 * labeled alternative in {@link FakeJSParser#function_execution_argumentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_exe_argP_SUB(FakeJSParser.Func_exe_argP_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_exe_argP_END}
	 * labeled alternative in {@link FakeJSParser#function_execution_argumentP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_exe_argP_END(FakeJSParser.Func_exe_argP_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_prp_id_SUB}
	 * labeled alternative in {@link FakeJSParser#object_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_prp_id_SUB(FakeJSParser.Obj_prp_id_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_prp_this_SUB}
	 * labeled alternative in {@link FakeJSParser#object_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_prp_this_SUB(FakeJSParser.Obj_prp_this_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_prpP_SUB}
	 * labeled alternative in {@link FakeJSParser#object_propertyP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_prpP_SUB(FakeJSParser.Obj_prpP_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj_prpP_END}
	 * labeled alternative in {@link FakeJSParser#object_propertyP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_prpP_END(FakeJSParser.Obj_prpP_ENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_e_bool_ATOM}
	 * labeled alternative in {@link FakeJSParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_bool_ATOM(FakeJSParser.C_e_bool_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_e_id_ATOM}
	 * labeled alternative in {@link FakeJSParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_id_ATOM(FakeJSParser.C_e_id_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_e_t7_SUB}
	 * labeled alternative in {@link FakeJSParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_t7_SUB(FakeJSParser.C_e_t7_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_e_t6_SUB}
	 * labeled alternative in {@link FakeJSParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_t6_SUB(FakeJSParser.C_e_t6_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_e_t2_SUB}
	 * labeled alternative in {@link FakeJSParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_t2_SUB(FakeJSParser.C_e_t2_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_e_func_exe_ATOM}
	 * labeled alternative in {@link FakeJSParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_func_exe_ATOM(FakeJSParser.C_e_func_exe_ATOMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_e_brkt_SUB}
	 * labeled alternative in {@link FakeJSParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_brkt_SUB(FakeJSParser.C_e_brkt_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link FakeJSParser#t1_math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(FakeJSParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link FakeJSParser#t1_math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(FakeJSParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link FakeJSParser#t2_math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(FakeJSParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link FakeJSParser#t2_math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(FakeJSParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eql_eql}
	 * labeled alternative in {@link FakeJSParser#t2_comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEql_eql(FakeJSParser.Eql_eqlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_eql}
	 * labeled alternative in {@link FakeJSParser#t2_comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_eql(FakeJSParser.Not_eqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#t6_comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT6_comp_operator(FakeJSParser.T6_comp_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#t7_comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT7_comp_operator(FakeJSParser.T7_comp_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sl_boolean_true_SUB}
	 * labeled alternative in {@link FakeJSParser#sl_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_boolean_true_SUB(FakeJSParser.Sl_boolean_true_SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sl_boolean_false_SUB}
	 * labeled alternative in {@link FakeJSParser#sl_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_boolean_false_SUB(FakeJSParser.Sl_boolean_false_SUBContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(FakeJSParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(FakeJSParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(FakeJSParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_true(FakeJSParser.Sl_trueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_false(FakeJSParser.Sl_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(FakeJSParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(FakeJSParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(FakeJSParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#subtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(FakeJSParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#equal_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_equal(FakeJSParser.Equal_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#not_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal(FakeJSParser.Not_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#and_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_and(FakeJSParser.And_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#or_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_or(FakeJSParser.Or_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(FakeJSParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(FakeJSParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(FakeJSParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FakeJSParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FakeJSParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_return(FakeJSParser.Sl_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_new(FakeJSParser.Sl_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_if(FakeJSParser.Sl_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_else(FakeJSParser.Sl_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_while(FakeJSParser.Sl_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_for(FakeJSParser.Sl_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#sl_this}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_this(FakeJSParser.Sl_thisContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#l_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_bracket(FakeJSParser.L_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#r_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_bracket(FakeJSParser.R_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#l_curv_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_curv_bracket(FakeJSParser.L_curv_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#r_curv_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_curv_bracket(FakeJSParser.R_curv_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link FakeJSParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(FakeJSParser.DotContext ctx);
}