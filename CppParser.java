// Generated from Cpp.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CppParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__120=1, T__119=2, T__118=3, T__117=4, T__116=5, T__115=6, T__114=7, 
		T__113=8, T__112=9, T__111=10, T__110=11, T__109=12, T__108=13, T__107=14, 
		T__106=15, T__105=16, T__104=17, T__103=18, T__102=19, T__101=20, T__100=21, 
		T__99=22, T__98=23, T__97=24, T__96=25, T__95=26, T__94=27, T__93=28, 
		T__92=29, T__91=30, T__90=31, T__89=32, T__88=33, T__87=34, T__86=35, 
		T__85=36, T__84=37, T__83=38, T__82=39, T__81=40, T__80=41, T__79=42, 
		T__78=43, T__77=44, T__76=45, T__75=46, T__74=47, T__73=48, T__72=49, 
		T__71=50, T__70=51, T__69=52, T__68=53, T__67=54, T__66=55, T__65=56, 
		T__64=57, T__63=58, T__62=59, T__61=60, T__60=61, T__59=62, T__58=63, 
		T__57=64, T__56=65, T__55=66, T__54=67, T__53=68, T__52=69, T__51=70, 
		T__50=71, T__49=72, T__48=73, T__47=74, T__46=75, T__45=76, T__44=77, 
		T__43=78, T__42=79, T__41=80, T__40=81, T__39=82, T__38=83, T__37=84, 
		T__36=85, T__35=86, T__34=87, T__33=88, T__32=89, T__31=90, T__30=91, 
		T__29=92, T__28=93, T__27=94, T__26=95, T__25=96, T__24=97, T__23=98, 
		T__22=99, T__21=100, T__20=101, T__19=102, T__18=103, T__17=104, T__16=105, 
		T__15=106, T__14=107, T__13=108, T__12=109, T__11=110, T__10=111, T__9=112, 
		T__8=113, T__7=114, T__6=115, T__5=116, T__4=117, T__3=118, T__2=119, 
		T__1=120, T__0=121, IDENTIFIER=122, INTEGER_LITERAL=123, FLOATING_LITERAL=124, 
		CHARACTER_LITERAL=125, STRING_LITERAL=126, BOOLEAN_LITERAL=127, POINTER_LITERAL=128, 
		UDEF_LITERAL=129, NON_BRACES_CHAR=130, WS=131, COMMENT=132, COMMENT2=133;
	public static final String[] tokenNames = {
		"<INVALID>", "'while'", "'>>='", "'='", "'return'", "'-='", "'^'", "'break'", 
		"'typeid'", "'struct'", "'%='", "'mutable'", "'throw'", "'!='", "','", 
		"'^='", "'>>'", "'&&'", "'public'", "'delete'", "'<'", "']'", "'~'", "'char'", 
		"'volatile'", "'+'", "'>='", "'int'", "'operator'", "'typename'", "'static_assert'", 
		"'bool'", "'constexpr'", "';'", "'asm'", "'catch'", "'}'", "'<<='", "'char16_t'", 
		"'*='", "'\"'", "'&='", "'inline'", "'template'", "'*'", "'virtual'", 
		"'protected'", "'register'", "'class'", "':'", "'override'", "'['", "'namespace'", 
		"'|'", "'auto'", "'!'", "'wchar_t'", "'unsigned'", "'sizeof'", "')'", 
		"'signed'", "'this'", "'extern'", "'|='", "'enum'", "'decltype'", "'do'", 
		"'{'", "'try'", "'static'", "'/='", "'double'", "'+='", "'switch'", "'('", 
		"'const_cast'", "'long'", "'.*'", "'::'", "'static_cast'", "'goto'", "'final'", 
		"'->*'", "'void'", "'else'", "'friend'", "'++'", "'/'", "'<='", "'reinterpret_cast'", 
		"'alignas'", "'char32_t'", "'float'", "'alignof'", "'case'", "'?'", "'new'", 
		"'default'", "'explicit'", "'private'", "'thread_local'", "'&'", "'for'", 
		"'typedef'", "'if'", "'.'", "'...'", "'<<'", "'||'", "'union'", "'continue'", 
		"'short'", "'>'", "'->'", "'const'", "'using'", "'%'", "'noexcept'", "'dynamic_cast'", 
		"'-'", "'--'", "'=='", "IDENTIFIER", "INTEGER_LITERAL", "FLOATING_LITERAL", 
		"CHARACTER_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "POINTER_LITERAL", 
		"UDEF_LITERAL", "NON_BRACES_CHAR", "WS", "COMMENT", "COMMENT2"
	};
	public static final int
		RULE_translation_unit = 0, RULE_entrance = 1, RULE_primary_expression = 2, 
		RULE_literal = 3, RULE_linked_string_literal = 4, RULE_id_expression = 5, 
		RULE_unqualified_id = 6, RULE_qualified_id = 7, RULE_nested_name_specifier = 8, 
		RULE_lambda_expression = 9, RULE_lambda_introducer = 10, RULE_lambda_capture = 11, 
		RULE_capture_default = 12, RULE_capture_list = 13, RULE_capture = 14, 
		RULE_lambda_declarator = 15, RULE_postfix_expression = 16, RULE_expression_list = 17, 
		RULE_pseudo_destructor_name = 18, RULE_unary_expression = 19, RULE_noexcept_expression = 20, 
		RULE_new_expression = 21, RULE_new_placement = 22, RULE_new_type_id = 23, 
		RULE_new_declarator = 24, RULE_noptr_new_declarator = 25, RULE_new_initializer = 26, 
		RULE_delete_expression = 27, RULE_cast_expression = 28, RULE_pm_expression = 29, 
		RULE_multiplicative_expression = 30, RULE_additive_expression = 31, RULE_shift_expression = 32, 
		RULE_relational_expression = 33, RULE_equality_expression = 34, RULE_and_expression = 35, 
		RULE_exclusive_or_expression = 36, RULE_inclusive_or_expression = 37, 
		RULE_logical_and_expression = 38, RULE_logical_or_expression = 39, RULE_conditional_expression = 40, 
		RULE_assignment_expression = 41, RULE_expression = 42, RULE_constant_expression = 43, 
		RULE_statement = 44, RULE_labeled_statement = 45, RULE_expression_statement = 46, 
		RULE_compound_statement = 47, RULE_statement_seq = 48, RULE_selection_statement = 49, 
		RULE_condition = 50, RULE_iteration_statement = 51, RULE_for_init_statement = 52, 
		RULE_for_range_declaration = 53, RULE_for_range_initializer = 54, RULE_jump_statement = 55, 
		RULE_declaration_statement = 56, RULE_declaration_seq = 57, RULE_declaration = 58, 
		RULE_block_declaration = 59, RULE_alias_declaration = 60, RULE_simple_declaration = 61, 
		RULE_static_assert_declaration = 62, RULE_empty_declaration = 63, RULE_attribute_declaration = 64, 
		RULE_decl_specifier_seq = 65, RULE_decl_specifier = 66, RULE_storage_class_specifier = 67, 
		RULE_function_specifier = 68, RULE_typedef_name = 69, RULE_type_specifier = 70, 
		RULE_trailing_type_specifier = 71, RULE_type_specifier_seq = 72, RULE_trailing_type_specifier_seq = 73, 
		RULE_simple_type_specifier = 74, RULE_type_name = 75, RULE_decltype_specifier = 76, 
		RULE_elaborated_type_specifier = 77, RULE_enum_name = 78, RULE_enum_specifier = 79, 
		RULE_enum_header = 80, RULE_opaque_enum_declaration = 81, RULE_enum_key = 82, 
		RULE_enum_base = 83, RULE_enumerator_list = 84, RULE_enumerator_definition = 85, 
		RULE_enumerator = 86, RULE_namespace_name = 87, RULE_original_namespace_name = 88, 
		RULE_namespace_alias = 89, RULE_namespace_definition = 90, RULE_named_namespace_definition = 91, 
		RULE_original_namespace_definition = 92, RULE_extension_namespace_definition = 93, 
		RULE_unnamed_namespace_definition = 94, RULE_namespace_body = 95, RULE_namespace_alias_definition = 96, 
		RULE_qualified_namespace_specifier = 97, RULE_using_declaration = 98, 
		RULE_using_directive = 99, RULE_asm_definition = 100, RULE_linkage_specification = 101, 
		RULE_attribute_specifier_seq = 102, RULE_attribute_specifier = 103, RULE_alignment_specifier = 104, 
		RULE_alignment_expression = 105, RULE_attribute_list = 106, RULE_attribute = 107, 
		RULE_attribute_token = 108, RULE_attribute_scoped_token = 109, RULE_attribute_namespace = 110, 
		RULE_attribute_argument_clause = 111, RULE_balanced_token_seq = 112, RULE_balanced_token = 113, 
		RULE_init_declarator_list = 114, RULE_init_declarator = 115, RULE_declarator = 116, 
		RULE_ptr_declarator = 117, RULE_noptr_declarator = 118, RULE_parameters_and_qualifiers = 119, 
		RULE_trailing_return_type = 120, RULE_ptr_operator = 121, RULE_cv_qualifier_seq = 122, 
		RULE_cv_qualifier = 123, RULE_ref_qualifier = 124, RULE_declarator_id = 125, 
		RULE_type_id = 126, RULE_abstract_declarator = 127, RULE_ptr_abstract_declarator = 128, 
		RULE_noptr_abstract_declarator = 129, RULE_abstract_pack_declarator = 130, 
		RULE_noptr_abstract_pack_declarator = 131, RULE_parameter_declaration_clause = 132, 
		RULE_parameter_declaration_list = 133, RULE_parameter_declaration = 134, 
		RULE_function_definition = 135, RULE_function_body = 136, RULE_initializer = 137, 
		RULE_brace_or_equal_initializer = 138, RULE_initializer_clause = 139, 
		RULE_initializer_list = 140, RULE_braced_init_list = 141, RULE_class_name = 142, 
		RULE_class_specifier = 143, RULE_class_head = 144, RULE_class_head_name = 145, 
		RULE_class_virt_specifier = 146, RULE_class_key = 147, RULE_member_specification = 148, 
		RULE_member_declaration = 149, RULE_member_declarator_list = 150, RULE_member_declarator = 151, 
		RULE_virt_specifier_seq = 152, RULE_virt_specifier = 153, RULE_pure_specifier = 154, 
		RULE_base_clause = 155, RULE_base_specifier_list = 156, RULE_base_specifier = 157, 
		RULE_class_or_decltype = 158, RULE_base_type_specifier = 159, RULE_access_specifier = 160, 
		RULE_conversion_function_id = 161, RULE_conversion_type_id = 162, RULE_conversion_declarator = 163, 
		RULE_ctor_initializer = 164, RULE_mem_initializer_list = 165, RULE_mem_initializer = 166, 
		RULE_mem_initializer_id = 167, RULE_operator_function_id = 168, RULE_operator = 169, 
		RULE_literal_operator_id = 170, RULE_template_declaration = 171, RULE_template_parameter_list = 172, 
		RULE_template_parameter = 173, RULE_type_parameter = 174, RULE_simple_template_id = 175, 
		RULE_template_id = 176, RULE_template_name = 177, RULE_template_argument_list = 178, 
		RULE_template_argument = 179, RULE_typename_specifier = 180, RULE_explicit_instantiation = 181, 
		RULE_explicit_specialization = 182, RULE_try_block = 183, RULE_function_try_block = 184, 
		RULE_handler_seq = 185, RULE_handler = 186, RULE_exception_declaration = 187, 
		RULE_throw_expression = 188, RULE_exception_specification = 189, RULE_dynamic_exception_specification = 190, 
		RULE_type_id_list = 191, RULE_noexcept_specification = 192;
	public static final String[] ruleNames = {
		"translation_unit", "entrance", "primary_expression", "literal", "linked_string_literal", 
		"id_expression", "unqualified_id", "qualified_id", "nested_name_specifier", 
		"lambda_expression", "lambda_introducer", "lambda_capture", "capture_default", 
		"capture_list", "capture", "lambda_declarator", "postfix_expression", 
		"expression_list", "pseudo_destructor_name", "unary_expression", "noexcept_expression", 
		"new_expression", "new_placement", "new_type_id", "new_declarator", "noptr_new_declarator", 
		"new_initializer", "delete_expression", "cast_expression", "pm_expression", 
		"multiplicative_expression", "additive_expression", "shift_expression", 
		"relational_expression", "equality_expression", "and_expression", "exclusive_or_expression", 
		"inclusive_or_expression", "logical_and_expression", "logical_or_expression", 
		"conditional_expression", "assignment_expression", "expression", "constant_expression", 
		"statement", "labeled_statement", "expression_statement", "compound_statement", 
		"statement_seq", "selection_statement", "condition", "iteration_statement", 
		"for_init_statement", "for_range_declaration", "for_range_initializer", 
		"jump_statement", "declaration_statement", "declaration_seq", "declaration", 
		"block_declaration", "alias_declaration", "simple_declaration", "static_assert_declaration", 
		"empty_declaration", "attribute_declaration", "decl_specifier_seq", "decl_specifier", 
		"storage_class_specifier", "function_specifier", "typedef_name", "type_specifier", 
		"trailing_type_specifier", "type_specifier_seq", "trailing_type_specifier_seq", 
		"simple_type_specifier", "type_name", "decltype_specifier", "elaborated_type_specifier", 
		"enum_name", "enum_specifier", "enum_header", "opaque_enum_declaration", 
		"enum_key", "enum_base", "enumerator_list", "enumerator_definition", "enumerator", 
		"namespace_name", "original_namespace_name", "namespace_alias", "namespace_definition", 
		"named_namespace_definition", "original_namespace_definition", "extension_namespace_definition", 
		"unnamed_namespace_definition", "namespace_body", "namespace_alias_definition", 
		"qualified_namespace_specifier", "using_declaration", "using_directive", 
		"asm_definition", "linkage_specification", "attribute_specifier_seq", 
		"attribute_specifier", "alignment_specifier", "alignment_expression", 
		"attribute_list", "attribute", "attribute_token", "attribute_scoped_token", 
		"attribute_namespace", "attribute_argument_clause", "balanced_token_seq", 
		"balanced_token", "init_declarator_list", "init_declarator", "declarator", 
		"ptr_declarator", "noptr_declarator", "parameters_and_qualifiers", "trailing_return_type", 
		"ptr_operator", "cv_qualifier_seq", "cv_qualifier", "ref_qualifier", "declarator_id", 
		"type_id", "abstract_declarator", "ptr_abstract_declarator", "noptr_abstract_declarator", 
		"abstract_pack_declarator", "noptr_abstract_pack_declarator", "parameter_declaration_clause", 
		"parameter_declaration_list", "parameter_declaration", "function_definition", 
		"function_body", "initializer", "brace_or_equal_initializer", "initializer_clause", 
		"initializer_list", "braced_init_list", "class_name", "class_specifier", 
		"class_head", "class_head_name", "class_virt_specifier", "class_key", 
		"member_specification", "member_declaration", "member_declarator_list", 
		"member_declarator", "virt_specifier_seq", "virt_specifier", "pure_specifier", 
		"base_clause", "base_specifier_list", "base_specifier", "class_or_decltype", 
		"base_type_specifier", "access_specifier", "conversion_function_id", "conversion_type_id", 
		"conversion_declarator", "ctor_initializer", "mem_initializer_list", "mem_initializer", 
		"mem_initializer_id", "operator_function_id", "operator", "literal_operator_id", 
		"template_declaration", "template_parameter_list", "template_parameter", 
		"type_parameter", "simple_template_id", "template_id", "template_name", 
		"template_argument_list", "template_argument", "typename_specifier", "explicit_instantiation", 
		"explicit_specialization", "try_block", "function_try_block", "handler_seq", 
		"handler", "exception_declaration", "throw_expression", "exception_specification", 
		"dynamic_exception_specification", "type_id_list", "noexcept_specification"
	};

	@Override
	public String getGrammarFileName() { return "Cpp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Translation_unitContext extends ParserRuleContext {
		public Declaration_seqContext declaration_seq() {
			return getRuleContext(Declaration_seqContext.class,0);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTranslation_unit(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 17) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 38) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (103 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(386); declaration_seq();
				}
			}

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

	public static class EntranceContext extends ParserRuleContext {
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public EntranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEntrance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEntrance(this);
		}
	}

	public final EntranceContext entrance() throws RecognitionException {
		EntranceContext _localctx = new EntranceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); translation_unit();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Id_expressionContext id_expression() {
			return getRuleContext(Id_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primary_expression);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case FLOATING_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case POINTER_LITERAL:
			case UDEF_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(391); literal();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 2);
				{
				setState(392); match(61);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 3);
				{
				setState(393); match(74);
				setState(394); expression(0);
				setState(395); match(59);
				}
				break;
			case 22:
			case 28:
			case 65:
			case 78:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(397); id_expression();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 5);
				{
				setState(398); lambda_expression();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode UDEF_LITERAL() { return getToken(CppParser.UDEF_LITERAL, 0); }
		public TerminalNode FLOATING_LITERAL() { return getToken(CppParser.FLOATING_LITERAL, 0); }
		public TerminalNode POINTER_LITERAL() { return getToken(CppParser.POINTER_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(CppParser.INTEGER_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CppParser.CHARACTER_LITERAL, 0); }
		public Linked_string_literalContext linked_string_literal() {
			return getRuleContext(Linked_string_literalContext.class,0);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CppParser.BOOLEAN_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		try {
			setState(408);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); match(INTEGER_LITERAL);
				}
				break;
			case FLOATING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); match(FLOATING_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(403); match(CHARACTER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(404); linked_string_literal(0);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(405); match(BOOLEAN_LITERAL);
				}
				break;
			case POINTER_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(406); match(POINTER_LITERAL);
				}
				break;
			case UDEF_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(407); match(UDEF_LITERAL);
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

	public static class Linked_string_literalContext extends ParserRuleContext {
		public int _p;
		public TerminalNode STRING_LITERAL() { return getToken(CppParser.STRING_LITERAL, 0); }
		public Linked_string_literalContext linked_string_literal() {
			return getRuleContext(Linked_string_literalContext.class,0);
		}
		public Linked_string_literalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Linked_string_literalContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_linked_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLinked_string_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLinked_string_literal(this);
		}
	}

	public final Linked_string_literalContext linked_string_literal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Linked_string_literalContext _localctx = new Linked_string_literalContext(_ctx, _parentState, _p);
		Linked_string_literalContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_linked_string_literal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411); match(STRING_LITERAL);
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Linked_string_literalContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_linked_string_literal);
					setState(413);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(414); match(STRING_LITERAL);
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Id_expressionContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Unqualified_idContext unqualified_id() {
			return getRuleContext(Unqualified_idContext.class,0);
		}
		public Id_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterId_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitId_expression(this);
		}
	}

	public final Id_expressionContext id_expression() throws RecognitionException {
		Id_expressionContext _localctx = new Id_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id_expression);
		try {
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420); unqualified_id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421); qualified_id();
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

	public static class Unqualified_idContext extends ParserRuleContext {
		public Template_idContext template_id() {
			return getRuleContext(Template_idContext.class,0);
		}
		public Conversion_function_idContext conversion_function_id() {
			return getRuleContext(Conversion_function_idContext.class,0);
		}
		public Operator_function_idContext operator_function_id() {
			return getRuleContext(Operator_function_idContext.class,0);
		}
		public Decltype_specifierContext decltype_specifier() {
			return getRuleContext(Decltype_specifierContext.class,0);
		}
		public Literal_operator_idContext literal_operator_id() {
			return getRuleContext(Literal_operator_idContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Unqualified_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualified_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterUnqualified_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitUnqualified_id(this);
		}
	}

	public final Unqualified_idContext unqualified_id() throws RecognitionException {
		Unqualified_idContext _localctx = new Unqualified_idContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unqualified_id);
		try {
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425); operator_function_id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426); conversion_function_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427); literal_operator_id();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(428); match(22);
				setState(429); class_name();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430); match(22);
				setState(431); decltype_specifier();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(432); template_id();
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

	public static class Qualified_idContext extends ParserRuleContext {
		public Template_idContext template_id() {
			return getRuleContext(Template_idContext.class,0);
		}
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Operator_function_idContext operator_function_id() {
			return getRuleContext(Operator_function_idContext.class,0);
		}
		public Unqualified_idContext unqualified_id() {
			return getRuleContext(Unqualified_idContext.class,0);
		}
		public Literal_operator_idContext literal_operator_id() {
			return getRuleContext(Literal_operator_idContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Qualified_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterQualified_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitQualified_id(this);
		}
	}

	public final Qualified_idContext qualified_id() throws RecognitionException {
		Qualified_idContext _localctx = new Qualified_idContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_qualified_id);
		int _la;
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435); nested_name_specifier(0);
				setState(437);
				_la = _input.LA(1);
				if (_la==43) {
					{
					setState(436); match(43);
					}
				}

				setState(439); unqualified_id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441); match(78);
				setState(442); match(IDENTIFIER);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(443); match(78);
				setState(444); operator_function_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(445); match(78);
				setState(446); literal_operator_id();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447); match(78);
				setState(448); template_id();
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

	public static class Nested_name_specifierContext extends ParserRuleContext {
		public int _p;
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Decltype_specifierContext decltype_specifier() {
			return getRuleContext(Decltype_specifierContext.class,0);
		}
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Nested_name_specifierContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Nested_name_specifierContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_nested_name_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNested_name_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNested_name_specifier(this);
		}
	}

	public final Nested_name_specifierContext nested_name_specifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Nested_name_specifierContext _localctx = new Nested_name_specifierContext(_ctx, _parentState, _p);
		Nested_name_specifierContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_nested_name_specifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(453);
				_la = _input.LA(1);
				if (_la==78) {
					{
					setState(452); match(78);
					}
				}

				setState(455); type_name();
				setState(456); match(78);
				}
				break;

			case 2:
				{
				setState(459);
				_la = _input.LA(1);
				if (_la==78) {
					{
					setState(458); match(78);
					}
				}

				setState(461); namespace_name();
				setState(462); match(78);
				}
				break;

			case 3:
				{
				setState(464); decltype_specifier();
				setState(465); match(78);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(479);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Nested_name_specifierContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_nested_name_specifier);
						setState(469);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(470); match(IDENTIFIER);
						setState(471); match(78);
						}
						break;

					case 2:
						{
						_localctx = new Nested_name_specifierContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_nested_name_specifier);
						setState(472);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(474);
						_la = _input.LA(1);
						if (_la==43) {
							{
							setState(473); match(43);
							}
						}

						setState(476); simple_template_id();
						setState(477); match(78);
						}
						break;
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Lambda_expressionContext extends ParserRuleContext {
		public Lambda_introducerContext lambda_introducer() {
			return getRuleContext(Lambda_introducerContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Lambda_declaratorContext lambda_declarator() {
			return getRuleContext(Lambda_declaratorContext.class,0);
		}
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLambda_expression(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); lambda_introducer();
			setState(486);
			_la = _input.LA(1);
			if (_la==74) {
				{
				setState(485); lambda_declarator();
				}
			}

			setState(488); compound_statement();
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

	public static class Lambda_introducerContext extends ParserRuleContext {
		public Lambda_captureContext lambda_capture() {
			return getRuleContext(Lambda_captureContext.class,0);
		}
		public Lambda_introducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_introducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLambda_introducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLambda_introducer(this);
		}
	}

	public final Lambda_introducerContext lambda_introducer() throws RecognitionException {
		Lambda_introducerContext _localctx = new Lambda_introducerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lambda_introducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(51);
			setState(492);
			_la = _input.LA(1);
			if (_la==3 || _la==61 || _la==101 || _la==IDENTIFIER) {
				{
				setState(491); lambda_capture();
				}
			}

			setState(494); match(21);
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

	public static class Lambda_captureContext extends ParserRuleContext {
		public Capture_defaultContext capture_default() {
			return getRuleContext(Capture_defaultContext.class,0);
		}
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Lambda_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLambda_capture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLambda_capture(this);
		}
	}

	public final Lambda_captureContext lambda_capture() throws RecognitionException {
		Lambda_captureContext _localctx = new Lambda_captureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lambda_capture);
		try {
			setState(502);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); capture_default();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497); capture_list(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498); capture_default();
				setState(499); match(14);
				setState(500); capture_list(0);
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

	public static class Capture_defaultContext extends ParserRuleContext {
		public Capture_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCapture_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCapture_default(this);
		}
	}

	public final Capture_defaultContext capture_default() throws RecognitionException {
		Capture_defaultContext _localctx = new Capture_defaultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_capture_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==101) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Capture_listContext extends ParserRuleContext {
		public int _p;
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public Capture_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Capture_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCapture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCapture_list(this);
		}
	}

	public final Capture_listContext capture_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Capture_listContext _localctx = new Capture_listContext(_ctx, _parentState, _p);
		Capture_listContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_capture_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(507); capture();
			setState(509);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(508); match(106);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Capture_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_capture_list);
					setState(511);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(512); match(14);
					setState(513); capture();
					setState(515);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(514); match(106);
						}
						break;
					}
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class CaptureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_capture);
		try {
			setState(526);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(522); match(IDENTIFIER);
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 2);
				{
				setState(523); match(101);
				setState(524); match(IDENTIFIER);
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 3);
				{
				setState(525); match(61);
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

	public static class Lambda_declaratorContext extends ParserRuleContext {
		public Trailing_return_typeContext trailing_return_type() {
			return getRuleContext(Trailing_return_typeContext.class,0);
		}
		public Parameter_declaration_clauseContext parameter_declaration_clause() {
			return getRuleContext(Parameter_declaration_clauseContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Exception_specificationContext exception_specification() {
			return getRuleContext(Exception_specificationContext.class,0);
		}
		public Lambda_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLambda_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLambda_declarator(this);
		}
	}

	public final Lambda_declaratorContext lambda_declarator() throws RecognitionException {
		Lambda_declaratorContext _localctx = new Lambda_declaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambda_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(74);
			setState(529); parameter_declaration_clause();
			setState(530); match(59);
			setState(532);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(531); match(11);
				}
			}

			setState(535);
			_la = _input.LA(1);
			if (_la==12 || _la==117) {
				{
				setState(534); exception_specification();
				}
			}

			setState(538);
			_la = _input.LA(1);
			if (_la==51 || _la==90) {
				{
				setState(537); attribute_specifier_seq();
				}
			}

			setState(541);
			_la = _input.LA(1);
			if (_la==113) {
				{
				setState(540); trailing_return_type();
				}
			}

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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public int _p;
		public Pseudo_destructor_nameContext pseudo_destructor_name() {
			return getRuleContext(Pseudo_destructor_nameContext.class,0);
		}
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public Simple_type_specifierContext simple_type_specifier() {
			return getRuleContext(Simple_type_specifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Typename_specifierContext typename_specifier() {
			return getRuleContext(Typename_specifierContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Id_expressionContext id_expression() {
			return getRuleContext(Id_expressionContext.class,0);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState, _p);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_postfix_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(544); primary_expression();
				}
				break;

			case 2:
				{
				setState(545); simple_type_specifier();
				setState(546); match(74);
				setState(548);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (67 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(547); expression_list();
					}
				}

				setState(550); match(59);
				}
				break;

			case 3:
				{
				setState(552); typename_specifier();
				setState(553); match(74);
				setState(554); expression_list();
				setState(555); match(59);
				}
				break;

			case 4:
				{
				setState(557); simple_type_specifier();
				setState(558); braced_init_list();
				}
				break;

			case 5:
				{
				setState(560); typename_specifier();
				setState(561); braced_init_list();
				}
				break;

			case 6:
				{
				setState(563); match(118);
				setState(564); match(20);
				setState(565); type_id();
				setState(566); match(112);
				setState(567); match(74);
				setState(568); expression(0);
				setState(569); match(59);
				}
				break;

			case 7:
				{
				setState(571); match(79);
				setState(572); match(20);
				setState(573); type_id();
				setState(574); match(112);
				setState(575); match(74);
				setState(576); expression(0);
				setState(577); match(59);
				}
				break;

			case 8:
				{
				setState(579); match(89);
				setState(580); match(20);
				setState(581); type_id();
				setState(582); match(112);
				setState(583); match(74);
				setState(584); expression(0);
				setState(585); match(59);
				}
				break;

			case 9:
				{
				setState(587); match(75);
				setState(588); match(20);
				setState(589); type_id();
				setState(590); match(112);
				setState(591); match(74);
				setState(592); expression(0);
				setState(593); match(59);
				}
				break;

			case 10:
				{
				setState(595); match(8);
				setState(596); match(74);
				setState(597); expression(0);
				setState(598); match(59);
				}
				break;

			case 11:
				{
				setState(600); match(8);
				setState(601); match(74);
				setState(602); type_id();
				setState(603); match(59);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(645);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(607);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(608); match(51);
						setState(609); expression(0);
						setState(610); match(21);
						}
						break;

					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(612);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(613); match(51);
						setState(614); braced_init_list();
						setState(615); match(21);
						}
						break;

					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(617);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(618); match(74);
						setState(620);
						_la = _input.LA(1);
						if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (67 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
							{
							setState(619); expression_list();
							}
						}

						setState(622); match(59);
						}
						break;

					case 4:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(623);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(624); match(105);
						setState(626);
						_la = _input.LA(1);
						if (_la==43) {
							{
							setState(625); match(43);
							}
						}

						setState(628); id_expression();
						}
						break;

					case 5:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(629);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(630); match(113);
						setState(632);
						_la = _input.LA(1);
						if (_la==43) {
							{
							setState(631); match(43);
							}
						}

						setState(634); id_expression();
						}
						break;

					case 6:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(635);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(636); match(105);
						setState(637); pseudo_destructor_name();
						}
						break;

					case 7:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(638);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(639); match(113);
						setState(640); pseudo_destructor_name();
						}
						break;

					case 8:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(641);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(642); match(86);
						}
						break;

					case 9:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(643);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(644); match(120);
						}
						break;
					}
					} 
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Expression_listContext extends ParserRuleContext {
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650); initializer_list(0);
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

	public static class Pseudo_destructor_nameContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Decltype_specifierContext decltype_specifier() {
			return getRuleContext(Decltype_specifierContext.class,0);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Pseudo_destructor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo_destructor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPseudo_destructor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPseudo_destructor_name(this);
		}
	}

	public final Pseudo_destructor_nameContext pseudo_destructor_name() throws RecognitionException {
		Pseudo_destructor_nameContext _localctx = new Pseudo_destructor_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudo_destructor_name);
		int _la;
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(652); nested_name_specifier(0);
					}
					break;
				}
				setState(655); type_name();
				setState(656); match(78);
				setState(657); match(22);
				setState(658); type_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660); nested_name_specifier(0);
				setState(661); match(43);
				setState(662); simple_template_id();
				setState(663); match(78);
				setState(664); match(22);
				setState(665); type_name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				_la = _input.LA(1);
				if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (78 - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(667); nested_name_specifier(0);
					}
				}

				setState(670); match(22);
				setState(671); type_name();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672); match(22);
				setState(673); decltype_specifier();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Delete_expressionContext delete_expression() {
			return getRuleContext(Delete_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Noexcept_expressionContext noexcept_expression() {
			return getRuleContext(Noexcept_expressionContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary_expression);
		int _la;
		try {
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676); postfix_expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				_la = _input.LA(1);
				if ( !(_la==86 || _la==120) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(678); cast_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 22) | (1L << 25) | (1L << 44) | (1L << 55))) != 0) || _la==101 || _la==119) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(680); cast_expression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(681); match(58);
				setState(682); unary_expression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(683); match(58);
				setState(684); match(74);
				setState(685); type_id();
				setState(686); match(59);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(688); match(58);
				setState(689); match(106);
				setState(690); match(74);
				setState(691); match(IDENTIFIER);
				setState(692); match(59);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(693); match(93);
				setState(694); match(74);
				setState(695); type_id();
				setState(696); match(59);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(698); noexcept_expression();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(699); new_expression();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(700); delete_expression();
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

	public static class Noexcept_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Noexcept_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexcept_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNoexcept_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNoexcept_expression(this);
		}
	}

	public final Noexcept_expressionContext noexcept_expression() throws RecognitionException {
		Noexcept_expressionContext _localctx = new Noexcept_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_noexcept_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); match(117);
			setState(704); match(74);
			setState(705); expression(0);
			setState(706); match(59);
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

	public static class New_expressionContext extends ParserRuleContext {
		public New_type_idContext new_type_id() {
			return getRuleContext(New_type_idContext.class,0);
		}
		public New_placementContext new_placement() {
			return getRuleContext(New_placementContext.class,0);
		}
		public New_initializerContext new_initializer() {
			return getRuleContext(New_initializerContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNew_expression(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_new_expression);
		int _la;
		try {
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				_la = _input.LA(1);
				if (_la==78) {
					{
					setState(708); match(78);
					}
				}

				setState(711); match(96);
				setState(713);
				_la = _input.LA(1);
				if (_la==74) {
					{
					setState(712); new_placement();
					}
				}

				setState(715); new_type_id();
				setState(717);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(716); new_initializer();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				_la = _input.LA(1);
				if (_la==78) {
					{
					setState(719); match(78);
					}
				}

				setState(722); match(96);
				setState(724);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(723); new_placement();
					}
					break;
				}
				setState(726); match(74);
				setState(727); type_id();
				setState(728); match(59);
				setState(730);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(729); new_initializer();
					}
					break;
				}
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

	public static class New_placementContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public New_placementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_placement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNew_placement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNew_placement(this);
		}
	}

	public final New_placementContext new_placement() throws RecognitionException {
		New_placementContext _localctx = new New_placementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_new_placement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); match(74);
			setState(735); expression_list();
			setState(736); match(59);
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

	public static class New_type_idContext extends ParserRuleContext {
		public New_declaratorContext new_declarator() {
			return getRuleContext(New_declaratorContext.class,0);
		}
		public Type_specifier_seqContext type_specifier_seq() {
			return getRuleContext(Type_specifier_seqContext.class,0);
		}
		public New_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNew_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNew_type_id(this);
		}
	}

	public final New_type_idContext new_type_id() throws RecognitionException {
		New_type_idContext _localctx = new New_type_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_new_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); type_specifier_seq();
			setState(740);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(739); new_declarator();
				}
				break;
			}
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

	public static class New_declaratorContext extends ParserRuleContext {
		public Noptr_new_declaratorContext noptr_new_declarator() {
			return getRuleContext(Noptr_new_declaratorContext.class,0);
		}
		public New_declaratorContext new_declarator() {
			return getRuleContext(New_declaratorContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public New_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNew_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNew_declarator(this);
		}
	}

	public final New_declaratorContext new_declarator() throws RecognitionException {
		New_declaratorContext _localctx = new New_declaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_new_declarator);
		try {
			setState(747);
			switch (_input.LA(1)) {
			case 17:
			case 44:
			case 65:
			case 78:
			case 101:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(742); ptr_operator();
				setState(744);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(743); new_declarator();
					}
					break;
				}
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 2);
				{
				setState(746); noptr_new_declarator(0);
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

	public static class Noptr_new_declaratorContext extends ParserRuleContext {
		public int _p;
		public Noptr_new_declaratorContext noptr_new_declarator() {
			return getRuleContext(Noptr_new_declaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Noptr_new_declaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Noptr_new_declaratorContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_noptr_new_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNoptr_new_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNoptr_new_declarator(this);
		}
	}

	public final Noptr_new_declaratorContext noptr_new_declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Noptr_new_declaratorContext _localctx = new Noptr_new_declaratorContext(_ctx, _parentState, _p);
		Noptr_new_declaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, RULE_noptr_new_declarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(750); match(51);
			setState(751); expression(0);
			setState(752); match(21);
			setState(754);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(753); attribute_specifier_seq();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Noptr_new_declaratorContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_noptr_new_declarator);
					setState(756);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(757); match(51);
					setState(758); constant_expression();
					setState(759); match(21);
					setState(761);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(760); attribute_specifier_seq();
						}
						break;
					}
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class New_initializerContext extends ParserRuleContext {
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public New_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNew_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNew_initializer(this);
		}
	}

	public final New_initializerContext new_initializer() throws RecognitionException {
		New_initializerContext _localctx = new New_initializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_new_initializer);
		int _la;
		try {
			setState(774);
			switch (_input.LA(1)) {
			case 74:
				enterOuterAlt(_localctx, 1);
				{
				setState(768); match(74);
				setState(770);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (67 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(769); expression_list();
					}
				}

				setState(772); match(59);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 2);
				{
				setState(773); braced_init_list();
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

	public static class Delete_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Delete_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDelete_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDelete_expression(this);
		}
	}

	public final Delete_expressionContext delete_expression() throws RecognitionException {
		Delete_expressionContext _localctx = new Delete_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_delete_expression);
		int _la;
		try {
			setState(788);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				_la = _input.LA(1);
				if (_la==78) {
					{
					setState(776); match(78);
					}
				}

				setState(779); match(19);
				setState(780); cast_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				_la = _input.LA(1);
				if (_la==78) {
					{
					setState(781); match(78);
					}
				}

				setState(784); match(19);
				setState(785); match(51);
				setState(786); match(21);
				setState(787); cast_expression();
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cast_expression);
		try {
			setState(796);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790); unary_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791); match(74);
				setState(792); type_id();
				setState(793); match(59);
				setState(794); cast_expression();
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

	public static class Pm_expressionContext extends ParserRuleContext {
		public int _p;
		public Pm_expressionContext pm_expression() {
			return getRuleContext(Pm_expressionContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Pm_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Pm_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_pm_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPm_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPm_expression(this);
		}
	}

	public final Pm_expressionContext pm_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Pm_expressionContext _localctx = new Pm_expressionContext(_ctx, _parentState, _p);
		Pm_expressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, RULE_pm_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(799); cast_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(807);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new Pm_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_pm_expression);
						setState(801);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(802); match(77);
						setState(803); cast_expression();
						}
						break;

					case 2:
						{
						_localctx = new Pm_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_pm_expression);
						setState(804);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(805); match(82);
						setState(806); cast_expression();
						}
						break;
					}
					} 
				}
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public int _p;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Pm_expressionContext pm_expression() {
			return getRuleContext(Pm_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState, _p);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(813); pm_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
					setState(815);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(816);
					_la = _input.LA(1);
					if ( !(_la==44 || _la==87 || _la==116) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(817); pm_expression(0);
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public int _p;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState, _p);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(824); multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
					setState(826);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(827);
					_la = _input.LA(1);
					if ( !(_la==25 || _la==119) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(828); multiplicative_expression(0);
					}
					} 
				}
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public int _p;
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Shift_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, _parentState, _p);
		Shift_expressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, RULE_shift_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(835); additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Shift_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
					setState(837);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(838);
					_la = _input.LA(1);
					if ( !(_la==16 || _la==107) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(839); additive_expression(0);
					}
					} 
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public int _p;
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState, _p);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(846); shift_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
					setState(848);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(849);
					_la = _input.LA(1);
					if ( !(_la==20 || _la==26 || _la==88 || _la==112) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(850); shift_expression(0);
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public int _p;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState, _p);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, RULE_equality_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(857); relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
					setState(859);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(860);
					_la = _input.LA(1);
					if ( !(_la==13 || _la==121) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(861); relational_expression(0);
					}
					} 
				}
				setState(866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class And_expressionContext extends ParserRuleContext {
		public int _p;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public And_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState, _p);
		And_expressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(868); equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(870);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(871); match(101);
					setState(872); equality_expression(0);
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public int _p;
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, _parentState, _p);
		Exclusive_or_expressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, RULE_exclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(879); and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exclusive_or_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusive_or_expression);
					setState(881);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(882); match(6);
					setState(883); and_expression(0);
					}
					} 
				}
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public int _p;
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, _parentState, _p);
		Inclusive_or_expressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, RULE_inclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(890); exclusive_or_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Inclusive_or_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusive_or_expression);
					setState(892);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(893); match(53);
					setState(894); exclusive_or_expression(0);
					}
					} 
				}
				setState(899);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public int _p;
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLogical_and_expression(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState, _p);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, RULE_logical_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(901); inclusive_or_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(903);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(904); match(17);
					setState(905); inclusive_or_expression(0);
					}
					} 
				}
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public int _p;
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLogical_or_expression(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, _parentState, _p);
		Logical_or_expressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, RULE_logical_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(912); logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(919);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(914);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(915); match(108);
					setState(916); logical_and_expression(0);
					}
					} 
				}
				setState(921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditional_expression);
		try {
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922); logical_or_expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923); logical_or_expression(0);
				setState(924); match(95);
				setState(925); expression(0);
				setState(926); match(49);
				setState(927); assignment_expression();
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Initializer_clauseContext initializer_clause() {
			return getRuleContext(Initializer_clauseContext.class,0);
		}
		public Throw_expressionContext throw_expression() {
			return getRuleContext(Throw_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignment_expression);
		int _la;
		try {
			setState(937);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931); conditional_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932); logical_or_expression(0);
				setState(933);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 10) | (1L << 15) | (1L << 37) | (1L << 39) | (1L << 41) | (1L << 63))) != 0) || _la==70 || _la==72) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(934); initializer_clause();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(936); throw_expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(940); assignment_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(942);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(943); match(14);
					setState(944); assignment_expression();
					}
					} 
				}
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950); conditional_expression();
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

	public static class StatementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Try_blockContext try_block() {
			return getRuleContext(Try_blockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		int _la;
		try {
			setState(978);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952); labeled_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(953); attribute_specifier_seq();
					}
					break;
				}
				setState(956); expression_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(957); attribute_specifier_seq();
					}
				}

				setState(960); compound_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(961); attribute_specifier_seq();
					}
				}

				setState(964); selection_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(966);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(965); attribute_specifier_seq();
					}
				}

				setState(968); iteration_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(970);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(969); attribute_specifier_seq();
					}
				}

				setState(972); jump_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(973); declaration_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(975);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(974); attribute_specifier_seq();
					}
				}

				setState(977); try_block();
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLabeled_statement(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_labeled_statement);
		int _la;
		try {
			setState(1000);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(980); attribute_specifier_seq();
					}
				}

				setState(983); match(IDENTIFIER);
				setState(984); match(49);
				setState(985); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(986); attribute_specifier_seq();
					}
				}

				setState(989); match(94);
				setState(990); constant_expression();
				setState(991); match(49);
				setState(992); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(994); attribute_specifier_seq();
					}
				}

				setState(997); match(97);
				setState(998); match(49);
				setState(999); statement();
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

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
				{
				setState(1002); expression(0);
				}
			}

			setState(1005); match(33);
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

	public static class Compound_statementContext extends ParserRuleContext {
		public Statement_seqContext statement_seq() {
			return getRuleContext(Statement_seqContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); match(67);
			setState(1009);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 17) | (1L << 19) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 38) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 60) | (1L << 61) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (67 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (86 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (94 - 64)) | (1L << (96 - 64)) | (1L << (97 - 64)) | (1L << (98 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (102 - 64)) | (1L << (103 - 64)) | (1L << (104 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (110 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (117 - 64)) | (1L << (118 - 64)) | (1L << (119 - 64)) | (1L << (120 - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (FLOATING_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (BOOLEAN_LITERAL - 64)))) != 0) || _la==POINTER_LITERAL || _la==UDEF_LITERAL) {
				{
				setState(1008); statement_seq(0);
				}
			}

			setState(1011); match(36);
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

	public static class Statement_seqContext extends ParserRuleContext {
		public int _p;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_seqContext statement_seq() {
			return getRuleContext(Statement_seqContext.class,0);
		}
		public Statement_seqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statement_seqContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_statement_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterStatement_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitStatement_seq(this);
		}
	}

	public final Statement_seqContext statement_seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_seqContext _localctx = new Statement_seqContext(_ctx, _parentState, _p);
		Statement_seqContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, RULE_statement_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1014); statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_seqContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_seq);
					setState(1016);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1017); statement();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selection_statement);
		try {
			setState(1043);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023); match(104);
				setState(1024); match(74);
				setState(1025); condition();
				setState(1026); match(59);
				setState(1027); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029); match(104);
				setState(1030); match(74);
				setState(1031); condition();
				setState(1032); match(59);
				setState(1033); statement();
				setState(1034); match(84);
				setState(1035); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037); match(73);
				setState(1038); match(74);
				setState(1039); condition();
				setState(1040); match(59);
				setState(1041); statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public Decl_specifier_seqContext decl_specifier_seq() {
			return getRuleContext(Decl_specifier_seqContext.class,0);
		}
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Initializer_clauseContext initializer_clause() {
			return getRuleContext(Initializer_clauseContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_condition);
		int _la;
		try {
			setState(1061);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1046); attribute_specifier_seq();
					}
				}

				setState(1049); decl_specifier_seq();
				setState(1050); declarator();
				setState(1051); match(3);
				setState(1052); initializer_clause();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1054); attribute_specifier_seq();
					}
				}

				setState(1057); decl_specifier_seq();
				setState(1058); declarator();
				setState(1059); braced_init_list();
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public For_range_initializerContext for_range_initializer() {
			return getRuleContext(For_range_initializerContext.class,0);
		}
		public For_range_declarationContext for_range_declaration() {
			return getRuleContext(For_range_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_iteration_statement);
		int _la;
		try {
			setState(1098);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063); match(1);
				setState(1064); match(74);
				setState(1065); condition();
				setState(1066); match(59);
				setState(1067); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069); match(66);
				setState(1070); statement();
				setState(1071); match(1);
				setState(1072); match(74);
				setState(1073); condition();
				setState(1074); match(59);
				setState(1075); match(33);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077); match(102);
				setState(1078); match(74);
				setState(1079); for_init_statement();
				setState(1081);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (9 - 8)) | (1L << (11 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (24 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (32 - 8)) | (1L << (38 - 8)) | (1L << (42 - 8)) | (1L << (44 - 8)) | (1L << (45 - 8)) | (1L << (47 - 8)) | (1L << (48 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (62 - 8)) | (1L << (64 - 8)) | (1L << (65 - 8)) | (1L << (69 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (85 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (90 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (98 - 74)) | (1L << (100 - 74)) | (1L << (101 - 74)) | (1L << (103 - 74)) | (1L << (109 - 74)) | (1L << (111 - 74)) | (1L << (114 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(1080); condition();
					}
				}

				setState(1083); match(33);
				setState(1085);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(1084); expression(0);
					}
				}

				setState(1087); match(59);
				setState(1088); statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1090); match(102);
				setState(1091); match(74);
				setState(1092); for_range_declaration();
				setState(1093); match(49);
				setState(1094); for_range_initializer();
				setState(1095); match(59);
				setState(1096); statement();
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

	public static class For_init_statementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFor_init_statement(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_for_init_statement);
		try {
			setState(1102);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100); expression_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101); simple_declaration();
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

	public static class For_range_declarationContext extends ParserRuleContext {
		public Decl_specifier_seqContext decl_specifier_seq() {
			return getRuleContext(Decl_specifier_seqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public For_range_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFor_range_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFor_range_declaration(this);
		}
	}

	public final For_range_declarationContext for_range_declaration() throws RecognitionException {
		For_range_declarationContext _localctx = new For_range_declarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_for_range_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_la = _input.LA(1);
			if (_la==51 || _la==90) {
				{
				setState(1104); attribute_specifier_seq();
				}
			}

			setState(1107); decl_specifier_seq();
			setState(1108); declarator();
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

	public static class For_range_initializerContext extends ParserRuleContext {
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_range_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFor_range_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFor_range_initializer(this);
		}
	}

	public final For_range_initializerContext for_range_initializer() throws RecognitionException {
		For_range_initializerContext _localctx = new For_range_initializerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_for_range_initializer);
		try {
			setState(1112);
			switch (_input.LA(1)) {
			case 8:
			case 12:
			case 19:
			case 22:
			case 23:
			case 25:
			case 27:
			case 28:
			case 29:
			case 31:
			case 38:
			case 44:
			case 51:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 60:
			case 61:
			case 65:
			case 71:
			case 74:
			case 75:
			case 76:
			case 78:
			case 79:
			case 83:
			case 86:
			case 89:
			case 91:
			case 92:
			case 93:
			case 96:
			case 101:
			case 111:
			case 117:
			case 118:
			case 119:
			case 120:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case FLOATING_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case POINTER_LITERAL:
			case UDEF_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110); expression(0);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111); braced_init_list();
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

	public static class Jump_statementContext extends ParserRuleContext {
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jump_statement);
		int _la;
		try {
			setState(1130);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114); match(7);
				setState(1115); match(33);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116); match(110);
				setState(1117); match(33);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1118); match(4);
				setState(1120);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(1119); expression(0);
					}
				}

				setState(1122); match(33);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1123); match(4);
				setState(1124); braced_init_list();
				setState(1125); match(33);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1127); match(80);
				setState(1128); match(IDENTIFIER);
				setState(1129); match(33);
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public Block_declarationContext block_declaration() {
			return getRuleContext(Block_declarationContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132); block_declaration();
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

	public static class Declaration_seqContext extends ParserRuleContext {
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public Declaration_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclaration_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclaration_seq(this);
		}
	}

	public final Declaration_seqContext declaration_seq() throws RecognitionException {
		Declaration_seqContext _localctx = new Declaration_seqContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declaration_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1134); declaration();
				}
				}
				setState(1137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 17) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 38) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (103 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
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
		public Explicit_instantiationContext explicit_instantiation() {
			return getRuleContext(Explicit_instantiationContext.class,0);
		}
		public Linkage_specificationContext linkage_specification() {
			return getRuleContext(Linkage_specificationContext.class,0);
		}
		public Explicit_specializationContext explicit_specialization() {
			return getRuleContext(Explicit_specializationContext.class,0);
		}
		public Empty_declarationContext empty_declaration() {
			return getRuleContext(Empty_declarationContext.class,0);
		}
		public Template_declarationContext template_declaration() {
			return getRuleContext(Template_declarationContext.class,0);
		}
		public Namespace_definitionContext namespace_definition() {
			return getRuleContext(Namespace_definitionContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Block_declarationContext block_declaration() {
			return getRuleContext(Block_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declaration);
		try {
			setState(1148);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139); block_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140); function_definition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1141); template_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1142); explicit_instantiation();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1143); explicit_specialization();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1144); linkage_specification();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1145); namespace_definition();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1146); empty_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1147); attribute_declaration();
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

	public static class Block_declarationContext extends ParserRuleContext {
		public Static_assert_declarationContext static_assert_declaration() {
			return getRuleContext(Static_assert_declarationContext.class,0);
		}
		public Opaque_enum_declarationContext opaque_enum_declaration() {
			return getRuleContext(Opaque_enum_declarationContext.class,0);
		}
		public Using_declarationContext using_declaration() {
			return getRuleContext(Using_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Asm_definitionContext asm_definition() {
			return getRuleContext(Asm_definitionContext.class,0);
		}
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public Namespace_alias_definitionContext namespace_alias_definition() {
			return getRuleContext(Namespace_alias_definitionContext.class,0);
		}
		public Using_directiveContext using_directive() {
			return getRuleContext(Using_directiveContext.class,0);
		}
		public Block_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBlock_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBlock_declaration(this);
		}
	}

	public final Block_declarationContext block_declaration() throws RecognitionException {
		Block_declarationContext _localctx = new Block_declarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_block_declaration);
		try {
			setState(1158);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150); simple_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151); asm_definition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152); namespace_alias_definition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1153); using_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1154); using_directive();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1155); static_assert_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1156); alias_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1157); opaque_enum_declaration();
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

	public static class Alias_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Alias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAlias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAlias_declaration(this);
		}
	}

	public final Alias_declarationContext alias_declaration() throws RecognitionException {
		Alias_declarationContext _localctx = new Alias_declarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alias_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160); match(115);
			setState(1161); match(IDENTIFIER);
			setState(1163);
			_la = _input.LA(1);
			if (_la==51 || _la==90) {
				{
				setState(1162); attribute_specifier_seq();
				}
			}

			setState(1165); match(3);
			setState(1166); type_id();
			setState(1167); match(33);
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

	public static class Simple_declarationContext extends ParserRuleContext {
		public Decl_specifier_seqContext decl_specifier_seq() {
			return getRuleContext(Decl_specifier_seqContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitSimple_declaration(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_simple_declaration);
		int _la;
		try {
			setState(1183);
			switch (_input.LA(1)) {
			case 9:
			case 11:
			case 17:
			case 22:
			case 23:
			case 24:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 33:
			case 38:
			case 42:
			case 44:
			case 45:
			case 47:
			case 48:
			case 54:
			case 56:
			case 57:
			case 60:
			case 62:
			case 64:
			case 65:
			case 69:
			case 71:
			case 74:
			case 76:
			case 78:
			case 83:
			case 85:
			case 91:
			case 92:
			case 98:
			case 100:
			case 101:
			case 103:
			case 106:
			case 109:
			case 111:
			case 114:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1170);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1169); decl_specifier_seq();
					}
					break;
				}
				setState(1173);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 22) | (1L << 28) | (1L << 44))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (74 - 65)) | (1L << (78 - 65)) | (1L << (101 - 65)) | (1L << (106 - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(1172); init_declarator_list(0);
					}
				}

				setState(1175); match(33);
				}
				break;
			case 51:
			case 90:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176); attribute_specifier_seq();
				setState(1178);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1177); decl_specifier_seq();
					}
					break;
				}
				setState(1180); init_declarator_list(0);
				setState(1181); match(33);
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

	public static class Static_assert_declarationContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CppParser.STRING_LITERAL, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Static_assert_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assert_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterStatic_assert_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitStatic_assert_declaration(this);
		}
	}

	public final Static_assert_declarationContext static_assert_declaration() throws RecognitionException {
		Static_assert_declarationContext _localctx = new Static_assert_declarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_static_assert_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185); match(30);
			setState(1186); match(74);
			setState(1187); constant_expression();
			setState(1188); match(14);
			setState(1189); match(STRING_LITERAL);
			setState(1190); match(59);
			setState(1191); match(33);
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

	public static class Empty_declarationContext extends ParserRuleContext {
		public Empty_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEmpty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEmpty_declaration(this);
		}
	}

	public final Empty_declarationContext empty_declaration() throws RecognitionException {
		Empty_declarationContext _localctx = new Empty_declarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_empty_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193); match(33);
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

	public static class Attribute_declarationContext extends ParserRuleContext {
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_attribute_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195); attribute_specifier_seq();
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

	public static class Decl_specifier_seqContext extends ParserRuleContext {
		public Decl_specifier_seqContext decl_specifier_seq() {
			return getRuleContext(Decl_specifier_seqContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Decl_specifierContext decl_specifier() {
			return getRuleContext(Decl_specifierContext.class,0);
		}
		public Decl_specifier_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_specifier_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDecl_specifier_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDecl_specifier_seq(this);
		}
	}

	public final Decl_specifier_seqContext decl_specifier_seq() throws RecognitionException {
		Decl_specifier_seqContext _localctx = new Decl_specifier_seqContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_decl_specifier_seq);
		try {
			setState(1204);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197); decl_specifier();
				setState(1199);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1198); attribute_specifier_seq();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201); decl_specifier();
				setState(1202); decl_specifier_seq();
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

	public static class Decl_specifierContext extends ParserRuleContext {
		public Function_specifierContext function_specifier() {
			return getRuleContext(Function_specifierContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Storage_class_specifierContext storage_class_specifier() {
			return getRuleContext(Storage_class_specifierContext.class,0);
		}
		public Decl_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDecl_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDecl_specifier(this);
		}
	}

	public final Decl_specifierContext decl_specifier() throws RecognitionException {
		Decl_specifierContext _localctx = new Decl_specifierContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_decl_specifier);
		try {
			setState(1212);
			switch (_input.LA(1)) {
			case 11:
			case 47:
			case 62:
			case 69:
			case 100:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206); storage_class_specifier();
				}
				break;
			case 9:
			case 23:
			case 24:
			case 27:
			case 29:
			case 31:
			case 38:
			case 48:
			case 54:
			case 56:
			case 57:
			case 60:
			case 64:
			case 65:
			case 71:
			case 76:
			case 78:
			case 83:
			case 91:
			case 92:
			case 109:
			case 111:
			case 114:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207); type_specifier();
				}
				break;
			case 42:
			case 45:
			case 98:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208); function_specifier();
				}
				break;
			case 85:
				enterOuterAlt(_localctx, 4);
				{
				setState(1209); match(85);
				}
				break;
			case 103:
				enterOuterAlt(_localctx, 5);
				{
				setState(1210); match(103);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 6);
				{
				setState(1211); match(32);
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

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitStorage_class_specifier(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 47) | (1L << 62))) != 0) || _la==69 || _la==100) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Function_specifierContext extends ParserRuleContext {
		public Function_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFunction_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFunction_specifier(this);
		}
	}

	public final Function_specifierContext function_specifier() throws RecognitionException {
		Function_specifierContext _localctx = new Function_specifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_function_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (42 - 42)) | (1L << (45 - 42)) | (1L << (98 - 42)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Typedef_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Typedef_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTypedef_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTypedef_name(this);
		}
	}

	public final Typedef_nameContext typedef_name() throws RecognitionException {
		Typedef_nameContext _localctx = new Typedef_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_typedef_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218); match(IDENTIFIER);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Class_specifierContext class_specifier() {
			return getRuleContext(Class_specifierContext.class,0);
		}
		public Trailing_type_specifierContext trailing_type_specifier() {
			return getRuleContext(Trailing_type_specifierContext.class,0);
		}
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_type_specifier);
		try {
			setState(1223);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220); trailing_type_specifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221); class_specifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222); enum_specifier();
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

	public static class Trailing_type_specifierContext extends ParserRuleContext {
		public Simple_type_specifierContext simple_type_specifier() {
			return getRuleContext(Simple_type_specifierContext.class,0);
		}
		public Typename_specifierContext typename_specifier() {
			return getRuleContext(Typename_specifierContext.class,0);
		}
		public Elaborated_type_specifierContext elaborated_type_specifier() {
			return getRuleContext(Elaborated_type_specifierContext.class,0);
		}
		public Cv_qualifierContext cv_qualifier() {
			return getRuleContext(Cv_qualifierContext.class,0);
		}
		public Trailing_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTrailing_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTrailing_type_specifier(this);
		}
	}

	public final Trailing_type_specifierContext trailing_type_specifier() throws RecognitionException {
		Trailing_type_specifierContext _localctx = new Trailing_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_trailing_type_specifier);
		try {
			setState(1229);
			switch (_input.LA(1)) {
			case 23:
			case 27:
			case 31:
			case 38:
			case 54:
			case 56:
			case 57:
			case 60:
			case 65:
			case 71:
			case 76:
			case 78:
			case 83:
			case 91:
			case 92:
			case 111:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225); simple_type_specifier();
				}
				break;
			case 9:
			case 48:
			case 64:
			case 109:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226); elaborated_type_specifier();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 3);
				{
				setState(1227); typename_specifier();
				}
				break;
			case 24:
			case 114:
				enterOuterAlt(_localctx, 4);
				{
				setState(1228); cv_qualifier();
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

	public static class Type_specifier_seqContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_specifier_seqContext type_specifier_seq() {
			return getRuleContext(Type_specifier_seqContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Type_specifier_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_specifier_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_specifier_seq(this);
		}
	}

	public final Type_specifier_seqContext type_specifier_seq() throws RecognitionException {
		Type_specifier_seqContext _localctx = new Type_specifier_seqContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_type_specifier_seq);
		try {
			setState(1238);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231); type_specifier();
				setState(1233);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1232); attribute_specifier_seq();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235); type_specifier();
				setState(1236); type_specifier_seq();
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

	public static class Trailing_type_specifier_seqContext extends ParserRuleContext {
		public Trailing_type_specifier_seqContext trailing_type_specifier_seq() {
			return getRuleContext(Trailing_type_specifier_seqContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Trailing_type_specifierContext trailing_type_specifier() {
			return getRuleContext(Trailing_type_specifierContext.class,0);
		}
		public Trailing_type_specifier_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_type_specifier_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTrailing_type_specifier_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTrailing_type_specifier_seq(this);
		}
	}

	public final Trailing_type_specifier_seqContext trailing_type_specifier_seq() throws RecognitionException {
		Trailing_type_specifier_seqContext _localctx = new Trailing_type_specifier_seqContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_trailing_type_specifier_seq);
		try {
			setState(1247);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240); trailing_type_specifier();
				setState(1242);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1241); attribute_specifier_seq();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244); trailing_type_specifier();
				setState(1245); trailing_type_specifier_seq();
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

	public static class Simple_type_specifierContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Decltype_specifierContext decltype_specifier() {
			return getRuleContext(Decltype_specifierContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Simple_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterSimple_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitSimple_type_specifier(this);
		}
	}

	public final Simple_type_specifierContext simple_type_specifier() throws RecognitionException {
		Simple_type_specifierContext _localctx = new Simple_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_simple_type_specifier);
		try {
			setState(1272);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1249); nested_name_specifier(0);
					}
					break;
				}
				setState(1252); type_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253); nested_name_specifier(0);
				setState(1254); match(43);
				setState(1255); simple_template_id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1257); match(23);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1258); match(38);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1259); match(91);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1260); match(56);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1261); match(31);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1262); match(111);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1263); match(27);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1264); match(76);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1265); match(60);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1266); match(57);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1267); match(92);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1268); match(71);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1269); match(83);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1270); match(54);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1271); decltype_specifier();
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

	public static class Type_nameContext extends ParserRuleContext {
		public Typedef_nameContext typedef_name() {
			return getRuleContext(Typedef_nameContext.class,0);
		}
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_type_name);
		try {
			setState(1278);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274); class_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275); enum_name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1276); typedef_name();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1277); simple_template_id();
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

	public static class Decltype_specifierContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Decltype_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltype_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDecltype_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDecltype_specifier(this);
		}
	}

	public final Decltype_specifierContext decltype_specifier() throws RecognitionException {
		Decltype_specifierContext _localctx = new Decltype_specifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_decltype_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280); match(65);
			setState(1281); match(74);
			setState(1282); expression(0);
			setState(1283); match(59);
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

	public static class Elaborated_type_specifierContext extends ParserRuleContext {
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Elaborated_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaborated_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterElaborated_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitElaborated_type_specifier(this);
		}
	}

	public final Elaborated_type_specifierContext elaborated_type_specifier() throws RecognitionException {
		Elaborated_type_specifierContext _localctx = new Elaborated_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_elaborated_type_specifier);
		int _la;
		try {
			setState(1308);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285); class_key();
				setState(1287);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1286); attribute_specifier_seq();
					}
				}

				setState(1290);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1289); nested_name_specifier(0);
					}
					break;
				}
				setState(1292); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294); class_key();
				setState(1296);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1295); nested_name_specifier(0);
					}
					break;
				}
				setState(1299);
				_la = _input.LA(1);
				if (_la==43) {
					{
					setState(1298); match(43);
					}
				}

				setState(1301); simple_template_id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303); match(64);
				setState(1305);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1304); nested_name_specifier(0);
					}
					break;
				}
				setState(1307); match(IDENTIFIER);
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

	public static class Enum_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnum_name(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310); match(IDENTIFIER);
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

	public static class Enum_specifierContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public Enum_headerContext enum_header() {
			return getRuleContext(Enum_headerContext.class,0);
		}
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnum_specifier(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enum_specifier);
		int _la;
		try {
			setState(1325);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312); enum_header();
				setState(1313); match(67);
				setState(1315);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1314); enumerator_list(0);
					}
				}

				setState(1317); match(36);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319); enum_header();
				setState(1320); match(67);
				setState(1321); enumerator_list(0);
				setState(1322); match(14);
				setState(1323); match(36);
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

	public static class Enum_headerContext extends ParserRuleContext {
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Enum_keyContext enum_key() {
			return getRuleContext(Enum_keyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Enum_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnum_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnum_header(this);
		}
	}

	public final Enum_headerContext enum_header() throws RecognitionException {
		Enum_headerContext _localctx = new Enum_headerContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enum_header);
		int _la;
		try {
			setState(1346);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327); enum_key();
				setState(1329);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1328); attribute_specifier_seq();
					}
				}

				setState(1332);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1331); match(IDENTIFIER);
					}
				}

				setState(1335);
				_la = _input.LA(1);
				if (_la==49) {
					{
					setState(1334); enum_base();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337); enum_key();
				setState(1339);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1338); attribute_specifier_seq();
					}
				}

				setState(1341); nested_name_specifier(0);
				setState(1342); match(IDENTIFIER);
				setState(1344);
				_la = _input.LA(1);
				if (_la==49) {
					{
					setState(1343); enum_base();
					}
				}

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

	public static class Opaque_enum_declarationContext extends ParserRuleContext {
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public Enum_keyContext enum_key() {
			return getRuleContext(Enum_keyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Opaque_enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaque_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterOpaque_enum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitOpaque_enum_declaration(this);
		}
	}

	public final Opaque_enum_declarationContext opaque_enum_declaration() throws RecognitionException {
		Opaque_enum_declarationContext _localctx = new Opaque_enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_opaque_enum_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348); enum_key();
			setState(1350);
			_la = _input.LA(1);
			if (_la==51 || _la==90) {
				{
				setState(1349); attribute_specifier_seq();
				}
			}

			setState(1352); match(IDENTIFIER);
			setState(1354);
			_la = _input.LA(1);
			if (_la==49) {
				{
				setState(1353); enum_base();
				}
			}

			setState(1356); match(33);
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

	public static class Enum_keyContext extends ParserRuleContext {
		public Enum_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnum_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnum_key(this);
		}
	}

	public final Enum_keyContext enum_key() throws RecognitionException {
		Enum_keyContext _localctx = new Enum_keyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enum_key);
		try {
			setState(1363);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358); match(64);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359); match(64);
				setState(1360); match(48);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1361); match(64);
				setState(1362); match(9);
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

	public static class Enum_baseContext extends ParserRuleContext {
		public Type_specifier_seqContext type_specifier_seq() {
			return getRuleContext(Type_specifier_seqContext.class,0);
		}
		public Enum_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnum_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnum_base(this);
		}
	}

	public final Enum_baseContext enum_base() throws RecognitionException {
		Enum_baseContext _localctx = new Enum_baseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365); match(49);
			setState(1366); type_specifier_seq();
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

	public static class Enumerator_listContext extends ParserRuleContext {
		public int _p;
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public Enumerator_definitionContext enumerator_definition() {
			return getRuleContext(Enumerator_definitionContext.class,0);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Enumerator_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnumerator_list(this);
		}
	}

	public final Enumerator_listContext enumerator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, _parentState, _p);
		Enumerator_listContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, RULE_enumerator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1369); enumerator_definition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Enumerator_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_enumerator_list);
					setState(1371);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1372); match(14);
					setState(1373); enumerator_definition();
					}
					} 
				}
				setState(1378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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

	public static class Enumerator_definitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Enumerator_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnumerator_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnumerator_definition(this);
		}
	}

	public final Enumerator_definitionContext enumerator_definition() throws RecognitionException {
		Enumerator_definitionContext _localctx = new Enumerator_definitionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumerator_definition);
		try {
			setState(1384);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379); enumerator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380); enumerator();
				setState(1381); match(3);
				setState(1382); constant_expression();
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386); match(IDENTIFIER);
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

	public static class Namespace_nameContext extends ParserRuleContext {
		public Original_namespace_nameContext original_namespace_name() {
			return getRuleContext(Original_namespace_nameContext.class,0);
		}
		public Namespace_aliasContext namespace_alias() {
			return getRuleContext(Namespace_aliasContext.class,0);
		}
		public Namespace_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNamespace_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNamespace_name(this);
		}
	}

	public final Namespace_nameContext namespace_name() throws RecognitionException {
		Namespace_nameContext _localctx = new Namespace_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_namespace_name);
		try {
			setState(1390);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388); original_namespace_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389); namespace_alias();
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

	public static class Original_namespace_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Original_namespace_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_original_namespace_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterOriginal_namespace_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitOriginal_namespace_name(this);
		}
	}

	public final Original_namespace_nameContext original_namespace_name() throws RecognitionException {
		Original_namespace_nameContext _localctx = new Original_namespace_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_original_namespace_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392); match(IDENTIFIER);
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

	public static class Namespace_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Namespace_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNamespace_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNamespace_alias(this);
		}
	}

	public final Namespace_aliasContext namespace_alias() throws RecognitionException {
		Namespace_aliasContext _localctx = new Namespace_aliasContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_namespace_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394); match(IDENTIFIER);
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

	public static class Namespace_definitionContext extends ParserRuleContext {
		public Unnamed_namespace_definitionContext unnamed_namespace_definition() {
			return getRuleContext(Unnamed_namespace_definitionContext.class,0);
		}
		public Named_namespace_definitionContext named_namespace_definition() {
			return getRuleContext(Named_namespace_definitionContext.class,0);
		}
		public Namespace_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNamespace_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNamespace_definition(this);
		}
	}

	public final Namespace_definitionContext namespace_definition() throws RecognitionException {
		Namespace_definitionContext _localctx = new Namespace_definitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namespace_definition);
		try {
			setState(1398);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396); named_namespace_definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397); unnamed_namespace_definition();
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

	public static class Named_namespace_definitionContext extends ParserRuleContext {
		public Original_namespace_definitionContext original_namespace_definition() {
			return getRuleContext(Original_namespace_definitionContext.class,0);
		}
		public Extension_namespace_definitionContext extension_namespace_definition() {
			return getRuleContext(Extension_namespace_definitionContext.class,0);
		}
		public Named_namespace_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_namespace_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNamed_namespace_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNamed_namespace_definition(this);
		}
	}

	public final Named_namespace_definitionContext named_namespace_definition() throws RecognitionException {
		Named_namespace_definitionContext _localctx = new Named_namespace_definitionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_named_namespace_definition);
		try {
			setState(1402);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400); original_namespace_definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401); extension_namespace_definition();
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

	public static class Original_namespace_definitionContext extends ParserRuleContext {
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Original_namespace_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_original_namespace_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterOriginal_namespace_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitOriginal_namespace_definition(this);
		}
	}

	public final Original_namespace_definitionContext original_namespace_definition() throws RecognitionException {
		Original_namespace_definitionContext _localctx = new Original_namespace_definitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_original_namespace_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(1404); match(42);
				}
			}

			setState(1407); match(52);
			setState(1408); match(IDENTIFIER);
			setState(1409); match(67);
			setState(1410); namespace_body();
			setState(1411); match(36);
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

	public static class Extension_namespace_definitionContext extends ParserRuleContext {
		public Original_namespace_nameContext original_namespace_name() {
			return getRuleContext(Original_namespace_nameContext.class,0);
		}
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Extension_namespace_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_namespace_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExtension_namespace_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExtension_namespace_definition(this);
		}
	}

	public final Extension_namespace_definitionContext extension_namespace_definition() throws RecognitionException {
		Extension_namespace_definitionContext _localctx = new Extension_namespace_definitionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_extension_namespace_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(1413); match(42);
				}
			}

			setState(1416); match(52);
			setState(1417); original_namespace_name();
			setState(1418); match(67);
			setState(1419); namespace_body();
			setState(1420); match(36);
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

	public static class Unnamed_namespace_definitionContext extends ParserRuleContext {
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Unnamed_namespace_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamed_namespace_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterUnnamed_namespace_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitUnnamed_namespace_definition(this);
		}
	}

	public final Unnamed_namespace_definitionContext unnamed_namespace_definition() throws RecognitionException {
		Unnamed_namespace_definitionContext _localctx = new Unnamed_namespace_definitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_unnamed_namespace_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(1422); match(42);
				}
			}

			setState(1425); match(52);
			setState(1426); match(67);
			setState(1427); namespace_body();
			setState(1428); match(36);
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

	public static class Namespace_bodyContext extends ParserRuleContext {
		public Declaration_seqContext declaration_seq() {
			return getRuleContext(Declaration_seqContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNamespace_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNamespace_body(this);
		}
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 17) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 38) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (103 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1430); declaration_seq();
				}
			}

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

	public static class Namespace_alias_definitionContext extends ParserRuleContext {
		public Qualified_namespace_specifierContext qualified_namespace_specifier() {
			return getRuleContext(Qualified_namespace_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Namespace_alias_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_alias_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNamespace_alias_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNamespace_alias_definition(this);
		}
	}

	public final Namespace_alias_definitionContext namespace_alias_definition() throws RecognitionException {
		Namespace_alias_definitionContext _localctx = new Namespace_alias_definitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespace_alias_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433); match(52);
			setState(1434); match(IDENTIFIER);
			setState(1435); match(3);
			setState(1436); qualified_namespace_specifier();
			setState(1437); match(33);
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

	public static class Qualified_namespace_specifierContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public Qualified_namespace_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_namespace_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterQualified_namespace_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitQualified_namespace_specifier(this);
		}
	}

	public final Qualified_namespace_specifierContext qualified_namespace_specifier() throws RecognitionException {
		Qualified_namespace_specifierContext _localctx = new Qualified_namespace_specifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_qualified_namespace_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1439); nested_name_specifier(0);
				}
				break;
			}
			setState(1442); namespace_name();
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

	public static class Using_declarationContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Unqualified_idContext unqualified_id() {
			return getRuleContext(Unqualified_idContext.class,0);
		}
		public Using_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterUsing_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitUsing_declaration(this);
		}
	}

	public final Using_declarationContext using_declaration() throws RecognitionException {
		Using_declarationContext _localctx = new Using_declarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_using_declaration);
		int _la;
		try {
			setState(1457);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444); match(115);
				setState(1446);
				_la = _input.LA(1);
				if (_la==29) {
					{
					setState(1445); match(29);
					}
				}

				setState(1448); nested_name_specifier(0);
				setState(1449); unqualified_id();
				setState(1450); match(33);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1452); match(115);
				setState(1453); match(78);
				setState(1454); unqualified_id();
				setState(1455); match(33);
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

	public static class Using_directiveContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterUsing_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitUsing_directive(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_using_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			_la = _input.LA(1);
			if (_la==51 || _la==90) {
				{
				setState(1459); attribute_specifier_seq();
				}
			}

			setState(1462); match(115);
			setState(1463); match(52);
			setState(1465);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1464); nested_name_specifier(0);
				}
				break;
			}
			setState(1467); namespace_name();
			setState(1468); match(33);
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

	public static class Asm_definitionContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CppParser.STRING_LITERAL, 0); }
		public Asm_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asm_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAsm_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAsm_definition(this);
		}
	}

	public final Asm_definitionContext asm_definition() throws RecognitionException {
		Asm_definitionContext _localctx = new Asm_definitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_asm_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470); match(34);
			setState(1471); match(74);
			setState(1472); match(STRING_LITERAL);
			setState(1473); match(59);
			setState(1474); match(33);
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

	public static class Linkage_specificationContext extends ParserRuleContext {
		public Declaration_seqContext declaration_seq() {
			return getRuleContext(Declaration_seqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CppParser.STRING_LITERAL, 0); }
		public Linkage_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkage_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLinkage_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLinkage_specification(this);
		}
	}

	public final Linkage_specificationContext linkage_specification() throws RecognitionException {
		Linkage_specificationContext _localctx = new Linkage_specificationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_linkage_specification);
		int _la;
		try {
			setState(1486);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476); match(62);
				setState(1477); match(STRING_LITERAL);
				setState(1478); match(67);
				setState(1480);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 17) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 38) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (103 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1479); declaration_seq();
					}
				}

				setState(1482); match(36);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483); match(62);
				setState(1484); match(STRING_LITERAL);
				setState(1485); declaration();
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

	public static class Attribute_specifier_seqContext extends ParserRuleContext {
		public Attribute_specifierContext attribute_specifier(int i) {
			return getRuleContext(Attribute_specifierContext.class,i);
		}
		public List<Attribute_specifierContext> attribute_specifier() {
			return getRuleContexts(Attribute_specifierContext.class);
		}
		public Attribute_specifier_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_specifier_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_specifier_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_specifier_seq(this);
		}
	}

	public final Attribute_specifier_seqContext attribute_specifier_seq() throws RecognitionException {
		Attribute_specifier_seqContext _localctx = new Attribute_specifier_seqContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attribute_specifier_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1489); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1488); attribute_specifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1491); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class Attribute_specifierContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Alignment_specifierContext alignment_specifier() {
			return getRuleContext(Alignment_specifierContext.class,0);
		}
		public Attribute_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_specifier(this);
		}
	}

	public final Attribute_specifierContext attribute_specifier() throws RecognitionException {
		Attribute_specifierContext _localctx = new Attribute_specifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_attribute_specifier);
		try {
			setState(1500);
			switch (_input.LA(1)) {
			case 51:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493); match(51);
				setState(1494); match(51);
				setState(1495); attribute_list(0);
				setState(1496); match(21);
				setState(1497); match(21);
				}
				break;
			case 90:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499); alignment_specifier();
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

	public static class Alignment_specifierContext extends ParserRuleContext {
		public Alignment_expressionContext alignment_expression() {
			return getRuleContext(Alignment_expressionContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Alignment_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAlignment_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAlignment_specifier(this);
		}
	}

	public final Alignment_specifierContext alignment_specifier() throws RecognitionException {
		Alignment_specifierContext _localctx = new Alignment_specifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_alignment_specifier);
		int _la;
		try {
			setState(1518);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502); match(90);
				setState(1503); match(74);
				setState(1504); type_id();
				setState(1506);
				_la = _input.LA(1);
				if (_la==106) {
					{
					setState(1505); match(106);
					}
				}

				setState(1508); match(59);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510); match(90);
				setState(1511); match(74);
				setState(1512); alignment_expression();
				setState(1514);
				_la = _input.LA(1);
				if (_la==106) {
					{
					setState(1513); match(106);
					}
				}

				setState(1516); match(59);
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

	public static class Alignment_expressionContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Alignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAlignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAlignment_expression(this);
		}
	}

	public final Alignment_expressionContext alignment_expression() throws RecognitionException {
		Alignment_expressionContext _localctx = new Alignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_alignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520); constant_expression();
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

	public static class Attribute_listContext extends ParserRuleContext {
		public int _p;
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Attribute_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_list(this);
		}
	}

	public final Attribute_listContext attribute_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, _parentState, _p);
		Attribute_listContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1524);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1523); attribute();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(1526); attribute();
				setState(1527); match(106);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1541);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						_localctx = new Attribute_listContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_attribute_list);
						setState(1531);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1532); match(14);
						setState(1534);
						switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
						case 1:
							{
							setState(1533); attribute();
							}
							break;
						}
						}
						break;

					case 2:
						{
						_localctx = new Attribute_listContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_attribute_list);
						setState(1536);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1537); match(14);
						setState(1538); attribute();
						setState(1539); match(106);
						}
						break;
					}
					} 
				}
				setState(1545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public Attribute_tokenContext attribute_token() {
			return getRuleContext(Attribute_tokenContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546); attribute_token();
			setState(1548);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1547); attribute_argument_clause();
				}
				break;
			}
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

	public static class Attribute_tokenContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_scoped_tokenContext attribute_scoped_token() {
			return getRuleContext(Attribute_scoped_tokenContext.class,0);
		}
		public Attribute_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_token(this);
		}
	}

	public final Attribute_tokenContext attribute_token() throws RecognitionException {
		Attribute_tokenContext _localctx = new Attribute_tokenContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attribute_token);
		try {
			setState(1552);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1551); attribute_scoped_token();
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

	public static class Attribute_scoped_tokenContext extends ParserRuleContext {
		public Attribute_namespaceContext attribute_namespace() {
			return getRuleContext(Attribute_namespaceContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_scoped_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_scoped_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_scoped_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_scoped_token(this);
		}
	}

	public final Attribute_scoped_tokenContext attribute_scoped_token() throws RecognitionException {
		Attribute_scoped_tokenContext _localctx = new Attribute_scoped_tokenContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_attribute_scoped_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554); attribute_namespace();
			setState(1555); match(78);
			setState(1556); match(IDENTIFIER);
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

	public static class Attribute_namespaceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_namespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_namespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_namespace(this);
		}
	}

	public final Attribute_namespaceContext attribute_namespace() throws RecognitionException {
		Attribute_namespaceContext _localctx = new Attribute_namespaceContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attribute_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558); match(IDENTIFIER);
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

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public Balanced_token_seqContext balanced_token_seq() {
			return getRuleContext(Balanced_token_seqContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAttribute_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAttribute_argument_clause(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560); match(74);
			setState(1561); balanced_token_seq(0);
			setState(1562); match(59);
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

	public static class Balanced_token_seqContext extends ParserRuleContext {
		public int _p;
		public Balanced_token_seqContext balanced_token_seq() {
			return getRuleContext(Balanced_token_seqContext.class,0);
		}
		public Balanced_tokenContext balanced_token() {
			return getRuleContext(Balanced_tokenContext.class,0);
		}
		public Balanced_token_seqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Balanced_token_seqContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_balanced_token_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBalanced_token_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBalanced_token_seq(this);
		}
	}

	public final Balanced_token_seqContext balanced_token_seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Balanced_token_seqContext _localctx = new Balanced_token_seqContext(_ctx, _parentState, _p);
		Balanced_token_seqContext _prevctx = _localctx;
		int _startState = 224;
		enterRecursionRule(_localctx, RULE_balanced_token_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1566);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1565); balanced_token();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Balanced_token_seqContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_balanced_token_seq);
					setState(1568);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1569); balanced_token();
					}
					} 
				}
				setState(1574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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

	public static class Balanced_tokenContext extends ParserRuleContext {
		public Balanced_token_seqContext balanced_token_seq() {
			return getRuleContext(Balanced_token_seqContext.class,0);
		}
		public TerminalNode NON_BRACES_CHAR(int i) {
			return getToken(CppParser.NON_BRACES_CHAR, i);
		}
		public List<TerminalNode> NON_BRACES_CHAR() { return getTokens(CppParser.NON_BRACES_CHAR); }
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBalanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBalanced_token(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_balanced_token);
		try {
			int _alt;
			setState(1592);
			switch (_input.LA(1)) {
			case 74:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575); match(74);
				setState(1576); balanced_token_seq(0);
				setState(1577); match(59);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579); match(51);
				setState(1580); balanced_token_seq(0);
				setState(1581); match(21);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 3);
				{
				setState(1583); match(67);
				setState(1584); balanced_token_seq(0);
				setState(1585); match(36);
				}
				break;
			case NON_BRACES_CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1588); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1587); match(NON_BRACES_CHAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1590); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class Init_declarator_listContext extends ParserRuleContext {
		public int _p;
		public Init_declaratorContext init_declarator() {
			return getRuleContext(Init_declaratorContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, _parentState, _p);
		Init_declarator_listContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, RULE_init_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1595); init_declarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Init_declarator_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_init_declarator_list);
					setState(1597);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1598); match(14);
					setState(1599); init_declarator();
					}
					} 
				}
				setState(1604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_init_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605); declarator();
			setState(1607);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1606); initializer();
				}
				break;
			}
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

	public static class DeclaratorContext extends ParserRuleContext {
		public Noptr_declaratorContext noptr_declarator() {
			return getRuleContext(Noptr_declaratorContext.class,0);
		}
		public Ptr_declaratorContext ptr_declarator() {
			return getRuleContext(Ptr_declaratorContext.class,0);
		}
		public Trailing_return_typeContext trailing_return_type() {
			return getRuleContext(Trailing_return_typeContext.class,0);
		}
		public Parameters_and_qualifiersContext parameters_and_qualifiers() {
			return getRuleContext(Parameters_and_qualifiersContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_declarator);
		try {
			setState(1614);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609); ptr_declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610); noptr_declarator(0);
				setState(1611); parameters_and_qualifiers();
				setState(1612); trailing_return_type();
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

	public static class Ptr_declaratorContext extends ParserRuleContext {
		public Noptr_declaratorContext noptr_declarator() {
			return getRuleContext(Noptr_declaratorContext.class,0);
		}
		public Ptr_declaratorContext ptr_declarator() {
			return getRuleContext(Ptr_declaratorContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Ptr_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPtr_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPtr_declarator(this);
		}
	}

	public final Ptr_declaratorContext ptr_declarator() throws RecognitionException {
		Ptr_declaratorContext _localctx = new Ptr_declaratorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_ptr_declarator);
		try {
			setState(1620);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1616); noptr_declarator(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617); ptr_operator();
				setState(1618); ptr_declarator();
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

	public static class Noptr_declaratorContext extends ParserRuleContext {
		public int _p;
		public Noptr_declaratorContext noptr_declarator() {
			return getRuleContext(Noptr_declaratorContext.class,0);
		}
		public Declarator_idContext declarator_id() {
			return getRuleContext(Declarator_idContext.class,0);
		}
		public Ptr_declaratorContext ptr_declarator() {
			return getRuleContext(Ptr_declaratorContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Parameters_and_qualifiersContext parameters_and_qualifiers() {
			return getRuleContext(Parameters_and_qualifiersContext.class,0);
		}
		public Noptr_declaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Noptr_declaratorContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_noptr_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNoptr_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNoptr_declarator(this);
		}
	}

	public final Noptr_declaratorContext noptr_declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Noptr_declaratorContext _localctx = new Noptr_declaratorContext(_ctx, _parentState, _p);
		Noptr_declaratorContext _prevctx = _localctx;
		int _startState = 236;
		enterRecursionRule(_localctx, RULE_noptr_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			switch (_input.LA(1)) {
			case 22:
			case 28:
			case 65:
			case 78:
			case 106:
			case IDENTIFIER:
				{
				setState(1623); declarator_id();
				setState(1625);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1624); attribute_specifier_seq();
					}
					break;
				}
				}
				break;
			case 74:
				{
				setState(1627); match(74);
				setState(1628); ptr_declarator();
				setState(1629); match(59);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1644);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						_localctx = new Noptr_declaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_noptr_declarator);
						setState(1633);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1634); parameters_and_qualifiers();
						}
						break;

					case 2:
						{
						_localctx = new Noptr_declaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_noptr_declarator);
						setState(1635);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1636); match(51);
						setState(1638);
						_la = _input.LA(1);
						if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
							{
							setState(1637); constant_expression();
							}
						}

						setState(1640); match(21);
						setState(1642);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1641); attribute_specifier_seq();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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

	public static class Parameters_and_qualifiersContext extends ParserRuleContext {
		public Ref_qualifierContext ref_qualifier() {
			return getRuleContext(Ref_qualifierContext.class,0);
		}
		public Cv_qualifier_seqContext cv_qualifier_seq() {
			return getRuleContext(Cv_qualifier_seqContext.class,0);
		}
		public Parameter_declaration_clauseContext parameter_declaration_clause() {
			return getRuleContext(Parameter_declaration_clauseContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Exception_specificationContext exception_specification() {
			return getRuleContext(Exception_specificationContext.class,0);
		}
		public Parameters_and_qualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_and_qualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterParameters_and_qualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitParameters_and_qualifiers(this);
		}
	}

	public final Parameters_and_qualifiersContext parameters_and_qualifiers() throws RecognitionException {
		Parameters_and_qualifiersContext _localctx = new Parameters_and_qualifiersContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_parameters_and_qualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649); match(74);
			setState(1650); parameter_declaration_clause();
			setState(1651); match(59);
			setState(1653);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1652); attribute_specifier_seq();
				}
				break;
			}
			setState(1656);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1655); cv_qualifier_seq();
				}
				break;
			}
			setState(1659);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1658); ref_qualifier();
				}
				break;
			}
			setState(1662);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1661); exception_specification();
				}
				break;
			}
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

	public static class Trailing_return_typeContext extends ParserRuleContext {
		public Trailing_type_specifier_seqContext trailing_type_specifier_seq() {
			return getRuleContext(Trailing_type_specifier_seqContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Trailing_return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTrailing_return_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTrailing_return_type(this);
		}
	}

	public final Trailing_return_typeContext trailing_return_type() throws RecognitionException {
		Trailing_return_typeContext _localctx = new Trailing_return_typeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_trailing_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); match(113);
			setState(1665); trailing_type_specifier_seq();
			setState(1667);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1666); abstract_declarator();
				}
				break;
			}
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

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Cv_qualifier_seqContext cv_qualifier_seq() {
			return getRuleContext(Cv_qualifier_seqContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPtr_operator(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_ptr_operator);
		try {
			setState(1692);
			switch (_input.LA(1)) {
			case 44:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669); match(44);
				setState(1671);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1670); attribute_specifier_seq();
					}
					break;
				}
				setState(1674);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1673); cv_qualifier_seq();
					}
					break;
				}
				}
				break;
			case 101:
				enterOuterAlt(_localctx, 2);
				{
				setState(1676); match(101);
				setState(1678);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1677); attribute_specifier_seq();
					}
					break;
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 3);
				{
				setState(1680); match(17);
				setState(1682);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1681); attribute_specifier_seq();
					}
					break;
				}
				}
				break;
			case 65:
			case 78:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1684); nested_name_specifier(0);
				setState(1685); match(44);
				setState(1687);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1686); attribute_specifier_seq();
					}
					break;
				}
				setState(1690);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1689); cv_qualifier_seq();
					}
					break;
				}
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

	public static class Cv_qualifier_seqContext extends ParserRuleContext {
		public Cv_qualifier_seqContext cv_qualifier_seq() {
			return getRuleContext(Cv_qualifier_seqContext.class,0);
		}
		public Cv_qualifierContext cv_qualifier() {
			return getRuleContext(Cv_qualifierContext.class,0);
		}
		public Cv_qualifier_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv_qualifier_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCv_qualifier_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCv_qualifier_seq(this);
		}
	}

	public final Cv_qualifier_seqContext cv_qualifier_seq() throws RecognitionException {
		Cv_qualifier_seqContext _localctx = new Cv_qualifier_seqContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cv_qualifier_seq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694); cv_qualifier();
			setState(1696);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1695); cv_qualifier_seq();
				}
				break;
			}
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

	public static class Cv_qualifierContext extends ParserRuleContext {
		public Cv_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCv_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCv_qualifier(this);
		}
	}

	public final Cv_qualifierContext cv_qualifier() throws RecognitionException {
		Cv_qualifierContext _localctx = new Cv_qualifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_cv_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			_la = _input.LA(1);
			if ( !(_la==24 || _la==114) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Ref_qualifierContext extends ParserRuleContext {
		public Ref_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterRef_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitRef_qualifier(this);
		}
	}

	public final Ref_qualifierContext ref_qualifier() throws RecognitionException {
		Ref_qualifierContext _localctx = new Ref_qualifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ref_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			_la = _input.LA(1);
			if ( !(_la==17 || _la==101) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Declarator_idContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Id_expressionContext id_expression() {
			return getRuleContext(Id_expressionContext.class,0);
		}
		public Declarator_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclarator_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclarator_id(this);
		}
	}

	public final Declarator_idContext declarator_id() throws RecognitionException {
		Declarator_idContext _localctx = new Declarator_idContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_declarator_id);
		int _la;
		try {
			setState(1710);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1703);
				_la = _input.LA(1);
				if (_la==106) {
					{
					setState(1702); match(106);
					}
				}

				setState(1705); id_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1707);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1706); nested_name_specifier(0);
					}
					break;
				}
				setState(1709); class_name();
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

	public static class Type_idContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Type_specifier_seqContext type_specifier_seq() {
			return getRuleContext(Type_specifier_seqContext.class,0);
		}
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_id(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712); type_specifier_seq();
			setState(1714);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1713); abstract_declarator();
				}
				break;
			}
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

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public Ptr_abstract_declaratorContext ptr_abstract_declarator() {
			return getRuleContext(Ptr_abstract_declaratorContext.class,0);
		}
		public Noptr_abstract_declaratorContext noptr_abstract_declarator() {
			return getRuleContext(Noptr_abstract_declaratorContext.class,0);
		}
		public Trailing_return_typeContext trailing_return_type() {
			return getRuleContext(Trailing_return_typeContext.class,0);
		}
		public Parameters_and_qualifiersContext parameters_and_qualifiers() {
			return getRuleContext(Parameters_and_qualifiersContext.class,0);
		}
		public Abstract_pack_declaratorContext abstract_pack_declarator() {
			return getRuleContext(Abstract_pack_declaratorContext.class,0);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAbstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAbstract_declarator(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_abstract_declarator);
		try {
			setState(1724);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1716); ptr_abstract_declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1717); noptr_abstract_declarator(0);
					}
					break;
				}
				setState(1720); parameters_and_qualifiers();
				setState(1721); trailing_return_type();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1723); abstract_pack_declarator();
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

	public static class Ptr_abstract_declaratorContext extends ParserRuleContext {
		public Ptr_abstract_declaratorContext ptr_abstract_declarator() {
			return getRuleContext(Ptr_abstract_declaratorContext.class,0);
		}
		public Noptr_abstract_declaratorContext noptr_abstract_declarator() {
			return getRuleContext(Noptr_abstract_declaratorContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Ptr_abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPtr_abstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPtr_abstract_declarator(this);
		}
	}

	public final Ptr_abstract_declaratorContext ptr_abstract_declarator() throws RecognitionException {
		Ptr_abstract_declaratorContext _localctx = new Ptr_abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_ptr_abstract_declarator);
		try {
			setState(1731);
			switch (_input.LA(1)) {
			case 51:
			case 74:
				enterOuterAlt(_localctx, 1);
				{
				setState(1726); noptr_abstract_declarator(0);
				}
				break;
			case 17:
			case 44:
			case 65:
			case 78:
			case 101:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727); ptr_operator();
				setState(1729);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1728); ptr_abstract_declarator();
					}
					break;
				}
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

	public static class Noptr_abstract_declaratorContext extends ParserRuleContext {
		public int _p;
		public Ptr_abstract_declaratorContext ptr_abstract_declarator() {
			return getRuleContext(Ptr_abstract_declaratorContext.class,0);
		}
		public Noptr_abstract_declaratorContext noptr_abstract_declarator() {
			return getRuleContext(Noptr_abstract_declaratorContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Parameters_and_qualifiersContext parameters_and_qualifiers() {
			return getRuleContext(Parameters_and_qualifiersContext.class,0);
		}
		public Noptr_abstract_declaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Noptr_abstract_declaratorContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_noptr_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNoptr_abstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNoptr_abstract_declarator(this);
		}
	}

	public final Noptr_abstract_declaratorContext noptr_abstract_declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Noptr_abstract_declaratorContext _localctx = new Noptr_abstract_declaratorContext(_ctx, _parentState, _p);
		Noptr_abstract_declaratorContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, RULE_noptr_abstract_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1734); parameters_and_qualifiers();
				}
				break;

			case 2:
				{
				setState(1735); match(51);
				setState(1737);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(1736); constant_expression();
					}
				}

				setState(1739); match(21);
				setState(1741);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1740); attribute_specifier_seq();
					}
					break;
				}
				}
				break;

			case 3:
				{
				setState(1743); match(74);
				setState(1744); ptr_abstract_declarator();
				setState(1745); match(59);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1760);
					switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
					case 1:
						{
						_localctx = new Noptr_abstract_declaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_noptr_abstract_declarator);
						setState(1749);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1750); parameters_and_qualifiers();
						}
						break;

					case 2:
						{
						_localctx = new Noptr_abstract_declaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_noptr_abstract_declarator);
						setState(1751);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1752); match(51);
						setState(1754);
						_la = _input.LA(1);
						if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
							{
							setState(1753); constant_expression();
							}
						}

						setState(1756); match(21);
						setState(1758);
						switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
						case 1:
							{
							setState(1757); attribute_specifier_seq();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class Abstract_pack_declaratorContext extends ParserRuleContext {
		public Noptr_abstract_pack_declaratorContext noptr_abstract_pack_declarator() {
			return getRuleContext(Noptr_abstract_pack_declaratorContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Abstract_pack_declaratorContext abstract_pack_declarator() {
			return getRuleContext(Abstract_pack_declaratorContext.class,0);
		}
		public Abstract_pack_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_pack_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAbstract_pack_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAbstract_pack_declarator(this);
		}
	}

	public final Abstract_pack_declaratorContext abstract_pack_declarator() throws RecognitionException {
		Abstract_pack_declaratorContext _localctx = new Abstract_pack_declaratorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_abstract_pack_declarator);
		try {
			setState(1769);
			switch (_input.LA(1)) {
			case 106:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765); noptr_abstract_pack_declarator(0);
				}
				break;
			case 17:
			case 44:
			case 65:
			case 78:
			case 101:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766); ptr_operator();
				setState(1767); abstract_pack_declarator();
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

	public static class Noptr_abstract_pack_declaratorContext extends ParserRuleContext {
		public int _p;
		public Noptr_abstract_pack_declaratorContext noptr_abstract_pack_declarator() {
			return getRuleContext(Noptr_abstract_pack_declaratorContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Parameters_and_qualifiersContext parameters_and_qualifiers() {
			return getRuleContext(Parameters_and_qualifiersContext.class,0);
		}
		public Noptr_abstract_pack_declaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Noptr_abstract_pack_declaratorContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_noptr_abstract_pack_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNoptr_abstract_pack_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNoptr_abstract_pack_declarator(this);
		}
	}

	public final Noptr_abstract_pack_declaratorContext noptr_abstract_pack_declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Noptr_abstract_pack_declaratorContext _localctx = new Noptr_abstract_pack_declaratorContext(_ctx, _parentState, _p);
		Noptr_abstract_pack_declaratorContext _prevctx = _localctx;
		int _startState = 262;
		enterRecursionRule(_localctx, RULE_noptr_abstract_pack_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1772); match(106);
			}
			_ctx.stop = _input.LT(-1);
			setState(1787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1785);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						_localctx = new Noptr_abstract_pack_declaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_noptr_abstract_pack_declarator);
						setState(1774);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1775); parameters_and_qualifiers();
						}
						break;

					case 2:
						{
						_localctx = new Noptr_abstract_pack_declaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_noptr_abstract_pack_declarator);
						setState(1776);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1777); match(51);
						setState(1779);
						_la = _input.LA(1);
						if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
							{
							setState(1778); constant_expression();
							}
						}

						setState(1781); match(21);
						setState(1783);
						switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
						case 1:
							{
							setState(1782); attribute_specifier_seq();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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

	public static class Parameter_declaration_clauseContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Parameter_declaration_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterParameter_declaration_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitParameter_declaration_clause(this);
		}
	}

	public final Parameter_declaration_clauseContext parameter_declaration_clause() throws RecognitionException {
		Parameter_declaration_clauseContext _localctx = new Parameter_declaration_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_parameter_declaration_clause);
		int _la;
		try {
			setState(1800);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 38) | (1L << 42) | (1L << 45) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (100 - 64)) | (1L << (103 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1790); parameter_declaration_list(0);
					}
				}

				setState(1794);
				_la = _input.LA(1);
				if (_la==106) {
					{
					setState(1793); match(106);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1796); parameter_declaration_list(0);
				setState(1797); match(14);
				setState(1798); match(106);
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

	public static class Parameter_declaration_listContext extends ParserRuleContext {
		public int _p;
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterParameter_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitParameter_declaration_list(this);
		}
	}

	public final Parameter_declaration_listContext parameter_declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, _parentState, _p);
		Parameter_declaration_listContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, RULE_parameter_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1803); parameter_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parameter_declaration_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_declaration_list);
					setState(1805);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1806); match(14);
					setState(1807); parameter_declaration();
					}
					} 
				}
				setState(1812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Decl_specifier_seqContext decl_specifier_seq() {
			return getRuleContext(Decl_specifier_seqContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Initializer_clauseContext initializer_clause() {
			return getRuleContext(Initializer_clauseContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_parameter_declaration);
		int _la;
		try {
			setState(1844);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1813); attribute_specifier_seq();
					}
				}

				setState(1816); decl_specifier_seq();
				setState(1817); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1820);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1819); attribute_specifier_seq();
					}
				}

				setState(1822); decl_specifier_seq();
				setState(1823); declarator();
				setState(1824); match(3);
				setState(1825); initializer_clause();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1828);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1827); attribute_specifier_seq();
					}
				}

				setState(1830); decl_specifier_seq();
				setState(1832);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1831); abstract_declarator();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1835);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1834); attribute_specifier_seq();
					}
				}

				setState(1837); decl_specifier_seq();
				setState(1839);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 44) | (1L << 51))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (74 - 65)) | (1L << (78 - 65)) | (1L << (101 - 65)) | (1L << (106 - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(1838); abstract_declarator();
					}
				}

				setState(1841); match(3);
				setState(1842); initializer_clause();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Decl_specifier_seqContext decl_specifier_seq() {
			return getRuleContext(Decl_specifier_seqContext.class,0);
		}
		public Virt_specifier_seqContext virt_specifier_seq() {
			return getRuleContext(Virt_specifier_seqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			_la = _input.LA(1);
			if (_la==51 || _la==90) {
				{
				setState(1846); attribute_specifier_seq();
				}
			}

			setState(1850);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1849); decl_specifier_seq();
				}
				break;
			}
			setState(1852); declarator();
			setState(1854);
			_la = _input.LA(1);
			if (_la==50 || _la==81) {
				{
				setState(1853); virt_specifier_seq(0);
				}
			}

			setState(1856); function_body();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public Function_try_blockContext function_try_block() {
			return getRuleContext(Function_try_blockContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Ctor_initializerContext ctor_initializer() {
			return getRuleContext(Ctor_initializerContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_function_body);
		int _la;
		try {
			setState(1869);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				_la = _input.LA(1);
				if (_la==49) {
					{
					setState(1858); ctor_initializer();
					}
				}

				setState(1861); compound_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1862); function_try_block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1863); match(3);
				setState(1864); match(97);
				setState(1865); match(33);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1866); match(3);
				setState(1867); match(19);
				setState(1868); match(33);
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

	public static class InitializerContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Brace_or_equal_initializerContext brace_or_equal_initializer() {
			return getRuleContext(Brace_or_equal_initializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_initializer);
		try {
			setState(1876);
			switch (_input.LA(1)) {
			case 3:
			case 67:
				enterOuterAlt(_localctx, 1);
				{
				setState(1871); brace_or_equal_initializer();
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 2);
				{
				setState(1872); match(74);
				setState(1873); expression_list();
				setState(1874); match(59);
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

	public static class Brace_or_equal_initializerContext extends ParserRuleContext {
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public Initializer_clauseContext initializer_clause() {
			return getRuleContext(Initializer_clauseContext.class,0);
		}
		public Brace_or_equal_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace_or_equal_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBrace_or_equal_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBrace_or_equal_initializer(this);
		}
	}

	public final Brace_or_equal_initializerContext brace_or_equal_initializer() throws RecognitionException {
		Brace_or_equal_initializerContext _localctx = new Brace_or_equal_initializerContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_brace_or_equal_initializer);
		try {
			setState(1881);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(1878); match(3);
				setState(1879); initializer_clause();
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880); braced_init_list();
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

	public static class Initializer_clauseContext extends ParserRuleContext {
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Initializer_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInitializer_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInitializer_clause(this);
		}
	}

	public final Initializer_clauseContext initializer_clause() throws RecognitionException {
		Initializer_clauseContext _localctx = new Initializer_clauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_initializer_clause);
		try {
			setState(1885);
			switch (_input.LA(1)) {
			case 8:
			case 12:
			case 19:
			case 22:
			case 23:
			case 25:
			case 27:
			case 28:
			case 29:
			case 31:
			case 38:
			case 44:
			case 51:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 60:
			case 61:
			case 65:
			case 71:
			case 74:
			case 75:
			case 76:
			case 78:
			case 79:
			case 83:
			case 86:
			case 89:
			case 91:
			case 92:
			case 93:
			case 96:
			case 101:
			case 111:
			case 117:
			case 118:
			case 119:
			case 120:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case FLOATING_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case POINTER_LITERAL:
			case UDEF_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1883); assignment_expression();
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 2);
				{
				setState(1884); braced_init_list();
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

	public static class Initializer_listContext extends ParserRuleContext {
		public int _p;
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Initializer_clauseContext initializer_clause() {
			return getRuleContext(Initializer_clauseContext.class,0);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Initializer_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, _parentState, _p);
		Initializer_listContext _prevctx = _localctx;
		int _startState = 280;
		enterRecursionRule(_localctx, RULE_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1888); initializer_clause();
			setState(1890);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1889); match(106);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Initializer_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_initializer_list);
					setState(1892);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1893); match(14);
					setState(1894); initializer_clause();
					setState(1896);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						setState(1895); match(106);
						}
						break;
					}
					}
					} 
				}
				setState(1902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
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

	public static class Braced_init_listContext extends ParserRuleContext {
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Braced_init_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braced_init_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBraced_init_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBraced_init_list(this);
		}
	}

	public final Braced_init_listContext braced_init_list() throws RecognitionException {
		Braced_init_listContext _localctx = new Braced_init_listContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_braced_init_list);
		int _la;
		try {
			setState(1912);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903); match(67);
				setState(1904); initializer_list(0);
				setState(1906);
				_la = _input.LA(1);
				if (_la==14) {
					{
					setState(1905); match(14);
					}
				}

				setState(1908); match(36);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1910); match(67);
				setState(1911); match(36);
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_class_name);
		try {
			setState(1916);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915); simple_template_id();
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

	public static class Class_specifierContext extends ParserRuleContext {
		public Class_headContext class_head() {
			return getRuleContext(Class_headContext.class,0);
		}
		public Member_specificationContext member_specification() {
			return getRuleContext(Member_specificationContext.class,0);
		}
		public Class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterClass_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitClass_specifier(this);
		}
	}

	public final Class_specifierContext class_specifier() throws RecognitionException {
		Class_specifierContext _localctx = new Class_specifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918); class_head();
			setState(1919); match(67);
			setState(1921);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 17) | (1L << 18) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 38) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (103 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1920); member_specification();
				}
			}

			setState(1923); match(36);
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

	public static class Class_headContext extends ParserRuleContext {
		public Class_head_nameContext class_head_name() {
			return getRuleContext(Class_head_nameContext.class,0);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public Class_virt_specifierContext class_virt_specifier() {
			return getRuleContext(Class_virt_specifierContext.class,0);
		}
		public Base_clauseContext base_clause() {
			return getRuleContext(Base_clauseContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Class_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterClass_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitClass_head(this);
		}
	}

	public final Class_headContext class_head() throws RecognitionException {
		Class_headContext _localctx = new Class_headContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_class_head);
		int _la;
		try {
			setState(1943);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1925); class_key();
				setState(1927);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1926); attribute_specifier_seq();
					}
				}

				setState(1929); class_head_name();
				setState(1931);
				_la = _input.LA(1);
				if (_la==81) {
					{
					setState(1930); class_virt_specifier();
					}
				}

				setState(1934);
				_la = _input.LA(1);
				if (_la==49) {
					{
					setState(1933); base_clause();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936); class_key();
				setState(1938);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(1937); attribute_specifier_seq();
					}
				}

				setState(1941);
				_la = _input.LA(1);
				if (_la==49) {
					{
					setState(1940); base_clause();
					}
				}

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

	public static class Class_head_nameContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_head_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_head_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterClass_head_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitClass_head_name(this);
		}
	}

	public final Class_head_nameContext class_head_name() throws RecognitionException {
		Class_head_nameContext _localctx = new Class_head_nameContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_class_head_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1945); nested_name_specifier(0);
				}
				break;
			}
			setState(1948); class_name();
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

	public static class Class_virt_specifierContext extends ParserRuleContext {
		public Class_virt_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_virt_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterClass_virt_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitClass_virt_specifier(this);
		}
	}

	public final Class_virt_specifierContext class_virt_specifier() throws RecognitionException {
		Class_virt_specifierContext _localctx = new Class_virt_specifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_class_virt_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950); match(81);
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

	public static class Class_keyContext extends ParserRuleContext {
		public Class_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterClass_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitClass_key(this);
		}
	}

	public final Class_keyContext class_key() throws RecognitionException {
		Class_keyContext _localctx = new Class_keyContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_class_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			_la = _input.LA(1);
			if ( !(_la==9 || _la==48 || _la==109) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Member_specificationContext extends ParserRuleContext {
		public Member_declarationContext member_declaration() {
			return getRuleContext(Member_declarationContext.class,0);
		}
		public Member_specificationContext member_specification() {
			return getRuleContext(Member_specificationContext.class,0);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Member_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMember_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMember_specification(this);
		}
	}

	public final Member_specificationContext member_specification() throws RecognitionException {
		Member_specificationContext _localctx = new Member_specificationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_member_specification);
		int _la;
		try {
			setState(1963);
			switch (_input.LA(1)) {
			case 9:
			case 11:
			case 17:
			case 22:
			case 23:
			case 24:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 38:
			case 42:
			case 43:
			case 44:
			case 45:
			case 47:
			case 48:
			case 49:
			case 51:
			case 54:
			case 56:
			case 57:
			case 60:
			case 62:
			case 64:
			case 65:
			case 69:
			case 71:
			case 74:
			case 76:
			case 78:
			case 83:
			case 85:
			case 90:
			case 91:
			case 92:
			case 98:
			case 100:
			case 101:
			case 103:
			case 106:
			case 109:
			case 111:
			case 114:
			case 115:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1954); member_declaration();
				setState(1956);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 17) | (1L << 18) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 38) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (103 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1955); member_specification();
					}
				}

				}
				break;
			case 18:
			case 46:
			case 99:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958); access_specifier();
				setState(1959); match(49);
				setState(1961);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 11) | (1L << 17) | (1L << 18) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 38) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)) | (1L << (100 - 64)) | (1L << (101 - 64)) | (1L << (103 - 64)) | (1L << (106 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (115 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1960); member_specification();
					}
				}

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

	public static class Member_declarationContext extends ParserRuleContext {
		public Static_assert_declarationContext static_assert_declaration() {
			return getRuleContext(Static_assert_declarationContext.class,0);
		}
		public Using_declarationContext using_declaration() {
			return getRuleContext(Using_declarationContext.class,0);
		}
		public Decl_specifier_seqContext decl_specifier_seq() {
			return getRuleContext(Decl_specifier_seqContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Template_declarationContext template_declaration() {
			return getRuleContext(Template_declarationContext.class,0);
		}
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMember_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMember_declaration(this);
		}
	}

	public final Member_declarationContext member_declaration() throws RecognitionException {
		Member_declarationContext _localctx = new Member_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_member_declaration);
		int _la;
		try {
			setState(1983);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1966);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1965); attribute_specifier_seq();
					}
					break;
				}
				setState(1969);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1968); decl_specifier_seq();
					}
					break;
				}
				setState(1972);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 22) | (1L << 28) | (1L << 44) | (1L << 49) | (1L << 51))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (74 - 65)) | (1L << (78 - 65)) | (1L << (90 - 65)) | (1L << (101 - 65)) | (1L << (106 - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(1971); member_declarator_list(0);
					}
				}

				setState(1974); match(33);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975); function_definition();
				setState(1977);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1976); match(33);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1979); using_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1980); static_assert_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1981); template_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1982); alias_declaration();
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

	public static class Member_declarator_listContext extends ParserRuleContext {
		public int _p;
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMember_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMember_declarator_list(this);
		}
	}

	public final Member_declarator_listContext member_declarator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, _parentState, _p);
		Member_declarator_listContext _prevctx = _localctx;
		int _startState = 300;
		enterRecursionRule(_localctx, RULE_member_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1986); member_declarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Member_declarator_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_member_declarator_list);
					setState(1988);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1989); match(14);
					setState(1990); member_declarator();
					}
					} 
				}
				setState(1995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
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

	public static class Member_declaratorContext extends ParserRuleContext {
		public Virt_specifier_seqContext virt_specifier_seq() {
			return getRuleContext(Virt_specifier_seqContext.class,0);
		}
		public Pure_specifierContext pure_specifier() {
			return getRuleContext(Pure_specifierContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Brace_or_equal_initializerContext brace_or_equal_initializer() {
			return getRuleContext(Brace_or_equal_initializerContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMember_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMember_declarator(this);
		}
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_member_declarator);
		int _la;
		try {
			setState(2015);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996); declarator();
				setState(1998);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1997); virt_specifier_seq(0);
					}
					break;
				}
				setState(2001);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2000); pure_specifier();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2003); declarator();
				setState(2005);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2004); brace_or_equal_initializer();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2008);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(2007); match(IDENTIFIER);
					}
				}

				setState(2011);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(2010); attribute_specifier_seq();
					}
				}

				setState(2013); match(49);
				setState(2014); constant_expression();
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

	public static class Virt_specifier_seqContext extends ParserRuleContext {
		public int _p;
		public Virt_specifier_seqContext virt_specifier_seq() {
			return getRuleContext(Virt_specifier_seqContext.class,0);
		}
		public Virt_specifierContext virt_specifier() {
			return getRuleContext(Virt_specifierContext.class,0);
		}
		public Virt_specifier_seqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Virt_specifier_seqContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_virt_specifier_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterVirt_specifier_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitVirt_specifier_seq(this);
		}
	}

	public final Virt_specifier_seqContext virt_specifier_seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Virt_specifier_seqContext _localctx = new Virt_specifier_seqContext(_ctx, _parentState, _p);
		Virt_specifier_seqContext _prevctx = _localctx;
		int _startState = 304;
		enterRecursionRule(_localctx, RULE_virt_specifier_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2018); virt_specifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Virt_specifier_seqContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_virt_specifier_seq);
					setState(2020);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(2021); virt_specifier();
					}
					} 
				}
				setState(2026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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

	public static class Virt_specifierContext extends ParserRuleContext {
		public Virt_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virt_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterVirt_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitVirt_specifier(this);
		}
	}

	public final Virt_specifierContext virt_specifier() throws RecognitionException {
		Virt_specifierContext _localctx = new Virt_specifierContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_virt_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			_la = _input.LA(1);
			if ( !(_la==50 || _la==81) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Pure_specifierContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(CppParser.INTEGER_LITERAL, 0); }
		public Pure_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pure_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPure_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPure_specifier(this);
		}
	}

	public final Pure_specifierContext pure_specifier() throws RecognitionException {
		Pure_specifierContext _localctx = new Pure_specifierContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_pure_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029); match(3);
			setState(2030); match(INTEGER_LITERAL);
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

	public static class Base_clauseContext extends ParserRuleContext {
		public Base_specifier_listContext base_specifier_list() {
			return getRuleContext(Base_specifier_listContext.class,0);
		}
		public Base_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBase_clause(this);
		}
	}

	public final Base_clauseContext base_clause() throws RecognitionException {
		Base_clauseContext _localctx = new Base_clauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_base_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032); match(49);
			setState(2033); base_specifier_list(0);
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

	public static class Base_specifier_listContext extends ParserRuleContext {
		public int _p;
		public Base_specifierContext base_specifier() {
			return getRuleContext(Base_specifierContext.class,0);
		}
		public Base_specifier_listContext base_specifier_list() {
			return getRuleContext(Base_specifier_listContext.class,0);
		}
		public Base_specifier_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Base_specifier_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_base_specifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBase_specifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBase_specifier_list(this);
		}
	}

	public final Base_specifier_listContext base_specifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Base_specifier_listContext _localctx = new Base_specifier_listContext(_ctx, _parentState, _p);
		Base_specifier_listContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, RULE_base_specifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2036); base_specifier();
			setState(2038);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2037); match(106);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Base_specifier_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_base_specifier_list);
					setState(2040);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(2041); match(14);
					setState(2042); base_specifier();
					setState(2044);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(2043); match(106);
						}
						break;
					}
					}
					} 
				}
				setState(2050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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

	public static class Base_specifierContext extends ParserRuleContext {
		public Base_type_specifierContext base_type_specifier() {
			return getRuleContext(Base_type_specifierContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Base_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBase_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBase_specifier(this);
		}
	}

	public final Base_specifierContext base_specifier() throws RecognitionException {
		Base_specifierContext _localctx = new Base_specifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_base_specifier);
		int _la;
		try {
			setState(2072);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(2051); attribute_specifier_seq();
					}
				}

				setState(2054); base_type_specifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2056);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(2055); attribute_specifier_seq();
					}
				}

				setState(2058); match(45);
				setState(2060);
				_la = _input.LA(1);
				if (_la==18 || _la==46 || _la==99) {
					{
					setState(2059); access_specifier();
					}
				}

				setState(2062); base_type_specifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2064);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(2063); attribute_specifier_seq();
					}
				}

				setState(2066); access_specifier();
				setState(2068);
				_la = _input.LA(1);
				if (_la==45) {
					{
					setState(2067); match(45);
					}
				}

				setState(2070); base_type_specifier();
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

	public static class Class_or_decltypeContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public Decltype_specifierContext decltype_specifier() {
			return getRuleContext(Decltype_specifierContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_or_decltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_or_decltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterClass_or_decltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitClass_or_decltype(this);
		}
	}

	public final Class_or_decltypeContext class_or_decltype() throws RecognitionException {
		Class_or_decltypeContext _localctx = new Class_or_decltypeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_class_or_decltype);
		try {
			setState(2079);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2074); nested_name_specifier(0);
					}
					break;
				}
				setState(2077); class_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2078); decltype_specifier();
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

	public static class Base_type_specifierContext extends ParserRuleContext {
		public Class_or_decltypeContext class_or_decltype() {
			return getRuleContext(Class_or_decltypeContext.class,0);
		}
		public Base_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBase_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBase_type_specifier(this);
		}
	}

	public final Base_type_specifierContext base_type_specifier() throws RecognitionException {
		Base_type_specifierContext _localctx = new Base_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_base_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081); class_or_decltype();
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

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAccess_specifier(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			_la = _input.LA(1);
			if ( !(_la==18 || _la==46 || _la==99) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Conversion_function_idContext extends ParserRuleContext {
		public Conversion_type_idContext conversion_type_id() {
			return getRuleContext(Conversion_type_idContext.class,0);
		}
		public Conversion_function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_function_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterConversion_function_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitConversion_function_id(this);
		}
	}

	public final Conversion_function_idContext conversion_function_id() throws RecognitionException {
		Conversion_function_idContext _localctx = new Conversion_function_idContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_conversion_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085); match(28);
			setState(2086); conversion_type_id();
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

	public static class Conversion_type_idContext extends ParserRuleContext {
		public Conversion_declaratorContext conversion_declarator() {
			return getRuleContext(Conversion_declaratorContext.class,0);
		}
		public Type_specifier_seqContext type_specifier_seq() {
			return getRuleContext(Type_specifier_seqContext.class,0);
		}
		public Conversion_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterConversion_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitConversion_type_id(this);
		}
	}

	public final Conversion_type_idContext conversion_type_id() throws RecognitionException {
		Conversion_type_idContext _localctx = new Conversion_type_idContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_conversion_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088); type_specifier_seq();
			setState(2090);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(2089); conversion_declarator();
				}
				break;
			}
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

	public static class Conversion_declaratorContext extends ParserRuleContext {
		public Conversion_declaratorContext conversion_declarator() {
			return getRuleContext(Conversion_declaratorContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Conversion_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterConversion_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitConversion_declarator(this);
		}
	}

	public final Conversion_declaratorContext conversion_declarator() throws RecognitionException {
		Conversion_declaratorContext _localctx = new Conversion_declaratorContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_conversion_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092); ptr_operator();
			setState(2094);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2093); conversion_declarator();
				}
				break;
			}
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

	public static class Ctor_initializerContext extends ParserRuleContext {
		public Mem_initializer_listContext mem_initializer_list() {
			return getRuleContext(Mem_initializer_listContext.class,0);
		}
		public Ctor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCtor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCtor_initializer(this);
		}
	}

	public final Ctor_initializerContext ctor_initializer() throws RecognitionException {
		Ctor_initializerContext _localctx = new Ctor_initializerContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2096); match(49);
			setState(2097); mem_initializer_list();
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

	public static class Mem_initializer_listContext extends ParserRuleContext {
		public Mem_initializer_listContext mem_initializer_list() {
			return getRuleContext(Mem_initializer_listContext.class,0);
		}
		public Mem_initializerContext mem_initializer() {
			return getRuleContext(Mem_initializerContext.class,0);
		}
		public Mem_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMem_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMem_initializer_list(this);
		}
	}

	public final Mem_initializer_listContext mem_initializer_list() throws RecognitionException {
		Mem_initializer_listContext _localctx = new Mem_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_mem_initializer_list);
		try {
			setState(2109);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099); mem_initializer();
				setState(2101);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2100); match(106);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2103); mem_initializer();
				setState(2104); match(14);
				setState(2105); mem_initializer_list();
				setState(2107);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2106); match(106);
					}
					break;
				}
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

	public static class Mem_initializerContext extends ParserRuleContext {
		public Mem_initializer_idContext mem_initializer_id() {
			return getRuleContext(Mem_initializer_idContext.class,0);
		}
		public Braced_init_listContext braced_init_list() {
			return getRuleContext(Braced_init_listContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Mem_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMem_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMem_initializer(this);
		}
	}

	public final Mem_initializerContext mem_initializer() throws RecognitionException {
		Mem_initializerContext _localctx = new Mem_initializerContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_mem_initializer);
		int _la;
		try {
			setState(2121);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2111); mem_initializer_id();
				setState(2112); match(74);
				setState(2114);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (12 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (65 - 8)) | (1L << (67 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (111 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(2113); expression_list();
					}
				}

				setState(2116); match(59);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2118); mem_initializer_id();
				setState(2119); braced_init_list();
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

	public static class Mem_initializer_idContext extends ParserRuleContext {
		public Class_or_decltypeContext class_or_decltype() {
			return getRuleContext(Class_or_decltypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Mem_initializer_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem_initializer_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMem_initializer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMem_initializer_id(this);
		}
	}

	public final Mem_initializer_idContext mem_initializer_id() throws RecognitionException {
		Mem_initializer_idContext _localctx = new Mem_initializer_idContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_mem_initializer_id);
		try {
			setState(2125);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2123); class_or_decltype();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2124); match(IDENTIFIER);
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

	public static class Operator_function_idContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Operator_function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_function_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterOperator_function_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitOperator_function_id(this);
		}
	}

	public final Operator_function_idContext operator_function_id() throws RecognitionException {
		Operator_function_idContext _localctx = new Operator_function_idContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_operator_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127); match(28);
			setState(2128); operator();
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_operator);
		try {
			setState(2178);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2130); match(96);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2131); match(19);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2132); match(96);
				setState(2133); match(51);
				setState(2134); match(21);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2135); match(19);
				setState(2136); match(51);
				setState(2137); match(21);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2138); match(44);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2139); match(87);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2140); match(116);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2141); match(25);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2142); match(119);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2143); match(107);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2144); match(16);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2145); match(20);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2146); match(88);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2147); match(112);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2148); match(26);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2149); match(121);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2150); match(13);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2151); match(101);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2152); match(6);
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2153); match(53);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2154); match(17);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2155); match(108);
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2156); match(3);
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2157); match(39);
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2158); match(70);
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2159); match(10);
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2160); match(72);
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2161); match(5);
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2162); match(2);
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2163); match(37);
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2164); match(41);
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2165); match(15);
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2166); match(63);
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2167); match(22);
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2168); match(55);
				}
				break;

			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2169); match(86);
				}
				break;

			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2170); match(120);
				}
				break;

			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2171); match(14);
				}
				break;

			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2172); match(82);
				}
				break;

			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2173); match(113);
				}
				break;

			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2174); match(74);
				setState(2175); match(59);
				}
				break;

			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2176); match(51);
				setState(2177); match(21);
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

	public static class Literal_operator_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Literal_operator_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_operator_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLiteral_operator_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLiteral_operator_id(this);
		}
	}

	public final Literal_operator_idContext literal_operator_id() throws RecognitionException {
		Literal_operator_idContext _localctx = new Literal_operator_idContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_literal_operator_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180); match(28);
			setState(2181); match(40);
			setState(2182); match(40);
			setState(2183); match(IDENTIFIER);
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

	public static class Template_declarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Template_parameter_listContext template_parameter_list() {
			return getRuleContext(Template_parameter_listContext.class,0);
		}
		public Template_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTemplate_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTemplate_declaration(this);
		}
	}

	public final Template_declarationContext template_declaration() throws RecognitionException {
		Template_declarationContext _localctx = new Template_declarationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_template_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185); match(43);
			setState(2186); match(20);
			setState(2187); template_parameter_list(0);
			setState(2188); match(112);
			setState(2189); declaration();
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

	public static class Template_parameter_listContext extends ParserRuleContext {
		public int _p;
		public Template_parameterContext template_parameter() {
			return getRuleContext(Template_parameterContext.class,0);
		}
		public Template_parameter_listContext template_parameter_list() {
			return getRuleContext(Template_parameter_listContext.class,0);
		}
		public Template_parameter_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Template_parameter_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_template_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTemplate_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTemplate_parameter_list(this);
		}
	}

	public final Template_parameter_listContext template_parameter_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Template_parameter_listContext _localctx = new Template_parameter_listContext(_ctx, _parentState, _p);
		Template_parameter_listContext _prevctx = _localctx;
		int _startState = 344;
		enterRecursionRule(_localctx, RULE_template_parameter_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2192); template_parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_parameter_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_template_parameter_list);
					setState(2194);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(2195); match(14);
					setState(2196); template_parameter();
					}
					} 
				}
				setState(2201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
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

	public static class Template_parameterContext extends ParserRuleContext {
		public Type_parameterContext type_parameter() {
			return getRuleContext(Type_parameterContext.class,0);
		}
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public Template_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTemplate_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTemplate_parameter(this);
		}
	}

	public final Template_parameterContext template_parameter() throws RecognitionException {
		Template_parameterContext _localctx = new Template_parameterContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_template_parameter);
		try {
			setState(2204);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2202); type_parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2203); parameter_declaration();
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

	public static class Type_parameterContext extends ParserRuleContext {
		public Template_parameter_listContext template_parameter_list() {
			return getRuleContext(Template_parameter_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Id_expressionContext id_expression() {
			return getRuleContext(Id_expressionContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_parameter(this);
		}
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_type_parameter);
		int _la;
		try {
			setState(2254);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206); match(48);
				setState(2208);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2207); match(106);
					}
					break;
				}
				setState(2211);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2210); match(IDENTIFIER);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2213); match(48);
				setState(2215);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(2214); match(IDENTIFIER);
					}
				}

				setState(2217); match(3);
				setState(2218); type_id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2219); match(29);
				setState(2221);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2220); match(106);
					}
					break;
				}
				setState(2224);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2223); match(IDENTIFIER);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2226); match(29);
				setState(2228);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(2227); match(IDENTIFIER);
					}
				}

				setState(2230); match(3);
				setState(2231); type_id();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2232); match(43);
				setState(2233); match(20);
				setState(2234); template_parameter_list(0);
				setState(2235); match(112);
				setState(2236); match(48);
				setState(2238);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2237); match(106);
					}
					break;
				}
				setState(2241);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2240); match(IDENTIFIER);
					}
					break;
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2243); match(43);
				setState(2244); match(20);
				setState(2245); template_parameter_list(0);
				setState(2246); match(112);
				setState(2247); match(48);
				setState(2249);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(2248); match(IDENTIFIER);
					}
				}

				setState(2251); match(3);
				setState(2252); id_expression();
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

	public static class Simple_template_idContext extends ParserRuleContext {
		public Template_nameContext template_name() {
			return getRuleContext(Template_nameContext.class,0);
		}
		public Template_argument_listContext template_argument_list() {
			return getRuleContext(Template_argument_listContext.class,0);
		}
		public Simple_template_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_template_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterSimple_template_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitSimple_template_id(this);
		}
	}

	public final Simple_template_idContext simple_template_id() throws RecognitionException {
		Simple_template_idContext _localctx = new Simple_template_idContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_simple_template_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2256); template_name();
			setState(2257); match(20);
			setState(2259);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (9 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (24 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (48 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (64 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (109 - 74)) | (1L << (111 - 74)) | (1L << (114 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
				{
				setState(2258); template_argument_list(0);
				}
			}

			setState(2261); match(112);
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

	public static class Template_idContext extends ParserRuleContext {
		public Template_argument_listContext template_argument_list() {
			return getRuleContext(Template_argument_listContext.class,0);
		}
		public Operator_function_idContext operator_function_id() {
			return getRuleContext(Operator_function_idContext.class,0);
		}
		public Literal_operator_idContext literal_operator_id() {
			return getRuleContext(Literal_operator_idContext.class,0);
		}
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Template_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTemplate_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTemplate_id(this);
		}
	}

	public final Template_idContext template_id() throws RecognitionException {
		Template_idContext _localctx = new Template_idContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_template_id);
		int _la;
		try {
			setState(2278);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2263); simple_template_id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2264); operator_function_id();
				setState(2265); match(20);
				setState(2267);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (9 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (24 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (48 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (64 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (109 - 74)) | (1L << (111 - 74)) | (1L << (114 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(2266); template_argument_list(0);
					}
				}

				setState(2269); match(112);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2271); literal_operator_id();
				setState(2272); match(20);
				setState(2274);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (9 - 8)) | (1L << (19 - 8)) | (1L << (22 - 8)) | (1L << (23 - 8)) | (1L << (24 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (28 - 8)) | (1L << (29 - 8)) | (1L << (31 - 8)) | (1L << (38 - 8)) | (1L << (44 - 8)) | (1L << (48 - 8)) | (1L << (51 - 8)) | (1L << (54 - 8)) | (1L << (55 - 8)) | (1L << (56 - 8)) | (1L << (57 - 8)) | (1L << (58 - 8)) | (1L << (60 - 8)) | (1L << (61 - 8)) | (1L << (64 - 8)) | (1L << (65 - 8)) | (1L << (71 - 8)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (74 - 74)) | (1L << (75 - 74)) | (1L << (76 - 74)) | (1L << (78 - 74)) | (1L << (79 - 74)) | (1L << (83 - 74)) | (1L << (86 - 74)) | (1L << (89 - 74)) | (1L << (91 - 74)) | (1L << (92 - 74)) | (1L << (93 - 74)) | (1L << (96 - 74)) | (1L << (101 - 74)) | (1L << (109 - 74)) | (1L << (111 - 74)) | (1L << (114 - 74)) | (1L << (117 - 74)) | (1L << (118 - 74)) | (1L << (119 - 74)) | (1L << (120 - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (INTEGER_LITERAL - 74)) | (1L << (FLOATING_LITERAL - 74)) | (1L << (CHARACTER_LITERAL - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (BOOLEAN_LITERAL - 74)) | (1L << (POINTER_LITERAL - 74)) | (1L << (UDEF_LITERAL - 74)))) != 0)) {
					{
					setState(2273); template_argument_list(0);
					}
				}

				setState(2276); match(112);
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

	public static class Template_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTemplate_name(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_template_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280); match(IDENTIFIER);
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

	public static class Template_argument_listContext extends ParserRuleContext {
		public int _p;
		public Template_argumentContext template_argument() {
			return getRuleContext(Template_argumentContext.class,0);
		}
		public Template_argument_listContext template_argument_list() {
			return getRuleContext(Template_argument_listContext.class,0);
		}
		public Template_argument_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Template_argument_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_template_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTemplate_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTemplate_argument_list(this);
		}
	}

	public final Template_argument_listContext template_argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Template_argument_listContext _localctx = new Template_argument_listContext(_ctx, _parentState, _p);
		Template_argument_listContext _prevctx = _localctx;
		int _startState = 356;
		enterRecursionRule(_localctx, RULE_template_argument_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2283); template_argument();
			setState(2285);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2284); match(106);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_argument_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_template_argument_list);
					setState(2287);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(2288); match(14);
					setState(2289); template_argument();
					setState(2291);
					switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
					case 1:
						{
						setState(2290); match(106);
						}
						break;
					}
					}
					} 
				}
				setState(2297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
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

	public static class Template_argumentContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Id_expressionContext id_expression() {
			return getRuleContext(Id_expressionContext.class,0);
		}
		public Template_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTemplate_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTemplate_argument(this);
		}
	}

	public final Template_argumentContext template_argument() throws RecognitionException {
		Template_argumentContext _localctx = new Template_argumentContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_template_argument);
		try {
			setState(2301);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2298); constant_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2299); type_id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2300); id_expression();
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

	public static class Typename_specifierContext extends ParserRuleContext {
		public Nested_name_specifierContext nested_name_specifier() {
			return getRuleContext(Nested_name_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CppParser.IDENTIFIER, 0); }
		public Simple_template_idContext simple_template_id() {
			return getRuleContext(Simple_template_idContext.class,0);
		}
		public Typename_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTypename_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTypename_specifier(this);
		}
	}

	public final Typename_specifierContext typename_specifier() throws RecognitionException {
		Typename_specifierContext _localctx = new Typename_specifierContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_typename_specifier);
		int _la;
		try {
			setState(2314);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2303); match(29);
				setState(2304); nested_name_specifier(0);
				setState(2305); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2307); match(29);
				setState(2308); nested_name_specifier(0);
				setState(2310);
				_la = _input.LA(1);
				if (_la==43) {
					{
					setState(2309); match(43);
					}
				}

				setState(2312); simple_template_id();
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

	public static class Explicit_instantiationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Explicit_instantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExplicit_instantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExplicit_instantiation(this);
		}
	}

	public final Explicit_instantiationContext explicit_instantiation() throws RecognitionException {
		Explicit_instantiationContext _localctx = new Explicit_instantiationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_explicit_instantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			_la = _input.LA(1);
			if (_la==62) {
				{
				setState(2316); match(62);
				}
			}

			setState(2319); match(43);
			setState(2320); declaration();
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

	public static class Explicit_specializationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Explicit_specializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_specialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExplicit_specialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExplicit_specialization(this);
		}
	}

	public final Explicit_specializationContext explicit_specialization() throws RecognitionException {
		Explicit_specializationContext _localctx = new Explicit_specializationContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_explicit_specialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322); match(43);
			setState(2323); match(20);
			setState(2324); match(112);
			setState(2325); declaration();
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

	public static class Try_blockContext extends ParserRuleContext {
		public Handler_seqContext handler_seq() {
			return getRuleContext(Handler_seqContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterTry_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitTry_block(this);
		}
	}

	public final Try_blockContext try_block() throws RecognitionException {
		Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_try_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327); match(68);
			setState(2328); compound_statement();
			setState(2329); handler_seq();
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

	public static class Function_try_blockContext extends ParserRuleContext {
		public Handler_seqContext handler_seq() {
			return getRuleContext(Handler_seqContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Ctor_initializerContext ctor_initializer() {
			return getRuleContext(Ctor_initializerContext.class,0);
		}
		public Function_try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_try_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFunction_try_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFunction_try_block(this);
		}
	}

	public final Function_try_blockContext function_try_block() throws RecognitionException {
		Function_try_blockContext _localctx = new Function_try_blockContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_function_try_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331); match(68);
			setState(2333);
			_la = _input.LA(1);
			if (_la==49) {
				{
				setState(2332); ctor_initializer();
				}
			}

			setState(2335); compound_statement();
			setState(2336); handler_seq();
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

	public static class Handler_seqContext extends ParserRuleContext {
		public Handler_seqContext handler_seq() {
			return getRuleContext(Handler_seqContext.class,0);
		}
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public Handler_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterHandler_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitHandler_seq(this);
		}
	}

	public final Handler_seqContext handler_seq() throws RecognitionException {
		Handler_seqContext _localctx = new Handler_seqContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_handler_seq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338); handler();
			setState(2340);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2339); handler_seq();
				}
				break;
			}
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

	public static class HandlerContext extends ParserRuleContext {
		public Exception_declarationContext exception_declaration() {
			return getRuleContext(Exception_declarationContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342); match(35);
			setState(2343); match(74);
			setState(2344); exception_declaration();
			setState(2345); match(59);
			setState(2346); compound_statement();
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

	public static class Exception_declarationContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Type_specifier_seqContext type_specifier_seq() {
			return getRuleContext(Type_specifier_seqContext.class,0);
		}
		public Attribute_specifier_seqContext attribute_specifier_seq() {
			return getRuleContext(Attribute_specifier_seqContext.class,0);
		}
		public Exception_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterException_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitException_declaration(this);
		}
	}

	public final Exception_declarationContext exception_declaration() throws RecognitionException {
		Exception_declarationContext _localctx = new Exception_declarationContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_exception_declaration);
		int _la;
		try {
			setState(2362);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2349);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(2348); attribute_specifier_seq();
					}
				}

				setState(2351); type_specifier_seq();
				setState(2352); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2355);
				_la = _input.LA(1);
				if (_la==51 || _la==90) {
					{
					setState(2354); attribute_specifier_seq();
					}
				}

				setState(2357); type_specifier_seq();
				setState(2359);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 44) | (1L << 51))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (74 - 65)) | (1L << (78 - 65)) | (1L << (101 - 65)) | (1L << (106 - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(2358); abstract_declarator();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2361); match(106);
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

	public static class Throw_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Throw_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterThrow_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitThrow_expression(this);
		}
	}

	public final Throw_expressionContext throw_expression() throws RecognitionException {
		Throw_expressionContext _localctx = new Throw_expressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_throw_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2364); match(12);
			setState(2366);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2365); assignment_expression();
				}
				break;
			}
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

	public static class Exception_specificationContext extends ParserRuleContext {
		public Noexcept_specificationContext noexcept_specification() {
			return getRuleContext(Noexcept_specificationContext.class,0);
		}
		public Dynamic_exception_specificationContext dynamic_exception_specification() {
			return getRuleContext(Dynamic_exception_specificationContext.class,0);
		}
		public Exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterException_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitException_specification(this);
		}
	}

	public final Exception_specificationContext exception_specification() throws RecognitionException {
		Exception_specificationContext _localctx = new Exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_exception_specification);
		try {
			setState(2370);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(2368); dynamic_exception_specification();
				}
				break;
			case 117:
				enterOuterAlt(_localctx, 2);
				{
				setState(2369); noexcept_specification();
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

	public static class Dynamic_exception_specificationContext extends ParserRuleContext {
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public Dynamic_exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDynamic_exception_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDynamic_exception_specification(this);
		}
	}

	public final Dynamic_exception_specificationContext dynamic_exception_specification() throws RecognitionException {
		Dynamic_exception_specificationContext _localctx = new Dynamic_exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_dynamic_exception_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372); match(12);
			setState(2373); match(74);
			setState(2375);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 38) | (1L << 48) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (71 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (83 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (109 - 64)) | (1L << (111 - 64)) | (1L << (114 - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(2374); type_id_list(0);
				}
			}

			setState(2377); match(59);
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

	public static class Type_id_listContext extends ParserRuleContext {
		public int _p;
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Type_id_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Type_id_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_id_list(this);
		}
	}

	public final Type_id_listContext type_id_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_id_listContext _localctx = new Type_id_listContext(_ctx, _parentState, _p);
		Type_id_listContext _prevctx = _localctx;
		int _startState = 382;
		enterRecursionRule(_localctx, RULE_type_id_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2380); type_id();
			setState(2382);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2381); match(106);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_id_listContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_type_id_list);
					setState(2384);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(2385); match(14);
					setState(2386); type_id();
					setState(2388);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						setState(2387); match(106);
						}
						break;
					}
					}
					} 
				}
				setState(2394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
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

	public static class Noexcept_specificationContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Noexcept_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexcept_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterNoexcept_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitNoexcept_specification(this);
		}
	}

	public final Noexcept_specificationContext noexcept_specification() throws RecognitionException {
		Noexcept_specificationContext _localctx = new Noexcept_specificationContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_noexcept_specification);
		try {
			setState(2401);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2395); match(117);
				setState(2396); match(74);
				setState(2397); constant_expression();
				setState(2398); match(59);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2400); match(117);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return linked_string_literal_sempred((Linked_string_literalContext)_localctx, predIndex);

		case 8: return nested_name_specifier_sempred((Nested_name_specifierContext)_localctx, predIndex);

		case 13: return capture_list_sempred((Capture_listContext)_localctx, predIndex);

		case 16: return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);

		case 25: return noptr_new_declarator_sempred((Noptr_new_declaratorContext)_localctx, predIndex);

		case 29: return pm_expression_sempred((Pm_expressionContext)_localctx, predIndex);

		case 30: return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);

		case 31: return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);

		case 32: return shift_expression_sempred((Shift_expressionContext)_localctx, predIndex);

		case 33: return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);

		case 34: return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);

		case 35: return and_expression_sempred((And_expressionContext)_localctx, predIndex);

		case 36: return exclusive_or_expression_sempred((Exclusive_or_expressionContext)_localctx, predIndex);

		case 37: return inclusive_or_expression_sempred((Inclusive_or_expressionContext)_localctx, predIndex);

		case 38: return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);

		case 39: return logical_or_expression_sempred((Logical_or_expressionContext)_localctx, predIndex);

		case 42: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 48: return statement_seq_sempred((Statement_seqContext)_localctx, predIndex);

		case 84: return enumerator_list_sempred((Enumerator_listContext)_localctx, predIndex);

		case 106: return attribute_list_sempred((Attribute_listContext)_localctx, predIndex);

		case 112: return balanced_token_seq_sempred((Balanced_token_seqContext)_localctx, predIndex);

		case 114: return init_declarator_list_sempred((Init_declarator_listContext)_localctx, predIndex);

		case 118: return noptr_declarator_sempred((Noptr_declaratorContext)_localctx, predIndex);

		case 129: return noptr_abstract_declarator_sempred((Noptr_abstract_declaratorContext)_localctx, predIndex);

		case 131: return noptr_abstract_pack_declarator_sempred((Noptr_abstract_pack_declaratorContext)_localctx, predIndex);

		case 133: return parameter_declaration_list_sempred((Parameter_declaration_listContext)_localctx, predIndex);

		case 140: return initializer_list_sempred((Initializer_listContext)_localctx, predIndex);

		case 150: return member_declarator_list_sempred((Member_declarator_listContext)_localctx, predIndex);

		case 152: return virt_specifier_seq_sempred((Virt_specifier_seqContext)_localctx, predIndex);

		case 156: return base_specifier_list_sempred((Base_specifier_listContext)_localctx, predIndex);

		case 172: return template_parameter_list_sempred((Template_parameter_listContext)_localctx, predIndex);

		case 178: return template_argument_list_sempred((Template_argument_listContext)_localctx, predIndex);

		case 191: return type_id_list_sempred((Type_id_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean member_declarator_list_sempred(Member_declarator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean statement_seq_sempred(Statement_seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean nested_name_specifier_sempred(Nested_name_specifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;

		case 2: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean exclusive_or_expression_sempred(Exclusive_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean virt_specifier_seq_sempred(Virt_specifier_seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean template_parameter_list_sempred(Template_parameter_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean parameter_declaration_list_sempred(Parameter_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean pm_expression_sempred(Pm_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: return 2 >= _localctx._p;

		case 15: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean template_argument_list_sempred(Template_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean initializer_list_sempred(Initializer_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean inclusive_or_expression_sempred(Inclusive_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean attribute_list_sempred(Attribute_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: return 3 >= _localctx._p;

		case 30: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean noptr_new_declarator_sempred(Noptr_new_declaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 19 >= _localctx._p;

		case 5: return 18 >= _localctx._p;

		case 6: return 17 >= _localctx._p;

		case 7: return 12 >= _localctx._p;

		case 8: return 11 >= _localctx._p;

		case 9: return 10 >= _localctx._p;

		case 10: return 9 >= _localctx._p;

		case 11: return 8 >= _localctx._p;

		case 12: return 7 >= _localctx._p;
		}
		return true;
	}
	private boolean balanced_token_seq_sempred(Balanced_token_seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean noptr_declarator_sempred(Noptr_declaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33: return 3 >= _localctx._p;

		case 34: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean linked_string_literal_sempred(Linked_string_literalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean noptr_abstract_pack_declarator_sempred(Noptr_abstract_pack_declaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: return 3 >= _localctx._p;

		case 38: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean base_specifier_list_sempred(Base_specifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean shift_expression_sempred(Shift_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean capture_list_sempred(Capture_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean enumerator_list_sempred(Enumerator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean noptr_abstract_declarator_sempred(Noptr_abstract_declaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35: return 4 >= _localctx._p;

		case 36: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean type_id_list_sempred(Type_id_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean init_declarator_list_sempred(Init_declarator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean logical_or_expression_sempred(Logical_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25: return 1 >= _localctx._p;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0087\u0966\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\3\2\5\2\u0186\n\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0192\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u019b\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u01a2\n\6\f\6\16\6\u01a5"+
		"\13\6\3\7\3\7\5\7\u01a9\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b4"+
		"\n\b\3\t\3\t\5\t\u01b8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u01c4\n\t\3\n\3\n\5\n\u01c8\n\n\3\n\3\n\3\n\3\n\5\n\u01ce\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u01d6\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u01dd\n\n\3\n\3"+
		"\n\3\n\7\n\u01e2\n\n\f\n\16\n\u01e5\13\n\3\13\3\13\5\13\u01e9\n\13\3\13"+
		"\3\13\3\f\3\f\5\f\u01ef\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01f9"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u0200\n\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0206\n\17\7\17\u0208\n\17\f\17\16\17\u020b\13\17\3\20\3\20\3\20\3\20"+
		"\5\20\u0211\n\20\3\21\3\21\3\21\3\21\5\21\u0217\n\21\3\21\5\21\u021a\n"+
		"\21\3\21\5\21\u021d\n\21\3\21\5\21\u0220\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0227\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0260\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u026f\n\22\3\22\3\22\3\22\3\22\5\22\u0275\n"+
		"\22\3\22\3\22\3\22\3\22\5\22\u027b\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0288\n\22\f\22\16\22\u028b\13\22\3\23"+
		"\3\23\3\24\5\24\u0290\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u029f\n\24\3\24\3\24\3\24\3\24\5\24\u02a5\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02c0"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u02c8\n\27\3\27\3\27\5\27\u02cc"+
		"\n\27\3\27\3\27\5\27\u02d0\n\27\3\27\5\27\u02d3\n\27\3\27\3\27\5\27\u02d7"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u02dd\n\27\5\27\u02df\n\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\5\31\u02e7\n\31\3\32\3\32\5\32\u02eb\n\32\3\32\5\32"+
		"\u02ee\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u02f5\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u02fc\n\33\7\33\u02fe\n\33\f\33\16\33\u0301\13\33\3\34\3"+
		"\34\5\34\u0305\n\34\3\34\3\34\5\34\u0309\n\34\3\35\5\35\u030c\n\35\3\35"+
		"\3\35\3\35\5\35\u0311\n\35\3\35\3\35\3\35\3\35\5\35\u0317\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u031f\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u032a\n\37\f\37\16\37\u032d\13\37\3 \3 \3 \3 \3 "+
		"\3 \7 \u0335\n \f \16 \u0338\13 \3!\3!\3!\3!\3!\3!\7!\u0340\n!\f!\16!"+
		"\u0343\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u034b\n\"\f\"\16\"\u034e\13\"\3"+
		"#\3#\3#\3#\3#\3#\7#\u0356\n#\f#\16#\u0359\13#\3$\3$\3$\3$\3$\3$\7$\u0361"+
		"\n$\f$\16$\u0364\13$\3%\3%\3%\3%\3%\3%\7%\u036c\n%\f%\16%\u036f\13%\3"+
		"&\3&\3&\3&\3&\3&\7&\u0377\n&\f&\16&\u037a\13&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u0382\n\'\f\'\16\'\u0385\13\'\3(\3(\3(\3(\3(\3(\7(\u038d\n(\f(\16"+
		"(\u0390\13(\3)\3)\3)\3)\3)\3)\7)\u0398\n)\f)\16)\u039b\13)\3*\3*\3*\3"+
		"*\3*\3*\3*\5*\u03a4\n*\3+\3+\3+\3+\3+\3+\5+\u03ac\n+\3,\3,\3,\3,\3,\3"+
		",\7,\u03b4\n,\f,\16,\u03b7\13,\3-\3-\3.\3.\5.\u03bd\n.\3.\3.\5.\u03c1"+
		"\n.\3.\3.\5.\u03c5\n.\3.\3.\5.\u03c9\n.\3.\3.\5.\u03cd\n.\3.\3.\3.\5."+
		"\u03d2\n.\3.\5.\u03d5\n.\3/\5/\u03d8\n/\3/\3/\3/\3/\5/\u03de\n/\3/\3/"+
		"\3/\3/\3/\3/\5/\u03e6\n/\3/\3/\3/\5/\u03eb\n/\3\60\5\60\u03ee\n\60\3\60"+
		"\3\60\3\61\3\61\5\61\u03f4\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\7\62"+
		"\u03fd\n\62\f\62\16\62\u0400\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u0416\n\63\3\64\3\64\5\64\u041a\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5"+
		"\64\u0422\n\64\3\64\3\64\3\64\3\64\5\64\u0428\n\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u043c\n\65\3\65\3\65\5\65\u0440\n\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\5\65\u044d\n\65\3\66\3\66\5\66\u0451\n\66"+
		"\3\67\5\67\u0454\n\67\3\67\3\67\3\67\38\38\58\u045b\n8\39\39\39\39\39"+
		"\39\59\u0463\n9\39\39\39\39\39\39\39\39\59\u046d\n9\3:\3:\3;\6;\u0472"+
		"\n;\r;\16;\u0473\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u047f\n<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\5=\u0489\n=\3>\3>\3>\5>\u048e\n>\3>\3>\3>\3>\3?\5?\u0495\n"+
		"?\3?\5?\u0498\n?\3?\3?\3?\5?\u049d\n?\3?\3?\3?\5?\u04a2\n?\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\5C\u04b2\nC\3C\3C\3C\5C\u04b7\nC\3D\3"+
		"D\3D\3D\3D\3D\5D\u04bf\nD\3E\3E\3F\3F\3G\3G\3H\3H\3H\5H\u04ca\nH\3I\3"+
		"I\3I\3I\5I\u04d0\nI\3J\3J\5J\u04d4\nJ\3J\3J\3J\5J\u04d9\nJ\3K\3K\5K\u04dd"+
		"\nK\3K\3K\3K\5K\u04e2\nK\3L\5L\u04e5\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04fb\nL\3M\3M\3M\3M\5M\u0501\nM\3N"+
		"\3N\3N\3N\3N\3O\3O\5O\u050a\nO\3O\5O\u050d\nO\3O\3O\3O\3O\5O\u0513\nO"+
		"\3O\5O\u0516\nO\3O\3O\3O\3O\5O\u051c\nO\3O\5O\u051f\nO\3P\3P\3Q\3Q\3Q"+
		"\5Q\u0526\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0530\nQ\3R\3R\5R\u0534\nR\3R"+
		"\5R\u0537\nR\3R\5R\u053a\nR\3R\3R\5R\u053e\nR\3R\3R\3R\5R\u0543\nR\5R"+
		"\u0545\nR\3S\3S\5S\u0549\nS\3S\3S\5S\u054d\nS\3S\3S\3T\3T\3T\3T\3T\5T"+
		"\u0556\nT\3U\3U\3U\3V\3V\3V\3V\3V\3V\7V\u0561\nV\fV\16V\u0564\13V\3W\3"+
		"W\3W\3W\3W\5W\u056b\nW\3X\3X\3Y\3Y\5Y\u0571\nY\3Z\3Z\3[\3[\3\\\3\\\5\\"+
		"\u0579\n\\\3]\3]\5]\u057d\n]\3^\5^\u0580\n^\3^\3^\3^\3^\3^\3^\3_\5_\u0589"+
		"\n_\3_\3_\3_\3_\3_\3_\3`\5`\u0592\n`\3`\3`\3`\3`\3`\3a\5a\u059a\na\3b"+
		"\3b\3b\3b\3b\3b\3c\5c\u05a3\nc\3c\3c\3d\3d\5d\u05a9\nd\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\5d\u05b4\nd\3e\5e\u05b7\ne\3e\3e\3e\5e\u05bc\ne\3e\3e\3e"+
		"\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\5g\u05cb\ng\3g\3g\3g\3g\5g\u05d1\ng\3h"+
		"\6h\u05d4\nh\rh\16h\u05d5\3i\3i\3i\3i\3i\3i\3i\5i\u05df\ni\3j\3j\3j\3"+
		"j\5j\u05e5\nj\3j\3j\3j\3j\3j\3j\5j\u05ed\nj\3j\3j\5j\u05f1\nj\3k\3k\3"+
		"l\3l\5l\u05f7\nl\3l\3l\3l\5l\u05fc\nl\3l\3l\3l\5l\u0601\nl\3l\3l\3l\3"+
		"l\3l\7l\u0608\nl\fl\16l\u060b\13l\3m\3m\5m\u060f\nm\3n\3n\5n\u0613\nn"+
		"\3o\3o\3o\3o\3p\3p\3q\3q\3q\3q\3r\3r\5r\u0621\nr\3r\3r\7r\u0625\nr\fr"+
		"\16r\u0628\13r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\6s\u0637\ns\rs\16"+
		"s\u0638\5s\u063b\ns\3t\3t\3t\3t\3t\3t\7t\u0643\nt\ft\16t\u0646\13t\3u"+
		"\3u\5u\u064a\nu\3v\3v\3v\3v\3v\5v\u0651\nv\3w\3w\3w\3w\5w\u0657\nw\3x"+
		"\3x\3x\5x\u065c\nx\3x\3x\3x\3x\5x\u0662\nx\3x\3x\3x\3x\3x\5x\u0669\nx"+
		"\3x\3x\5x\u066d\nx\7x\u066f\nx\fx\16x\u0672\13x\3y\3y\3y\3y\5y\u0678\n"+
		"y\3y\5y\u067b\ny\3y\5y\u067e\ny\3y\5y\u0681\ny\3z\3z\3z\5z\u0686\nz\3"+
		"{\3{\5{\u068a\n{\3{\5{\u068d\n{\3{\3{\5{\u0691\n{\3{\3{\5{\u0695\n{\3"+
		"{\3{\3{\5{\u069a\n{\3{\5{\u069d\n{\5{\u069f\n{\3|\3|\5|\u06a3\n|\3}\3"+
		"}\3~\3~\3\177\5\177\u06aa\n\177\3\177\3\177\5\177\u06ae\n\177\3\177\5"+
		"\177\u06b1\n\177\3\u0080\3\u0080\5\u0080\u06b5\n\u0080\3\u0081\3\u0081"+
		"\5\u0081\u06b9\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u06bf\n"+
		"\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u06c4\n\u0082\5\u0082\u06c6\n\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u06cc\n\u0083\3\u0083\3\u0083"+
		"\5\u0083\u06d0\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u06d6\n"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u06dd\n\u0083\3"+
		"\u0083\3\u0083\5\u0083\u06e1\n\u0083\7\u0083\u06e3\n\u0083\f\u0083\16"+
		"\u0083\u06e6\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u06ec\n"+
		"\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u06f6\n\u0085\3\u0085\3\u0085\5\u0085\u06fa\n\u0085\7\u0085\u06fc"+
		"\n\u0085\f\u0085\16\u0085\u06ff\13\u0085\3\u0086\5\u0086\u0702\n\u0086"+
		"\3\u0086\5\u0086\u0705\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u070b\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u0713\n\u0087\f\u0087\16\u0087\u0716\13\u0087\3\u0088\5\u0088\u0719\n"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u071f\n\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0727\n\u0088\3\u0088\3"+
		"\u0088\5\u0088\u072b\n\u0088\3\u0088\5\u0088\u072e\n\u0088\3\u0088\3\u0088"+
		"\5\u0088\u0732\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0737\n\u0088\3"+
		"\u0089\5\u0089\u073a\n\u0089\3\u0089\5\u0089\u073d\n\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0741\n\u0089\3\u0089\3\u0089\3\u008a\5\u008a\u0746\n\u008a\3"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u0750\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0757\n"+
		"\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u075c\n\u008c\3\u008d\3\u008d\5"+
		"\u008d\u0760\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0765\n\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u076b\n\u008e\7\u008e\u076d\n\u008e\f"+
		"\u008e\16\u008e\u0770\13\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u0775\n"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u077b\n\u008f\3\u0090\3"+
		"\u0090\5\u0090\u077f\n\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u0784\n\u0091"+
		"\3\u0091\3\u0091\3\u0092\3\u0092\5\u0092\u078a\n\u0092\3\u0092\3\u0092"+
		"\5\u0092\u078e\n\u0092\3\u0092\5\u0092\u0791\n\u0092\3\u0092\3\u0092\5"+
		"\u0092\u0795\n\u0092\3\u0092\5\u0092\u0798\n\u0092\5\u0092\u079a\n\u0092"+
		"\3\u0093\5\u0093\u079d\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\5\u0096\u07a7\n\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u07ac\n\u0096\5\u0096\u07ae\n\u0096\3\u0097\5\u0097\u07b1\n\u0097"+
		"\3\u0097\5\u0097\u07b4\n\u0097\3\u0097\5\u0097\u07b7\n\u0097\3\u0097\3"+
		"\u0097\3\u0097\5\u0097\u07bc\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5"+
		"\u0097\u07c2\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\7"+
		"\u0098\u07ca\n\u0098\f\u0098\16\u0098\u07cd\13\u0098\3\u0099\3\u0099\5"+
		"\u0099\u07d1\n\u0099\3\u0099\5\u0099\u07d4\n\u0099\3\u0099\3\u0099\5\u0099"+
		"\u07d8\n\u0099\3\u0099\5\u0099\u07db\n\u0099\3\u0099\5\u0099\u07de\n\u0099"+
		"\3\u0099\3\u0099\5\u0099\u07e2\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\7\u009a\u07e9\n\u009a\f\u009a\16\u009a\u07ec\13\u009a\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u07f9\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u07ff\n\u009e\7\u009e\u0801\n\u009e\f\u009e\16\u009e\u0804\13\u009e\3"+
		"\u009f\5\u009f\u0807\n\u009f\3\u009f\3\u009f\5\u009f\u080b\n\u009f\3\u009f"+
		"\3\u009f\5\u009f\u080f\n\u009f\3\u009f\3\u009f\5\u009f\u0813\n\u009f\3"+
		"\u009f\3\u009f\5\u009f\u0817\n\u009f\3\u009f\3\u009f\5\u009f\u081b\n\u009f"+
		"\3\u00a0\5\u00a0\u081e\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u0822\n\u00a0\3"+
		"\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\5\u00a4\u082d\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u0831\n\u00a5\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a7\3\u00a7\5\u00a7\u0838\n\u00a7\3\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\5\u00a7\u083e\n\u00a7\5\u00a7\u0840\n\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u0845\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u084c\n\u00a8\3\u00a9\3\u00a9\5\u00a9\u0850\n\u00a9\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0885\n\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u0898"+
		"\n\u00ae\f\u00ae\16\u00ae\u089b\13\u00ae\3\u00af\3\u00af\5\u00af\u089f"+
		"\n\u00af\3\u00b0\3\u00b0\5\u00b0\u08a3\n\u00b0\3\u00b0\5\u00b0\u08a6\n"+
		"\u00b0\3\u00b0\3\u00b0\5\u00b0\u08aa\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\5\u00b0\u08b0\n\u00b0\3\u00b0\5\u00b0\u08b3\n\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u08b7\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u08c1\n\u00b0\3\u00b0\5\u00b0\u08c4\n\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u08cc\n\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\5\u00b0\u08d1\n\u00b0\3\u00b1\3\u00b1\3\u00b1\5"+
		"\u00b1\u08d6\n\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5"+
		"\u00b2\u08de\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08e5"+
		"\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u08e9\n\u00b2\3\u00b3\3\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b4\5\u00b4\u08f0\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u08f6\n\u00b4\7\u00b4\u08f8\n\u00b4\f\u00b4\16\u00b4\u08fb\13"+
		"\u00b4\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0900\n\u00b5\3\u00b6\3\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0909\n\u00b6\3\u00b6\3"+
		"\u00b6\5\u00b6\u090d\n\u00b6\3\u00b7\5\u00b7\u0910\n\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00ba\3\u00ba\5\u00ba\u0920\n\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\5\u00bb\u0927\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bd\5\u00bd\u0930\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0936\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u093a\n\u00bd\3"+
		"\u00bd\5\u00bd\u093d\n\u00bd\3\u00be\3\u00be\5\u00be\u0941\n\u00be\3\u00bf"+
		"\3\u00bf\5\u00bf\u0945\n\u00bf\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u094a\n"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0951\n\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0957\n\u00c1\7\u00c1\u0959\n\u00c1"+
		"\f\u00c1\16\u00c1\u095c\13\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\5\u00c2\u0964\n\u00c2\3\u00c2\2\u00c3\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\2\22"+
		"\4\2\5\5gg\4\2XXzz\b\2\30\30\33\33..99ggyy\5\2..YYvv\4\2\33\33yy\4\2\22"+
		"\22mm\6\2\26\26\34\34ZZrr\4\2\17\17{{\f\2\4\5\7\7\f\f\21\21\'\'))++AA"+
		"HHJJ\7\2\r\r\61\61@@GGff\5\2,,//dd\4\2\32\32tt\4\2\23\23gg\5\2\13\13\62"+
		"\62oo\4\2\64\64SS\5\2\24\24\60\60ee\u0a7f\2\u0185\3\2\2\2\4\u0187\3\2"+
		"\2\2\6\u0191\3\2\2\2\b\u019a\3\2\2\2\n\u019c\3\2\2\2\f\u01a8\3\2\2\2\16"+
		"\u01b3\3\2\2\2\20\u01c3\3\2\2\2\22\u01d5\3\2\2\2\24\u01e6\3\2\2\2\26\u01ec"+
		"\3\2\2\2\30\u01f8\3\2\2\2\32\u01fa\3\2\2\2\34\u01fc\3\2\2\2\36\u0210\3"+
		"\2\2\2 \u0212\3\2\2\2\"\u025f\3\2\2\2$\u028c\3\2\2\2&\u02a4\3\2\2\2(\u02bf"+
		"\3\2\2\2*\u02c1\3\2\2\2,\u02de\3\2\2\2.\u02e0\3\2\2\2\60\u02e4\3\2\2\2"+
		"\62\u02ed\3\2\2\2\64\u02ef\3\2\2\2\66\u0308\3\2\2\28\u0316\3\2\2\2:\u031e"+
		"\3\2\2\2<\u0320\3\2\2\2>\u032e\3\2\2\2@\u0339\3\2\2\2B\u0344\3\2\2\2D"+
		"\u034f\3\2\2\2F\u035a\3\2\2\2H\u0365\3\2\2\2J\u0370\3\2\2\2L\u037b\3\2"+
		"\2\2N\u0386\3\2\2\2P\u0391\3\2\2\2R\u03a3\3\2\2\2T\u03ab\3\2\2\2V\u03ad"+
		"\3\2\2\2X\u03b8\3\2\2\2Z\u03d4\3\2\2\2\\\u03ea\3\2\2\2^\u03ed\3\2\2\2"+
		"`\u03f1\3\2\2\2b\u03f7\3\2\2\2d\u0415\3\2\2\2f\u0427\3\2\2\2h\u044c\3"+
		"\2\2\2j\u0450\3\2\2\2l\u0453\3\2\2\2n\u045a\3\2\2\2p\u046c\3\2\2\2r\u046e"+
		"\3\2\2\2t\u0471\3\2\2\2v\u047e\3\2\2\2x\u0488\3\2\2\2z\u048a\3\2\2\2|"+
		"\u04a1\3\2\2\2~\u04a3\3\2\2\2\u0080\u04ab\3\2\2\2\u0082\u04ad\3\2\2\2"+
		"\u0084\u04b6\3\2\2\2\u0086\u04be\3\2\2\2\u0088\u04c0\3\2\2\2\u008a\u04c2"+
		"\3\2\2\2\u008c\u04c4\3\2\2\2\u008e\u04c9\3\2\2\2\u0090\u04cf\3\2\2\2\u0092"+
		"\u04d8\3\2\2\2\u0094\u04e1\3\2\2\2\u0096\u04fa\3\2\2\2\u0098\u0500\3\2"+
		"\2\2\u009a\u0502\3\2\2\2\u009c\u051e\3\2\2\2\u009e\u0520\3\2\2\2\u00a0"+
		"\u052f\3\2\2\2\u00a2\u0544\3\2\2\2\u00a4\u0546\3\2\2\2\u00a6\u0555\3\2"+
		"\2\2\u00a8\u0557\3\2\2\2\u00aa\u055a\3\2\2\2\u00ac\u056a\3\2\2\2\u00ae"+
		"\u056c\3\2\2\2\u00b0\u0570\3\2\2\2\u00b2\u0572\3\2\2\2\u00b4\u0574\3\2"+
		"\2\2\u00b6\u0578\3\2\2\2\u00b8\u057c\3\2\2\2\u00ba\u057f\3\2\2\2\u00bc"+
		"\u0588\3\2\2\2\u00be\u0591\3\2\2\2\u00c0\u0599\3\2\2\2\u00c2\u059b\3\2"+
		"\2\2\u00c4\u05a2\3\2\2\2\u00c6\u05b3\3\2\2\2\u00c8\u05b6\3\2\2\2\u00ca"+
		"\u05c0\3\2\2\2\u00cc\u05d0\3\2\2\2\u00ce\u05d3\3\2\2\2\u00d0\u05de\3\2"+
		"\2\2\u00d2\u05f0\3\2\2\2\u00d4\u05f2\3\2\2\2\u00d6\u05fb\3\2\2\2\u00d8"+
		"\u060c\3\2\2\2\u00da\u0612\3\2\2\2\u00dc\u0614\3\2\2\2\u00de\u0618\3\2"+
		"\2\2\u00e0\u061a\3\2\2\2\u00e2\u061e\3\2\2\2\u00e4\u063a\3\2\2\2\u00e6"+
		"\u063c\3\2\2\2\u00e8\u0647\3\2\2\2\u00ea\u0650\3\2\2\2\u00ec\u0656\3\2"+
		"\2\2\u00ee\u0661\3\2\2\2\u00f0\u0673\3\2\2\2\u00f2\u0682\3\2\2\2\u00f4"+
		"\u069e\3\2\2\2\u00f6\u06a0\3\2\2\2\u00f8\u06a4\3\2\2\2\u00fa\u06a6\3\2"+
		"\2\2\u00fc\u06b0\3\2\2\2\u00fe\u06b2\3\2\2\2\u0100\u06be\3\2\2\2\u0102"+
		"\u06c5\3\2\2\2\u0104\u06d5\3\2\2\2\u0106\u06eb\3\2\2\2\u0108\u06ed\3\2"+
		"\2\2\u010a\u070a\3\2\2\2\u010c\u070c\3\2\2\2\u010e\u0736\3\2\2\2\u0110"+
		"\u0739\3\2\2\2\u0112\u074f\3\2\2\2\u0114\u0756\3\2\2\2\u0116\u075b\3\2"+
		"\2\2\u0118\u075f\3\2\2\2\u011a\u0761\3\2\2\2\u011c\u077a\3\2\2\2\u011e"+
		"\u077e\3\2\2\2\u0120\u0780\3\2\2\2\u0122\u0799\3\2\2\2\u0124\u079c\3\2"+
		"\2\2\u0126\u07a0\3\2\2\2\u0128\u07a2\3\2\2\2\u012a\u07ad\3\2\2\2\u012c"+
		"\u07c1\3\2\2\2\u012e\u07c3\3\2\2\2\u0130\u07e1\3\2\2\2\u0132\u07e3\3\2"+
		"\2\2\u0134\u07ed\3\2\2\2\u0136\u07ef\3\2\2\2\u0138\u07f2\3\2\2\2\u013a"+
		"\u07f5\3\2\2\2\u013c\u081a\3\2\2\2\u013e\u0821\3\2\2\2\u0140\u0823\3\2"+
		"\2\2\u0142\u0825\3\2\2\2\u0144\u0827\3\2\2\2\u0146\u082a\3\2\2\2\u0148"+
		"\u082e\3\2\2\2\u014a\u0832\3\2\2\2\u014c\u083f\3\2\2\2\u014e\u084b\3\2"+
		"\2\2\u0150\u084f\3\2\2\2\u0152\u0851\3\2\2\2\u0154\u0884\3\2\2\2\u0156"+
		"\u0886\3\2\2\2\u0158\u088b\3\2\2\2\u015a\u0891\3\2\2\2\u015c\u089e\3\2"+
		"\2\2\u015e\u08d0\3\2\2\2\u0160\u08d2\3\2\2\2\u0162\u08e8\3\2\2\2\u0164"+
		"\u08ea\3\2\2\2\u0166\u08ec\3\2\2\2\u0168\u08ff\3\2\2\2\u016a\u090c\3\2"+
		"\2\2\u016c\u090f\3\2\2\2\u016e\u0914\3\2\2\2\u0170\u0919\3\2\2\2\u0172"+
		"\u091d\3\2\2\2\u0174\u0924\3\2\2\2\u0176\u0928\3\2\2\2\u0178\u093c\3\2"+
		"\2\2\u017a\u093e\3\2\2\2\u017c\u0944\3\2\2\2\u017e\u0946\3\2\2\2\u0180"+
		"\u094d\3\2\2\2\u0182\u0963\3\2\2\2\u0184\u0186\5t;\2\u0185\u0184\3\2\2"+
		"\2\u0185\u0186\3\2\2\2\u0186\3\3\2\2\2\u0187\u0188\5\2\2\2\u0188\5\3\2"+
		"\2\2\u0189\u0192\5\b\5\2\u018a\u0192\7?\2\2\u018b\u018c\7L\2\2\u018c\u018d"+
		"\5V,\2\u018d\u018e\7=\2\2\u018e\u0192\3\2\2\2\u018f\u0192\5\f\7\2\u0190"+
		"\u0192\5\24\13\2\u0191\u0189\3\2\2\2\u0191\u018a\3\2\2\2\u0191\u018b\3"+
		"\2\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\7\3\2\2\2\u0193\u019b"+
		"\7}\2\2\u0194\u019b\7~\2\2\u0195\u019b\7\177\2\2\u0196\u019b\5\n\6\2\u0197"+
		"\u019b\7\u0081\2\2\u0198\u019b\7\u0082\2\2\u0199\u019b\7\u0083\2\2\u019a"+
		"\u0193\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0195\3\2\2\2\u019a\u0196\3\2"+
		"\2\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\t\3\2\2\2\u019c\u019d\b\6\1\2\u019d\u019e\7\u0080\2\2\u019e\u01a3\3\2"+
		"\2\2\u019f\u01a0\6\6\2\3\u01a0\u01a2\7\u0080\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\13\3\2\2"+
		"\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\5\16\b\2\u01a7\u01a9\5\20\t\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\r\3\2\2\2\u01aa\u01b4\7|\2\2"+
		"\u01ab\u01b4\5\u0152\u00aa\2\u01ac\u01b4\5\u0144\u00a3\2\u01ad\u01b4\5"+
		"\u0156\u00ac\2\u01ae\u01af\7\30\2\2\u01af\u01b4\5\u011e\u0090\2\u01b0"+
		"\u01b1\7\30\2\2\u01b1\u01b4\5\u009aN\2\u01b2\u01b4\5\u0162\u00b2\2\u01b3"+
		"\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3\u01ad\3\2"+
		"\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"\17\3\2\2\2\u01b5\u01b7\5\22\n\2\u01b6\u01b8\7-\2\2\u01b7\u01b6\3\2\2"+
		"\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\5\16\b\2\u01ba"+
		"\u01c4\3\2\2\2\u01bb\u01bc\7P\2\2\u01bc\u01c4\7|\2\2\u01bd\u01be\7P\2"+
		"\2\u01be\u01c4\5\u0152\u00aa\2\u01bf\u01c0\7P\2\2\u01c0\u01c4\5\u0156"+
		"\u00ac\2\u01c1\u01c2\7P\2\2\u01c2\u01c4\5\u0162\u00b2\2\u01c3\u01b5\3"+
		"\2\2\2\u01c3\u01bb\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\21\3\2\2\2\u01c5\u01c7\b\n\1\2\u01c6\u01c8\7P\2\2"+
		"\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca"+
		"\5\u0098M\2\u01ca\u01cb\7P\2\2\u01cb\u01d6\3\2\2\2\u01cc\u01ce\7P\2\2"+
		"\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\5\u00b0Y\2\u01d0\u01d1\7P\2\2\u01d1\u01d6\3\2\2\2\u01d2\u01d3\5\u009a"+
		"N\2\u01d3\u01d4\7P\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01c5\3\2\2\2\u01d5\u01cd"+
		"\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\u01e3\3\2\2\2\u01d7\u01d8\6\n\3\3\u01d8"+
		"\u01d9\7|\2\2\u01d9\u01e2\7P\2\2\u01da\u01dc\6\n\4\3\u01db\u01dd\7-\2"+
		"\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df"+
		"\5\u0160\u00b1\2\u01df\u01e0\7P\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01d7\3"+
		"\2\2\2\u01e1\u01da\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\23\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\5\26\f"+
		"\2\u01e7\u01e9\5 \21\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01eb\5`\61\2\u01eb\25\3\2\2\2\u01ec\u01ee\7\65\2\2\u01ed"+
		"\u01ef\5\30\r\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3"+
		"\2\2\2\u01f0\u01f1\7\27\2\2\u01f1\27\3\2\2\2\u01f2\u01f9\5\32\16\2\u01f3"+
		"\u01f9\5\34\17\2\u01f4\u01f5\5\32\16\2\u01f5\u01f6\7\20\2\2\u01f6\u01f7"+
		"\5\34\17\2\u01f7\u01f9\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f3\3\2\2\2"+
		"\u01f8\u01f4\3\2\2\2\u01f9\31\3\2\2\2\u01fa\u01fb\t\2\2\2\u01fb\33\3\2"+
		"\2\2\u01fc\u01fd\b\17\1\2\u01fd\u01ff\5\36\20\2\u01fe\u0200\7l\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0209\3\2\2\2\u0201\u0202\6\17"+
		"\5\3\u0202\u0203\7\20\2\2\u0203\u0205\5\36\20\2\u0204\u0206\7l\2\2\u0205"+
		"\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0201\3\2"+
		"\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\35\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0211\7|\2\2\u020d\u020e\7g\2\2"+
		"\u020e\u0211\7|\2\2\u020f\u0211\7?\2\2\u0210\u020c\3\2\2\2\u0210\u020d"+
		"\3\2\2\2\u0210\u020f\3\2\2\2\u0211\37\3\2\2\2\u0212\u0213\7L\2\2\u0213"+
		"\u0214\5\u010a\u0086\2\u0214\u0216\7=\2\2\u0215\u0217\7\r\2\2\u0216\u0215"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a\5\u017c\u00bf"+
		"\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d"+
		"\5\u00ceh\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2"+
		"\2\u021e\u0220\5\u00f2z\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"!\3\2\2\2\u0221\u0222\b\22\1\2\u0222\u0260\5\6\4\2\u0223\u0224\5\u0096"+
		"L\2\u0224\u0226\7L\2\2\u0225\u0227\5$\23\2\u0226\u0225\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7=\2\2\u0229\u0260\3\2\2\2\u022a"+
		"\u022b\5\u016a\u00b6\2\u022b\u022c\7L\2\2\u022c\u022d\5$\23\2\u022d\u022e"+
		"\7=\2\2\u022e\u0260\3\2\2\2\u022f\u0230\5\u0096L\2\u0230\u0231\5\u011c"+
		"\u008f\2\u0231\u0260\3\2\2\2\u0232\u0233\5\u016a\u00b6\2\u0233\u0234\5"+
		"\u011c\u008f\2\u0234\u0260\3\2\2\2\u0235\u0236\7x\2\2\u0236\u0237\7\26"+
		"\2\2\u0237\u0238\5\u00fe\u0080\2\u0238\u0239\7r\2\2\u0239\u023a\7L\2\2"+
		"\u023a\u023b\5V,\2\u023b\u023c\7=\2\2\u023c\u0260\3\2\2\2\u023d\u023e"+
		"\7Q\2\2\u023e\u023f\7\26\2\2\u023f\u0240\5\u00fe\u0080\2\u0240\u0241\7"+
		"r\2\2\u0241\u0242\7L\2\2\u0242\u0243\5V,\2\u0243\u0244\7=\2\2\u0244\u0260"+
		"\3\2\2\2\u0245\u0246\7[\2\2\u0246\u0247\7\26\2\2\u0247\u0248\5\u00fe\u0080"+
		"\2\u0248\u0249\7r\2\2\u0249\u024a\7L\2\2\u024a\u024b\5V,\2\u024b\u024c"+
		"\7=\2\2\u024c\u0260\3\2\2\2\u024d\u024e\7M\2\2\u024e\u024f\7\26\2\2\u024f"+
		"\u0250\5\u00fe\u0080\2\u0250\u0251\7r\2\2\u0251\u0252\7L\2\2\u0252\u0253"+
		"\5V,\2\u0253\u0254\7=\2\2\u0254\u0260\3\2\2\2\u0255\u0256\7\n\2\2\u0256"+
		"\u0257\7L\2\2\u0257\u0258\5V,\2\u0258\u0259\7=\2\2\u0259\u0260\3\2\2\2"+
		"\u025a\u025b\7\n\2\2\u025b\u025c\7L\2\2\u025c\u025d\5\u00fe\u0080\2\u025d"+
		"\u025e\7=\2\2\u025e\u0260\3\2\2\2\u025f\u0221\3\2\2\2\u025f\u0223\3\2"+
		"\2\2\u025f\u022a\3\2\2\2\u025f\u022f\3\2\2\2\u025f\u0232\3\2\2\2\u025f"+
		"\u0235\3\2\2\2\u025f\u023d\3\2\2\2\u025f\u0245\3\2\2\2\u025f\u024d\3\2"+
		"\2\2\u025f\u0255\3\2\2\2\u025f\u025a\3\2\2\2\u0260\u0289\3\2\2\2\u0261"+
		"\u0262\6\22\6\3\u0262\u0263\7\65\2\2\u0263\u0264\5V,\2\u0264\u0265\7\27"+
		"\2\2\u0265\u0288\3\2\2\2\u0266\u0267\6\22\7\3\u0267\u0268\7\65\2\2\u0268"+
		"\u0269\5\u011c\u008f\2\u0269\u026a\7\27\2\2\u026a\u0288\3\2\2\2\u026b"+
		"\u026c\6\22\b\3\u026c\u026e\7L\2\2\u026d\u026f\5$\23\2\u026e\u026d\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0288\7=\2\2\u0271"+
		"\u0272\6\22\t\3\u0272\u0274\7k\2\2\u0273\u0275\7-\2\2\u0274\u0273\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0288\5\f\7\2\u0277"+
		"\u0278\6\22\n\3\u0278\u027a\7s\2\2\u0279\u027b\7-\2\2\u027a\u0279\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0288\5\f\7\2\u027d"+
		"\u027e\6\22\13\3\u027e\u027f\7k\2\2\u027f\u0288\5&\24\2\u0280\u0281\6"+
		"\22\f\3\u0281\u0282\7s\2\2\u0282\u0288\5&\24\2\u0283\u0284\6\22\r\3\u0284"+
		"\u0288\7X\2\2\u0285\u0286\6\22\16\3\u0286\u0288\7z\2\2\u0287\u0261\3\2"+
		"\2\2\u0287\u0266\3\2\2\2\u0287\u026b\3\2\2\2\u0287\u0271\3\2\2\2\u0287"+
		"\u0277\3\2\2\2\u0287\u027d\3\2\2\2\u0287\u0280\3\2\2\2\u0287\u0283\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a#\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\5\u011a"+
		"\u008e\2\u028d%\3\2\2\2\u028e\u0290\5\22\n\2\u028f\u028e\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\5\u0098M\2\u0292\u0293"+
		"\7P\2\2\u0293\u0294\7\30\2\2\u0294\u0295\5\u0098M\2\u0295\u02a5\3\2\2"+
		"\2\u0296\u0297\5\22\n\2\u0297\u0298\7-\2\2\u0298\u0299\5\u0160\u00b1\2"+
		"\u0299\u029a\7P\2\2\u029a\u029b\7\30\2\2\u029b\u029c\5\u0098M\2\u029c"+
		"\u02a5\3\2\2\2\u029d\u029f\5\22\n\2\u029e\u029d\3\2\2\2\u029e\u029f\3"+
		"\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\30\2\2\u02a1\u02a5\5\u0098M\2"+
		"\u02a2\u02a3\7\30\2\2\u02a3\u02a5\5\u009aN\2\u02a4\u028f\3\2\2\2\u02a4"+
		"\u0296\3\2\2\2\u02a4\u029e\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\'\3\2\2\2"+
		"\u02a6\u02c0\5\"\22\2\u02a7\u02a8\t\3\2\2\u02a8\u02c0\5:\36\2\u02a9\u02aa"+
		"\t\4\2\2\u02aa\u02c0\5:\36\2\u02ab\u02ac\7<\2\2\u02ac\u02c0\5(\25\2\u02ad"+
		"\u02ae\7<\2\2\u02ae\u02af\7L\2\2\u02af\u02b0\5\u00fe\u0080\2\u02b0\u02b1"+
		"\7=\2\2\u02b1\u02c0\3\2\2\2\u02b2\u02b3\7<\2\2\u02b3\u02b4\7l\2\2\u02b4"+
		"\u02b5\7L\2\2\u02b5\u02b6\7|\2\2\u02b6\u02c0\7=\2\2\u02b7\u02b8\7_\2\2"+
		"\u02b8\u02b9\7L\2\2\u02b9\u02ba\5\u00fe\u0080\2\u02ba\u02bb\7=\2\2\u02bb"+
		"\u02c0\3\2\2\2\u02bc\u02c0\5*\26\2\u02bd\u02c0\5,\27\2\u02be\u02c0\58"+
		"\35\2\u02bf\u02a6\3\2\2\2\u02bf\u02a7\3\2\2\2\u02bf\u02a9\3\2\2\2\u02bf"+
		"\u02ab\3\2\2\2\u02bf\u02ad\3\2\2\2\u02bf\u02b2\3\2\2\2\u02bf\u02b7\3\2"+
		"\2\2\u02bf\u02bc\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0"+
		")\3\2\2\2\u02c1\u02c2\7w\2\2\u02c2\u02c3\7L\2\2\u02c3\u02c4\5V,\2\u02c4"+
		"\u02c5\7=\2\2\u02c5+\3\2\2\2\u02c6\u02c8\7P\2\2\u02c7\u02c6\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\7b\2\2\u02ca\u02cc\5.\30"+
		"\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf"+
		"\5\60\31\2\u02ce\u02d0\5\66\34\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2"+
		"\2\u02d0\u02df\3\2\2\2\u02d1\u02d3\7P\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\7b\2\2\u02d5\u02d7\5.\30\2\u02d6"+
		"\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\7L"+
		"\2\2\u02d9\u02da\5\u00fe\u0080\2\u02da\u02dc\7=\2\2\u02db\u02dd\5\66\34"+
		"\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02c7"+
		"\3\2\2\2\u02de\u02d2\3\2\2\2\u02df-\3\2\2\2\u02e0\u02e1\7L\2\2\u02e1\u02e2"+
		"\5$\23\2\u02e2\u02e3\7=\2\2\u02e3/\3\2\2\2\u02e4\u02e6\5\u0092J\2\u02e5"+
		"\u02e7\5\62\32\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\61\3\2"+
		"\2\2\u02e8\u02ea\5\u00f4{\2\u02e9\u02eb\5\62\32\2\u02ea\u02e9\3\2\2\2"+
		"\u02ea\u02eb\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ee\5\64\33\2\u02ed\u02e8"+
		"\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee\63\3\2\2\2\u02ef\u02f0\b\33\1\2\u02f0"+
		"\u02f1\7\65\2\2\u02f1\u02f2\5V,\2\u02f2\u02f4\7\27\2\2\u02f3\u02f5\5\u00ce"+
		"h\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02ff\3\2\2\2\u02f6"+
		"\u02f7\6\33\17\3\u02f7\u02f8\7\65\2\2\u02f8\u02f9\5X-\2\u02f9\u02fb\7"+
		"\27\2\2\u02fa\u02fc\5\u00ceh\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2"+
		"\u02fc\u02fe\3\2\2\2\u02fd\u02f6\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\65\3\2\2\2\u0301\u02ff\3\2\2\2\u0302"+
		"\u0304\7L\2\2\u0303\u0305\5$\23\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0309\7=\2\2\u0307\u0309\5\u011c\u008f"+
		"\2\u0308\u0302\3\2\2\2\u0308\u0307\3\2\2\2\u0309\67\3\2\2\2\u030a\u030c"+
		"\7P\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030e\7\25\2\2\u030e\u0317\5:\36\2\u030f\u0311\7P\2\2\u0310\u030f\3\2"+
		"\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7\25\2\2\u0313"+
		"\u0314\7\65\2\2\u0314\u0315\7\27\2\2\u0315\u0317\5:\36\2\u0316\u030b\3"+
		"\2\2\2\u0316\u0310\3\2\2\2\u03179\3\2\2\2\u0318\u031f\5(\25\2\u0319\u031a"+
		"\7L\2\2\u031a\u031b\5\u00fe\u0080\2\u031b\u031c\7=\2\2\u031c\u031d\5:"+
		"\36\2\u031d\u031f\3\2\2\2\u031e\u0318\3\2\2\2\u031e\u0319\3\2\2\2\u031f"+
		";\3\2\2\2\u0320\u0321\b\37\1\2\u0321\u0322\5:\36\2\u0322\u032b\3\2\2\2"+
		"\u0323\u0324\6\37\20\3\u0324\u0325\7O\2\2\u0325\u032a\5:\36\2\u0326\u0327"+
		"\6\37\21\3\u0327\u0328\7T\2\2\u0328\u032a\5:\36\2\u0329\u0323\3\2\2\2"+
		"\u0329\u0326\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c"+
		"\3\2\2\2\u032c=\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u032f\b \1\2\u032f\u0330"+
		"\5<\37\2\u0330\u0336\3\2\2\2\u0331\u0332\6 \22\3\u0332\u0333\t\5\2\2\u0333"+
		"\u0335\5<\37\2\u0334\u0331\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337?\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033a"+
		"\b!\1\2\u033a\u033b\5> \2\u033b\u0341\3\2\2\2\u033c\u033d\6!\23\3\u033d"+
		"\u033e\t\6\2\2\u033e\u0340\5> \2\u033f\u033c\3\2\2\2\u0340\u0343\3\2\2"+
		"\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342A\3\2\2\2\u0343\u0341"+
		"\3\2\2\2\u0344\u0345\b\"\1\2\u0345\u0346\5@!\2\u0346\u034c\3\2\2\2\u0347"+
		"\u0348\6\"\24\3\u0348\u0349\t\7\2\2\u0349\u034b\5@!\2\u034a\u0347\3\2"+
		"\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"C\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\b#\1\2\u0350\u0351\5B\"\2\u0351"+
		"\u0357\3\2\2\2\u0352\u0353\6#\25\3\u0353\u0354\t\b\2\2\u0354\u0356\5B"+
		"\"\2\u0355\u0352\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358E\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035b\b$\1\2\u035b"+
		"\u035c\5D#\2\u035c\u0362\3\2\2\2\u035d\u035e\6$\26\3\u035e\u035f\t\t\2"+
		"\2\u035f\u0361\5D#\2\u0360\u035d\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360"+
		"\3\2\2\2\u0362\u0363\3\2\2\2\u0363G\3\2\2\2\u0364\u0362\3\2\2\2\u0365"+
		"\u0366\b%\1\2\u0366\u0367\5F$\2\u0367\u036d\3\2\2\2\u0368\u0369\6%\27"+
		"\3\u0369\u036a\7g\2\2\u036a\u036c\5F$\2\u036b\u0368\3\2\2\2\u036c\u036f"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036eI\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370\u0371\b&\1\2\u0371\u0372\5H%\2\u0372\u0378\3\2\2"+
		"\2\u0373\u0374\6&\30\3\u0374\u0375\7\b\2\2\u0375\u0377\5H%\2\u0376\u0373"+
		"\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"K\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\b\'\1\2\u037c\u037d\5J&\2\u037d"+
		"\u0383\3\2\2\2\u037e\u037f\6\'\31\3\u037f\u0380\7\67\2\2\u0380\u0382\5"+
		"J&\2\u0381\u037e\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384M\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u0387\b(\1\2\u0387"+
		"\u0388\5L\'\2\u0388\u038e\3\2\2\2\u0389\u038a\6(\32\3\u038a\u038b\7\23"+
		"\2\2\u038b\u038d\5L\'\2\u038c\u0389\3\2\2\2\u038d\u0390\3\2\2\2\u038e"+
		"\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038fO\3\2\2\2\u0390\u038e\3\2\2\2"+
		"\u0391\u0392\b)\1\2\u0392\u0393\5N(\2\u0393\u0399\3\2\2\2\u0394\u0395"+
		"\6)\33\3\u0395\u0396\7n\2\2\u0396\u0398\5N(\2\u0397\u0394\3\2\2\2\u0398"+
		"\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039aQ\3\2\2\2"+
		"\u039b\u0399\3\2\2\2\u039c\u03a4\5P)\2\u039d\u039e\5P)\2\u039e\u039f\7"+
		"a\2\2\u039f\u03a0\5V,\2\u03a0\u03a1\7\63\2\2\u03a1\u03a2\5T+\2\u03a2\u03a4"+
		"\3\2\2\2\u03a3\u039c\3\2\2\2\u03a3\u039d\3\2\2\2\u03a4S\3\2\2\2\u03a5"+
		"\u03ac\5R*\2\u03a6\u03a7\5P)\2\u03a7\u03a8\t\n\2\2\u03a8\u03a9\5\u0118"+
		"\u008d\2\u03a9\u03ac\3\2\2\2\u03aa\u03ac\5\u017a\u00be\2\u03ab\u03a5\3"+
		"\2\2\2\u03ab\u03a6\3\2\2\2\u03ab\u03aa\3\2\2\2\u03acU\3\2\2\2\u03ad\u03ae"+
		"\b,\1\2\u03ae\u03af\5T+\2\u03af\u03b5\3\2\2\2\u03b0\u03b1\6,\34\3\u03b1"+
		"\u03b2\7\20\2\2\u03b2\u03b4\5T+\2\u03b3\u03b0\3\2\2\2\u03b4\u03b7\3\2"+
		"\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6W\3\2\2\2\u03b7\u03b5"+
		"\3\2\2\2\u03b8\u03b9\5R*\2\u03b9Y\3\2\2\2\u03ba\u03d5\5\\/\2\u03bb\u03bd"+
		"\5\u00ceh\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2"+
		"\2\u03be\u03d5\5^\60\2\u03bf\u03c1\5\u00ceh\2\u03c0\u03bf\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03d5\5`\61\2\u03c3\u03c5\5\u00ce"+
		"h\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03d5\5d\63\2\u03c7\u03c9\5\u00ceh\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03d5\5h\65\2\u03cb\u03cd\5\u00ceh"+
		"\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d5"+
		"\5p9\2\u03cf\u03d5\5r:\2\u03d0\u03d2\5\u00ceh\2\u03d1\u03d0\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\5\u0170\u00b9\2\u03d4\u03ba"+
		"\3\2\2\2\u03d4\u03bc\3\2\2\2\u03d4\u03c0\3\2\2\2\u03d4\u03c4\3\2\2\2\u03d4"+
		"\u03c8\3\2\2\2\u03d4\u03cc\3\2\2\2\u03d4\u03cf\3\2\2\2\u03d4\u03d1\3\2"+
		"\2\2\u03d5[\3\2\2\2\u03d6\u03d8\5\u00ceh\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8"+
		"\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\7|\2\2\u03da\u03db\7\63\2\2\u03db"+
		"\u03eb\5Z.\2\u03dc\u03de\5\u00ceh\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3"+
		"\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\7`\2\2\u03e0\u03e1\5X-\2\u03e1"+
		"\u03e2\7\63\2\2\u03e2\u03e3\5Z.\2\u03e3\u03eb\3\2\2\2\u03e4\u03e6\5\u00ce"+
		"h\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7"+
		"\u03e8\7c\2\2\u03e8\u03e9\7\63\2\2\u03e9\u03eb\5Z.\2\u03ea\u03d7\3\2\2"+
		"\2\u03ea\u03dd\3\2\2\2\u03ea\u03e5\3\2\2\2\u03eb]\3\2\2\2\u03ec\u03ee"+
		"\5V,\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f0\7#\2\2\u03f0_\3\2\2\2\u03f1\u03f3\7E\2\2\u03f2\u03f4\5b\62\2\u03f3"+
		"\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\7&"+
		"\2\2\u03f6a\3\2\2\2\u03f7\u03f8\b\62\1\2\u03f8\u03f9\5Z.\2\u03f9\u03fe"+
		"\3\2\2\2\u03fa\u03fb\6\62\35\3\u03fb\u03fd\5Z.\2\u03fc\u03fa\3\2\2\2\u03fd"+
		"\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ffc\3\2\2\2"+
		"\u0400\u03fe\3\2\2\2\u0401\u0402\7j\2\2\u0402\u0403\7L\2\2\u0403\u0404"+
		"\5f\64\2\u0404\u0405\7=\2\2\u0405\u0406\5Z.\2\u0406\u0416\3\2\2\2\u0407"+
		"\u0408\7j\2\2\u0408\u0409\7L\2\2\u0409\u040a\5f\64\2\u040a\u040b\7=\2"+
		"\2\u040b\u040c\5Z.\2\u040c\u040d\7V\2\2\u040d\u040e\5Z.\2\u040e\u0416"+
		"\3\2\2\2\u040f\u0410\7K\2\2\u0410\u0411\7L\2\2\u0411\u0412\5f\64\2\u0412"+
		"\u0413\7=\2\2\u0413\u0414\5Z.\2\u0414\u0416\3\2\2\2\u0415\u0401\3\2\2"+
		"\2\u0415\u0407\3\2\2\2\u0415\u040f\3\2\2\2\u0416e\3\2\2\2\u0417\u0428"+
		"\5V,\2\u0418\u041a\5\u00ceh\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2"+
		"\u041a\u041b\3\2\2\2\u041b\u041c\5\u0084C\2\u041c\u041d\5\u00eav\2\u041d"+
		"\u041e\7\5\2\2\u041e\u041f\5\u0118\u008d\2\u041f\u0428\3\2\2\2\u0420\u0422"+
		"\5\u00ceh\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2"+
		"\2\u0423\u0424\5\u0084C\2\u0424\u0425\5\u00eav\2\u0425\u0426\5\u011c\u008f"+
		"\2\u0426\u0428\3\2\2\2\u0427\u0417\3\2\2\2\u0427\u0419\3\2\2\2\u0427\u0421"+
		"\3\2\2\2\u0428g\3\2\2\2\u0429\u042a\7\3\2\2\u042a\u042b\7L\2\2\u042b\u042c"+
		"\5f\64\2\u042c\u042d\7=\2\2\u042d\u042e\5Z.\2\u042e\u044d\3\2\2\2\u042f"+
		"\u0430\7D\2\2\u0430\u0431\5Z.\2\u0431\u0432\7\3\2\2\u0432\u0433\7L\2\2"+
		"\u0433\u0434\5f\64\2\u0434\u0435\7=\2\2\u0435\u0436\7#\2\2\u0436\u044d"+
		"\3\2\2\2\u0437\u0438\7h\2\2\u0438\u0439\7L\2\2\u0439\u043b\5j\66\2\u043a"+
		"\u043c\5f\64\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u043f\7#\2\2\u043e\u0440\5V,\2\u043f\u043e\3\2\2\2\u043f\u0440"+
		"\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\7=\2\2\u0442\u0443\5Z.\2\u0443"+
		"\u044d\3\2\2\2\u0444\u0445\7h\2\2\u0445\u0446\7L\2\2\u0446\u0447\5l\67"+
		"\2\u0447\u0448\7\63\2\2\u0448\u0449\5n8\2\u0449\u044a\7=\2\2\u044a\u044b"+
		"\5Z.\2\u044b\u044d\3\2\2\2\u044c\u0429\3\2\2\2\u044c\u042f\3\2\2\2\u044c"+
		"\u0437\3\2\2\2\u044c\u0444\3\2\2\2\u044di\3\2\2\2\u044e\u0451\5^\60\2"+
		"\u044f\u0451\5|?\2\u0450\u044e\3\2\2\2\u0450\u044f\3\2\2\2\u0451k\3\2"+
		"\2\2\u0452\u0454\5\u00ceh\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u0455\3\2\2\2\u0455\u0456\5\u0084C\2\u0456\u0457\5\u00eav\2\u0457m\3"+
		"\2\2\2\u0458\u045b\5V,\2\u0459\u045b\5\u011c\u008f\2\u045a\u0458\3\2\2"+
		"\2\u045a\u0459\3\2\2\2\u045bo\3\2\2\2\u045c\u045d\7\t\2\2\u045d\u046d"+
		"\7#\2\2\u045e\u045f\7p\2\2\u045f\u046d\7#\2\2\u0460\u0462\7\6\2\2\u0461"+
		"\u0463\5V,\2\u0462\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2"+
		"\2\u0464\u046d\7#\2\2\u0465\u0466\7\6\2\2\u0466\u0467\5\u011c\u008f\2"+
		"\u0467\u0468\7#\2\2\u0468\u046d\3\2\2\2\u0469\u046a\7R\2\2\u046a\u046b"+
		"\7|\2\2\u046b\u046d\7#\2\2\u046c\u045c\3\2\2\2\u046c\u045e\3\2\2\2\u046c"+
		"\u0460\3\2\2\2\u046c\u0465\3\2\2\2\u046c\u0469\3\2\2\2\u046dq\3\2\2\2"+
		"\u046e\u046f\5x=\2\u046fs\3\2\2\2\u0470\u0472\5v<\2\u0471\u0470\3\2\2"+
		"\2\u0472\u0473\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474u"+
		"\3\2\2\2\u0475\u047f\5x=\2\u0476\u047f\5\u0110\u0089\2\u0477\u047f\5\u0158"+
		"\u00ad\2\u0478\u047f\5\u016c\u00b7\2\u0479\u047f\5\u016e\u00b8\2\u047a"+
		"\u047f\5\u00ccg\2\u047b\u047f\5\u00b6\\\2\u047c\u047f\5\u0080A\2\u047d"+
		"\u047f\5\u0082B\2\u047e\u0475\3\2\2\2\u047e\u0476\3\2\2\2\u047e\u0477"+
		"\3\2\2\2\u047e\u0478\3\2\2\2\u047e\u0479\3\2\2\2\u047e\u047a\3\2\2\2\u047e"+
		"\u047b\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047d\3\2\2\2\u047fw\3\2\2\2"+
		"\u0480\u0489\5|?\2\u0481\u0489\5\u00caf\2\u0482\u0489\5\u00c2b\2\u0483"+
		"\u0489\5\u00c6d\2\u0484\u0489\5\u00c8e\2\u0485\u0489\5~@\2\u0486\u0489"+
		"\5z>\2\u0487\u0489\5\u00a4S\2\u0488\u0480\3\2\2\2\u0488\u0481\3\2\2\2"+
		"\u0488\u0482\3\2\2\2\u0488\u0483\3\2\2\2\u0488\u0484\3\2\2\2\u0488\u0485"+
		"\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0487\3\2\2\2\u0489y\3\2\2\2\u048a"+
		"\u048b\7u\2\2\u048b\u048d\7|\2\2\u048c\u048e\5\u00ceh\2\u048d\u048c\3"+
		"\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\7\5\2\2\u0490"+
		"\u0491\5\u00fe\u0080\2\u0491\u0492\7#\2\2\u0492{\3\2\2\2\u0493\u0495\5"+
		"\u0084C\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0497\3\2\2\2"+
		"\u0496\u0498\5\u00e6t\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u04a2\7#\2\2\u049a\u049c\5\u00ceh\2\u049b\u049d\5"+
		"\u0084C\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2"+
		"\u049e\u049f\5\u00e6t\2\u049f\u04a0\7#\2\2\u04a0\u04a2\3\2\2\2\u04a1\u0494"+
		"\3\2\2\2\u04a1\u049a\3\2\2\2\u04a2}\3\2\2\2\u04a3\u04a4\7 \2\2\u04a4\u04a5"+
		"\7L\2\2\u04a5\u04a6\5X-\2\u04a6\u04a7\7\20\2\2\u04a7\u04a8\7\u0080\2\2"+
		"\u04a8\u04a9\7=\2\2\u04a9\u04aa\7#\2\2\u04aa\177\3\2\2\2\u04ab\u04ac\7"+
		"#\2\2\u04ac\u0081\3\2\2\2\u04ad\u04ae\5\u00ceh\2\u04ae\u0083\3\2\2\2\u04af"+
		"\u04b1\5\u0086D\2\u04b0\u04b2\5\u00ceh\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2"+
		"\3\2\2\2\u04b2\u04b7\3\2\2\2\u04b3\u04b4\5\u0086D\2\u04b4\u04b5\5\u0084"+
		"C\2\u04b5\u04b7\3\2\2\2\u04b6\u04af\3\2\2\2\u04b6\u04b3\3\2\2\2\u04b7"+
		"\u0085\3\2\2\2\u04b8\u04bf\5\u0088E\2\u04b9\u04bf\5\u008eH\2\u04ba\u04bf"+
		"\5\u008aF\2\u04bb\u04bf\7W\2\2\u04bc\u04bf\7i\2\2\u04bd\u04bf\7\"\2\2"+
		"\u04be\u04b8\3\2\2\2\u04be\u04b9\3\2\2\2\u04be\u04ba\3\2\2\2\u04be\u04bb"+
		"\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bd\3\2\2\2\u04bf\u0087\3\2\2\2\u04c0"+
		"\u04c1\t\13\2\2\u04c1\u0089\3\2\2\2\u04c2\u04c3\t\f\2\2\u04c3\u008b\3"+
		"\2\2\2\u04c4\u04c5\7|\2\2\u04c5\u008d\3\2\2\2\u04c6\u04ca\5\u0090I\2\u04c7"+
		"\u04ca\5\u0120\u0091\2\u04c8\u04ca\5\u00a0Q\2\u04c9\u04c6\3\2\2\2\u04c9"+
		"\u04c7\3\2\2\2\u04c9\u04c8\3\2\2\2\u04ca\u008f\3\2\2\2\u04cb\u04d0\5\u0096"+
		"L\2\u04cc\u04d0\5\u009cO\2\u04cd\u04d0\5\u016a\u00b6\2\u04ce\u04d0\5\u00f8"+
		"}\2\u04cf\u04cb\3\2\2\2\u04cf\u04cc\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf"+
		"\u04ce\3\2\2\2\u04d0\u0091\3\2\2\2\u04d1\u04d3\5\u008eH\2\u04d2\u04d4"+
		"\5\u00ceh\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d9\3\2\2"+
		"\2\u04d5\u04d6\5\u008eH\2\u04d6\u04d7\5\u0092J\2\u04d7\u04d9\3\2\2\2\u04d8"+
		"\u04d1\3\2\2\2\u04d8\u04d5\3\2\2\2\u04d9\u0093\3\2\2\2\u04da\u04dc\5\u0090"+
		"I\2\u04db\u04dd\5\u00ceh\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u04e2\3\2\2\2\u04de\u04df\5\u0090I\2\u04df\u04e0\5\u0094K\2\u04e0\u04e2"+
		"\3\2\2\2\u04e1\u04da\3\2\2\2\u04e1\u04de\3\2\2\2\u04e2\u0095\3\2\2\2\u04e3"+
		"\u04e5\5\22\n\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3"+
		"\2\2\2\u04e6\u04fb\5\u0098M\2\u04e7\u04e8\5\22\n\2\u04e8\u04e9\7-\2\2"+
		"\u04e9\u04ea\5\u0160\u00b1\2\u04ea\u04fb\3\2\2\2\u04eb\u04fb\7\31\2\2"+
		"\u04ec\u04fb\7(\2\2\u04ed\u04fb\7]\2\2\u04ee\u04fb\7:\2\2\u04ef\u04fb"+
		"\7!\2\2\u04f0\u04fb\7q\2\2\u04f1\u04fb\7\35\2\2\u04f2\u04fb\7N\2\2\u04f3"+
		"\u04fb\7>\2\2\u04f4\u04fb\7;\2\2\u04f5\u04fb\7^\2\2\u04f6\u04fb\7I\2\2"+
		"\u04f7\u04fb\7U\2\2\u04f8\u04fb\78\2\2\u04f9\u04fb\5\u009aN\2\u04fa\u04e4"+
		"\3\2\2\2\u04fa\u04e7\3\2\2\2\u04fa\u04eb\3\2\2\2\u04fa\u04ec\3\2\2\2\u04fa"+
		"\u04ed\3\2\2\2\u04fa\u04ee\3\2\2\2\u04fa\u04ef\3\2\2\2\u04fa\u04f0\3\2"+
		"\2\2\u04fa\u04f1\3\2\2\2\u04fa\u04f2\3\2\2\2\u04fa\u04f3\3\2\2\2\u04fa"+
		"\u04f4\3\2\2\2\u04fa\u04f5\3\2\2\2\u04fa\u04f6\3\2\2\2\u04fa\u04f7\3\2"+
		"\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04f9\3\2\2\2\u04fb\u0097\3\2\2\2\u04fc"+
		"\u0501\5\u011e\u0090\2\u04fd\u0501\5\u009eP\2\u04fe\u0501\5\u008cG\2\u04ff"+
		"\u0501\5\u0160\u00b1\2\u0500\u04fc\3\2\2\2\u0500\u04fd\3\2\2\2\u0500\u04fe"+
		"\3\2\2\2\u0500\u04ff\3\2\2\2\u0501\u0099\3\2\2\2\u0502\u0503\7C\2\2\u0503"+
		"\u0504\7L\2\2\u0504\u0505\5V,\2\u0505\u0506\7=\2\2\u0506\u009b\3\2\2\2"+
		"\u0507\u0509\5\u0128\u0095\2\u0508\u050a\5\u00ceh\2\u0509\u0508\3\2\2"+
		"\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u050d\5\22\n\2\u050c"+
		"\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\7|"+
		"\2\2\u050f\u051f\3\2\2\2\u0510\u0512\5\u0128\u0095\2\u0511\u0513\5\22"+
		"\n\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514"+
		"\u0516\7-\2\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2"+
		"\2\2\u0517\u0518\5\u0160\u00b1\2\u0518\u051f\3\2\2\2\u0519\u051b\7B\2"+
		"\2\u051a\u051c\5\22\n\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c"+
		"\u051d\3\2\2\2\u051d\u051f\7|\2\2\u051e\u0507\3\2\2\2\u051e\u0510\3\2"+
		"\2\2\u051e\u0519\3\2\2\2\u051f\u009d\3\2\2\2\u0520\u0521\7|\2\2\u0521"+
		"\u009f\3\2\2\2\u0522\u0523\5\u00a2R\2\u0523\u0525\7E\2\2\u0524\u0526\5"+
		"\u00aaV\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2"+
		"\u0527\u0528\7&\2\2\u0528\u0530\3\2\2\2\u0529\u052a\5\u00a2R\2\u052a\u052b"+
		"\7E\2\2\u052b\u052c\5\u00aaV\2\u052c\u052d\7\20\2\2\u052d\u052e\7&\2\2"+
		"\u052e\u0530\3\2\2\2\u052f\u0522\3\2\2\2\u052f\u0529\3\2\2\2\u0530\u00a1"+
		"\3\2\2\2\u0531\u0533\5\u00a6T\2\u0532\u0534\5\u00ceh\2\u0533\u0532\3\2"+
		"\2\2\u0533\u0534\3\2\2\2\u0534\u0536\3\2\2\2\u0535\u0537\7|\2\2\u0536"+
		"\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0539\3\2\2\2\u0538\u053a\5\u00a8"+
		"U\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u0545\3\2\2\2\u053b"+
		"\u053d\5\u00a6T\2\u053c\u053e\5\u00ceh\2\u053d\u053c\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\5\22\n\2\u0540\u0542\7|\2\2\u0541"+
		"\u0543\5\u00a8U\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545"+
		"\3\2\2\2\u0544\u0531\3\2\2\2\u0544\u053b\3\2\2\2\u0545\u00a3\3\2\2\2\u0546"+
		"\u0548\5\u00a6T\2\u0547\u0549\5\u00ceh\2\u0548\u0547\3\2\2\2\u0548\u0549"+
		"\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054c\7|\2\2\u054b\u054d\5\u00a8U\2"+
		"\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f"+
		"\7#\2\2\u054f\u00a5\3\2\2\2\u0550\u0556\7B\2\2\u0551\u0552\7B\2\2\u0552"+
		"\u0556\7\62\2\2\u0553\u0554\7B\2\2\u0554\u0556\7\13\2\2\u0555\u0550\3"+
		"\2\2\2\u0555\u0551\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u00a7\3\2\2\2\u0557"+
		"\u0558\7\63\2\2\u0558\u0559\5\u0092J\2\u0559\u00a9\3\2\2\2\u055a\u055b"+
		"\bV\1\2\u055b\u055c\5\u00acW\2\u055c\u0562\3\2\2\2\u055d\u055e\6V\36\3"+
		"\u055e\u055f\7\20\2\2\u055f\u0561\5\u00acW\2\u0560\u055d\3\2\2\2\u0561"+
		"\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u00ab\3\2"+
		"\2\2\u0564\u0562\3\2\2\2\u0565\u056b\5\u00aeX\2\u0566\u0567\5\u00aeX\2"+
		"\u0567\u0568\7\5\2\2\u0568\u0569\5X-\2\u0569\u056b\3\2\2\2\u056a\u0565"+
		"\3\2\2\2\u056a\u0566\3\2\2\2\u056b\u00ad\3\2\2\2\u056c\u056d\7|\2\2\u056d"+
		"\u00af\3\2\2\2\u056e\u0571\5\u00b2Z\2\u056f\u0571\5\u00b4[\2\u0570\u056e"+
		"\3\2\2\2\u0570\u056f\3\2\2\2\u0571\u00b1\3\2\2\2\u0572\u0573\7|\2\2\u0573"+
		"\u00b3\3\2\2\2\u0574\u0575\7|\2\2\u0575\u00b5\3\2\2\2\u0576\u0579\5\u00b8"+
		"]\2\u0577\u0579\5\u00be`\2\u0578\u0576\3\2\2\2\u0578\u0577\3\2\2\2\u0579"+
		"\u00b7\3\2\2\2\u057a\u057d\5\u00ba^\2\u057b\u057d\5\u00bc_\2\u057c\u057a"+
		"\3\2\2\2\u057c\u057b\3\2\2\2\u057d\u00b9\3\2\2\2\u057e\u0580\7,\2\2\u057f"+
		"\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\7\66"+
		"\2\2\u0582\u0583\7|\2\2\u0583\u0584\7E\2\2\u0584\u0585\5\u00c0a\2\u0585"+
		"\u0586\7&\2\2\u0586\u00bb\3\2\2\2\u0587\u0589\7,\2\2\u0588\u0587\3\2\2"+
		"\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b\7\66\2\2\u058b"+
		"\u058c\5\u00b2Z\2\u058c\u058d\7E\2\2\u058d\u058e\5\u00c0a\2\u058e\u058f"+
		"\7&\2\2\u058f\u00bd\3\2\2\2\u0590\u0592\7,\2\2\u0591\u0590\3\2\2\2\u0591"+
		"\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\7\66\2\2\u0594\u0595\7"+
		"E\2\2\u0595\u0596\5\u00c0a\2\u0596\u0597\7&\2\2\u0597\u00bf\3\2\2\2\u0598"+
		"\u059a\5t;\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u00c1\3\2\2"+
		"\2\u059b\u059c\7\66\2\2\u059c\u059d\7|\2\2\u059d\u059e\7\5\2\2\u059e\u059f"+
		"\5\u00c4c\2\u059f\u05a0\7#\2\2\u05a0\u00c3\3\2\2\2\u05a1\u05a3\5\22\n"+
		"\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5"+
		"\5\u00b0Y\2\u05a5\u00c5\3\2\2\2\u05a6\u05a8\7u\2\2\u05a7\u05a9\7\37\2"+
		"\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab"+
		"\5\22\n\2\u05ab\u05ac\5\16\b\2\u05ac\u05ad\7#\2\2\u05ad\u05b4\3\2\2\2"+
		"\u05ae\u05af\7u\2\2\u05af\u05b0\7P\2\2\u05b0\u05b1\5\16\b\2\u05b1\u05b2"+
		"\7#\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05a6\3\2\2\2\u05b3\u05ae\3\2\2\2\u05b4"+
		"\u00c7\3\2\2\2\u05b5\u05b7\5\u00ceh\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\7u\2\2\u05b9\u05bb\7\66\2\2\u05ba"+
		"\u05bc\5\22\n\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\3"+
		"\2\2\2\u05bd\u05be\5\u00b0Y\2\u05be\u05bf\7#\2\2\u05bf\u00c9\3\2\2\2\u05c0"+
		"\u05c1\7$\2\2\u05c1\u05c2\7L\2\2\u05c2\u05c3\7\u0080\2\2\u05c3\u05c4\7"+
		"=\2\2\u05c4\u05c5\7#\2\2\u05c5\u00cb\3\2\2\2\u05c6\u05c7\7@\2\2\u05c7"+
		"\u05c8\7\u0080\2\2\u05c8\u05ca\7E\2\2\u05c9\u05cb\5t;\2\u05ca\u05c9\3"+
		"\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05d1\7&\2\2\u05cd"+
		"\u05ce\7@\2\2\u05ce\u05cf\7\u0080\2\2\u05cf\u05d1\5v<\2\u05d0\u05c6\3"+
		"\2\2\2\u05d0\u05cd\3\2\2\2\u05d1\u00cd\3\2\2\2\u05d2\u05d4\5\u00d0i\2"+
		"\u05d3\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6"+
		"\3\2\2\2\u05d6\u00cf\3\2\2\2\u05d7\u05d8\7\65\2\2\u05d8\u05d9\7\65\2\2"+
		"\u05d9\u05da\5\u00d6l\2\u05da\u05db\7\27\2\2\u05db\u05dc\7\27\2\2\u05dc"+
		"\u05df\3\2\2\2\u05dd\u05df\5\u00d2j\2\u05de\u05d7\3\2\2\2\u05de\u05dd"+
		"\3\2\2\2\u05df\u00d1\3\2\2\2\u05e0\u05e1\7\\\2\2\u05e1\u05e2\7L\2\2\u05e2"+
		"\u05e4\5\u00fe\u0080\2\u05e3\u05e5\7l\2\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\7=\2\2\u05e7\u05f1\3\2\2\2\u05e8"+
		"\u05e9\7\\\2\2\u05e9\u05ea\7L\2\2\u05ea\u05ec\5\u00d4k\2\u05eb\u05ed\7"+
		"l\2\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05ef\7=\2\2\u05ef\u05f1\3\2\2\2\u05f0\u05e0\3\2\2\2\u05f0\u05e8\3\2"+
		"\2\2\u05f1\u00d3\3\2\2\2\u05f2\u05f3\5X-\2\u05f3\u00d5\3\2\2\2\u05f4\u05f6"+
		"\bl\1\2\u05f5\u05f7\5\u00d8m\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2"+
		"\u05f7\u05fc\3\2\2\2\u05f8\u05f9\5\u00d8m\2\u05f9\u05fa\7l\2\2\u05fa\u05fc"+
		"\3\2\2\2\u05fb\u05f4\3\2\2\2\u05fb\u05f8\3\2\2\2\u05fc\u0609\3\2\2\2\u05fd"+
		"\u05fe\6l\37\3\u05fe\u0600\7\20\2\2\u05ff\u0601\5\u00d8m\2\u0600\u05ff"+
		"\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0608\3\2\2\2\u0602\u0603\6l \3\u0603"+
		"\u0604\7\20\2\2\u0604\u0605\5\u00d8m\2\u0605\u0606\7l\2\2\u0606\u0608"+
		"\3\2\2\2\u0607\u05fd\3\2\2\2\u0607\u0602\3\2\2\2\u0608\u060b\3\2\2\2\u0609"+
		"\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u00d7\3\2\2\2\u060b\u0609\3\2"+
		"\2\2\u060c\u060e\5\u00dan\2\u060d\u060f\5\u00e0q\2\u060e\u060d\3\2\2\2"+
		"\u060e\u060f\3\2\2\2\u060f\u00d9\3\2\2\2\u0610\u0613\7|\2\2\u0611\u0613"+
		"\5\u00dco\2\u0612\u0610\3\2\2\2\u0612\u0611\3\2\2\2\u0613\u00db\3\2\2"+
		"\2\u0614\u0615\5\u00dep\2\u0615\u0616\7P\2\2\u0616\u0617\7|\2\2\u0617"+
		"\u00dd\3\2\2\2\u0618\u0619\7|\2\2\u0619\u00df\3\2\2\2\u061a\u061b\7L\2"+
		"\2\u061b\u061c\5\u00e2r\2\u061c\u061d\7=\2\2\u061d\u00e1\3\2\2\2\u061e"+
		"\u0620\br\1\2\u061f\u0621\5\u00e4s\2\u0620\u061f\3\2\2\2\u0620\u0621\3"+
		"\2\2\2\u0621\u0626\3\2\2\2\u0622\u0623\6r!\3\u0623\u0625\5\u00e4s\2\u0624"+
		"\u0622\3\2\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2"+
		"\2\2\u0627\u00e3\3\2\2\2\u0628\u0626\3\2\2\2\u0629\u062a\7L\2\2\u062a"+
		"\u062b\5\u00e2r\2\u062b\u062c\7=\2\2\u062c\u063b\3\2\2\2\u062d\u062e\7"+
		"\65\2\2\u062e\u062f\5\u00e2r\2\u062f\u0630\7\27\2\2\u0630\u063b\3\2\2"+
		"\2\u0631\u0632\7E\2\2\u0632\u0633\5\u00e2r\2\u0633\u0634\7&\2\2\u0634"+
		"\u063b\3\2\2\2\u0635\u0637\7\u0084\2\2\u0636\u0635\3\2\2\2\u0637\u0638"+
		"\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a"+
		"\u0629\3\2\2\2\u063a\u062d\3\2\2\2\u063a\u0631\3\2\2\2\u063a\u0636\3\2"+
		"\2\2\u063b\u00e5\3\2\2\2\u063c\u063d\bt\1\2\u063d\u063e\5\u00e8u\2\u063e"+
		"\u0644\3\2\2\2\u063f\u0640\6t\"\3\u0640\u0641\7\20\2\2\u0641\u0643\5\u00e8"+
		"u\2\u0642\u063f\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2\u0644"+
		"\u0645\3\2\2\2\u0645\u00e7\3\2\2\2\u0646\u0644\3\2\2\2\u0647\u0649\5\u00ea"+
		"v\2\u0648\u064a\5\u0114\u008b\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2"+
		"\2\u064a\u00e9\3\2\2\2\u064b\u0651\5\u00ecw\2\u064c\u064d\5\u00eex\2\u064d"+
		"\u064e\5\u00f0y\2\u064e\u064f\5\u00f2z\2\u064f\u0651\3\2\2\2\u0650\u064b"+
		"\3\2\2\2\u0650\u064c\3\2\2\2\u0651\u00eb\3\2\2\2\u0652\u0657\5\u00eex"+
		"\2\u0653\u0654\5\u00f4{\2\u0654\u0655\5\u00ecw\2\u0655\u0657\3\2\2\2\u0656"+
		"\u0652\3\2\2\2\u0656\u0653\3\2\2\2\u0657\u00ed\3\2\2\2\u0658\u0659\bx"+
		"\1\2\u0659\u065b\5\u00fc\177\2\u065a\u065c\5\u00ceh\2\u065b\u065a\3\2"+
		"\2\2\u065b\u065c\3\2\2\2\u065c\u0662\3\2\2\2\u065d\u065e\7L\2\2\u065e"+
		"\u065f\5\u00ecw\2\u065f\u0660\7=\2\2\u0660\u0662\3\2\2\2\u0661\u0658\3"+
		"\2\2\2\u0661\u065d\3\2\2\2\u0662\u0670\3\2\2\2\u0663\u0664\6x#\3\u0664"+
		"\u066f\5\u00f0y\2\u0665\u0666\6x$\3\u0666\u0668\7\65\2\2\u0667\u0669\5"+
		"X-\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2\2\2\u066a"+
		"\u066c\7\27\2\2\u066b\u066d\5\u00ceh\2\u066c\u066b\3\2\2\2\u066c\u066d"+
		"\3\2\2\2\u066d\u066f\3\2\2\2\u066e\u0663\3\2\2\2\u066e\u0665\3\2\2\2\u066f"+
		"\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u00ef\3\2"+
		"\2\2\u0672\u0670\3\2\2\2\u0673\u0674\7L\2\2\u0674\u0675\5\u010a\u0086"+
		"\2\u0675\u0677\7=\2\2\u0676\u0678\5\u00ceh\2\u0677\u0676\3\2\2\2\u0677"+
		"\u0678\3\2\2\2\u0678\u067a\3\2\2\2\u0679\u067b\5\u00f6|\2\u067a\u0679"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u067e\5\u00fa~"+
		"\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0681"+
		"\5\u017c\u00bf\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u00f1\3"+
		"\2\2\2\u0682\u0683\7s\2\2\u0683\u0685\5\u0094K\2\u0684\u0686\5\u0100\u0081"+
		"\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u00f3\3\2\2\2\u0687\u0689"+
		"\7.\2\2\u0688\u068a\5\u00ceh\2\u0689\u0688\3\2\2\2\u0689\u068a\3\2\2\2"+
		"\u068a\u068c\3\2\2\2\u068b\u068d\5\u00f6|\2\u068c\u068b\3\2\2\2\u068c"+
		"\u068d\3\2\2\2\u068d\u069f\3\2\2\2\u068e\u0690\7g\2\2\u068f\u0691\5\u00ce"+
		"h\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u069f\3\2\2\2\u0692"+
		"\u0694\7\23\2\2\u0693\u0695\5\u00ceh\2\u0694\u0693\3\2\2\2\u0694\u0695"+
		"\3\2\2\2\u0695\u069f\3\2\2\2\u0696\u0697\5\22\n\2\u0697\u0699\7.\2\2\u0698"+
		"\u069a\5\u00ceh\2\u0699\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069c"+
		"\3\2\2\2\u069b\u069d\5\u00f6|\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2"+
		"\2\u069d\u069f\3\2\2\2\u069e\u0687\3\2\2\2\u069e\u068e\3\2\2\2\u069e\u0692"+
		"\3\2\2\2\u069e\u0696\3\2\2\2\u069f\u00f5\3\2\2\2\u06a0\u06a2\5\u00f8}"+
		"\2\u06a1\u06a3\5\u00f6|\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3"+
		"\u00f7\3\2\2\2\u06a4\u06a5\t\r\2\2\u06a5\u00f9\3\2\2\2\u06a6\u06a7\t\16"+
		"\2\2\u06a7\u00fb\3\2\2\2\u06a8\u06aa\7l\2\2\u06a9\u06a8\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06b1\5\f\7\2\u06ac\u06ae\5\22"+
		"\n\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\3\2\2\2\u06af"+
		"\u06b1\5\u011e\u0090\2\u06b0\u06a9\3\2\2\2\u06b0\u06ad\3\2\2\2\u06b1\u00fd"+
		"\3\2\2\2\u06b2\u06b4\5\u0092J\2\u06b3\u06b5\5\u0100\u0081\2\u06b4\u06b3"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u00ff\3\2\2\2\u06b6\u06bf\5\u0102\u0082"+
		"\2\u06b7\u06b9\5\u0104\u0083\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2"+
		"\u06b9\u06ba\3\2\2\2\u06ba\u06bb\5\u00f0y\2\u06bb\u06bc\5\u00f2z\2\u06bc"+
		"\u06bf\3\2\2\2\u06bd\u06bf\5\u0106\u0084\2\u06be\u06b6\3\2\2\2\u06be\u06b8"+
		"\3\2\2\2\u06be\u06bd\3\2\2\2\u06bf\u0101\3\2\2\2\u06c0\u06c6\5\u0104\u0083"+
		"\2\u06c1\u06c3\5\u00f4{\2\u06c2\u06c4\5\u0102\u0082\2\u06c3\u06c2\3\2"+
		"\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c6\3\2\2\2\u06c5\u06c0\3\2\2\2\u06c5"+
		"\u06c1\3\2\2\2\u06c6\u0103\3\2\2\2\u06c7\u06c8\b\u0083\1\2\u06c8\u06d6"+
		"\5\u00f0y\2\u06c9\u06cb\7\65\2\2\u06ca\u06cc\5X-\2\u06cb\u06ca\3\2\2\2"+
		"\u06cb\u06cc\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\7\27\2\2\u06ce\u06d0"+
		"\5\u00ceh\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d6\3\2\2"+
		"\2\u06d1\u06d2\7L\2\2\u06d2\u06d3\5\u0102\u0082\2\u06d3\u06d4\7=\2\2\u06d4"+
		"\u06d6\3\2\2\2\u06d5\u06c7\3\2\2\2\u06d5\u06c9\3\2\2\2\u06d5\u06d1\3\2"+
		"\2\2\u06d6\u06e4\3\2\2\2\u06d7\u06d8\6\u0083%\3\u06d8\u06e3\5\u00f0y\2"+
		"\u06d9\u06da\6\u0083&\3\u06da\u06dc\7\65\2\2\u06db\u06dd\5X-\2\u06dc\u06db"+
		"\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\7\27\2\2"+
		"\u06df\u06e1\5\u00ceh\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1"+
		"\u06e3\3\2\2\2\u06e2\u06d7\3\2\2\2\u06e2\u06d9\3\2\2\2\u06e3\u06e6\3\2"+
		"\2\2\u06e4\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u0105\3\2\2\2\u06e6"+
		"\u06e4\3\2\2\2\u06e7\u06ec\5\u0108\u0085\2\u06e8\u06e9\5\u00f4{\2\u06e9"+
		"\u06ea\5\u0106\u0084\2\u06ea\u06ec\3\2\2\2\u06eb\u06e7\3\2\2\2\u06eb\u06e8"+
		"\3\2\2\2\u06ec\u0107\3\2\2\2\u06ed\u06ee\b\u0085\1\2\u06ee\u06ef\7l\2"+
		"\2\u06ef\u06fd\3\2\2\2\u06f0\u06f1\6\u0085\'\3\u06f1\u06fc\5\u00f0y\2"+
		"\u06f2\u06f3\6\u0085(\3\u06f3\u06f5\7\65\2\2\u06f4\u06f6\5X-\2\u06f5\u06f4"+
		"\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f9\7\27\2\2"+
		"\u06f8\u06fa\5\u00ceh\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa"+
		"\u06fc\3\2\2\2\u06fb\u06f0\3\2\2\2\u06fb\u06f2\3\2\2\2\u06fc\u06ff\3\2"+
		"\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0109\3\2\2\2\u06ff"+
		"\u06fd\3\2\2\2\u0700\u0702\5\u010c\u0087\2\u0701\u0700\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0704\3\2\2\2\u0703\u0705\7l\2\2\u0704\u0703\3\2\2\2\u0704"+
		"\u0705\3\2\2\2\u0705\u070b\3\2\2\2\u0706\u0707\5\u010c\u0087\2\u0707\u0708"+
		"\7\20\2\2\u0708\u0709\7l\2\2\u0709\u070b\3\2\2\2\u070a\u0701\3\2\2\2\u070a"+
		"\u0706\3\2\2\2\u070b\u010b\3\2\2\2\u070c\u070d\b\u0087\1\2\u070d\u070e"+
		"\5\u010e\u0088\2\u070e\u0714\3\2\2\2\u070f\u0710\6\u0087)\3\u0710\u0711"+
		"\7\20\2\2\u0711\u0713\5\u010e\u0088\2\u0712\u070f\3\2\2\2\u0713\u0716"+
		"\3\2\2\2\u0714\u0712\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u010d\3\2\2\2\u0716"+
		"\u0714\3\2\2\2\u0717\u0719\5\u00ceh\2\u0718\u0717\3\2\2\2\u0718\u0719"+
		"\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b\5\u0084C\2\u071b\u071c\5\u00ea"+
		"v\2\u071c\u0737\3\2\2\2\u071d\u071f\5\u00ceh\2\u071e\u071d\3\2\2\2\u071e"+
		"\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\5\u0084C\2\u0721\u0722"+
		"\5\u00eav\2\u0722\u0723\7\5\2\2\u0723\u0724\5\u0118\u008d\2\u0724\u0737"+
		"\3\2\2\2\u0725\u0727\5\u00ceh\2\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2"+
		"\2\u0727\u0728\3\2\2\2\u0728\u072a\5\u0084C\2\u0729\u072b\5\u0100\u0081"+
		"\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u0737\3\2\2\2\u072c\u072e"+
		"\5\u00ceh\2\u072d\u072c\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\3\2\2"+
		"\2\u072f\u0731\5\u0084C\2\u0730\u0732\5\u0100\u0081\2\u0731\u0730\3\2"+
		"\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\7\5\2\2\u0734"+
		"\u0735\5\u0118\u008d\2\u0735\u0737\3\2\2\2\u0736\u0718\3\2\2\2\u0736\u071e"+
		"\3\2\2\2\u0736\u0726\3\2\2\2\u0736\u072d\3\2\2\2\u0737\u010f\3\2\2\2\u0738"+
		"\u073a\5\u00ceh\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c"+
		"\3\2\2\2\u073b\u073d\5\u0084C\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2"+
		"\2\u073d\u073e\3\2\2\2\u073e\u0740\5\u00eav\2\u073f\u0741\5\u0132\u009a"+
		"\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743"+
		"\5\u0112\u008a\2\u0743\u0111\3\2\2\2\u0744\u0746\5\u014a\u00a6\2\u0745"+
		"\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0750\5`"+
		"\61\2\u0748\u0750\5\u0172\u00ba\2\u0749\u074a\7\5\2\2\u074a\u074b\7c\2"+
		"\2\u074b\u0750\7#\2\2\u074c\u074d\7\5\2\2\u074d\u074e\7\25\2\2\u074e\u0750"+
		"\7#\2\2\u074f\u0745\3\2\2\2\u074f\u0748\3\2\2\2\u074f\u0749\3\2\2\2\u074f"+
		"\u074c\3\2\2\2\u0750\u0113\3\2\2\2\u0751\u0757\5\u0116\u008c\2\u0752\u0753"+
		"\7L\2\2\u0753\u0754\5$\23\2\u0754\u0755\7=\2\2\u0755\u0757\3\2\2\2\u0756"+
		"\u0751\3\2\2\2\u0756\u0752\3\2\2\2\u0757\u0115\3\2\2\2\u0758\u0759\7\5"+
		"\2\2\u0759\u075c\5\u0118\u008d\2\u075a\u075c\5\u011c\u008f\2\u075b\u0758"+
		"\3\2\2\2\u075b\u075a\3\2\2\2\u075c\u0117\3\2\2\2\u075d\u0760\5T+\2\u075e"+
		"\u0760\5\u011c\u008f\2\u075f\u075d\3\2\2\2\u075f\u075e\3\2\2\2\u0760\u0119"+
		"\3\2\2\2\u0761\u0762\b\u008e\1\2\u0762\u0764\5\u0118\u008d\2\u0763\u0765"+
		"\7l\2\2\u0764\u0763\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u076e\3\2\2\2\u0766"+
		"\u0767\6\u008e*\3\u0767\u0768\7\20\2\2\u0768\u076a\5\u0118\u008d\2\u0769"+
		"\u076b\7l\2\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\3\2"+
		"\2\2\u076c\u0766\3\2\2\2\u076d\u0770\3\2\2\2\u076e\u076c\3\2\2\2\u076e"+
		"\u076f\3\2\2\2\u076f\u011b\3\2\2\2\u0770\u076e\3\2\2\2\u0771\u0772\7E"+
		"\2\2\u0772\u0774\5\u011a\u008e\2\u0773\u0775\7\20\2\2\u0774\u0773\3\2"+
		"\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\7&\2\2\u0777"+
		"\u077b\3\2\2\2\u0778\u0779\7E\2\2\u0779\u077b\7&\2\2\u077a\u0771\3\2\2"+
		"\2\u077a\u0778\3\2\2\2\u077b\u011d\3\2\2\2\u077c\u077f\7|\2\2\u077d\u077f"+
		"\5\u0160\u00b1\2\u077e\u077c\3\2\2\2\u077e\u077d\3\2\2\2\u077f\u011f\3"+
		"\2\2\2\u0780\u0781\5\u0122\u0092\2\u0781\u0783\7E\2\2\u0782\u0784\5\u012a"+
		"\u0096\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0786\7&\2\2\u0786\u0121\3\2\2\2\u0787\u0789\5\u0128\u0095\2\u0788\u078a"+
		"\5\u00ceh\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2"+
		"\2\u078b\u078d\5\u0124\u0093\2\u078c\u078e\5\u0126\u0094\2\u078d\u078c"+
		"\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u0790\3\2\2\2\u078f\u0791\5\u0138\u009d"+
		"\2\u0790\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u079a\3\2\2\2\u0792\u0794"+
		"\5\u0128\u0095\2\u0793\u0795\5\u00ceh\2\u0794\u0793\3\2\2\2\u0794\u0795"+
		"\3\2\2\2\u0795\u0797\3\2\2\2\u0796\u0798\5\u0138\u009d\2\u0797\u0796\3"+
		"\2\2\2\u0797\u0798\3\2\2\2\u0798\u079a\3\2\2\2\u0799\u0787\3\2\2\2\u0799"+
		"\u0792\3\2\2\2\u079a\u0123\3\2\2\2\u079b\u079d\5\22\n\2\u079c\u079b\3"+
		"\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\5\u011e\u0090"+
		"\2\u079f\u0125\3\2\2\2\u07a0\u07a1\7S\2\2\u07a1\u0127\3\2\2\2\u07a2\u07a3"+
		"\t\17\2\2\u07a3\u0129\3\2\2\2\u07a4\u07a6\5\u012c\u0097\2\u07a5\u07a7"+
		"\5\u012a\u0096\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07ae\3"+
		"\2\2\2\u07a8\u07a9\5\u0142\u00a2\2\u07a9\u07ab\7\63\2\2\u07aa\u07ac\5"+
		"\u012a\u0096\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ae\3\2"+
		"\2\2\u07ad\u07a4\3\2\2\2\u07ad\u07a8\3\2\2\2\u07ae\u012b\3\2\2\2\u07af"+
		"\u07b1\5\u00ceh\2\u07b0\u07af\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3"+
		"\3\2\2\2\u07b2\u07b4\5\u0084C\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2\2"+
		"\2\u07b4\u07b6\3\2\2\2\u07b5\u07b7\5\u012e\u0098\2\u07b6\u07b5\3\2\2\2"+
		"\u07b6\u07b7\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07c2\7#\2\2\u07b9\u07bb"+
		"\5\u0110\u0089\2\u07ba\u07bc\7#\2\2\u07bb\u07ba\3\2\2\2\u07bb\u07bc\3"+
		"\2\2\2\u07bc\u07c2\3\2\2\2\u07bd\u07c2\5\u00c6d\2\u07be\u07c2\5~@\2\u07bf"+
		"\u07c2\5\u0158\u00ad\2\u07c0\u07c2\5z>\2\u07c1\u07b0\3\2\2\2\u07c1\u07b9"+
		"\3\2\2\2\u07c1\u07bd\3\2\2\2\u07c1\u07be\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1"+
		"\u07c0\3\2\2\2\u07c2\u012d\3\2\2\2\u07c3\u07c4\b\u0098\1\2\u07c4\u07c5"+
		"\5\u0130\u0099\2\u07c5\u07cb\3\2\2\2\u07c6\u07c7\6\u0098+\3\u07c7\u07c8"+
		"\7\20\2\2\u07c8\u07ca\5\u0130\u0099\2\u07c9\u07c6\3\2\2\2\u07ca\u07cd"+
		"\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u012f\3\2\2\2\u07cd"+
		"\u07cb\3\2\2\2\u07ce\u07d0\5\u00eav\2\u07cf\u07d1\5\u0132\u009a\2\u07d0"+
		"\u07cf\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d3\3\2\2\2\u07d2\u07d4\5\u0136"+
		"\u009c\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07e2\3\2\2\2\u07d5"+
		"\u07d7\5\u00eav\2\u07d6\u07d8\5\u0116\u008c\2\u07d7\u07d6\3\2\2\2\u07d7"+
		"\u07d8\3\2\2\2\u07d8\u07e2\3\2\2\2\u07d9\u07db\7|\2\2\u07da\u07d9\3\2"+
		"\2\2\u07da\u07db\3\2\2\2\u07db\u07dd\3\2\2\2\u07dc\u07de\5\u00ceh\2\u07dd"+
		"\u07dc\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\7\63"+
		"\2\2\u07e0\u07e2\5X-\2\u07e1\u07ce\3\2\2\2\u07e1\u07d5\3\2\2\2\u07e1\u07da"+
		"\3\2\2\2\u07e2\u0131\3\2\2\2\u07e3\u07e4\b\u009a\1\2\u07e4\u07e5\5\u0134"+
		"\u009b\2\u07e5\u07ea\3\2\2\2\u07e6\u07e7\6\u009a,\3\u07e7\u07e9\5\u0134"+
		"\u009b\2\u07e8\u07e6\3\2\2\2\u07e9\u07ec\3\2\2\2\u07ea\u07e8\3\2\2\2\u07ea"+
		"\u07eb\3\2\2\2\u07eb\u0133\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ed\u07ee\t\20"+
		"\2\2\u07ee\u0135\3\2\2\2\u07ef\u07f0\7\5\2\2\u07f0\u07f1\7}\2\2\u07f1"+
		"\u0137\3\2\2\2\u07f2\u07f3\7\63\2\2\u07f3\u07f4\5\u013a\u009e\2\u07f4"+
		"\u0139\3\2\2\2\u07f5\u07f6\b\u009e\1\2\u07f6\u07f8\5\u013c\u009f\2\u07f7"+
		"\u07f9\7l\2\2\u07f8\u07f7\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u0802\3\2"+
		"\2\2\u07fa\u07fb\6\u009e-\3\u07fb\u07fc\7\20\2\2\u07fc\u07fe\5\u013c\u009f"+
		"\2\u07fd\u07ff\7l\2\2\u07fe\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801"+
		"\3\2\2\2\u0800\u07fa\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800\3\2\2\2\u0802"+
		"\u0803\3\2\2\2\u0803\u013b\3\2\2\2\u0804\u0802\3\2\2\2\u0805\u0807\5\u00ce"+
		"h\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2\2\2\u0808"+
		"\u081b\5\u0140\u00a1\2\u0809\u080b\5\u00ceh\2\u080a\u0809\3\2\2\2\u080a"+
		"\u080b\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e\7/\2\2\u080d\u080f\5\u0142"+
		"\u00a2\2\u080e\u080d\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0810\3\2\2\2\u0810"+
		"\u081b\5\u0140\u00a1\2\u0811\u0813\5\u00ceh\2\u0812\u0811\3\2\2\2\u0812"+
		"\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\5\u0142\u00a2\2\u0815\u0817"+
		"\7/\2\2\u0816\u0815\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u0819\5\u0140\u00a1\2\u0819\u081b\3\2\2\2\u081a\u0806\3\2\2\2\u081a\u080a"+
		"\3\2\2\2\u081a\u0812\3\2\2\2\u081b\u013d\3\2\2\2\u081c\u081e\5\22\n\2"+
		"\u081d\u081c\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0822"+
		"\5\u011e\u0090\2\u0820\u0822\5\u009aN\2\u0821\u081d\3\2\2\2\u0821\u0820"+
		"\3\2\2\2\u0822\u013f\3\2\2\2\u0823\u0824\5\u013e\u00a0\2\u0824\u0141\3"+
		"\2\2\2\u0825\u0826\t\21\2\2\u0826\u0143\3\2\2\2\u0827\u0828\7\36\2\2\u0828"+
		"\u0829\5\u0146\u00a4\2\u0829\u0145\3\2\2\2\u082a\u082c\5\u0092J\2\u082b"+
		"\u082d\5\u0148\u00a5\2\u082c\u082b\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u0147"+
		"\3\2\2\2\u082e\u0830\5\u00f4{\2\u082f\u0831\5\u0148\u00a5\2\u0830\u082f"+
		"\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0149\3\2\2\2\u0832\u0833\7\63\2\2"+
		"\u0833\u0834\5\u014c\u00a7\2\u0834\u014b\3\2\2\2\u0835\u0837\5\u014e\u00a8"+
		"\2\u0836\u0838\7l\2\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u0840"+
		"\3\2\2\2\u0839\u083a\5\u014e\u00a8\2\u083a\u083b\7\20\2\2\u083b\u083d"+
		"\5\u014c\u00a7\2\u083c\u083e\7l\2\2\u083d\u083c\3\2\2\2\u083d\u083e\3"+
		"\2\2\2\u083e\u0840\3\2\2\2\u083f\u0835\3\2\2\2\u083f\u0839\3\2\2\2\u0840"+
		"\u014d\3\2\2\2\u0841\u0842\5\u0150\u00a9\2\u0842\u0844\7L\2\2\u0843\u0845"+
		"\5$\23\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0846\3\2\2\2\u0846"+
		"\u0847\7=\2\2\u0847\u084c\3\2\2\2\u0848\u0849\5\u0150\u00a9\2\u0849\u084a"+
		"\5\u011c\u008f\2\u084a\u084c\3\2\2\2\u084b\u0841\3\2\2\2\u084b\u0848\3"+
		"\2\2\2\u084c\u014f\3\2\2\2\u084d\u0850\5\u013e\u00a0\2\u084e\u0850\7|"+
		"\2\2\u084f\u084d\3\2\2\2\u084f\u084e\3\2\2\2\u0850\u0151\3\2\2\2\u0851"+
		"\u0852\7\36\2\2\u0852\u0853\5\u0154\u00ab\2\u0853\u0153\3\2\2\2\u0854"+
		"\u0885\7b\2\2\u0855\u0885\7\25\2\2\u0856\u0857\7b\2\2\u0857\u0858\7\65"+
		"\2\2\u0858\u0885\7\27\2\2\u0859\u085a\7\25\2\2\u085a\u085b\7\65\2\2\u085b"+
		"\u0885\7\27\2\2\u085c\u0885\7.\2\2\u085d\u0885\7Y\2\2\u085e\u0885\7v\2"+
		"\2\u085f\u0885\7\33\2\2\u0860\u0885\7y\2\2\u0861\u0885\7m\2\2\u0862\u0885"+
		"\7\22\2\2\u0863\u0885\7\26\2\2\u0864\u0885\7Z\2\2\u0865\u0885\7r\2\2\u0866"+
		"\u0885\7\34\2\2\u0867\u0885\7{\2\2\u0868\u0885\7\17\2\2\u0869\u0885\7"+
		"g\2\2\u086a\u0885\7\b\2\2\u086b\u0885\7\67\2\2\u086c\u0885\7\23\2\2\u086d"+
		"\u0885\7n\2\2\u086e\u0885\7\5\2\2\u086f\u0885\7)\2\2\u0870\u0885\7H\2"+
		"\2\u0871\u0885\7\f\2\2\u0872\u0885\7J\2\2\u0873\u0885\7\7\2\2\u0874\u0885"+
		"\7\4\2\2\u0875\u0885\7\'\2\2\u0876\u0885\7+\2\2\u0877\u0885\7\21\2\2\u0878"+
		"\u0885\7A\2\2\u0879\u0885\7\30\2\2\u087a\u0885\79\2\2\u087b\u0885\7X\2"+
		"\2\u087c\u0885\7z\2\2\u087d\u0885\7\20\2\2\u087e\u0885\7T\2\2\u087f\u0885"+
		"\7s\2\2\u0880\u0881\7L\2\2\u0881\u0885\7=\2\2\u0882\u0883\7\65\2\2\u0883"+
		"\u0885\7\27\2\2\u0884\u0854\3\2\2\2\u0884\u0855\3\2\2\2\u0884\u0856\3"+
		"\2\2\2\u0884\u0859\3\2\2\2\u0884\u085c\3\2\2\2\u0884\u085d\3\2\2\2\u0884"+
		"\u085e\3\2\2\2\u0884\u085f\3\2\2\2\u0884\u0860\3\2\2\2\u0884\u0861\3\2"+
		"\2\2\u0884\u0862\3\2\2\2\u0884\u0863\3\2\2\2\u0884\u0864\3\2\2\2\u0884"+
		"\u0865\3\2\2\2\u0884\u0866\3\2\2\2\u0884\u0867\3\2\2\2\u0884\u0868\3\2"+
		"\2\2\u0884\u0869\3\2\2\2\u0884\u086a\3\2\2\2\u0884\u086b\3\2\2\2\u0884"+
		"\u086c\3\2\2\2\u0884\u086d\3\2\2\2\u0884\u086e\3\2\2\2\u0884\u086f\3\2"+
		"\2\2\u0884\u0870\3\2\2\2\u0884\u0871\3\2\2\2\u0884\u0872\3\2\2\2\u0884"+
		"\u0873\3\2\2\2\u0884\u0874\3\2\2\2\u0884\u0875\3\2\2\2\u0884\u0876\3\2"+
		"\2\2\u0884\u0877\3\2\2\2\u0884\u0878\3\2\2\2\u0884\u0879\3\2\2\2\u0884"+
		"\u087a\3\2\2\2\u0884\u087b\3\2\2\2\u0884\u087c\3\2\2\2\u0884\u087d\3\2"+
		"\2\2\u0884\u087e\3\2\2\2\u0884\u087f\3\2\2\2\u0884\u0880\3\2\2\2\u0884"+
		"\u0882\3\2\2\2\u0885\u0155\3\2\2\2\u0886\u0887\7\36\2\2\u0887\u0888\7"+
		"*\2\2\u0888\u0889\7*\2\2\u0889\u088a\7|\2\2\u088a\u0157\3\2\2\2\u088b"+
		"\u088c\7-\2\2\u088c\u088d\7\26\2\2\u088d\u088e\5\u015a\u00ae\2\u088e\u088f"+
		"\7r\2\2\u088f\u0890\5v<\2\u0890\u0159\3\2\2\2\u0891\u0892\b\u00ae\1\2"+
		"\u0892\u0893\5\u015c\u00af\2\u0893\u0899\3\2\2\2\u0894\u0895\6\u00ae."+
		"\3\u0895\u0896\7\20\2\2\u0896\u0898\5\u015c\u00af\2\u0897\u0894\3\2\2"+
		"\2\u0898\u089b\3\2\2\2\u0899\u0897\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u015b"+
		"\3\2\2\2\u089b\u0899\3\2\2\2\u089c\u089f\5\u015e\u00b0\2\u089d\u089f\5"+
		"\u010e\u0088\2\u089e\u089c\3\2\2\2\u089e\u089d\3\2\2\2\u089f\u015d\3\2"+
		"\2\2\u08a0\u08a2\7\62\2\2\u08a1\u08a3\7l\2\2\u08a2\u08a1\3\2\2\2\u08a2"+
		"\u08a3\3\2\2\2\u08a3\u08a5\3\2\2\2\u08a4\u08a6\7|\2\2\u08a5\u08a4\3\2"+
		"\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08d1\3\2\2\2\u08a7\u08a9\7\62\2\2\u08a8"+
		"\u08aa\7|\2\2\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\3\2"+
		"\2\2\u08ab\u08ac\7\5\2\2\u08ac\u08d1\5\u00fe\u0080\2\u08ad\u08af\7\37"+
		"\2\2\u08ae\u08b0\7l\2\2\u08af\u08ae\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0"+
		"\u08b2\3\2\2\2\u08b1\u08b3\7|\2\2\u08b2\u08b1\3\2\2\2\u08b2\u08b3\3\2"+
		"\2\2\u08b3\u08d1\3\2\2\2\u08b4\u08b6\7\37\2\2\u08b5\u08b7\7|\2\2\u08b6"+
		"\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\7\5"+
		"\2\2\u08b9\u08d1\5\u00fe\u0080\2\u08ba\u08bb\7-\2\2\u08bb\u08bc\7\26\2"+
		"\2\u08bc\u08bd\5\u015a\u00ae\2\u08bd\u08be\7r\2\2\u08be\u08c0\7\62\2\2"+
		"\u08bf\u08c1\7l\2\2\u08c0\u08bf\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c3"+
		"\3\2\2\2\u08c2\u08c4\7|\2\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4"+
		"\u08d1\3\2\2\2\u08c5\u08c6\7-\2\2\u08c6\u08c7\7\26\2\2\u08c7\u08c8\5\u015a"+
		"\u00ae\2\u08c8\u08c9\7r\2\2\u08c9\u08cb\7\62\2\2\u08ca\u08cc\7|\2\2\u08cb"+
		"\u08ca\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08ce\7\5"+
		"\2\2\u08ce\u08cf\5\f\7\2\u08cf\u08d1\3\2\2\2\u08d0\u08a0\3\2\2\2\u08d0"+
		"\u08a7\3\2\2\2\u08d0\u08ad\3\2\2\2\u08d0\u08b4\3\2\2\2\u08d0\u08ba\3\2"+
		"\2\2\u08d0\u08c5\3\2\2\2\u08d1\u015f\3\2\2\2\u08d2\u08d3\5\u0164\u00b3"+
		"\2\u08d3\u08d5\7\26\2\2\u08d4\u08d6\5\u0166\u00b4\2\u08d5\u08d4\3\2\2"+
		"\2\u08d5\u08d6\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\7r\2\2\u08d8\u0161"+
		"\3\2\2\2\u08d9\u08e9\5\u0160\u00b1\2\u08da\u08db\5\u0152\u00aa\2\u08db"+
		"\u08dd\7\26\2\2\u08dc\u08de\5\u0166\u00b4\2\u08dd\u08dc\3\2\2\2\u08dd"+
		"\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\7r\2\2\u08e0\u08e9\3\2"+
		"\2\2\u08e1\u08e2\5\u0156\u00ac\2\u08e2\u08e4\7\26\2\2\u08e3\u08e5\5\u0166"+
		"\u00b4\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6"+
		"\u08e7\7r\2\2\u08e7\u08e9\3\2\2\2\u08e8\u08d9\3\2\2\2\u08e8\u08da\3\2"+
		"\2\2\u08e8\u08e1\3\2\2\2\u08e9\u0163\3\2\2\2\u08ea\u08eb\7|\2\2\u08eb"+
		"\u0165\3\2\2\2\u08ec\u08ed\b\u00b4\1\2\u08ed\u08ef\5\u0168\u00b5\2\u08ee"+
		"\u08f0\7l\2\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f9\3\2"+
		"\2\2\u08f1\u08f2\6\u00b4/\3\u08f2\u08f3\7\20\2\2\u08f3\u08f5\5\u0168\u00b5"+
		"\2\u08f4\u08f6\7l\2\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8"+
		"\3\2\2\2\u08f7\u08f1\3\2\2\2\u08f8\u08fb\3\2\2\2\u08f9\u08f7\3\2\2\2\u08f9"+
		"\u08fa\3\2\2\2\u08fa\u0167\3\2\2\2\u08fb\u08f9\3\2\2\2\u08fc\u0900\5X"+
		"-\2\u08fd\u0900\5\u00fe\u0080\2\u08fe\u0900\5\f\7\2\u08ff\u08fc\3\2\2"+
		"\2\u08ff\u08fd\3\2\2\2\u08ff\u08fe\3\2\2\2\u0900\u0169\3\2\2\2\u0901\u0902"+
		"\7\37\2\2\u0902\u0903\5\22\n\2\u0903\u0904\7|\2\2\u0904\u090d\3\2\2\2"+
		"\u0905\u0906\7\37\2\2\u0906\u0908\5\22\n\2\u0907\u0909\7-\2\2\u0908\u0907"+
		"\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090b\5\u0160\u00b1"+
		"\2\u090b\u090d\3\2\2\2\u090c\u0901\3\2\2\2\u090c\u0905\3\2\2\2\u090d\u016b"+
		"\3\2\2\2\u090e\u0910\7@\2\2\u090f\u090e\3\2\2\2\u090f\u0910\3\2\2\2\u0910"+
		"\u0911\3\2\2\2\u0911\u0912\7-\2\2\u0912\u0913\5v<\2\u0913\u016d\3\2\2"+
		"\2\u0914\u0915\7-\2\2\u0915\u0916\7\26\2\2\u0916\u0917\7r\2\2\u0917\u0918"+
		"\5v<\2\u0918\u016f\3\2\2\2\u0919\u091a\7F\2\2\u091a\u091b\5`\61\2\u091b"+
		"\u091c\5\u0174\u00bb\2\u091c\u0171\3\2\2\2\u091d\u091f\7F\2\2\u091e\u0920"+
		"\5\u014a\u00a6\2\u091f\u091e\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0921\3"+
		"\2\2\2\u0921\u0922\5`\61\2\u0922\u0923\5\u0174\u00bb\2\u0923\u0173\3\2"+
		"\2\2\u0924\u0926\5\u0176\u00bc\2\u0925\u0927\5\u0174\u00bb\2\u0926\u0925"+
		"\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0175\3\2\2\2\u0928\u0929\7%\2\2\u0929"+
		"\u092a\7L\2\2\u092a\u092b\5\u0178\u00bd\2\u092b\u092c\7=\2\2\u092c\u092d"+
		"\5`\61\2\u092d\u0177\3\2\2\2\u092e\u0930\5\u00ceh\2\u092f\u092e\3\2\2"+
		"\2\u092f\u0930\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\5\u0092J\2\u0932"+
		"\u0933\5\u00eav\2\u0933\u093d\3\2\2\2\u0934\u0936\5\u00ceh\2\u0935\u0934"+
		"\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0939\5\u0092J"+
		"\2\u0938\u093a\5\u0100\u0081\2\u0939\u0938\3\2\2\2\u0939\u093a\3\2\2\2"+
		"\u093a\u093d\3\2\2\2\u093b\u093d\7l\2\2\u093c\u092f\3\2\2\2\u093c\u0935"+
		"\3\2\2\2\u093c\u093b\3\2\2\2\u093d\u0179\3\2\2\2\u093e\u0940\7\16\2\2"+
		"\u093f\u0941\5T+\2\u0940\u093f\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u017b"+
		"\3\2\2\2\u0942\u0945\5\u017e\u00c0\2\u0943\u0945\5\u0182\u00c2\2\u0944"+
		"\u0942\3\2\2\2\u0944\u0943\3\2\2\2\u0945\u017d\3\2\2\2\u0946\u0947\7\16"+
		"\2\2\u0947\u0949\7L\2\2\u0948\u094a\5\u0180\u00c1\2\u0949\u0948\3\2\2"+
		"\2\u0949\u094a\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\7=\2\2\u094c\u017f"+
		"\3\2\2\2\u094d\u094e\b\u00c1\1\2\u094e\u0950\5\u00fe\u0080\2\u094f\u0951"+
		"\7l\2\2\u0950\u094f\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u095a\3\2\2\2\u0952"+
		"\u0953\6\u00c1\60\3\u0953\u0954\7\20\2\2\u0954\u0956\5\u00fe\u0080\2\u0955"+
		"\u0957\7l\2\2\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0959\3\2"+
		"\2\2\u0958\u0952\3\2\2\2\u0959\u095c\3\2\2\2\u095a\u0958\3\2\2\2\u095a"+
		"\u095b\3\2\2\2\u095b\u0181\3\2\2\2\u095c\u095a\3\2\2\2\u095d\u095e\7w"+
		"\2\2\u095e\u095f\7L\2\2\u095f\u0960\5X-\2\u0960\u0961\7=\2\2\u0961\u0964"+
		"\3\2\2\2\u0962\u0964\7w\2\2\u0963\u095d\3\2\2\2\u0963\u0962\3\2\2\2\u0964"+
		"\u0183\3\2\2\2\u013b\u0185\u0191\u019a\u01a3\u01a8\u01b3\u01b7\u01c3\u01c7"+
		"\u01cd\u01d5\u01dc\u01e1\u01e3\u01e8\u01ee\u01f8\u01ff\u0205\u0209\u0210"+
		"\u0216\u0219\u021c\u021f\u0226\u025f\u026e\u0274\u027a\u0287\u0289\u028f"+
		"\u029e\u02a4\u02bf\u02c7\u02cb\u02cf\u02d2\u02d6\u02dc\u02de\u02e6\u02ea"+
		"\u02ed\u02f4\u02fb\u02ff\u0304\u0308\u030b\u0310\u0316\u031e\u0329\u032b"+
		"\u0336\u0341\u034c\u0357\u0362\u036d\u0378\u0383\u038e\u0399\u03a3\u03ab"+
		"\u03b5\u03bc\u03c0\u03c4\u03c8\u03cc\u03d1\u03d4\u03d7\u03dd\u03e5\u03ea"+
		"\u03ed\u03f3\u03fe\u0415\u0419\u0421\u0427\u043b\u043f\u044c\u0450\u0453"+
		"\u045a\u0462\u046c\u0473\u047e\u0488\u048d\u0494\u0497\u049c\u04a1\u04b1"+
		"\u04b6\u04be\u04c9\u04cf\u04d3\u04d8\u04dc\u04e1\u04e4\u04fa\u0500\u0509"+
		"\u050c\u0512\u0515\u051b\u051e\u0525\u052f\u0533\u0536\u0539\u053d\u0542"+
		"\u0544\u0548\u054c\u0555\u0562\u056a\u0570\u0578\u057c\u057f\u0588\u0591"+
		"\u0599\u05a2\u05a8\u05b3\u05b6\u05bb\u05ca\u05d0\u05d5\u05de\u05e4\u05ec"+
		"\u05f0\u05f6\u05fb\u0600\u0607\u0609\u060e\u0612\u0620\u0626\u0638\u063a"+
		"\u0644\u0649\u0650\u0656\u065b\u0661\u0668\u066c\u066e\u0670\u0677\u067a"+
		"\u067d\u0680\u0685\u0689\u068c\u0690\u0694\u0699\u069c\u069e\u06a2\u06a9"+
		"\u06ad\u06b0\u06b4\u06b8\u06be\u06c3\u06c5\u06cb\u06cf\u06d5\u06dc\u06e0"+
		"\u06e2\u06e4\u06eb\u06f5\u06f9\u06fb\u06fd\u0701\u0704\u070a\u0714\u0718"+
		"\u071e\u0726\u072a\u072d\u0731\u0736\u0739\u073c\u0740\u0745\u074f\u0756"+
		"\u075b\u075f\u0764\u076a\u076e\u0774\u077a\u077e\u0783\u0789\u078d";
	private static final String _serializedATNSegment1 =
		"\u0790\u0794\u0797\u0799\u079c\u07a6\u07ab\u07ad\u07b0\u07b3\u07b6\u07bb"+
		"\u07c1\u07cb\u07d0\u07d3\u07d7\u07da\u07dd\u07e1\u07ea\u07f8\u07fe\u0802"+
		"\u0806\u080a\u080e\u0812\u0816\u081a\u081d\u0821\u082c\u0830\u0837\u083d"+
		"\u083f\u0844\u084b\u084f\u0884\u0899\u089e\u08a2\u08a5\u08a9\u08af\u08b2"+
		"\u08b6\u08c0\u08c3\u08cb\u08d0\u08d5\u08dd\u08e4\u08e8\u08ef\u08f5\u08f9"+
		"\u08ff\u0908\u090c\u090f\u091f\u0926\u092f\u0935\u0939\u093c\u0940\u0944"+
		"\u0949\u0950\u0956\u095a\u0963";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}