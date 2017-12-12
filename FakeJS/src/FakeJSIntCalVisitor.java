// Template Generated from FakeJS.g4 by ANTLR 4.5.3
// Editted by David Yao
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class FakeJSIntCalVisitor extends FakeJSBaseVisitor<FakeJSValue> {
	
	Map<Integer, HashMap<String, FakeJSValue>> scopeSequence = new HashMap<Integer, HashMap<String, FakeJSValue>>();
	
	@Override public FakeJSValue visitStart(FakeJSParser.StartContext ctx) {
		ParseTree speculativeTreeInit = ctx.getChild(0);
		
		FakeJSSpeculativeParsingVisitor visitor = new FakeJSSpeculativeParsingVisitor();
		FakeJSScope scopeInitT = (FakeJSScope)visitor.visit(speculativeTreeInit);
		HashMap<String, FakeJSValue>scopeInit = scopeInitT.getVal();
		scopeInit.put("this", new FakeJSWindow(new HashMap<String, FakeJSValue>(), new HashMap<String, FakeJSFunction>()));
		scopeInit.put("Window", new FakeJSFunction(new FakeJSInt_FakeJSValue_HashMap(null), null));
		scopeInit.put("Object", new FakeJSFunction(new FakeJSInt_FakeJSValue_HashMap(null), null));
		scopeSequence.put(new Integer(1), scopeInit);
		
		visit(ctx.code_block());
		
		HashMap<String, FakeJSValue> globalScope = scopeSequence.get(new Integer(1));
		for(String key:globalScope.keySet()){
			if(globalScope.get(key).getValue() != null)
				System.out.println(key+"="+globalScope.get(key).getValue().toString());
			else
				System.out.println(key+"="+ "null");
		}
		return null;
	}
	
	@Override public FakeJSValue visitCode_block(FakeJSParser.Code_blockContext ctx) {
		FakeJSValue ret = visit(ctx.code_content());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return visit(ctx.code_blockP());
	}
	
	@Override public FakeJSValue visitCod_cont_stat_SUB(FakeJSParser.Cod_cont_stat_SUBContext ctx){
		FakeJSValue ret = visit(ctx.code_statement());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return null;
	}
	
	@Override public FakeJSValue visitCod_stat_dclr_SUB(FakeJSParser.Cod_stat_dclr_SUBContext ctx) {
		visit(ctx.declaration());
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_asn_SUB(FakeJSParser.Cod_stat_asn_SUBContext ctx) {
		visit(ctx.assignment());
		return null;
	}

	@Override public FakeJSValue visitCod_stat_dclr_asn_SUB(FakeJSParser.Cod_stat_dclr_asn_SUBContext ctx) {
		visit(ctx.declaration_assignment());
		return null;

	}
	
	@Override public FakeJSValue visitCod_stat_bool_asn_SUB(FakeJSParser.Cod_stat_bool_asn_SUBContext ctx) {
		visit(ctx.boolean_assignment());
		return null;
	}

	@Override public FakeJSValue visitCod_stat_bool_dclr_asn_SUB(FakeJSParser.Cod_stat_bool_dclr_asn_SUBContext ctx) {
		visit(ctx.boolean_declaration_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_func_exe_SUB(FakeJSParser.Cod_stat_func_exe_SUBContext ctx){
		visit(ctx.function_execution());
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_ret_a_e_SUB(FakeJSParser.Cod_stat_ret_a_e_SUBContext ctx){
		if(scopeSequence.size() > 1)
			return new FakeJSReturn(visit(ctx.arithmetic_expression()));
		else{
			System.out.println("Global Return currently not valid, on construction;");
			return null;
		}
	}
	
	@Override public FakeJSValue visitCod_stat_ret_c_e_SUB(FakeJSParser.Cod_stat_ret_c_e_SUBContext ctx){
		if(scopeSequence.size() > 1)
			return new FakeJSReturn(visit(ctx.comparison_expression()));
		else{
			System.out.println("Global Return currently not valid, on construction;");
			return null;
		}
	}
	
	@Override public FakeJSValue visitCod_stat_new_asn_SUB(FakeJSParser.Cod_stat_new_asn_SUBContext ctx){
		visit(ctx.new_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_new_dclr_asn_SUB(FakeJSParser.Cod_stat_new_dclr_asn_SUBContext ctx){
		visit(ctx.new_declaration_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitCod_stat_obj_asn_SUB(FakeJSParser.Cod_stat_obj_asn_SUBContext ctx){
		visit(ctx.object_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitDclr_m_SUB(FakeJSParser.Dclr_m_SUBContext ctx) {
/*		String id = ctx.id().ID().getText();
		int scopeInd = scopeSequence.size();
		
		for(int retroCount = scopeInd; retroCount > 0; retroCount --){
			HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(retroCount));
			if(scope.containsKey(id))
				return null;
			//In construction
		}
		
		HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(scopeInd));
		scope.put(id, null);
		scopeSequence.replace(new Integer(scopeInd),scope);
		
		visit(ctx.declarationP());*/
		return null;//Transcription
	}
	
	@Override public FakeJSValue visitDclr_s_SUB(FakeJSParser.Dclr_s_SUBContext ctx) {
/*		String id = ctx.id().ID().getText();
		
		int scopeInd = scopeSequence.size();
		HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(scopeInd));
		scope.put(id, null);
		scopeSequence.replace(new Integer(scopeInd),scope);*/
		//Transcription
		return null;
	}
	
	@Override public FakeJSValue visitDclrP_SUB(FakeJSParser.DclrP_SUBContext ctx) {
/*		String id = ctx.id().ID().getText();
		
		int scopeInd = scopeSequence.size();
		HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(scopeInd));
		scope.put(id, null);
		scopeSequence.replace(new Integer(scopeInd),scope);
		
		visit(ctx.declarationP());*/
		//Transcription
		return null;
	}
	
	@Override public FakeJSValue visitAsn_m_SUB(FakeJSParser.Asn_m_SUBContext ctx) {
		visit(ctx.assignmentP());
		visit(ctx.assignment());
		return null;
	}
	
	@Override public FakeJSValue visitAsn_s_SUB(FakeJSParser.Asn_s_SUBContext ctx) {
		visit(ctx.assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitAssignmentP(FakeJSParser.AssignmentPContext ctx) {
		String id = ctx.id().ID().getText();
		FakeJSValue valT = visit(ctx.arithmetic_expression());
		int scopeInd = scopeSequence.size();
		if(valT instanceof FakeJSString){
			FakeJSString val = (FakeJSString)valT;
			
			for(int retroCount = scopeInd; retroCount > 0; retroCount --){
				HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(retroCount));
				if(scope.containsKey(id)){
					scope.replace(id, val);
					scopeSequence.replace(new Integer(retroCount),scope);
					return null;
				}
			}
			HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(1));
			scope.put(id, val);
			scopeSequence.replace(new Integer(1), scope);
			return null;
		}
		else if(valT instanceof FakeJSNumber){
			FakeJSNumber val = (FakeJSNumber)valT;
			
			for(int retroCount = scopeInd; retroCount > 0; retroCount --){
				HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(retroCount));
				if(scope.containsKey(id)){
					scope.replace(id, val);
					scopeSequence.replace(new Integer(retroCount),scope);
					return null;
				}
			}
			HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(1));
			scope.put(id, val);
			scopeSequence.replace(new Integer(1), scope);
			return null;
		}
		else
			System.out.println("AssignmentP INSTANCE error on " + id + ";");
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
	
	@Override public FakeJSValue visitBool_asn_m_SUB(FakeJSParser.Bool_asn_m_SUBContext ctx) {
		visit(ctx.boolean_assignmentP());
		visit(ctx.boolean_assignment());
		return null;
	}
	
	@Override public FakeJSValue visitBool_asn_s_SUB(FakeJSParser.Bool_asn_s_SUBContext ctx) {
		visit(ctx.boolean_assignmentP());
		return null;
	}
	
	@Override public FakeJSValue visitBoolean_assignmentP(FakeJSParser.Boolean_assignmentPContext ctx) {
		String id = ctx.id().ID().getText();
		FakeJSValue valT = visit(ctx.comparison_expression());
		int scopeInd = scopeSequence.size();
		if(valT instanceof FakeJSBool){
			FakeJSBool val = (FakeJSBool)valT;
			
			for(int retroCount = scopeInd; retroCount > 0; retroCount --){
				HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(retroCount));
				if(scope.containsKey(id)){
					scope.replace(id, val);
					scopeSequence.replace(new Integer(retroCount),scope);
					return null;
				}
			}
			HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(1));
			scope.put(id, val);
			scopeSequence.replace(new Integer(1), scope);
			return null;
		}
		else
			System.out.println("Boolean AssignmentP INSTANCE error on " + id + ";");
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
	
	@Override public FakeJSValue visitNew_assignment(FakeJSParser.New_assignmentContext ctx){
		FakeJSValue idTT = visit(ctx.id());
		if(idTT instanceof FakeJSString){
			FakeJSString idT = (FakeJSString)idTT;
			String id = idT.getVal();
			
			FakeJSValue objectT = visit(ctx.constructor_execution());
			if(objectT instanceof FakeJSObject){
				FakeJSObject object = (FakeJSObject)objectT;
				int scopeIndP = scopeSequence.size();
				for(int retroCount = scopeIndP; retroCount > 0; retroCount --){
					HashMap<String, FakeJSValue> currentScope = scopeSequence.get(retroCount);
					if(currentScope.containsKey(id)){
						currentScope.replace(id, object);
						scopeSequence.replace(retroCount, currentScope);
						return null;
					}
				}
				HashMap<String, FakeJSValue> scopeP = scopeSequence.get(scopeIndP);
				scopeP.put(id, object);
				scopeSequence.replace(scopeIndP, scopeP);
				return null;
			}
			else{
				System.out.println("New Assignment Function Execution return INSTANCE error: not an Object;");
				return null;
			}
		}
		else{
			System.out.println("New Assignment ID INSTANCE error on " + idTT.getValue().toString() + ";");
			return null;
		}
	}
	
	@Override public FakeJSValue visitNew_declaration_assignment(FakeJSParser.New_declaration_assignmentContext ctx){
		FakeJSValue idTT = visit(ctx.id());
		if(idTT instanceof FakeJSString){
			FakeJSString idT = (FakeJSString)idTT;
			String id = idT.getVal();
				
			FakeJSValue objectT = visit(ctx.constructor_execution());
			if(objectT instanceof FakeJSObject){
				FakeJSObject object = (FakeJSObject)objectT;
				int scopeIndP = scopeSequence.size();
				HashMap<String, FakeJSValue> scopeP = scopeSequence.get(scopeIndP);
				scopeP.put(id, object);
				scopeSequence.replace(scopeIndP, scopeP);
				return null;
			}
			else{
				System.out.println("New Assignment Function Execution return INSTANCE error: not an Object;");
				return null;
			}
		}
		else{
			System.out.println("New Assignment ID INSTANCE error on " + idTT.getValue().toString() + ";");
			return null;
		}
	}
		
	@Override public FakeJSValue visitCod_cont_if_SUB(FakeJSParser.Cod_cont_if_SUBContext ctx){
		FakeJSValue ret = visit(ctx.if_block());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return null;
	}
	
	@Override public FakeJSValue visitCod_cont_loop_SUB(FakeJSParser.Cod_cont_loop_SUBContext ctx){
		FakeJSValue ret = visit(ctx.loop_block());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return null;
	}
	
	@Override public FakeJSValue visitCod_cont_func_SUB(FakeJSParser.Cod_cont_func_SUBContext ctx){
		visit(ctx.function_definition());
		return null;
	}
	
	@Override public FakeJSValue visitFunction_definition(FakeJSParser.Function_definitionContext ctx){
		ParseTree funcTree = ctx.getChild(5);
		
		FakeJSValue idTT = visit(ctx.id());
		if(idTT instanceof FakeJSString){
			FakeJSString idT = (FakeJSString)idTT;
			String id = idT.getVal();
			FakeJSFunction func = new FakeJSFunction(null, null);
			
			if(funcTree.getChildCount() == 3){
				FakeJSInt_FakeJSValue_HashMap arguments = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_definition_argument());
				func = new FakeJSFunction(arguments, funcTree.getChild(1));
			}
			int scopeInd = scopeSequence.size();
			HashMap<String, FakeJSValue> currentScope = scopeSequence.get(scopeInd);
			
			currentScope.put(id, func);
			scopeSequence.replace(scopeInd, currentScope);
		}
		else{
			System.out.println("Function Definition ID INSTANCE error on "+ idTT.getValue().toString() +" ");
		}
		return null;
	}
	
	@Override public FakeJSValue visitFunction_execution(FakeJSParser.Function_executionContext ctx){
		int scopeInd = scopeSequence.size();
		FakeJSFunction func;
		
		FakeJSValue idTT = visit(ctx.id());
		if(idTT instanceof FakeJSString){
			FakeJSString idT = (FakeJSString)idTT;
			String id = idT.getVal();
			
			for(int retroCount = scopeInd; retroCount > 0; retroCount --){
				HashMap<String, FakeJSValue>scope = scopeSequence.get(retroCount);
				
				if(scope.containsKey(id)){
					FakeJSValue funcT = scope.get(id);
					if(funcT instanceof FakeJSFunction){
						func = (FakeJSFunction) funcT;
						if(func.getVal() != null){	
							ParseTree funcTree = func.getVal();
							FakeJSSpeculativeParsingVisitor visitor = new FakeJSSpeculativeParsingVisitor();				
							FakeJSScope subScopeT = (FakeJSScope)visitor.visit(funcTree);
							HashMap<String, FakeJSValue> subScope = subScopeT.getVal();
							subScope.put("this", new FakeJSObject(new HashMap<String, FakeJSValue>(), new HashMap<String, FakeJSFunction>()));
							
							FakeJSInt_FakeJSValue_HashMap argumentsT = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_execution_argument());
							FakeJSInt_FakeJSValue_HashMap argumentsIDT = func.getArguments();
							HashMap<Integer,FakeJSValue> arguments = new HashMap<Integer,FakeJSValue>();
							HashMap<Integer,FakeJSValue> argumentsID = new HashMap<Integer,FakeJSValue>();
							if(argumentsT != null)
								arguments = argumentsT.getVal();
							if(argumentsIDT != null)
								argumentsID = argumentsIDT.getVal();
							for(int argumentCount = 0; argumentCount <= argumentsID.size(); argumentCount ++){
								if(argumentCount <= arguments.size()){
									if(argumentCount != 0){
										FakeJSString ID = (FakeJSString)argumentsID.get(argumentCount);
										FakeJSValue IDValue = arguments.get(argumentCount);
										subScope.put(ID.getVal(), IDValue);
									}
								}
								else{
									FakeJSString ID = (FakeJSString)argumentsID.get(argumentCount);
									subScope.put(ID.getVal(), null);
								}
							}
							
							Map<Integer, HashMap<String, FakeJSValue>>scopeSequenceTmp = new HashMap<Integer, HashMap<String, FakeJSValue>>();
							for(int i = retroCount + 1; i <= scopeInd; i++){
								scopeSequenceTmp.put(i, scopeSequence.get(i));
								scopeSequence.remove(i);
							}
							
							scopeSequence.put(retroCount + 1, subScope);
							
							FakeJSValue retT = visit(funcTree);
							
							scopeSequence.remove(retroCount + 1);
							
							for(int i = retroCount + 1;i <= scopeInd; i++){
								scopeSequence.put(i, scopeSequenceTmp.get(i));
							}
							
							if(retT instanceof FakeJSReturn)
								return retT;
							else
								return null;
						}
						else{
							return null;
						}
					}
					else{
						System.out.println("Function Execution INSTANCE error on value;");
						return null;
					}
				}
			}
			System.out.println("Function Execution ID undeclared on "+ id +";");
			return null;
		}
		else{
			System.out.println("Function Execution ID INSTANCE error on "+ idTT.getValue().toString() +"; ");
			return null;
		}
	}
	
	@Override public FakeJSValue visitConstructor_execution(FakeJSParser.Constructor_executionContext ctx){
			int scopeInd = scopeSequence.size();
			FakeJSFunction func;
			
			FakeJSValue idTT = visit(ctx.id());
			if(idTT instanceof FakeJSString){
				FakeJSString idT = (FakeJSString)idTT;
				String id = idT.getVal();
				
				for(int retroCount = scopeInd; retroCount > 0; retroCount --){
					HashMap<String, FakeJSValue>scope = scopeSequence.get(retroCount);
					
					if(scope.containsKey(id)){
						FakeJSValue funcT = scope.get(id);
						if(funcT instanceof FakeJSFunction){
							func = (FakeJSFunction) funcT;
							if(func.getVal() != null){	
								ParseTree funcTree = func.getVal();
								FakeJSSpeculativeParsingVisitor visitor = new FakeJSSpeculativeParsingVisitor();				
								FakeJSScope subScopeT = (FakeJSScope)visitor.visit(funcTree);
								HashMap<String, FakeJSValue> subScope = subScopeT.getVal();
								subScope.put("this", new FakeJSObject(new HashMap<String, FakeJSValue>(), new HashMap<String, FakeJSFunction>()));
								
								FakeJSInt_FakeJSValue_HashMap argumentsT = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_execution_argument());
								FakeJSInt_FakeJSValue_HashMap argumentsIDT = func.getArguments();
								HashMap<Integer,FakeJSValue> arguments = new HashMap<Integer,FakeJSValue>();
								HashMap<Integer,FakeJSValue> argumentsID = new HashMap<Integer,FakeJSValue>();
								if(argumentsT != null)
									arguments = argumentsT.getVal();
								if(argumentsIDT != null)
									argumentsID = argumentsIDT.getVal();
								for(int argumentCount = 0; argumentCount <= argumentsID.size(); argumentCount ++){
									if(argumentCount <= arguments.size()){
										if(argumentCount != 0){
											FakeJSString ID = (FakeJSString)argumentsID.get(argumentCount);
											FakeJSValue IDValue = arguments.get(argumentCount);
											subScope.put(ID.getVal(), IDValue);
										}
									}
									else{
										FakeJSString ID = (FakeJSString)argumentsID.get(argumentCount);
										subScope.put(ID.getVal(), null);
									}
								}
								
								Map<Integer, HashMap<String, FakeJSValue>>scopeSequenceTmp = new HashMap<Integer, HashMap<String, FakeJSValue>>();
								for(int i = retroCount + 1; i <= scopeInd; i++){
									scopeSequenceTmp.put(i, scopeSequence.get(i));
									scopeSequence.remove(i);
								}
								
								scopeSequence.put(retroCount + 1, subScope);
								
								visit(funcTree);
								
								FakeJSObject res = (FakeJSObject)scopeSequence.get(scopeInd + 1).get("this");
								scopeSequence.remove(retroCount + 1);
								
								for(int i = retroCount + 1;i <= scopeInd; i++){
									scopeSequence.put(i, scopeSequenceTmp.get(i));
								}
								
								return res;
								
							}
							else{
								return new FakeJSObject(new HashMap<String, FakeJSValue>(), new HashMap<String, FakeJSFunction>());
							}
						}
						else{
							System.out.println("Constructor Execution INSTANCE error on value;");
							return null;
						}
					}
				}
				System.out.println("Constructor Execution ID undeclared on "+ id +";");
				return null;
			}
			else{
				System.out.println("Constructor Execution ID INSTANCE error on "+ idTT.getValue().toString() +"; ");
				return null;
			}
		}

	
	@Override public FakeJSValue visitFunc_def_arg_SUB(FakeJSParser.Func_def_arg_SUBContext ctx){
		FakeJSString id = (FakeJSString)visit(ctx.id());
		HashMap<Integer, FakeJSValue> argumentID = new HashMap<Integer, FakeJSValue>();
		argumentID.put(1, id);
		
		if(ctx.function_definition_argumentP().getChildCount() == 3){
			FakeJSInt_FakeJSValue_HashMap argumentIDSupplementT = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_definition_argumentP());
			HashMap<Integer,FakeJSValue> argumentIDSupplement = argumentIDSupplementT.getVal();
			for(int supplementCount = 1; supplementCount <= argumentIDSupplement.size(); supplementCount ++){
				argumentID.put(supplementCount + 1, argumentIDSupplement.get(supplementCount));
			}
		}
		return new FakeJSInt_FakeJSValue_HashMap(argumentID);
	}
	
	@Override public FakeJSValue visitFunc_def_argP_SUB(FakeJSParser.Func_def_argP_SUBContext ctx){
		FakeJSString id = (FakeJSString)visit(ctx.id());
		HashMap<Integer, FakeJSValue> argumentID = new HashMap<Integer, FakeJSValue>();
		argumentID.put(1, id);
		
		if(ctx.function_definition_argumentP().getChildCount() == 3){
			FakeJSInt_FakeJSValue_HashMap argumentIDSupplementT = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_definition_argumentP());
			HashMap<Integer,FakeJSValue> argumentIDSupplement = argumentIDSupplementT.getVal();
			for(int supplementCount = 1; supplementCount <= argumentIDSupplement.size(); supplementCount ++){
				argumentID.put(supplementCount + 1, argumentIDSupplement.get(supplementCount));
			}
		}
		return new FakeJSInt_FakeJSValue_HashMap(argumentID);
	}
	
	@Override public FakeJSValue visitFunc_exe_arg_a_e_SUB(FakeJSParser.Func_exe_arg_a_e_SUBContext ctx){
		FakeJSValue argumentValue = visit(ctx.arithmetic_expression());
		HashMap<Integer, FakeJSValue> argument = new HashMap<Integer, FakeJSValue>();
		argument.put(1, argumentValue);
		
		if(ctx.function_execution_argumentP().getChildCount() == 2){
			FakeJSInt_FakeJSValue_HashMap argumentSupplementT = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_execution_argumentP());
			HashMap<Integer, FakeJSValue> argumentSupplement = argumentSupplementT.getVal();
			for(int supplementCount = 1; supplementCount <= argumentSupplement.size(); supplementCount ++){
				argument.put(supplementCount + 1, argumentSupplement.get(supplementCount));
			}
		}
		return new FakeJSInt_FakeJSValue_HashMap(argument);
	}
	
	@Override public FakeJSValue visitFunc_exe_arg_c_e_SUB(FakeJSParser.Func_exe_arg_c_e_SUBContext ctx){
		FakeJSValue argumentValue = visit(ctx.comparison_expression());
		if(!(argumentValue instanceof FakeJSBool)){
			System.out.println("Function Execution Arugment Comparison Expression INSTANCE error;");
			return null;
		}
		
		HashMap<Integer, FakeJSValue> argument = new HashMap<Integer, FakeJSValue>();
		argument.put(1, argumentValue);
		
		if(ctx.function_execution_argumentP().getChildCount() == 2){
			FakeJSInt_FakeJSValue_HashMap argumentSupplementT = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_execution_argumentP());
			HashMap<Integer, FakeJSValue> argumentSupplement = argumentSupplementT.getVal();
			for(int supplementCount = 1; supplementCount <= argumentSupplement.size(); supplementCount ++){
				argument.put(supplementCount + 1, argumentSupplement.get(supplementCount));
			}
		}
		return new FakeJSInt_FakeJSValue_HashMap(argument);
	}
	
	@Override public FakeJSValue visitFunc_exe_arg_id_SUB(FakeJSParser.Func_exe_arg_id_SUBContext ctx){
		HashMap<Integer, FakeJSValue> argument = new HashMap<Integer, FakeJSValue>();
		FakeJSValue idTT = visit(ctx.id());
		
		if(!(idTT instanceof FakeJSString)){
			System.out.println("Function Execution Arugment ID INSTANCE error on " + idTT.getValue().toString() + ";");
			return null;
		}
		FakeJSString idT = (FakeJSString)idTT;
		String id = idT.getVal();
		
		for(int retroCount = scopeSequence.size(); retroCount > 0; retroCount --){
			HashMap<String, FakeJSValue> scope = scopeSequence.get(retroCount);
			if(scope.containsKey(id)){
				FakeJSValue argumentValue = scope.get(id);
				argument.put(1, argumentValue);
				break;
			}
			if(retroCount == 1){
				System.out.println("Function Execution Argument ID error: ID undeclared;");
				return null;
			}
		}
		
		if(ctx.function_execution_argumentP().getChildCount() == 2){
			FakeJSInt_FakeJSValue_HashMap argumentSupplementT = (FakeJSInt_FakeJSValue_HashMap)visit(ctx.function_execution_argumentP());
			HashMap<Integer, FakeJSValue> argumentSupplement = argumentSupplementT.getVal();
			for(int supplementCount = 1; supplementCount <= argumentSupplement.size(); supplementCount ++){
				argument.put(supplementCount + 1, argumentSupplement.get(supplementCount));
			}
		}
		return new FakeJSInt_FakeJSValue_HashMap(argument);
	}
	
	@Override public FakeJSValue visitFunc_exe_argP_SUB(FakeJSParser.Func_exe_argP_SUBContext ctx){
		return visit(ctx.function_execution_argument());
	}

	@Override public FakeJSValue visitA_e_obj_prp_ATOM(FakeJSParser.A_e_obj_prp_ATOMContext ctx){
		return visit(ctx.object_property());
	}
	
	@Override public FakeJSValue visitObj_asn_a_e_SUB(FakeJSParser.Obj_asn_a_e_SUBContext ctx){
		FakeJSString idSequenceTT= (FakeJSString)visit(ctx.object_property_assignment());
		String idSequenceT = idSequenceTT.getVal();
		FakeJSValue val = visit(ctx.arithmetic_expression());
		
		String[] idSequence = idSequenceT.split("\\.");
		if(idSequence[0].equals("this")){
			FakeJSValue objT;
			int scopeInd = scopeSequence.size();
			for(int retroCount = scopeInd; retroCount > 0; retroCount --){
				HashMap<String, FakeJSValue> currentScope = scopeSequence.get(retroCount);
				if(currentScope.containsKey("this")){
					objT = currentScope.get("this"); 
					if(objT instanceof FakeJSObject){
						FakeJSObject obj = (FakeJSObject)objT;
						HashMap<Integer, FakeJSObject> objSequence = new HashMap<Integer, FakeJSObject>();
						objSequence.put(0, obj);
						for(int i = 1; i < idSequence.length - 1; i ++){
							if(objSequence.get(i-1).containsVar(idSequence[i])){
								FakeJSValue objTmpT = objSequence.get(i-1).getVar(idSequence[i]);
								if(objTmpT instanceof FakeJSObject){
									FakeJSObject objTmp = (FakeJSObject)objTmpT;
									objSequence.put(i, objTmp);
								}
								else{
									System.out.println("Object Assignment Arithmetic Expression ID indexing error on " + idSequence[i] + ": not an object/function; ");
									return null;
								}
							}
							else{
								System.out.println("Object Assignment Arithmetic Expression ID indexing error on object " + idSequence[i] + ": object undefined");
								return null;
							}
						}
						FakeJSObject res = objSequence.get(objSequence.size() - 1);
						res.putVar(idSequence[idSequence.length - 1], val);
						for(int i = objSequence.size() - 2; i >= 0; i -- ){
							FakeJSObject resTmp = res;
							res = objSequence.get(i);
							res.putVar(idSequence[i + 1], resTmp);
						}
						currentScope.put("this", res);
						scopeSequence.replace(retroCount, currentScope);
						return null;
					}
					else if(objT instanceof FakeJSWindow){
						FakeJSWindow obj = (FakeJSWindow)objT;
						//On construction
					}
					else{
						System.out.println("Object Assignment Arithmetic Expression INSTANCE error on THIS; ");
						return null;
					}
				}
			}
			System.out.println("Object Assignment Arithmetic Expression error on THIS: THIS missing;");
			return null;
		}
		else{
			FakeJSValue objT;
			int scopeInd = scopeSequence.size();
			for(int retroCount = scopeInd; retroCount > 0; retroCount --){
				HashMap<String, FakeJSValue> currentScope = scopeSequence.get(retroCount);
				if(currentScope.containsKey(idSequence[0])){
					objT = currentScope.get(idSequence[0]);
					if(objT instanceof FakeJSObject){
						FakeJSObject obj = (FakeJSObject)objT;
						//On construction
					}
					else{
						System.out.println("Object Assignment Arithmetic Expression INSTANCE error on " + idSequence[0] + "; ");
						return null;
					}
				}
			}
			System.out.println("Object Assignment Arithmetic Expression error on object " + idSequence[0] + ": object undefined;");
			return null;
		}
	}
	
	@Override public FakeJSValue visitObj_prp_asn_id_SUB(FakeJSParser.Obj_prp_asn_id_SUBContext ctx){
		FakeJSValue id1TT = visit(ctx.id(0));
		FakeJSString id1T =(FakeJSString)id1TT;
		String id1 = id1T.getVal();
		FakeJSValue id2TT = visit(ctx.id(1));
		FakeJSString id2T =(FakeJSString)id2TT;
		String id2 = id2T.getVal();
		
		if(ctx.object_propertyP().getChildCount() == 3){
			FakeJSValue idPTT = visit(ctx.object_propertyP());
			FakeJSString idPT = (FakeJSString) idPTT;
			String idP = idPT.getVal();
			return new FakeJSString(id1 + "." + id2 + idP);
		}
		else{
			return new FakeJSString(id1 + "." + id2);
		}
	}
	
	@Override public FakeJSValue visitObj_prp_asn_this_SUB(FakeJSParser.Obj_prp_asn_this_SUBContext ctx){
		String id1 = "this";
		FakeJSValue id2TT = visit(ctx.id());
		FakeJSString id2T =(FakeJSString)id2TT;
		String id2 = id2T.getVal();
		
		if(ctx.object_propertyP().getChildCount() == 3){
			FakeJSValue idPTT = visit(ctx.object_propertyP());
			FakeJSString idPT = (FakeJSString) idPTT;
			String idP = idPT.getVal();
			return new FakeJSString(id1 + "." + id2 + idP);
		}
		else{
			return new FakeJSString(id1 + "." + id2);
		}
	}	
	@Override public FakeJSValue visitObj_prp_id_SUB(FakeJSParser.Obj_prp_id_SUBContext ctx){
		FakeJSValue idTT = visit(ctx.id(0));
		FakeJSString idT =(FakeJSString)idTT;
		String id = idT.getVal();
		
		FakeJSValue id2TT = visit(ctx.id(1));
		FakeJSString id2T =(FakeJSString)id2TT;
		String id2 = id2T.getVal();
		
		int scopeInd = scopeSequence.size();
		for(int retroCount = scopeInd; retroCount > 0; retroCount --){
			HashMap<String, FakeJSValue> scope = scopeSequence.get(retroCount);
			if(scope.containsKey(id)){
				FakeJSValue objT = scope.get(id);
				if(objT instanceof FakeJSObject){
					FakeJSObject obj = (FakeJSObject) objT;
					FakeJSValue val = obj.getVar(id2);
					if(ctx.object_propertyP().getChildCount() == 0){
						return val;
					}
					else{	
						FakeJSString idSequenceTT = (FakeJSString)visit(ctx.object_propertyP());
						String idSequenceT = idSequenceTT.getVal();
						String[] idSequence = idSequenceT.split("\\.");	
						 
						FakeJSValue objTmpT = val;
						for(int i = 0; i < idSequence.length; i++){
							if(objTmpT instanceof FakeJSObject){
								FakeJSObject objTmp = (FakeJSObject)objTmpT;
								objTmpT = objTmp.getVar(idSequence[i]);
/*								if(objTmpT == null && i != idSequence.length - 1){
									System.out.println("Object Property ID indexing error on ID Prime " + idSequence[i] + ": id undefined/undeclared;");
									return null;
								}*/
							}
							else{
								if(i != 0)
									System.out.println("Object Property ID indexing error on ID Prime " + idSequence[i] + ": not an object;");
								else
									System.out.println("Object Property ID indexing error on ID Prime " + id2 + ":not an object;");
								return null;
							}
						}
						return objTmpT;
					}	
				}
				else{
					System.out.println("Object Property ID error on " + id + ": Not an object; ");
					return null;
				}
			}
		}
		System.out.println("Object Property ID error on " + id + ": ID undeclared;");
		return null;
	}
	
	@Override public FakeJSValue visitObj_prpP_SUB(FakeJSParser.Obj_prpP_SUBContext ctx){
		FakeJSValue idTT = visit(ctx.id());
		if(idTT instanceof FakeJSString){
			FakeJSString idT = (FakeJSString)idTT;
			String id = idT.getVal();
			
			if(ctx.object_propertyP().getChildCount() == 3){
				String res1 = id + ".";
				
				FakeJSValue res2TT = visit(ctx.object_propertyP());
				if(res2TT instanceof FakeJSString){
					FakeJSString res2T = (FakeJSString) res2TT;
					String res2 = res2T.getVal();
					return new FakeJSString(res1 + res2);
				}
				else{
					System.out.println("Object Property Prime INSTANCE error on object_propertyP;");
					return null;
				}
			}
			else{
				return new FakeJSString(id);
			}
			
		}
		else{
			System.out.println("Object Property Prime ID INSTANCE error on " + idTT.toString() + ";");
			return null;
		}
	}
	
	@Override public FakeJSValue visitIf_block(FakeJSParser.If_blockContext ctx) {
		FakeJSValue estT = visit(ctx.estimation_block());
		if(estT instanceof FakeJSBool){
			FakeJSBool est = (FakeJSBool)estT;
			if(est.val){
				FakeJSValue ret = visit(ctx.sub_code_block());
				if(ret instanceof FakeJSReturn)
					return ret;
				else
					return null;
			}
			else{
				FakeJSValue ret = visit(ctx.sub_if_block());
				if(ret instanceof FakeJSReturn)
					return ret;
				else
					return null;
			}
		}
		else{
			System.out.println("Code Content IF Estimation INSTANCE error;");
			return null;
		}
	}
	
	@Override public FakeJSValue visitIf_block_else_if_SUB(FakeJSParser.If_block_else_if_SUBContext ctx){
		FakeJSValue ret = visit(ctx.if_block());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return null;
	}
	
	@Override public FakeJSValue visitIf_block_else_SUB(FakeJSParser.If_block_else_SUBContext ctx){
		FakeJSValue ret = visit(ctx.sub_code_block());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return null;
	}
	
	@Override public FakeJSValue visitLoop_block_while_SUB(FakeJSParser.Loop_block_while_SUBContext ctx){
		
		while(true){
			FakeJSValue estT = visit(ctx.estimation_block());
			if(estT instanceof FakeJSBool){
				FakeJSBool est = (FakeJSBool)estT;
				if(est.val){
					visit(ctx.sub_code_block());
				}
				else
					break;
			}
			else{
				System.out.println("Loop Block While Estimation INSTANCE error;");
				break;
			}
		}
		
		return null;
	}
	
	@Override public FakeJSValue visitLoop_block_for_SUB(FakeJSParser.Loop_block_for_SUBContext ctx){
		//In construction
		int scopeInd = scopeSequence.size();
		scopeSequence.put(new Integer(scopeInd + 1), new HashMap<String,FakeJSValue>());
		visit(ctx.for_loop_prestatement());
		
		while(true){
			FakeJSValue estT = visit(ctx.comparison_expression());
			if(estT instanceof FakeJSBool){
				FakeJSBool est = (FakeJSBool)estT;
				if(est.val){
					visit(ctx.sub_code_block());
					visit(ctx.for_loop_wrap());
				}
				else
					break;
			}
			else{
				System.out.println("Loop Block For Estimation INSTANCE error;");
				break;
			}
		}
		
		scopeSequence.remove(new Integer(scopeInd + 1));
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
		
	@Override public FakeJSValue visitCode_block_SUB(FakeJSParser.Code_block_SUBContext ctx) {
		FakeJSValue ret = visit(ctx.code_block());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return null;
	}

	@Override public FakeJSValue visitIf_block_END(FakeJSParser.If_block_ENDContext ctx) { return null; }
	
	@Override public FakeJSValue visitCode_block_END(FakeJSParser.Code_block_ENDContext ctx) { return null; }

	@Override public FakeJSValue visitA_e_t1_SUB(FakeJSParser.A_e_t1_SUBContext ctx) {	
		FakeJSValue opT = visit(ctx.t1_math_operator());
		int opS = 0;
		if(opT instanceof FakeJSString){
			FakeJSString op = (FakeJSString) opT;
			if(op.getVal().equals("*"))
				opS = 1;
			else if(op.getVal().equals("/"))
				opS = 2;
			else{
					System.out.println("Arithmetic Expression Tier-1 operator TYPE error on "+opT.getValue().toString()+";");
					return null;
			}
		}
		else{
				System.out.println("Arithmetic Expression Tier-1 operator INSTANCE error on "+opT.getValue().toString()+";");
				return null;
		}
		
		FakeJSValue left = visit(ctx.arithmetic_expression(0));
		FakeJSValue right = visit(ctx.arithmetic_expression(1));
		int lrS = 0, iL = 0, iR = 0;
		if(left instanceof FakeJSInteger && right instanceof FakeJSInteger){
			FakeJSInteger iLT = (FakeJSInteger)left;
			iL = iLT.getVal();
			FakeJSInteger iRT = (FakeJSInteger)right;
			iR = iRT.getVal();

			lrS = 1;
		}
		else{
			System.out.println("Arithmetic Expression Tier-1 LHS&RHS INSTANCE-MATCHING error;");
			return null;
		}
		
		switch(opS){
			case(1):
				switch(lrS){
					case(1):
						return new FakeJSInteger(iL * iR);
					default:
						return null;
				}
			case(2):
				switch(lrS){
					case(1):
						if(iR != 0)
							return new FakeJSInteger(iL / iR);
						else{
							System.out.println("Arithmetic Expression Tier-1 DIVISION error: Divided by 0;");
							return null;
						}
					default:
						return null;
				}
			default:
				return null;
		}
	}
	
	@Override public FakeJSValue visitA_e_t2_SUB(FakeJSParser.A_e_t2_SUBContext ctx) {
		FakeJSValue opT = visit(ctx.t2_math_operator());
		int opS = 0;
		if(opT instanceof FakeJSString){
			FakeJSString op = (FakeJSString)opT;
			if(op.getVal().equals("+"))
				opS = 1;
			else if(op.getVal().equals("-"))
				opS = 2;
			else{
				System.out.println("Arithmetic Expression Tier-2 operator TYPE error on "+opT.getValue().toString()+";");
				return null;
			}
		}
		else{
			System.out.println("Arithmetic Expression Tier-2 operator INSTANCE error on "+opT.getValue().toString()+";");
			return null;
		}
		
		FakeJSValue left = visit(ctx.arithmetic_expression(0));
		FakeJSValue right = visit(ctx.arithmetic_expression(1));
		int iL = 0, iR = 0, lrS = 0;
		String sL = null, sR = null;
		if(left instanceof FakeJSInteger && right instanceof FakeJSInteger){
			FakeJSInteger iLT = (FakeJSInteger)left, iRT = (FakeJSInteger)right;
			iL = iLT.getVal();
			iR = iRT.getVal();
			
			lrS = 1;
		}
		else if(left instanceof FakeJSString && right instanceof FakeJSString){
			FakeJSString sLT = (FakeJSString)left, sRT = (FakeJSString)right;
			sL = sLT.getVal();
			sR = sRT.getVal();
			
			lrS = 2;
		}
		else{
			System.out.println("Arithmetic Expression Tier-2 LHS&RHS INSTANCE-MATCHING error;");
			return null;
		}
		
		switch(opS){
			case(1):
				switch(lrS){
					case(1):
						return new FakeJSInteger(iL + iR);
					case(2):
						return new FakeJSString(sL + sR);
					default:
						return null;
				}
			case(2):
				switch(lrS){
					case(1):
						return new FakeJSInteger(iL - iR);
					case(2):
						System.out.println("Arithmetic Expression Tier-2 operator USAGE error of " + opT.getValue().toString() + " on "+left.getValue().toString()+" "+right.getValue().toString()+";");
						return null;
					default:
						return null;
				}
			default:
				return null;
		}
	}
	
	@Override public FakeJSValue visitA_e_brkt_SUB(FakeJSParser.A_e_brkt_SUBContext ctx) {
		FakeJSValue aeT = visit(ctx.arithmetic_expression());
		return aeT;
	}
	
	@Override public FakeJSInteger visitA_e_int_ATOM(FakeJSParser.A_e_int_ATOMContext ctx) {
		FakeJSValue i = visit(ctx.integer());
		if(i instanceof FakeJSInteger)
			return (FakeJSInteger)i;
		else{
			System.out.println("Arithmetic Expression Int Atom error on " + ctx.integer().INTEGER().getText() + ";");
			return null;
		}
	}
	
	@Override public FakeJSString visitA_e_str_ATOM(FakeJSParser.A_e_str_ATOMContext ctx) {
		FakeJSValue str = visit(ctx.string());
		if(str instanceof FakeJSString)
			return (FakeJSString)str;
		else{
			System.out.println("Arithmetic Expression Str Atom error on " + ctx.string().STRING().getText() + ";");
			return null;
		}
	}
	
	@Override public FakeJSValue visitA_e_id_ATOM(FakeJSParser.A_e_id_ATOMContext ctx) {
		int scopeInd = scopeSequence.size();
		FakeJSValue idTT = visit(ctx.id());
		FakeJSString idT;
		if(idTT instanceof FakeJSString){
			idT = (FakeJSString)idTT;
			String id = idT.getVal();
			
			for(int retroCount = scopeInd; retroCount > 0; retroCount--){
				HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(retroCount));
				if(scope.containsKey(id)){
					 FakeJSValue val = scope.get(id);
					 if(val != null)
						 return val;
					 else{
						 System.out.println("Arithmetic Expression ID Atom error: variable " + id + " undefined;");
						 return null;
					 }
				}
			}
			
			System.out.println("Arithmetic Expression ID Atom error: variable " + id + " undeclared;");
			return null;
		}
		else{
			System.out.println("Arithmetic Expression ID Atom INSTANCE error on " + ctx.id().ID().getText() + ";");
			return null;
		}	
	}
	
	@Override public FakeJSValue visitA_e_func_exe_ATOM(FakeJSParser.A_e_func_exe_ATOMContext ctx){
		FakeJSValue retTT = visit(ctx.function_execution());
		if(retTT instanceof FakeJSReturn){
			FakeJSReturn retT = (FakeJSReturn)retTT;
			FakeJSValue ret = retT.getVal();
			return ret;
		}
		else{
			System.out.println("Arithmetic Expression Function Execution Atom error on Function: Given function does not have return;");
			return null;
		}
	}
	
	@Override public FakeJSBool visitEstimation_block(FakeJSParser.Estimation_blockContext ctx) {
		FakeJSValue estT = visit(ctx.comparison_expression());
		if(estT instanceof FakeJSBool){
			FakeJSBool est = (FakeJSBool)estT;
			return est;
		}
		else{
			System.out.println("Estimation Block Comparison Expression INSTANCE error;");
			return null;
		}
	}

	@Override public FakeJSValue visitSub_cod_block_SUB(FakeJSParser.Sub_cod_block_SUBContext ctx) {
		FakeJSValue ret = visit(ctx.code_block());
		if(ret instanceof FakeJSReturn)
			return ret;
		else
			return null;
	}
	
	@Override public FakeJSValue visitSub_cod_block_epsl_SUB(FakeJSParser.Sub_cod_block_epsl_SUBContext ctx){
		return null;
	}

	@Override public FakeJSBool visitC_e_bool_ATOM(FakeJSParser.C_e_bool_ATOMContext ctx) {
		FakeJSValue valT = visit(ctx.sl_boolean());
		if(valT instanceof FakeJSBool){
			FakeJSBool val = (FakeJSBool)valT;
			return val;
		}
		else{
			System.out.println("Comparison Expression Boolean Atom INSTANCE error on " + valT.getValue().toString() + ";");
			return null;
		}
	}
	
	@Override public FakeJSValue visitC_e_func_exe_ATOM(FakeJSParser.C_e_func_exe_ATOMContext ctx){
		FakeJSValue retTT = visit(ctx.function_execution());
		if(retTT instanceof FakeJSReturn){
			FakeJSReturn retT = (FakeJSReturn)retTT;
			FakeJSValue ret = retT.getVal();
			return ret;
		}
		else{
			System.out.println("Comparison Expression Function Execution Atom error on Function: Given function does not have return;");
			return null;
		}
	}
	
	@Override public FakeJSBool visitC_e_id_ATOM(FakeJSParser.C_e_id_ATOMContext ctx) {
		int scopeInd = scopeSequence.size();
	
		FakeJSValue idTT = visit(ctx.id());
		FakeJSString idT;
		if(idTT instanceof FakeJSString){
			idT = (FakeJSString)idTT;
			String id = idT.getVal();
			
			for(int retroCount = scopeInd; retroCount > 0; retroCount--){
				HashMap<String, FakeJSValue> scope = scopeSequence.get(new Integer(retroCount));
				if(scope.containsKey(id)){
					FakeJSValue valT = scope.get(id);
					FakeJSBool res = new FakeJSBool(true);
					if(valT instanceof FakeJSString){
							res.setVal(false);
					}
					else if(valT instanceof FakeJSInteger){
						FakeJSInteger val = (FakeJSInteger)valT;
						if(val.getVal() == 0)
							res.setVal(false);
					}
					else if(valT instanceof FakeJSBool){
						FakeJSBool val = (FakeJSBool)valT;
						res.setVal(val.getVal());
					}
					else if(valT == null){
						res.setVal(false);
					}
					return res;
				}
			}
			System.out.println("Comparison Expression ID Atom error: variable " + id + " undeclared;");
			return null;
	}
	else{
		System.out.println("Comparison Expression ID Atom INSTANCE error on " + idTT.getValue().toString() + " ;");
		return null;
	}
}

	@Override public FakeJSBool visitC_e_t7_SUB(FakeJSParser.C_e_t7_SUBContext ctx) {
		FakeJSValue left = visit(ctx.comparison_expression(0));
		FakeJSValue right = visit(ctx.comparison_expression(1));
		if(left instanceof FakeJSBool && right instanceof FakeJSBool){
			FakeJSBool bL = (FakeJSBool)left;
			FakeJSBool bR = (FakeJSBool)right;
			if(bL.getVal()||bR.getVal())
				return new FakeJSBool(true);
			else return new FakeJSBool(false);
		}
		else if(left instanceof FakeJSBool){
			System.out.println("Comparison Expression Tier-7 RHS INSTANCE error;");
			return null;
		}
		else if(right instanceof FakeJSBool){
			System.out.println("Comparson Expression Tier-7 LHS INSTANCE error;");
			return null;
		}
		else{
			System.out.println("Comparison Expression Tier-7 LHS&RHS INSTANCE error;");
			return null;
		}
	}

	@Override public FakeJSBool visitC_e_t6_SUB(FakeJSParser.C_e_t6_SUBContext ctx) {
		FakeJSValue left = visit(ctx.comparison_expression(0));
		FakeJSValue right = visit(ctx.comparison_expression(1));
		if(left instanceof FakeJSBool && right instanceof FakeJSBool){
			FakeJSBool bL = (FakeJSBool)left;
			FakeJSBool bR = (FakeJSBool)right;
			if(bL.getVal()&&bR.getVal())
				return new FakeJSBool(true);
			else return new FakeJSBool(false);
		}
		else if(left instanceof FakeJSBool){
			System.out.println("Comparison Expression Tier-6 RHS INSTANCE error;");
			return null;
		}
		else if(right instanceof FakeJSBool){
			System.out.println("Comparison Expression Tier-6 LHS INSTANCE error;");
			return null;
		}
		else{
			System.out.println("Comparison Expression Tier-6 LHS&RHS INSTANCE error;");
			return null;
		}
	}

	@Override public FakeJSBool visitC_e_t2_SUB(FakeJSParser.C_e_t2_SUBContext ctx) {
		FakeJSValue opT = visit(ctx.t2_comp_operator());
		if(opT instanceof FakeJSString){
			FakeJSString op = (FakeJSString)opT;
			int opS = 0;
			if(op.getVal().equals("=="))
				opS = 1;
			else if(op.getVal().equals("!="))
				opS = 2;
			else{
				System.out.println("Comparison Expression Tier-2 operator TYPE error on " + op.getVal() + ";");
				return null;
			}
			
			FakeJSValue left = visit(ctx.arithmetic_expression(0));
			FakeJSValue right = visit(ctx.arithmetic_expression(1));
			int iL = 0, iR = 0, lrS = 0;
			String sL = null, sR = null;

			if(left instanceof FakeJSInteger && right instanceof FakeJSInteger){
				FakeJSInteger iLT = (FakeJSInteger)left;
				iL = iLT.getVal();
				FakeJSInteger iRT = (FakeJSInteger)right;
				iR = iRT.getVal();
				lrS = 1;
			}
			else if(left instanceof FakeJSInteger && right instanceof FakeJSString){
				FakeJSInteger iLT = (FakeJSInteger)left;
				iL = iLT.getVal();
				FakeJSString sRT = (FakeJSString)right;
				sR = sRT.getVal();
				lrS = 2;
			}
			else if(left instanceof FakeJSString && right instanceof FakeJSInteger){
				FakeJSString sLT = (FakeJSString)left;
				sL = sLT.getVal();
				FakeJSInteger iRT = (FakeJSInteger)right;
				iR = iRT.getVal();
				lrS = 3;
			}
			else if(left instanceof FakeJSString && right instanceof FakeJSString){
				FakeJSString sLT = (FakeJSString)left;
				sL = sLT.getVal();
				FakeJSString sRT = (FakeJSString)right;
				sR = sRT.getVal();
				lrS = 4;
			}
			else{
				System.out.println("Comparison Expression Tier-2 LHS&&RHS INSTANCE-MATCHING error on " + left.getValue().toString() + " & " + right.getValue().toString() + ";");
				return null;
			}
			
			switch(opS){
				case(1):
					switch(lrS){
						case(1):
							if(iL == iR)
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						case(2):
							if(iL == Integer.parseInt(sR))
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						case(3):
							if(Integer.parseInt(sL) == iR)
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						case(4):
							if(sL.equals(sR))
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						default:
							return null;
					}
				case(2):
					switch(lrS){
						case(1):
							if(iL != iR)
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						case(2):
							if(iL != Integer.parseInt(sR))
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						case(3):
							if(Integer.parseInt(sL) != iR)
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						case(4):
							if(!sL.equals(sR))
								return new FakeJSBool(true);
							else
								return new FakeJSBool(false);
						default:
							return null;
					}
				default:
					return null;
			}	
		}
		else{
			System.out.println("Comparison Expression Tier-2 operator INSTANCE error on " + opT.getValue().toString() + ";");
			return null;
		}
	}

	@Override public FakeJSBool visitC_e_brkt_SUB(FakeJSParser.C_e_brkt_SUBContext ctx) {
		FakeJSValue ceT = visit(ctx.comparison_expression());
		if(ceT instanceof FakeJSBool){
			FakeJSBool ce = (FakeJSBool)ceT;
			return ce;
		}
		else{
			System.out.println("Comparison Exrepssion Bracket C_E INSTANCE error; ");
			return null;
		}
	}

	@Override public FakeJSString visitAdd(FakeJSParser.AddContext ctx) { return new FakeJSString("+"); }

	@Override public FakeJSString visitSub(FakeJSParser.SubContext ctx) { return new FakeJSString("-"); }
	
	@Override public FakeJSString visitMul(FakeJSParser.MulContext ctx) { return new FakeJSString("*"); }

	@Override public FakeJSString visitDiv(FakeJSParser.DivContext ctx) { return new FakeJSString("/"); }

	@Override public FakeJSString visitEql_eql(FakeJSParser.Eql_eqlContext ctx) { return new FakeJSString("=="); }

	@Override public FakeJSString visitNot_eql(FakeJSParser.Not_eqlContext ctx) { return new FakeJSString("!="); }

	@Override public FakeJSBool visitSl_boolean_true_SUB(FakeJSParser.Sl_boolean_true_SUBContext ctx) { return new FakeJSBool(true); }
	
	@Override public FakeJSBool visitSl_boolean_false_SUB(FakeJSParser.Sl_boolean_false_SUBContext ctx) { return new FakeJSBool(false); }
	
	@Override public FakeJSInteger visitInteger(FakeJSParser.IntegerContext ctx) {
		Integer val = Integer.valueOf(ctx.INTEGER().getText());
		FakeJSInteger res = new FakeJSInteger(val.intValue());
		return res;
	}
	
	@Override public FakeJSString visitString(FakeJSParser.StringContext ctx) {
		String strT = ctx.STRING().getText();
		strT = strT.substring(1, strT.length() - 1);
		FakeJSString str = new FakeJSString(strT);
		return str;
	}

	@Override public FakeJSString visitId(FakeJSParser.IdContext ctx) {
		FakeJSString id = new FakeJSString(ctx.ID().getText());
		return id;
	}

}