grammar FakeJS;
import FakeJSCommonLexer;

start
	:code_block
;

code_block
	:code_content code_blockP
;

code_content	//Incomplete
	:code_statement semicolon	#cod_cont_stat_SUB
	|if_block #cod_cont_if_SUB
	|loop_block #cod_cont_loop_SUB
	|function_definition	#cod_cont_func_SUB
;

code_statement	//Incomplete
	:declaration	#cod_stat_dclr_SUB
	|assignment #cod_stat_asn_SUB
	|declaration_assignment	#cod_stat_dclr_asn_SUB
	|boolean_assignment #cod_stat_bool_asn_SUB
	|boolean_declaration_assignment #cod_stat_bool_dclr_asn_SUB
	|function_execution	#cod_stat_func_exe_SUB
	|sl_return arithmetic_expression	#cod_stat_ret_a_e_SUB
	|sl_return comparison_expression	#cod_stat_ret_c_e_SUB
	|new_assignment	#cod_stat_new_asn_SUB
	|new_declaration_assignment	#cod_stat_new_dclr_asn_SUB
	|object_assignment	#cod_stat_obj_asn_SUB
;

declaration
	:var id declarationP	#dclr_m_SUB
	|var id	#dclr_s_SUB
;

declarationP
	:comma id declarationP	#dclrP_SUB
	|	#dclrP_END
;

assignment
	:assignmentP comma assignment	#asn_m_SUB
	|assignmentP	#asn_s_SUB
;

assignmentP
	:id equal arithmetic_expression
;

declaration_assignment
	:var assignmentP declaration_assignmentP	#dclr_asn_m_SUB
	|var assignmentP	#dclr_asn_s_SUB
;

declaration_assignmentP
	:comma assignmentP declaration_assignmentP	#dclr_asnP_SUB
	|	#dclr_asnP_END
;

boolean_assignment
	:boolean_assignmentP comma boolean_assignment	#bool_asn_m_SUB
	|boolean_assignmentP	#bool_asn_s_SUB
;

boolean_assignmentP
	:id equal comparison_expression
;

boolean_declaration_assignment
	:var boolean_assignmentP boolean_declaration_assignmentP	#bool_dclr_asn_m_SUB
	|var boolean_assignmentP	#bool_dclr_asn_s_SUB
;

boolean_declaration_assignmentP
	:comma boolean_assignmentP boolean_declaration_assignmentP	#bool_dclr_asnP_SUB
	|	#bool_dclr_asnP_END
;

new_assignment
	:id equal constructor_execution
;

new_declaration_assignment
	:var id equal constructor_execution
;

object_assignment
	:object_property_assignment equal arithmetic_expression	#obj_asn_a_e_SUB
	|object_property_assignment equal comparison_expression	#obj_asn_c_e_SUB
;

object_property_assignment
	:id dot id object_propertyP	#obj_prp_asn_id_SUB
	|sl_this dot id object_propertyP	#obj_prp_asn_this_SUB
;

code_blockP
	:code_block	#code_block_SUB
	|	#code_block_END
;

arithmetic_expression	//Incomplete
	:id	#a_e_id_ATOM
	|integer	#a_e_int_ATOM
	|string	#a_e_str_ATOM
	|function_execution	#a_e_func_exe_ATOM
	|object_property	#a_e_obj_prp_ATOM
	|arithmetic_expression t1_math_operator arithmetic_expression	#a_e_t1_SUB
	|arithmetic_expression t2_math_operator arithmetic_expression	#a_e_t2_SUB
	|l_bracket arithmetic_expression r_bracket	#a_e_brkt_SUB
;	

estimation_block 
	:l_bracket comparison_expression r_bracket
;
	
sub_code_block
	:l_curv_bracket code_block r_curv_bracket	#sub_cod_block_SUB
	|l_curv_bracket r_curv_bracket	#sub_cod_block_epsl_SUB
;

if_block
	:sl_if estimation_block sub_code_block sub_if_block
