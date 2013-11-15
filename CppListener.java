// Generated from Cpp.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppParser}.
 */
public interface CppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(@NotNull CppParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(@NotNull CppParser.Enum_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull CppParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull CppParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token(@NotNull CppParser.Balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token(@NotNull CppParser.Balanced_tokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_body(@NotNull CppParser.Namespace_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_body(@NotNull CppParser.Namespace_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#alias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAlias_declaration(@NotNull CppParser.Alias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#alias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAlias_declaration(@NotNull CppParser.Alias_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(@NotNull CppParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(@NotNull CppParser.Lambda_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(@NotNull CppParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(@NotNull CppParser.Constant_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_specifier(@NotNull CppParser.Function_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_specifier(@NotNull CppParser.Function_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#conversion_type_id}.
	 * @param ctx the parse tree
	 */
	void enterConversion_type_id(@NotNull CppParser.Conversion_type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conversion_type_id}.
	 * @param ctx the parse tree
	 */
	void exitConversion_type_id(@NotNull CppParser.Conversion_type_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#type_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier_seq(@NotNull CppParser.Type_specifier_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier_seq(@NotNull CppParser.Type_specifier_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration_list(@NotNull CppParser.Parameter_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration_list(@NotNull CppParser.Parameter_declaration_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#declaration_seq}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_seq(@NotNull CppParser.Declaration_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declaration_seq}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_seq(@NotNull CppParser.Declaration_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#pm_expression}.
	 * @param ctx the parse tree
	 */
	void enterPm_expression(@NotNull CppParser.Pm_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#pm_expression}.
	 * @param ctx the parse tree
	 */
	void exitPm_expression(@NotNull CppParser.Pm_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(@NotNull CppParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(@NotNull CppParser.Function_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#member_specification}.
	 * @param ctx the parse tree
	 */
	void enterMember_specification(@NotNull CppParser.Member_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#member_specification}.
	 * @param ctx the parse tree
	 */
	void exitMember_specification(@NotNull CppParser.Member_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#enum_key}.
	 * @param ctx the parse tree
	 */
	void enterEnum_key(@NotNull CppParser.Enum_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enum_key}.
	 * @param ctx the parse tree
	 */
	void exitEnum_key(@NotNull CppParser.Enum_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull CppParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull CppParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#ptr_declarator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_declarator(@NotNull CppParser.Ptr_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ptr_declarator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_declarator(@NotNull CppParser.Ptr_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#decltype_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltype_specifier(@NotNull CppParser.Decltype_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#decltype_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltype_specifier(@NotNull CppParser.Decltype_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#noptr_declarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptr_declarator(@NotNull CppParser.Noptr_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptr_declarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptr_declarator(@NotNull CppParser.Noptr_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#template_parameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_parameter(@NotNull CppParser.Template_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#template_parameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_parameter(@NotNull CppParser.Template_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#base_type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_specifier(@NotNull CppParser.Base_type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#base_type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_specifier(@NotNull CppParser.Base_type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#parameter_declaration_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration_clause(@NotNull CppParser.Parameter_declaration_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameter_declaration_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration_clause(@NotNull CppParser.Parameter_declaration_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#new_declarator}.
	 * @param ctx the parse tree
	 */
	void enterNew_declarator(@NotNull CppParser.New_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#new_declarator}.
	 * @param ctx the parse tree
	 */
	void exitNew_declarator(@NotNull CppParser.New_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull CppParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull CppParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#virt_specifier}.
	 * @param ctx the parse tree
	 */
	void enterVirt_specifier(@NotNull CppParser.Virt_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#virt_specifier}.
	 * @param ctx the parse tree
	 */
	void exitVirt_specifier(@NotNull CppParser.Virt_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(@NotNull CppParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(@NotNull CppParser.Enumerator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(@NotNull CppParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(@NotNull CppParser.Id_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#using_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUsing_declaration(@NotNull CppParser.Using_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#using_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUsing_declaration(@NotNull CppParser.Using_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#braced_init_list}.
	 * @param ctx the parse tree
	 */
	void enterBraced_init_list(@NotNull CppParser.Braced_init_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#braced_init_list}.
	 * @param ctx the parse tree
	 */
	void exitBraced_init_list(@NotNull CppParser.Braced_init_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(@NotNull CppParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(@NotNull CppParser.Type_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#class_head}.
	 * @param ctx the parse tree
	 */
	void enterClass_head(@NotNull CppParser.Class_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#class_head}.
	 * @param ctx the parse tree
	 */
	void exitClass_head(@NotNull CppParser.Class_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator_list(@NotNull CppParser.Member_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator_list(@NotNull CppParser.Member_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#capture_default}.
	 * @param ctx the parse tree
	 */
	void enterCapture_default(@NotNull CppParser.Capture_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#capture_default}.
	 * @param ctx the parse tree
	 */
	void exitCapture_default(@NotNull CppParser.Capture_defaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_scoped_token}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_scoped_token(@NotNull CppParser.Attribute_scoped_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_scoped_token}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_scoped_token(@NotNull CppParser.Attribute_scoped_tokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(@NotNull CppParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(@NotNull CppParser.Translation_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directive(@NotNull CppParser.Using_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directive(@NotNull CppParser.Using_directiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull CppParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull CppParser.Attribute_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(@NotNull CppParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(@NotNull CppParser.Attribute_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#alignment_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignment_specifier(@NotNull CppParser.Alignment_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#alignment_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignment_specifier(@NotNull CppParser.Alignment_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#original_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void enterOriginal_namespace_definition(@NotNull CppParser.Original_namespace_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#original_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void exitOriginal_namespace_definition(@NotNull CppParser.Original_namespace_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#decl_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDecl_specifier(@NotNull CppParser.Decl_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#decl_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDecl_specifier(@NotNull CppParser.Decl_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#namespace_alias}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_alias(@NotNull CppParser.Namespace_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespace_alias}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_alias(@NotNull CppParser.Namespace_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#noptr_abstract_pack_declarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptr_abstract_pack_declarator(@NotNull CppParser.Noptr_abstract_pack_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptr_abstract_pack_declarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptr_abstract_pack_declarator(@NotNull CppParser.Noptr_abstract_pack_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(@NotNull CppParser.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(@NotNull CppParser.Simple_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(@NotNull CppParser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(@NotNull CppParser.Abstract_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull CppParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull CppParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#alignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAlignment_expression(@NotNull CppParser.Alignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#alignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAlignment_expression(@NotNull CppParser.Alignment_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull CppParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull CppParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(@NotNull CppParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(@NotNull CppParser.Selection_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#cv_qualifier_seq}.
	 * @param ctx the parse tree
	 */
	void enterCv_qualifier_seq(@NotNull CppParser.Cv_qualifier_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#cv_qualifier_seq}.
	 * @param ctx the parse tree
	 */
	void exitCv_qualifier_seq(@NotNull CppParser.Cv_qualifier_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#explicit_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_instantiation(@NotNull CppParser.Explicit_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#explicit_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_instantiation(@NotNull CppParser.Explicit_instantiationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(@NotNull CppParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(@NotNull CppParser.Expression_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(@NotNull CppParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(@NotNull CppParser.Iteration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#pseudo_destructor_name}.
	 * @param ctx the parse tree
	 */
	void enterPseudo_destructor_name(@NotNull CppParser.Pseudo_destructor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#pseudo_destructor_name}.
	 * @param ctx the parse tree
	 */
	void exitPseudo_destructor_name(@NotNull CppParser.Pseudo_destructor_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull CppParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull CppParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_token}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_token(@NotNull CppParser.Attribute_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_token}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_token(@NotNull CppParser.Attribute_tokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void enterNew_expression(@NotNull CppParser.New_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void exitNew_expression(@NotNull CppParser.New_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CppParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CppParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull CppParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull CppParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#base_clause}.
	 * @param ctx the parse tree
	 */
	void enterBase_clause(@NotNull CppParser.Base_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#base_clause}.
	 * @param ctx the parse tree
	 */
	void exitBase_clause(@NotNull CppParser.Base_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(@NotNull CppParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(@NotNull CppParser.Jump_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#new_type_id}.
	 * @param ctx the parse tree
	 */
	void enterNew_type_id(@NotNull CppParser.New_type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#new_type_id}.
	 * @param ctx the parse tree
	 */
	void exitNew_type_id(@NotNull CppParser.New_type_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#balanced_token_seq}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token_seq(@NotNull CppParser.Balanced_token_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#balanced_token_seq}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token_seq(@NotNull CppParser.Balanced_token_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_specifier(@NotNull CppParser.Access_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_specifier(@NotNull CppParser.Access_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull CppParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull CppParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#lambda_introducer}.
	 * @param ctx the parse tree
	 */
	void enterLambda_introducer(@NotNull CppParser.Lambda_introducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambda_introducer}.
	 * @param ctx the parse tree
	 */
	void exitLambda_introducer(@NotNull CppParser.Lambda_introducerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#enumerator_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_definition(@NotNull CppParser.Enumerator_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumerator_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_definition(@NotNull CppParser.Enumerator_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull CppParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull CppParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull CppParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull CppParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#entrance}.
	 * @param ctx the parse tree
	 */
	void enterEntrance(@NotNull CppParser.EntranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#entrance}.
	 * @param ctx the parse tree
	 */
	void exitEntrance(@NotNull CppParser.EntranceContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#extension_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void enterExtension_namespace_definition(@NotNull CppParser.Extension_namespace_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#extension_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void exitExtension_namespace_definition(@NotNull CppParser.Extension_namespace_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#namespace_definition}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_definition(@NotNull CppParser.Namespace_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespace_definition}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_definition(@NotNull CppParser.Namespace_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#unqualified_id}.
	 * @param ctx the parse tree
	 */
	void enterUnqualified_id(@NotNull CppParser.Unqualified_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unqualified_id}.
	 * @param ctx the parse tree
	 */
	void exitUnqualified_id(@NotNull CppParser.Unqualified_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#noptr_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptr_abstract_declarator(@NotNull CppParser.Noptr_abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptr_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptr_abstract_declarator(@NotNull CppParser.Noptr_abstract_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(@NotNull CppParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(@NotNull CppParser.Init_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(@NotNull CppParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(@NotNull CppParser.Logical_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(@NotNull CppParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(@NotNull CppParser.Init_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#new_initializer}.
	 * @param ctx the parse tree
	 */
	void enterNew_initializer(@NotNull CppParser.New_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#new_initializer}.
	 * @param ctx the parse tree
	 */
	void exitNew_initializer(@NotNull CppParser.New_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(@NotNull CppParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(@NotNull CppParser.Labeled_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#typename_specifier}.
	 * @param ctx the parse tree
	 */
	void enterTypename_specifier(@NotNull CppParser.Typename_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typename_specifier}.
	 * @param ctx the parse tree
	 */
	void exitTypename_specifier(@NotNull CppParser.Typename_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#block_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_declaration(@NotNull CppParser.Block_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#block_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_declaration(@NotNull CppParser.Block_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#lambda_capture}.
	 * @param ctx the parse tree
	 */
	void enterLambda_capture(@NotNull CppParser.Lambda_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambda_capture}.
	 * @param ctx the parse tree
	 */
	void exitLambda_capture(@NotNull CppParser.Lambda_captureContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_operator(@NotNull CppParser.Ptr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_operator(@NotNull CppParser.Ptr_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull CppParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull CppParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#template_argument}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_argument(@NotNull CppParser.Template_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#template_argument}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_argument(@NotNull CppParser.Template_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter(@NotNull CppParser.Type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter(@NotNull CppParser.Type_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(@NotNull CppParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(@NotNull CppParser.Declaration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#for_range_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_initializer(@NotNull CppParser.For_range_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#for_range_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_initializer(@NotNull CppParser.For_range_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull CppParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull CppParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_name(@NotNull CppParser.Namespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_name(@NotNull CppParser.Namespace_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull CppParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull CppParser.Class_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull CppParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull CppParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(@NotNull CppParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(@NotNull CppParser.Logical_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator(@NotNull CppParser.Member_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator(@NotNull CppParser.Member_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#explicit_specialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_specialization(@NotNull CppParser.Explicit_specializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#explicit_specialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_specialization(@NotNull CppParser.Explicit_specializationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(@NotNull CppParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(@NotNull CppParser.Type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#conversion_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConversion_declarator(@NotNull CppParser.Conversion_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conversion_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConversion_declarator(@NotNull CppParser.Conversion_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull CppParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull CppParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#template_id}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_id(@NotNull CppParser.Template_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#template_id}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_id(@NotNull CppParser.Template_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#mem_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterMem_initializer_list(@NotNull CppParser.Mem_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#mem_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitMem_initializer_list(@NotNull CppParser.Mem_initializer_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#namespace_alias_definition}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_alias_definition(@NotNull CppParser.Namespace_alias_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespace_alias_definition}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_alias_definition(@NotNull CppParser.Namespace_alias_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#new_placement}.
	 * @param ctx the parse tree
	 */
	void enterNew_placement(@NotNull CppParser.New_placementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#new_placement}.
	 * @param ctx the parse tree
	 */
	void exitNew_placement(@NotNull CppParser.New_placementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#literal_operator_id}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_operator_id(@NotNull CppParser.Literal_operator_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#literal_operator_id}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_operator_id(@NotNull CppParser.Literal_operator_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(@NotNull CppParser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(@NotNull CppParser.Enum_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#linkage_specification}.
	 * @param ctx the parse tree
	 */
	void enterLinkage_specification(@NotNull CppParser.Linkage_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#linkage_specification}.
	 * @param ctx the parse tree
	 */
	void exitLinkage_specification(@NotNull CppParser.Linkage_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#try_block}.
	 * @param ctx the parse tree
	 */
	void enterTry_block(@NotNull CppParser.Try_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#try_block}.
	 * @param ctx the parse tree
	 */
	void exitTry_block(@NotNull CppParser.Try_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#exception_specification}.
	 * @param ctx the parse tree
	 */
	void enterException_specification(@NotNull CppParser.Exception_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#exception_specification}.
	 * @param ctx the parse tree
	 */
	void exitException_specification(@NotNull CppParser.Exception_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#dynamic_exception_specification}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_exception_specification(@NotNull CppParser.Dynamic_exception_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#dynamic_exception_specification}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_exception_specification(@NotNull CppParser.Dynamic_exception_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#class_key}.
	 * @param ctx the parse tree
	 */
	void enterClass_key(@NotNull CppParser.Class_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#class_key}.
	 * @param ctx the parse tree
	 */
	void exitClass_key(@NotNull CppParser.Class_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull CppParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull CppParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#trailing_type_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_type_specifier_seq(@NotNull CppParser.Trailing_type_specifier_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#trailing_type_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_type_specifier_seq(@NotNull CppParser.Trailing_type_specifier_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#original_namespace_name}.
	 * @param ctx the parse tree
	 */
	void enterOriginal_namespace_name(@NotNull CppParser.Original_namespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#original_namespace_name}.
	 * @param ctx the parse tree
	 */
	void exitOriginal_namespace_name(@NotNull CppParser.Original_namespace_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#noptr_new_declarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptr_new_declarator(@NotNull CppParser.Noptr_new_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptr_new_declarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptr_new_declarator(@NotNull CppParser.Noptr_new_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#simple_type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type_specifier(@NotNull CppParser.Simple_type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#simple_type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type_specifier(@NotNull CppParser.Simple_type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#template_name}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_name(@NotNull CppParser.Template_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#template_name}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_name(@NotNull CppParser.Template_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#template_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_declaration(@NotNull CppParser.Template_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#template_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_declaration(@NotNull CppParser.Template_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(@NotNull CppParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(@NotNull CppParser.For_init_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#pure_specifier}.
	 * @param ctx the parse tree
	 */
	void enterPure_specifier(@NotNull CppParser.Pure_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#pure_specifier}.
	 * @param ctx the parse tree
	 */
	void exitPure_specifier(@NotNull CppParser.Pure_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#ctor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCtor_initializer(@NotNull CppParser.Ctor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ctor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCtor_initializer(@NotNull CppParser.Ctor_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#conversion_function_id}.
	 * @param ctx the parse tree
	 */
	void enterConversion_function_id(@NotNull CppParser.Conversion_function_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conversion_function_id}.
	 * @param ctx the parse tree
	 */
	void exitConversion_function_id(@NotNull CppParser.Conversion_function_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#type_id_list}.
	 * @param ctx the parse tree
	 */
	void enterType_id_list(@NotNull CppParser.Type_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_id_list}.
	 * @param ctx the parse tree
	 */
	void exitType_id_list(@NotNull CppParser.Type_id_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#mem_initializer_id}.
	 * @param ctx the parse tree
	 */
	void enterMem_initializer_id(@NotNull CppParser.Mem_initializer_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#mem_initializer_id}.
	 * @param ctx the parse tree
	 */
	void exitMem_initializer_id(@NotNull CppParser.Mem_initializer_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(@NotNull CppParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(@NotNull CppParser.CaptureContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#trailing_return_type}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_return_type(@NotNull CppParser.Trailing_return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#trailing_return_type}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_return_type(@NotNull CppParser.Trailing_return_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(@NotNull CppParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(@NotNull CppParser.Assignment_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(@NotNull CppParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(@NotNull CppParser.HandlerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void enterEnum_base(@NotNull CppParser.Enum_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enum_base}.
	 * @param ctx the parse tree
	 */
	void exitEnum_base(@NotNull CppParser.Enum_baseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#nested_name_specifier}.
	 * @param ctx the parse tree
	 */
	void enterNested_name_specifier(@NotNull CppParser.Nested_name_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#nested_name_specifier}.
	 * @param ctx the parse tree
	 */
	void exitNested_name_specifier(@NotNull CppParser.Nested_name_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMember_declaration(@NotNull CppParser.Member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMember_declaration(@NotNull CppParser.Member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#unnamed_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void enterUnnamed_namespace_definition(@NotNull CppParser.Unnamed_namespace_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unnamed_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void exitUnnamed_namespace_definition(@NotNull CppParser.Unnamed_namespace_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull CppParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull CppParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#function_try_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_try_block(@NotNull CppParser.Function_try_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#function_try_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_try_block(@NotNull CppParser.Function_try_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#parameters_and_qualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParameters_and_qualifiers(@NotNull CppParser.Parameters_and_qualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameters_and_qualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParameters_and_qualifiers(@NotNull CppParser.Parameters_and_qualifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#linked_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterLinked_string_literal(@NotNull CppParser.Linked_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#linked_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitLinked_string_literal(@NotNull CppParser.Linked_string_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#initializer_clause}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_clause(@NotNull CppParser.Initializer_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializer_clause}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_clause(@NotNull CppParser.Initializer_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CppParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#static_assert_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assert_declaration(@NotNull CppParser.Static_assert_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#static_assert_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assert_declaration(@NotNull CppParser.Static_assert_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_namespace}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_namespace(@NotNull CppParser.Attribute_namespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_namespace}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_namespace(@NotNull CppParser.Attribute_namespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#mem_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMem_initializer(@NotNull CppParser.Mem_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#mem_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMem_initializer(@NotNull CppParser.Mem_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#class_or_decltype}.
	 * @param ctx the parse tree
	 */
	void enterClass_or_decltype(@NotNull CppParser.Class_or_decltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#class_or_decltype}.
	 * @param ctx the parse tree
	 */
	void exitClass_or_decltype(@NotNull CppParser.Class_or_decltypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CppParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CppParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#trailing_type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_type_specifier(@NotNull CppParser.Trailing_type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#trailing_type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_type_specifier(@NotNull CppParser.Trailing_type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#for_range_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_declaration(@NotNull CppParser.For_range_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#for_range_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_declaration(@NotNull CppParser.For_range_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#class_head_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_head_name(@NotNull CppParser.Class_head_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#class_head_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_head_name(@NotNull CppParser.Class_head_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#brace_or_equal_initializer}.
	 * @param ctx the parse tree
	 */
	void enterBrace_or_equal_initializer(@NotNull CppParser.Brace_or_equal_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#brace_or_equal_initializer}.
	 * @param ctx the parse tree
	 */
	void exitBrace_or_equal_initializer(@NotNull CppParser.Brace_or_equal_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#empty_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_declaration(@NotNull CppParser.Empty_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#empty_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_declaration(@NotNull CppParser.Empty_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#decl_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void enterDecl_specifier_seq(@NotNull CppParser.Decl_specifier_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#decl_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void exitDecl_specifier_seq(@NotNull CppParser.Decl_specifier_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(@NotNull CppParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(@NotNull CppParser.Exception_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#enum_header}.
	 * @param ctx the parse tree
	 */
	void enterEnum_header(@NotNull CppParser.Enum_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enum_header}.
	 * @param ctx the parse tree
	 */
	void exitEnum_header(@NotNull CppParser.Enum_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_clause(@NotNull CppParser.Attribute_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_clause(@NotNull CppParser.Attribute_argument_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#statement_seq}.
	 * @param ctx the parse tree
	 */
	void enterStatement_seq(@NotNull CppParser.Statement_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#statement_seq}.
	 * @param ctx the parse tree
	 */
	void exitStatement_seq(@NotNull CppParser.Statement_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#throw_expression}.
	 * @param ctx the parse tree
	 */
	void enterThrow_expression(@NotNull CppParser.Throw_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#throw_expression}.
	 * @param ctx the parse tree
	 */
	void exitThrow_expression(@NotNull CppParser.Throw_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#asm_definition}.
	 * @param ctx the parse tree
	 */
	void enterAsm_definition(@NotNull CppParser.Asm_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#asm_definition}.
	 * @param ctx the parse tree
	 */
	void exitAsm_definition(@NotNull CppParser.Asm_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(@NotNull CppParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(@NotNull CppParser.Cast_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#opaque_enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaque_enum_declaration(@NotNull CppParser.Opaque_enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#opaque_enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaque_enum_declaration(@NotNull CppParser.Opaque_enum_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#ptr_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_abstract_declarator(@NotNull CppParser.Ptr_abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ptr_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_abstract_declarator(@NotNull CppParser.Ptr_abstract_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void enterQualified_id(@NotNull CppParser.Qualified_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void exitQualified_id(@NotNull CppParser.Qualified_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#noexcept_specification}.
	 * @param ctx the parse tree
	 */
	void enterNoexcept_specification(@NotNull CppParser.Noexcept_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noexcept_specification}.
	 * @param ctx the parse tree
	 */
	void exitNoexcept_specification(@NotNull CppParser.Noexcept_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(@NotNull CppParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(@NotNull CppParser.Postfix_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull CppParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull CppParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#lambda_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLambda_declarator(@NotNull CppParser.Lambda_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambda_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLambda_declarator(@NotNull CppParser.Lambda_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(@NotNull CppParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(@NotNull CppParser.Function_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#delete_expression}.
	 * @param ctx the parse tree
	 */
	void enterDelete_expression(@NotNull CppParser.Delete_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#delete_expression}.
	 * @param ctx the parse tree
	 */
	void exitDelete_expression(@NotNull CppParser.Delete_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#base_specifier_list}.
	 * @param ctx the parse tree
	 */
	void enterBase_specifier_list(@NotNull CppParser.Base_specifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#base_specifier_list}.
	 * @param ctx the parse tree
	 */
	void exitBase_specifier_list(@NotNull CppParser.Base_specifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#qualified_namespace_specifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_namespace_specifier(@NotNull CppParser.Qualified_namespace_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#qualified_namespace_specifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_namespace_specifier(@NotNull CppParser.Qualified_namespace_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_specifier(@NotNull CppParser.Class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_specifier(@NotNull CppParser.Class_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_name(@NotNull CppParser.Typedef_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_name(@NotNull CppParser.Typedef_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull CppParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull CppParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#operator_function_id}.
	 * @param ctx the parse tree
	 */
	void enterOperator_function_id(@NotNull CppParser.Operator_function_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#operator_function_id}.
	 * @param ctx the parse tree
	 */
	void exitOperator_function_id(@NotNull CppParser.Operator_function_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#base_specifier}.
	 * @param ctx the parse tree
	 */
	void enterBase_specifier(@NotNull CppParser.Base_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#base_specifier}.
	 * @param ctx the parse tree
	 */
	void exitBase_specifier(@NotNull CppParser.Base_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#virt_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void enterVirt_specifier_seq(@NotNull CppParser.Virt_specifier_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#virt_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void exitVirt_specifier_seq(@NotNull CppParser.Virt_specifier_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#template_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_parameter_list(@NotNull CppParser.Template_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#template_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_parameter_list(@NotNull CppParser.Template_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull CppParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull CppParser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_specifier(@NotNull CppParser.Attribute_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_specifier(@NotNull CppParser.Attribute_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(@NotNull CppParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(@NotNull CppParser.Initializer_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#class_virt_specifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_virt_specifier(@NotNull CppParser.Class_virt_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#class_virt_specifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_virt_specifier(@NotNull CppParser.Class_virt_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#template_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_argument_list(@NotNull CppParser.Template_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#template_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_argument_list(@NotNull CppParser.Template_argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#noexcept_expression}.
	 * @param ctx the parse tree
	 */
	void enterNoexcept_expression(@NotNull CppParser.Noexcept_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noexcept_expression}.
	 * @param ctx the parse tree
	 */
	void exitNoexcept_expression(@NotNull CppParser.Noexcept_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#cv_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterCv_qualifier(@NotNull CppParser.Cv_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#cv_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitCv_qualifier(@NotNull CppParser.Cv_qualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(@NotNull CppParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(@NotNull CppParser.Parameter_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull CppParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull CppParser.Expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#declarator_id}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator_id(@NotNull CppParser.Declarator_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declarator_id}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator_id(@NotNull CppParser.Declarator_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#handler_seq}.
	 * @param ctx the parse tree
	 */
	void enterHandler_seq(@NotNull CppParser.Handler_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#handler_seq}.
	 * @param ctx the parse tree
	 */
	void exitHandler_seq(@NotNull CppParser.Handler_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull CppParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull CppParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(@NotNull CppParser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(@NotNull CppParser.Storage_class_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#simple_template_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_template_id(@NotNull CppParser.Simple_template_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#simple_template_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_template_id(@NotNull CppParser.Simple_template_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list(@NotNull CppParser.Capture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list(@NotNull CppParser.Capture_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#abstract_pack_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_pack_declarator(@NotNull CppParser.Abstract_pack_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#abstract_pack_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_pack_declarator(@NotNull CppParser.Abstract_pack_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#elaborated_type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterElaborated_type_specifier(@NotNull CppParser.Elaborated_type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#elaborated_type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitElaborated_type_specifier(@NotNull CppParser.Elaborated_type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#attribute_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_specifier_seq(@NotNull CppParser.Attribute_specifier_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute_specifier_seq}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_specifier_seq(@NotNull CppParser.Attribute_specifier_seqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#named_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void enterNamed_namespace_definition(@NotNull CppParser.Named_namespace_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#named_namespace_definition}.
	 * @param ctx the parse tree
	 */
	void exitNamed_namespace_definition(@NotNull CppParser.Named_namespace_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CppParser#ref_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterRef_qualifier(@NotNull CppParser.Ref_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ref_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitRef_qualifier(@NotNull CppParser.Ref_qualifierContext ctx);
}