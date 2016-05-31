// Generated from PlSql.g4 by ANTLR 4.5.2

package org.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(PlSqlParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(PlSqlParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement(PlSqlParser.Unit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#declare_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_wrapper(PlSqlParser.Declare_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#is_or_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_or_as(PlSqlParser.Is_or_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(PlSqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(PlSqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#record_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_declaration(PlSqlParser.Record_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_dec(PlSqlParser.Record_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_var_dec(PlSqlParser.Record_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_declaration(PlSqlParser.Table_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_dec(PlSqlParser.Table_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_dec(PlSqlParser.Table_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PlSqlParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_statement(PlSqlParser.Collection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pipe_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipe_row(PlSqlParser.Pipe_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exception_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_clause(PlSqlParser.Exception_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_cursor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_cursor_expression(PlSqlParser.Sql_cursor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collection_assoc_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_assoc_expression(PlSqlParser.Collection_assoc_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collection_type_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_type_expression(PlSqlParser.Collection_type_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(PlSqlParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#condition_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_wrapper(PlSqlParser.Condition_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#expression_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_wrapper(PlSqlParser.Expression_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(PlSqlParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#negated_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegated_expression(PlSqlParser.Negated_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(PlSqlParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multiset_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_part(PlSqlParser.Multiset_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multiset_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_type(PlSqlParser.Multiset_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#like_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_type(PlSqlParser.Like_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_escape_part(PlSqlParser.Like_escape_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#concatenation_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation_wrapper(PlSqlParser.Concatenation_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(PlSqlParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multiply_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_expression(PlSqlParser.Multiply_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_expression(PlSqlParser.Datetime_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_like_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_like_part(PlSqlParser.For_like_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_increment_decrement_type(PlSqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or_vector(PlSqlParser.Expression_or_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_expr(PlSqlParser.Vector_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#plsql_type_conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_type_conversion(PlSqlParser.Plsql_type_conversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_type_conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_type_conversion(PlSqlParser.Sql_type_conversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_columns(PlSqlParser.Xml_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table(PlSqlParser.Xml_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#boolean_static_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_static_expression(PlSqlParser.Boolean_static_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#preprocessor_internal_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_internal_statement(PlSqlParser.Preprocessor_internal_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#preprocessor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_statement(PlSqlParser.Preprocessor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_quoted_string(PlSqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_of_clause(PlSqlParser.Current_of_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#into_clause_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause_variable(PlSqlParser.Into_clause_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_class_name(PlSqlParser.Cost_class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(PlSqlParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(PlSqlParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_segment_name(PlSqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_name(PlSqlParser.Table_var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(PlSqlParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(PlSqlParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_type_name(PlSqlParser.Implementation_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(PlSqlParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model_name(PlSqlParser.Reference_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model_name(PlSqlParser.Main_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_name(PlSqlParser.Query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(PlSqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(PlSqlParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(PlSqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(PlSqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collection_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_name(PlSqlParser.Collection_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#link_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_name(PlSqlParser.Link_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PlSqlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_op(PlSqlParser.Not_equal_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than_or_equals_op(PlSqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than_or_equals_op(PlSqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation_op(PlSqlParser.Concatenation_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_id(PlSqlParser.Regular_idContext ctx);
}