;
	
sub_if_block
	:sl_else if_block	#if_block_else_if_SUB
	|sl_else sub_code_block	#if_block_else_SUB
	|	#if_block_END
;

loop_block
	:sl_while estimation_block sub_code_block	#loop_block_while_SUB
	|sl_for l_bracket for_loop_prestatement semicolon comparison_expression semicolon for_loop_wrap r_bracket sub_code_block	#loop_block_for_SUB //incomplete
;

for_loop_prestatement	//incomplete
	:code_statement	#for_loop_prestatement_SUB
	|	#for_loop_prestatement_END
;

for_loop_wrap	//incomplete
	:code_statement	#for_loop_wrap_SUB
	|	#for_loop_wrap_END
;

function_definition
	:function id l_bracket function_definition_argument r_bracket sub_code_block
;

function_definition_argument
	:id function_definition_argumentP	#func_def_arg_SUB
	|	#func_def_arg_END
;

function_definition_argumentP
	:comma id function_definition_argumentP	#func_def_argP_SUB
	|	#func_def_argP_END
;

function_execution
	:id l_bracket function_execution_argument r_bracket 
;

constructor_execution
	:sl_new id l_bracket function_execution_argument r_bracket
;

function_execution_argument
	:arithmetic_expression function_execution_argumentP	#func_exe_arg_a_e_SUB
	|comparison_expression function_execution_argumentP	#func_exe_arg_c_e_SUB
	|id function_execution_argumentP	#func_exe_arg_id_SUB
	|	#func_exe_arg_END
;

function_execution_argumentP
	:comma function_execution_argument	#func_exe_argP_SUB
	|	#func_exe_argP_END
;

object_property
	:id dot id object_propertyP	#obj_prp_id_SUB
	|sl_this dot id object_propertyP	#obj_prp_this_SUB
;

object_propertyP
	:dot id object_propertyP	#obj_prpP_SUB
	|	#obj_prpP_END
;

comparison_expression	//Incomplete
	:id	#c_e_id_ATOM
	|sl_boolean	#c_e_bool_ATOM
	|function_execution	#c_e_func_exe_ATOM
	|arithmetic_expression t2_comp_operator arithmetic_expression	#c_e_t2_SUB
	|comparison_expression t6_comp_operator comparison_expression	#c_e_t6_SUB
	|comparison_expression t7_comp_operator comparison_expression	#c_e_t7_SUB
	|l_bracket comparison_expression r_bracket	#c_e_brkt_SUB
;

t1_math_operator
	:multiplication	#mul
	|division	#div	
;

t2_math_operator
	:addition	#add
	|subtraction	#sub
;

t2_comp_operator
	:equal_equal	#eql_eql
	|not_equal	#not_eql
;

t6_comp_operator
	:and_and
;

t7_comp_operator
	:or_or
;

sl_boolean
	:sl_true	#sl_boolean_true_SUB
	|sl_false	#sl_boolean_false_SUB
;

//Additional Expression On Tokens For Parse Tree
integer	:INTEGER;
string	:STRING;
id	:ID;
sl_true	:TRUE;
sl_false	:FALSE;

multiplication	:MUL;
division	:DIV;
addition	:ADD;
subtraction	:SUB;
equal_equal	:EQL_EQL;
not_equal	:NOT_EQL;
and_and	:AND_AND;
or_or	:OR_OR;
equal	:EQL;

semicolon	:SEMICOLON;
comma	:COMMA;
var	:VAR;
function	:FUNCTION;
sl_return	:RETURN;
sl_new	:NEW;
sl_if	:IF;
sl_else	:ELSE;
sl_while	:WHILE;
sl_for	:FOR;
sl_this	:THIS;
l_bracket	:L_BRACKET;
r_bracket	:R_BRACKET;
l_curv_bracket	:L_CURV_BRACKET;
r_curv_bracket	:R_CURV_BRACKET;
dot	:DOT;
