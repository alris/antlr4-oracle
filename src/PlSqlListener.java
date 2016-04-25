// Generated from PlSql.g4 by ANTLR 4.5.2

package org.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlSqlParser}.
 */
public interface PlSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(PlSqlParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(PlSqlParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(PlSqlParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(PlSqlParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnit_statement(PlSqlParser.Unit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnit_statement(PlSqlParser.Unit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#declare_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_wrapper(PlSqlParser.Declare_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#declare_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_wrapper(PlSqlParser.Declare_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#is_or_as}.
	 * @param ctx the parse tree
	 */
	void enterIs_or_as(PlSqlParser.Is_or_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#is_or_as}.
	 * @param ctx the parse tree
	 */
	void exitIs_or_as(PlSqlParser.Is_or_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(PlSqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(PlSqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(PlSqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(PlSqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void enterDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void exitDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void enterType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void exitType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void enterModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void exitModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void enterObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void exitObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void enterPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void exitPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void enterSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void exitSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void enterSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void exitSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void enterJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void exitJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void enterC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void exitC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void enterParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void exitParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRecord_declaration(PlSqlParser.Record_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRecord_declaration(PlSqlParser.Record_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_dec(PlSqlParser.Record_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_dec(PlSqlParser.Record_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_var_dec(PlSqlParser.Record_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_var_dec(PlSqlParser.Record_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTable_declaration(PlSqlParser.Table_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTable_declaration(PlSqlParser.Table_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_dec(PlSqlParser.Table_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_dec(PlSqlParser.Table_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void enterTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void exitTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_dec(PlSqlParser.Table_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_dec(PlSqlParser.Table_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void enterBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void exitBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PlSqlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PlSqlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collection_statement}.
	 * @param ctx the parse tree
	 */
	void enterCollection_statement(PlSqlParser.Collection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collection_statement}.
	 * @param ctx the parse tree
	 */
	void exitCollection_statement(PlSqlParser.Collection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pipe_row}.
	 * @param ctx the parse tree
	 */
	void enterPipe_row(PlSqlParser.Pipe_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pipe_row}.
	 * @param ctx the parse tree
	 */
	void exitPipe_row(PlSqlParser.Pipe_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_clause}.
	 * @param ctx the parse tree
	 */
	void enterException_clause(PlSqlParser.Exception_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_clause}.
	 * @param ctx the parse tree
	 */
	void exitException_clause(PlSqlParser.Exception_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void enterWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void exitWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void enterFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void exitFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void enterSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void exitSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void enterStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void exitStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void enterUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void exitUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void enterMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void exitMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void enterSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void exitSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void enterWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void exitWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void enterSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void exitSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterSql_cursor_expression(PlSqlParser.Sql_cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitSql_cursor_expression(PlSqlParser.Sql_cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collection_assoc_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_assoc_expression(PlSqlParser.Collection_assoc_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collection_assoc_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_assoc_expression(PlSqlParser.Collection_assoc_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collection_type_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_type_expression(PlSqlParser.Collection_type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collection_type_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_type_expression(PlSqlParser.Collection_type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(PlSqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(PlSqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#condition_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterCondition_wrapper(PlSqlParser.Condition_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#condition_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitCondition_wrapper(PlSqlParser.Condition_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expression_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterExpression_wrapper(PlSqlParser.Expression_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expression_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitExpression_wrapper(PlSqlParser.Expression_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(PlSqlParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(PlSqlParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegated_expression(PlSqlParser.Negated_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegated_expression(PlSqlParser.Negated_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(PlSqlParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(PlSqlParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_type(PlSqlParser.Multiset_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_type(PlSqlParser.Multiset_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#like_type}.
	 * @param ctx the parse tree
	 */
	void enterLike_type(PlSqlParser.Like_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#like_type}.
	 * @param ctx the parse tree
	 */
	void exitLike_type(PlSqlParser.Like_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void enterLike_escape_part(PlSqlParser.Like_escape_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void exitLike_escape_part(PlSqlParser.Like_escape_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void enterIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void exitIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void enterBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void exitBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#concatenation_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_wrapper(PlSqlParser.Concatenation_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#concatenation_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_wrapper(PlSqlParser.Concatenation_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(PlSqlParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(PlSqlParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_expression(PlSqlParser.Multiply_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_expression(PlSqlParser.Multiply_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(PlSqlParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(PlSqlParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_like_part(PlSqlParser.For_like_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_like_part(PlSqlParser.For_like_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void enterFor_increment_decrement_type(PlSqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void exitFor_increment_decrement_type(PlSqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void enterExpression_or_vector(PlSqlParser.Expression_or_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void exitExpression_or_vector(PlSqlParser.Expression_or_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVector_expr(PlSqlParser.Vector_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVector_expr(PlSqlParser.Vector_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#plsql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_type_conversion(PlSqlParser.Plsql_type_conversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#plsql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_type_conversion(PlSqlParser.Plsql_type_conversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void enterSql_type_conversion(PlSqlParser.Sql_type_conversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_type_conversion}.
	 * @param ctx the parse tree
	 */
	void exitSql_type_conversion(PlSqlParser.Sql_type_conversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void enterUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void exitUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void enterCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void exitCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void enterXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void exitXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#boolean_static_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_static_expression(PlSqlParser.Boolean_static_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#boolean_static_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_static_expression(PlSqlParser.Boolean_static_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#preprocessor_internal_statement}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_internal_statement(PlSqlParser.Preprocessor_internal_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#preprocessor_internal_statement}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_internal_statement(PlSqlParser.Preprocessor_internal_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#preprocessor_statement}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_statement(PlSqlParser.Preprocessor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#preprocessor_statement}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_statement(PlSqlParser.Preprocessor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_plus_command(PlSqlParser.Sql_plus_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_plus_command(PlSqlParser.Sql_plus_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_command(PlSqlParser.Whenever_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_command(PlSqlParser.Whenever_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_command(PlSqlParser.Set_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_command(PlSqlParser.Set_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void enterExit_command(PlSqlParser.Exit_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void exitExit_command(PlSqlParser.Exit_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void enterPrompt_command(PlSqlParser.Prompt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void exitPrompt_command(PlSqlParser.Prompt_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#call_sql_script_command}.
	 * @param ctx the parse tree
	 */
	void enterCall_sql_script_command(PlSqlParser.Call_sql_script_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#call_sql_script_command}.
	 * @param ctx the parse tree
	 */
	void exitCall_sql_script_command(PlSqlParser.Call_sql_script_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterAlias_quoted_string(PlSqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitAlias_quoted_string(PlSqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_of_clause(PlSqlParser.Current_of_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_of_clause(PlSqlParser.Current_of_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#into_clause_variable}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause_variable(PlSqlParser.Into_clause_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#into_clause_variable}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause_variable(PlSqlParser.Into_clause_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void enterXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void exitXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void enterCost_class_name(PlSqlParser.Cost_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void exitCost_class_name(PlSqlParser.Cost_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(PlSqlParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(PlSqlParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(PlSqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(PlSqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment_name(PlSqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment_name(PlSqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_name(PlSqlParser.Table_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_name(PlSqlParser.Table_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(PlSqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(PlSqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(PlSqlParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(PlSqlParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_type_name(PlSqlParser.Implementation_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_type_name(PlSqlParser.Implementation_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(PlSqlParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(PlSqlParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(PlSqlParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(PlSqlParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(PlSqlParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(PlSqlParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(PlSqlParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(PlSqlParser.Query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(PlSqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(PlSqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(PlSqlParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(PlSqlParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(PlSqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(PlSqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(PlSqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(PlSqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void enterRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void exitRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(PlSqlParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(PlSqlParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void enterLink_name(PlSqlParser.Link_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void exitLink_name(PlSqlParser.Link_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void enterRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void exitRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void enterNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void exitNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PlSqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PlSqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal_op(PlSqlParser.Not_equal_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal_op(PlSqlParser.Not_equal_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than_or_equals_op(PlSqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than_or_equals_op(PlSqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterLess_than_or_equals_op(PlSqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitLess_than_or_equals_op(PlSqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_op(PlSqlParser.Concatenation_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_op(PlSqlParser.Concatenation_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(PlSqlParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(PlSqlParser.Regular_idContext ctx);
}