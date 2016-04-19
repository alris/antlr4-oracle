// Generated from plsql.g4 by ANTLR 4.5.2

package org.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link plsqlParser}.
 */
public interface plsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link plsqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(plsqlParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(plsqlParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(plsqlParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(plsqlParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(plsqlParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(plsqlParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnit_statement(plsqlParser.Unit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnit_statement(plsqlParser.Unit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(plsqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(plsqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(plsqlParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(plsqlParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_body(plsqlParser.Create_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_body(plsqlParser.Create_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(plsqlParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(plsqlParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(plsqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(plsqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_clause(plsqlParser.Partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_clause(plsqlParser.Partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(plsqlParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(plsqlParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_part(plsqlParser.Relies_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_part(plsqlParser.Relies_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(plsqlParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(plsqlParser.Streaming_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(plsqlParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(plsqlParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package(plsqlParser.Alter_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package(plsqlParser.Alter_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(plsqlParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(plsqlParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(plsqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(plsqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(plsqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(plsqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_spec(plsqlParser.Package_obj_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_spec(plsqlParser.Package_obj_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_body(plsqlParser.Package_obj_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_body(plsqlParser.Package_obj_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(plsqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(plsqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(plsqlParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(plsqlParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_body(plsqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_body(plsqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(plsqlParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(plsqlParser.Procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(plsqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(plsqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger(plsqlParser.Alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger(plsqlParser.Alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(plsqlParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(plsqlParser.Create_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_follows_clause(plsqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_follows_clause(plsqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_when_clause(plsqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_when_clause(plsqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(plsqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(plsqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_row(plsqlParser.For_each_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_row(plsqlParser.For_each_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(plsqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(plsqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(plsqlParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(plsqlParser.Non_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(plsqlParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(plsqlParser.Trigger_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_clause(plsqlParser.Routine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_clause(plsqlParser.Routine_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(plsqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(plsqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(plsqlParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(plsqlParser.Timing_point_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_event(plsqlParser.Non_dml_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_event(plsqlParser.Non_dml_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(plsqlParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(plsqlParser.Dml_event_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_element(plsqlParser.Dml_event_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_element(plsqlParser.Dml_event_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_nested_clause(plsqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_nested_clause(plsqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(plsqlParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(plsqlParser.Referencing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_element(plsqlParser.Referencing_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_element(plsqlParser.Referencing_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(plsqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(plsqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type(plsqlParser.Alter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type(plsqlParser.Alter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(plsqlParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(plsqlParser.Compile_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(plsqlParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(plsqlParser.Replace_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(plsqlParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(plsqlParser.Alter_method_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_element(plsqlParser.Alter_method_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_element(plsqlParser.Alter_method_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(plsqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(plsqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition(plsqlParser.Attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition(plsqlParser.Attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collection_clauses(plsqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collection_clauses(plsqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(plsqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(plsqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void enterDependent_exceptions_part(plsqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void exitDependent_exceptions_part(plsqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(plsqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(plsqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(plsqlParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(plsqlParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(plsqlParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(plsqlParser.Object_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_as_part(plsqlParser.Object_as_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_as_part(plsqlParser.Object_as_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_under_part(plsqlParser.Object_under_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_under_part(plsqlParser.Object_under_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(plsqlParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(plsqlParser.Nested_table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(plsqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(plsqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(plsqlParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(plsqlParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void enterType_body_elements(plsqlParser.Type_body_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void exitType_body_elements(plsqlParser.Type_body_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(plsqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(plsqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(plsqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(plsqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(plsqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(plsqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(plsqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(plsqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(plsqlParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(plsqlParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void enterModifier_clause(plsqlParser.Modifier_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void exitModifier_clause(plsqlParser.Modifier_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void enterObject_member_spec(plsqlParser.Object_member_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void exitObject_member_spec(plsqlParser.Object_member_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(plsqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(plsqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(plsqlParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(plsqlParser.Element_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec_options(plsqlParser.Element_spec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec_options(plsqlParser.Element_spec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(plsqlParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(plsqlParser.Subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_procedure_spec(plsqlParser.Type_procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_procedure_spec(plsqlParser.Type_procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_function_spec(plsqlParser.Type_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_function_spec(plsqlParser.Type_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(plsqlParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(plsqlParser.Constructor_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(plsqlParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(plsqlParser.Map_order_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(plsqlParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(plsqlParser.Pragma_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void enterPragma_elements(plsqlParser.Pragma_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void exitPragma_elements(plsqlParser.Pragma_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_elements_parameter(plsqlParser.Type_elements_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_elements_parameter(plsqlParser.Type_elements_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(plsqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(plsqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(plsqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(plsqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(plsqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(plsqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void enterSequence_spec(plsqlParser.Sequence_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void exitSequence_spec(plsqlParser.Sequence_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void enterSequence_start_clause(plsqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void exitSequence_start_clause(plsqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(plsqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(plsqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(plsqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(plsqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(plsqlParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(plsqlParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void enterJava_spec(plsqlParser.Java_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void exitJava_spec(plsqlParser.Java_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void enterC_spec(plsqlParser.C_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void exitC_spec(plsqlParser.C_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_agent_in_clause(plsqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_agent_in_clause(plsqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_parameters_clause(plsqlParser.C_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_parameters_clause(plsqlParser.C_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(plsqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(plsqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_part(plsqlParser.Default_value_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_part(plsqlParser.Default_value_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(plsqlParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(plsqlParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(plsqlParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(plsqlParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(plsqlParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(plsqlParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(plsqlParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(plsqlParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void enterParameter_spec(plsqlParser.Parameter_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void exitParameter_spec(plsqlParser.Parameter_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(plsqlParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(plsqlParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPragma_declaration(plsqlParser.Pragma_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPragma_declaration(plsqlParser.Pragma_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRecord_declaration(plsqlParser.Record_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRecord_declaration(plsqlParser.Record_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_dec(plsqlParser.Record_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_dec(plsqlParser.Record_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(plsqlParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(plsqlParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_var_dec(plsqlParser.Record_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_var_dec(plsqlParser.Record_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTable_declaration(plsqlParser.Table_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTable_declaration(plsqlParser.Table_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_dec(plsqlParser.Table_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_dec(plsqlParser.Table_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void enterTable_indexed_by_part(plsqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void exitTable_indexed_by_part(plsqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(plsqlParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(plsqlParser.Varray_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_dec(plsqlParser.Table_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_dec(plsqlParser.Table_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(plsqlParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(plsqlParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(plsqlParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(plsqlParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(plsqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(plsqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(plsqlParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(plsqlParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(plsqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(plsqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(plsqlParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(plsqlParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(plsqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(plsqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(plsqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(plsqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(plsqlParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(plsqlParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(plsqlParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(plsqlParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(plsqlParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(plsqlParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(plsqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(plsqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(plsqlParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(plsqlParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(plsqlParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(plsqlParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void enterBetween_bound(plsqlParser.Between_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void exitBetween_bound(plsqlParser.Between_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(plsqlParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(plsqlParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(plsqlParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(plsqlParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(plsqlParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(plsqlParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(plsqlParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(plsqlParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(plsqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(plsqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(plsqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(plsqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(plsqlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(plsqlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#collection_statement}.
	 * @param ctx the parse tree
	 */
	void enterCollection_statement(plsqlParser.Collection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#collection_statement}.
	 * @param ctx the parse tree
	 */
	void exitCollection_statement(plsqlParser.Collection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pipe_row}.
	 * @param ctx the parse tree
	 */
	void enterPipe_row(plsqlParser.Pipe_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pipe_row}.
	 * @param ctx the parse tree
	 */
	void exitPipe_row(plsqlParser.Pipe_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_clause}.
	 * @param ctx the parse tree
	 */
	void enterException_clause(plsqlParser.Exception_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_clause}.
	 * @param ctx the parse tree
	 */
	void exitException_clause(plsqlParser.Exception_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(plsqlParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(plsqlParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_block(plsqlParser.Trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_block(plsqlParser.Trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(plsqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(plsqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(plsqlParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(plsqlParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(plsqlParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(plsqlParser.Execute_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(plsqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(plsqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_language_statements(plsqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_language_statements(plsqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterCursor_manipulation_statements(plsqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitCursor_manipulation_statements(plsqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(plsqlParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(plsqlParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(plsqlParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(plsqlParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(plsqlParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(plsqlParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(plsqlParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(plsqlParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_control_statements(plsqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_control_statements(plsqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_command(plsqlParser.Set_transaction_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_command(plsqlParser.Set_transaction_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraint_command(plsqlParser.Set_constraint_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraint_command(plsqlParser.Set_constraint_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(plsqlParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(plsqlParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void enterWrite_clause(plsqlParser.Write_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void exitWrite_clause(plsqlParser.Write_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(plsqlParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(plsqlParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(plsqlParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(plsqlParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(plsqlParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(plsqlParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(plsqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(plsqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(plsqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(plsqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void enterFactoring_element(plsqlParser.Factoring_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void exitFactoring_element(plsqlParser.Factoring_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(plsqlParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(plsqlParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(plsqlParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(plsqlParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(plsqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(plsqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_operation_part(plsqlParser.Subquery_operation_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_operation_part(plsqlParser.Subquery_operation_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_basic_elements(plsqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_basic_elements(plsqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(plsqlParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(plsqlParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void enterSelected_element(plsqlParser.Selected_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void exitSelected_element(plsqlParser.Selected_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(plsqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(plsqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elements(plsqlParser.Select_list_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elements(plsqlParser.Select_list_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_list(plsqlParser.Table_ref_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_list(plsqlParser.Table_ref_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(plsqlParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(plsqlParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux(plsqlParser.Table_ref_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux(plsqlParser.Table_ref_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(plsqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(plsqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_part(plsqlParser.Join_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_part(plsqlParser.Join_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_using_part(plsqlParser.Join_using_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_using_part(plsqlParser.Join_using_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(plsqlParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(plsqlParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(plsqlParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(plsqlParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(plsqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(plsqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(plsqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(plsqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_element(plsqlParser.Pivot_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_element(plsqlParser.Pivot_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(plsqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(plsqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(plsqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(plsqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_element(plsqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_element(plsqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_elements(plsqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_elements(plsqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(plsqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(plsqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(plsqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(plsqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_elements(plsqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_elements(plsqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(plsqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(plsqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void enterStart_part(plsqlParser.Start_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void exitStart_part(plsqlParser.Start_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(plsqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(plsqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_elements(plsqlParser.Group_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_elements(plsqlParser.Group_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(plsqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(plsqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(plsqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(plsqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_elements(plsqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_elements(plsqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(plsqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(plsqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(plsqlParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(plsqlParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(plsqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(plsqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(plsqlParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(plsqlParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(plsqlParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(plsqlParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(plsqlParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(plsqlParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(plsqlParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(plsqlParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_partition_part(plsqlParser.Model_column_partition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_partition_part(plsqlParser.Model_column_partition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_list(plsqlParser.Model_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_list(plsqlParser.Model_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(plsqlParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(plsqlParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(plsqlParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(plsqlParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_part(plsqlParser.Model_rules_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_part(plsqlParser.Model_rules_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_element(plsqlParser.Model_rules_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_element(plsqlParser.Model_rules_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(plsqlParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(plsqlParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(plsqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(plsqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void enterUntil_part(plsqlParser.Until_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void exitUntil_part(plsqlParser.Until_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(plsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(plsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_elements(plsqlParser.Order_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_elements(plsqlParser.Order_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(plsqlParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(plsqlParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_of_part(plsqlParser.For_update_of_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_of_part(plsqlParser.For_update_of_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(plsqlParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(plsqlParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(plsqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(plsqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(plsqlParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(plsqlParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_based_update_set_clause(plsqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_based_update_set_clause(plsqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(plsqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(plsqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(plsqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(plsqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(plsqlParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(plsqlParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(plsqlParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(plsqlParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_element(plsqlParser.Multi_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_element(plsqlParser.Multi_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(plsqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(plsqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_when_part(plsqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_when_part(plsqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_else_part(plsqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_else_part(plsqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(plsqlParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(plsqlParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(plsqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(plsqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(plsqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(plsqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(plsqlParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(plsqlParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void enterMerge_element(plsqlParser.Merge_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void exitMerge_element(plsqlParser.Merge_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete_part(plsqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete_part(plsqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(plsqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(plsqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void enterSelected_tableview(plsqlParser.Selected_tableviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void exitSelected_tableview(plsqlParser.Selected_tableviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(plsqlParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(plsqlParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void enterWait_nowait_part(plsqlParser.Wait_nowait_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void exitWait_nowait_part(plsqlParser.Wait_nowait_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_element(plsqlParser.Lock_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_element(plsqlParser.Lock_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(plsqlParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(plsqlParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_table_ref(plsqlParser.General_table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_table_ref(plsqlParser.General_table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(plsqlParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(plsqlParser.Static_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(plsqlParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(plsqlParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_into_part(plsqlParser.Error_logging_into_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_into_part(plsqlParser.Error_logging_into_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_reject_part(plsqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_reject_part(plsqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(plsqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(plsqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(plsqlParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(plsqlParser.Table_collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(plsqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(plsqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(plsqlParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(plsqlParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void enterSeed_part(plsqlParser.Seed_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void exitSeed_part(plsqlParser.Seed_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(plsqlParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(plsqlParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterSql_cursor_expression(plsqlParser.Sql_cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitSql_cursor_expression(plsqlParser.Sql_cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#collection_assoc_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_assoc_expression(plsqlParser.Collection_assoc_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#collection_assoc_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_assoc_expression(plsqlParser.Collection_assoc_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#collection_type_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_type_expression(plsqlParser.Collection_type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#collection_type_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_type_expression(plsqlParser.Collection_type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(plsqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(plsqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(plsqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(plsqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#condition_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterCondition_wrapper(plsqlParser.Condition_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#condition_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitCondition_wrapper(plsqlParser.Condition_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(plsqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(plsqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterExpression_wrapper(plsqlParser.Expression_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitExpression_wrapper(plsqlParser.Expression_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(plsqlParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(plsqlParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegated_expression(plsqlParser.Negated_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegated_expression(plsqlParser.Negated_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(plsqlParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(plsqlParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_expression(plsqlParser.Multiset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_expression(plsqlParser.Multiset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_type(plsqlParser.Multiset_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_type(plsqlParser.Multiset_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(plsqlParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(plsqlParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(plsqlParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(plsqlParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#like_type}.
	 * @param ctx the parse tree
	 */
	void enterLike_type(plsqlParser.Like_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#like_type}.
	 * @param ctx the parse tree
	 */
	void exitLike_type(plsqlParser.Like_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void enterLike_escape_part(plsqlParser.Like_escape_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void exitLike_escape_part(plsqlParser.Like_escape_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void enterIn_elements(plsqlParser.In_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void exitIn_elements(plsqlParser.In_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void enterBetween_elements(plsqlParser.Between_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void exitBetween_elements(plsqlParser.Between_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(plsqlParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(plsqlParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#concatenation_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_wrapper(plsqlParser.Concatenation_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#concatenation_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_wrapper(plsqlParser.Concatenation_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(plsqlParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(plsqlParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_expression(plsqlParser.Multiply_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_expression(plsqlParser.Multiply_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(plsqlParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(plsqlParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(plsqlParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(plsqlParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(plsqlParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(plsqlParser.Model_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression_element(plsqlParser.Model_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression_element(plsqlParser.Model_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(plsqlParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(plsqlParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_like_part(plsqlParser.For_like_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_like_part(plsqlParser.For_like_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void enterFor_increment_decrement_type(plsqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void exitFor_increment_decrement_type(plsqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(plsqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(plsqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(plsqlParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(plsqlParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(plsqlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(plsqlParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(plsqlParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(plsqlParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(plsqlParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(plsqlParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(plsqlParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(plsqlParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(plsqlParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(plsqlParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(plsqlParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(plsqlParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(plsqlParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(plsqlParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void enterExpression_or_vector(plsqlParser.Expression_or_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void exitExpression_or_vector(plsqlParser.Expression_or_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVector_expr(plsqlParser.Vector_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVector_expr(plsqlParser.Vector_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_expression(plsqlParser.Quantified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_expression(plsqlParser.Quantified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#plsql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_type_conversion(plsqlParser.Plsql_type_conversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#plsql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_type_conversion(plsqlParser.Plsql_type_conversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void enterSql_type_conversion(plsqlParser.Sql_type_conversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void exitSql_type_conversion(plsqlParser.Sql_type_conversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(plsqlParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(plsqlParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_keyword(plsqlParser.Over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_keyword(plsqlParser.Over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_clause_keyword(plsqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_clause_keyword(plsqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStandard_prediction_function_keyword(plsqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStandard_prediction_function_keyword(plsqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(plsqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(plsqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(plsqlParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(plsqlParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_type(plsqlParser.Windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_type(plsqlParser.Windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_elements(plsqlParser.Windowing_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_elements(plsqlParser.Windowing_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(plsqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(plsqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void enterUsing_element(plsqlParser.Using_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void exitUsing_element(plsqlParser.Using_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void enterCollect_order_by_part(plsqlParser.Collect_order_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void exitCollect_order_by_part(plsqlParser.Collect_order_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_part(plsqlParser.Within_or_over_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_part(plsqlParser.Within_or_over_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterCost_matrix_clause(plsqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitCost_matrix_clause(plsqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(plsqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(plsqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes_clause(plsqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes_clause(plsqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(plsqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(plsqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(plsqlParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(plsqlParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void enterXml_general_default_part(plsqlParser.Xml_general_default_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void exitXml_general_default_part(plsqlParser.Xml_general_default_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterXml_multiuse_expression_element(plsqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitXml_multiuse_expression_element(plsqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_version_part(plsqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_version_part(plsqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_standalone_part(plsqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_standalone_part(plsqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_enconding_part(plsqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_enconding_part(plsqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_version_part(plsqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_version_part(plsqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_ident_part(plsqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_ident_part(plsqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#boolean_static_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_static_expression(plsqlParser.Boolean_static_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#boolean_static_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_static_expression(plsqlParser.Boolean_static_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#preprocessor_internal_statement}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_internal_statement(plsqlParser.Preprocessor_internal_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#preprocessor_internal_statement}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_internal_statement(plsqlParser.Preprocessor_internal_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#preprocessor_statement}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_statement(plsqlParser.Preprocessor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#preprocessor_statement}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_statement(plsqlParser.Preprocessor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_plus_command(plsqlParser.Sql_plus_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_plus_command(plsqlParser.Sql_plus_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_command(plsqlParser.Whenever_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_command(plsqlParser.Whenever_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_command(plsqlParser.Set_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_command(plsqlParser.Set_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void enterExit_command(plsqlParser.Exit_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void exitExit_command(plsqlParser.Exit_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void enterPrompt_command(plsqlParser.Prompt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void exitPrompt_command(plsqlParser.Prompt_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#call_sql_script_command}.
	 * @param ctx the parse tree
	 */
	void enterCall_sql_script_command(plsqlParser.Call_sql_script_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#call_sql_script_command}.
	 * @param ctx the parse tree
	 */
	void exitCall_sql_script_command(plsqlParser.Call_sql_script_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(plsqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(plsqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(plsqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(plsqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(plsqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(plsqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterAlias_quoted_string(plsqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitAlias_quoted_string(plsqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(plsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(plsqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_of_clause(plsqlParser.Current_of_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_of_clause(plsqlParser.Current_of_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#into_clause_variable}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause_variable(plsqlParser.Into_clause_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#into_clause_variable}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause_variable(plsqlParser.Into_clause_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(plsqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(plsqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void enterXml_column_name(plsqlParser.Xml_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void exitXml_column_name(plsqlParser.Xml_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void enterCost_class_name(plsqlParser.Cost_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void exitCost_class_name(plsqlParser.Cost_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(plsqlParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(plsqlParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(plsqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(plsqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment_name(plsqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment_name(plsqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_name(plsqlParser.Table_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_name(plsqlParser.Table_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(plsqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(plsqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(plsqlParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(plsqlParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(plsqlParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(plsqlParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_type_name(plsqlParser.Implementation_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_type_name(plsqlParser.Implementation_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(plsqlParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(plsqlParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(plsqlParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(plsqlParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(plsqlParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(plsqlParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(plsqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(plsqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(plsqlParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(plsqlParser.Query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(plsqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(plsqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(plsqlParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(plsqlParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(plsqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(plsqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(plsqlParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(plsqlParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(plsqlParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(plsqlParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(plsqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(plsqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(plsqlParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(plsqlParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(plsqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(plsqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(plsqlParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(plsqlParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(plsqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(plsqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(plsqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(plsqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void enterRecord_name(plsqlParser.Record_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void exitRecord_name(plsqlParser.Record_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(plsqlParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(plsqlParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void enterLink_name(plsqlParser.Link_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void exitLink_name(plsqlParser.Link_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(plsqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(plsqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterTableview_name(plsqlParser.Tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitTableview_name(plsqlParser.Tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_set_name(plsqlParser.Char_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_set_name(plsqlParser.Char_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(plsqlParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(plsqlParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(plsqlParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(plsqlParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_analytic(plsqlParser.Function_argument_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_analytic(plsqlParser.Function_argument_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_modeling(plsqlParser.Function_argument_modelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_modeling(plsqlParser.Function_argument_modelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void enterRespect_or_ignore_nulls(plsqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void exitRespect_or_ignore_nulls(plsqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(plsqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(plsqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(plsqlParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(plsqlParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(plsqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(plsqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_part(plsqlParser.Precision_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_part(plsqlParser.Precision_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void enterNative_datatype_element(plsqlParser.Native_datatype_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void exitNative_datatype_element(plsqlParser.Native_datatype_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(plsqlParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(plsqlParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(plsqlParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(plsqlParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(plsqlParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(plsqlParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(plsqlParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(plsqlParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(plsqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(plsqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(plsqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(plsqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(plsqlParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(plsqlParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(plsqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(plsqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(plsqlParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(plsqlParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal_op(plsqlParser.Not_equal_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal_op(plsqlParser.Not_equal_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than_or_equals_op(plsqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than_or_equals_op(plsqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterLess_than_or_equals_op(plsqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitLess_than_or_equals_op(plsqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_op(plsqlParser.Concatenation_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_op(plsqlParser.Concatenation_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(plsqlParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(plsqlParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(plsqlParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(plsqlParser.Regular_idContext ctx);
}