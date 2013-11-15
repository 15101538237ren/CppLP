grammar Cpp;

/*******************************************************************
 *                              TOKENS                             *
 *******************************************************************/
IDENTIFIER : IDENTIFIER_NONDIGIT (IDENTIFIER_NONDIGIT|DIGIT)* ;

fragment
IDENTIFIER_NONDIGIT : [_a-zA-Z]
                    | UNICODE_CHAR
                    ;

fragment
UNICODE_CHAR : '\\u' HEX_QUAD
             | '\\U' HEX_QUAD HEX_QUAD
             ;

fragment
HEX_QUAD : HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;

fragment
DIGIT : [0-9] ;

fragment
OCT_DIGIT : [0-7] ;

fragment
HEX_DIGIT : [0-9a-fA-F] ;

/*******************
 * INTEGER_LITERAL *
 *******************/
INTEGER_LITERAL : DEC_LITERAL INT_SUFFIX?
                | OCT_LITERAL INT_SUFFIX?
                | HEX_LITERAL INT_SUFFIX?
                ;

fragment
DEC_LITERAL : [1-9][0-9]* ;

fragment
OCT_LITERAL : '0'[0-7]* ;

fragment
HEX_LITERAL : '0'[xX][0-9a-fA-F]+ ;

fragment
INT_SUFFIX : [uU] [lL]?
           | [uU] ('ll'|'LL')?
           | [lL] [uU]?
           | ('ll'|'LL') [uU]?
           ;

/********************
 * FLOATING_LITERAL *
 ********************/
FLOATING_LITERAL : FRACTIONAL_CONSTANT EXPONENT_PART? FLOATING_SUFFIX?
                 | DIGIT_SEQUENCE EXPONENT_PART FLOATING_SUFFIX?
                 ;

fragment
FRACTIONAL_CONSTANT : DIGIT_SEQUENCE? '.' DIGIT_SEQUENCE
                    | DIGIT_SEQUENCE '.'
                    ;

fragment
EXPONENT_PART : [eE] [+-]? DIGIT_SEQUENCE ;

fragment
DIGIT_SEQUENCE : DIGIT+ ;

fragment
FLOATING_SUFFIX : [flFL] ;

/*********************
 * CHARACTER_LITERAL *
 *********************/
CHARACTER_LITERAL : [uUL]? '\'' C_CHAR_SEQUENCE '\'' ;

fragment
C_CHAR_SEQUENCE : C_CHAR+ ;

fragment
C_CHAR : ~['\\\n]
       | ESCAPE_SEQUENCE
       | UNICODE_CHAR
       ;

fragment
ESCAPE_SEQUENCE : SIMPLE_ESCAPE_CHAR
                | OCT_ESCAPE_CHAR
                | HEX_ESCAPE_SEQUENCE
                ;

fragment
SIMPLE_ESCAPE_CHAR : '\\\\'
                   | '\\\''
                   | '\\"'
                   | '\\?'
                   | '\\a'
                   | '\\b'
                   | '\\f'
                   | '\\n'
                   | '\\r'
                   | '\\t'
                   | '\\v'
                   ;

fragment
OCT_ESCAPE_CHAR : '\\' OCT_DIGIT
                | '\\' OCT_DIGIT OCT_DIGIT
                | '\\' OCT_DIGIT OCT_DIGIT OCT_DIGIT
                ;

fragment
HEX_ESCAPE_SEQUENCE : '\\x' HEX_DIGIT+ ;

/******************
 * STRING_LITERAL *
 ******************/
STRING_LITERAL : ('u8'|[uUL])? '"' S_CHAR_SEQUENCE? '"'
               | ('u8'|[uUL])? 'R' RAW_STRING
               ;

fragment
S_CHAR_SEQUENCE : S_CHAR+ ;

fragment
S_CHAR : ~["\\\n]
       | ESCAPE_SEQUENCE
       | UNICODE_CHAR
       ;

fragment
RAW_STRING : '"' D_CHAR_SEQUENCE? '(' R_CHAR_SEQUENCE? ')' D_CHAR_SEQUENCE? '"' ;

fragment
R_CHAR_SEQUENCE : R_CHAR+ ;

fragment
R_CHAR : ~[\n] ;

fragment
D_CHAR_SEQUENCE : D_CHAR+ ;

fragment
D_CHAR : ~[ ()\\\t\v\f\n] ;

/*******************
 * BOOLEAN_LITERAL *
 *******************/
BOOLEAN_LITERAL : 'false'
                | 'true'
                ;

/*******************
 * POINTER_LITERAL *
 *******************/
POINTER_LITERAL : 'nullptr' ;

/****************
 * UDEF_LITERAL *
 ****************/
UDEF_LITERAL : UDEF_INTEGER_LITERAL
             | UDEF_FLOATING_LITERAL
             | UDEF_CHARACTER_LITERAL
             | UDEF_STRING_LITERAL
             ;

fragment
UDEF_INTEGER_LITERAL : DEC_LITERAL UDEF_SUFFIX
                     | OCT_LITERAL UDEF_SUFFIX
                     | HEX_LITERAL UDEF_SUFFIX
                     ;

fragment
UDEF_FLOATING_LITERAL : FRACTIONAL_CONSTANT EXPONENT_PART? UDEF_SUFFIX
                      | DIGIT_SEQUENCE EXPONENT_PART UDEF_SUFFIX
                      ;

fragment
UDEF_CHARACTER_LITERAL : CHARACTER_LITERAL UDEF_SUFFIX ;

fragment
UDEF_STRING_LITERAL : STRING_LITERAL UDEF_SUFFIX ;

fragment
UDEF_SUFFIX : IDENTIFIER ;

/****************
 * OTHER TOKENS *
 ****************/
NON_BRACES_CHAR : ~[()\[\]{} \t\r\n] ;

/*****************
 * TO BE SKIPPED *
 *****************/
WS : [ \t\r\n]+ -> skip ;

COMMENT : '/*'.*?'*/' -> skip ;

COMMENT2 : '//'.*?'\n' -> skip ;

/* EO-Tokens */

/*******************************************************************
 *                              BASIC                              *
 *******************************************************************/
translation_unit : declaration_seq? ;

entrance : translation_unit ;

/*******************************************************************
 *                           EXPRESSIONS                           *
 *******************************************************************/
primary_expression : literal
                   | 'this'
                   | '(' expression ')'
                   | id_expression
                   | lambda_expression
                   ;

literal : INTEGER_LITERAL
        | FLOATING_LITERAL
        | CHARACTER_LITERAL
        | linked_string_literal
        | BOOLEAN_LITERAL
        | POINTER_LITERAL
        | UDEF_LITERAL
        ;

linked_string_literal : STRING_LITERAL
                      | linked_string_literal STRING_LITERAL
                      ;

id_expression : unqualified_id
              | qualified_id
              ;

unqualified_id : IDENTIFIER
               | operator_function_id
               | conversion_function_id
               | literal_operator_id
               | '~' class_name
               | '~' decltype_specifier
               | template_id
               ;

qualified_id : nested_name_specifier 'template'? unqualified_id
             | '::' IDENTIFIER
             | '::' operator_function_id
             | '::' literal_operator_id
             | '::' template_id
             ;

nested_name_specifier : '::'? type_name '::'
                      | '::'? namespace_name '::'
                      | decltype_specifier '::'
                      | nested_name_specifier IDENTIFIER '::'
                      | nested_name_specifier 'template'? simple_template_id '::'
                      ;

lambda_expression : lambda_introducer lambda_declarator? compound_statement ;

lambda_introducer : '[' lambda_capture? ']' ;

lambda_capture : capture_default
               | capture_list
               | capture_default ',' capture_list
               ;

capture_default : '&' | '=' ;

capture_list : capture '...'?
             | capture_list ',' capture '...'?
             ;

capture : IDENTIFIER
        | '&' IDENTIFIER
        | 'this'
        ;

lambda_declarator : '(' parameter_declaration_clause ')' 'mutable'? exception_specification? attribute_specifier_seq? trailing_return_type? ;

postfix_expression : primary_expression
                   | postfix_expression '[' expression ']'
                   | postfix_expression '[' braced_init_list ']'
                   | postfix_expression '(' expression_list? ')'
                   | simple_type_specifier '(' expression_list? ')'
                   | typename_specifier '(' expression_list ')'
                   | simple_type_specifier braced_init_list
                   | typename_specifier braced_init_list
                   | postfix_expression '.' 'template'? id_expression
                   | postfix_expression '->' 'template'? id_expression
                   | postfix_expression '.' pseudo_destructor_name
                   | postfix_expression '->' pseudo_destructor_name
                   | postfix_expression '++'
                   | postfix_expression '--'
                   | 'dynamic_cast' '<' type_id '>' '(' expression ')'
                   | 'static_cast' '<' type_id '>' '(' expression ')'
                   | 'reinterpret_cast' '<' type_id '>' '(' expression ')'
                   | 'const_cast' '<' type_id '>' '(' expression ')'
                   | 'typeid' '(' expression ')'
                   | 'typeid' '(' type_id ')'
                   ;

expression_list: initializer_list ;

pseudo_destructor_name : nested_name_specifier? type_name '::' '~' type_name
                       | nested_name_specifier 'template' simple_template_id '::' '~' type_name
                       | nested_name_specifier? '~' type_name
                       | '~' decltype_specifier
                       ;

unary_expression : postfix_expression
                 | ('++'|'--') cast_expression
                 | ('*'|'&'|'+'|'-'|'!'|'~') cast_expression
                 | 'sizeof' unary_expression
                 | 'sizeof' '(' type_id ')'
                 | 'sizeof' '...' '(' IDENTIFIER ')'
                 | 'alignof' '(' type_id ')'
                 | noexcept_expression
                 | new_expression
                 | delete_expression
                 ;

noexcept_expression : 'noexcept' '(' expression ')' ;

new_expression : '::'? 'new' new_placement? new_type_id new_initializer?
               | '::'? 'new' new_placement? '(' type_id ')' new_initializer?
               ;

new_placement : '(' expression_list ')' ;

new_type_id : type_specifier_seq new_declarator? ;

new_declarator : ptr_operator new_declarator?
               | noptr_new_declarator
               ;

noptr_new_declarator : '[' expression ']' attribute_specifier_seq?
                     | noptr_new_declarator '[' constant_expression ']' attribute_specifier_seq?
                     ;

new_initializer : '(' expression_list? ')'
                | braced_init_list
                ;

delete_expression : '::'? 'delete' cast_expression
                  | '::'? 'delete' '[' ']' cast_expression
                  ;

cast_expression : unary_expression
                | '(' type_id ')' cast_expression
                ;

pm_expression : cast_expression
              | pm_expression '.*' cast_expression
              | pm_expression '->*' cast_expression
              ;

multiplicative_expression : pm_expression
                          | multiplicative_expression ('*'|'/'|'%') pm_expression
                          ;

additive_expression : multiplicative_expression
                    | additive_expression ('+'|'-') multiplicative_expression
                    ;

shift_expression : additive_expression
                 | shift_expression ('<<'|'>>') additive_expression
                 ;

relational_expression : shift_expression
                      | relational_expression ('<'|'<='|'>'|'>=') shift_expression
                      ;

equality_expression : relational_expression
                    | equality_expression ('=='|'!=') relational_expression
                    ;

and_expression : equality_expression
               | and_expression '&' equality_expression
               ;

exclusive_or_expression : and_expression
                        | exclusive_or_expression '^' and_expression
                        ;

inclusive_or_expression : exclusive_or_expression
                        | inclusive_or_expression '|' exclusive_or_expression
                        ;

logical_and_expression : inclusive_or_expression
                       | logical_and_expression '&&' inclusive_or_expression
                       ;

logical_or_expression : logical_and_expression
                      | logical_or_expression '||' logical_and_expression
                      ;

conditional_expression : logical_or_expression
                       | logical_or_expression '?' expression ':' assignment_expression
                       ;

assignment_expression : conditional_expression
                      | logical_or_expression ('='|'*='|'/='|'%='|'+='|'-='|'>>='|'<<='|'&='|'^='|'|=') initializer_clause
                      | throw_expression
                      ;

expression : assignment_expression
           | expression ',' assignment_expression
           ;

constant_expression : conditional_expression ;

/*******************************************************************
 *                            STATEMENTS                           *
 *******************************************************************/
statement : labeled_statement
          | attribute_specifier_seq? expression_statement
          | attribute_specifier_seq? compound_statement
          | attribute_specifier_seq? selection_statement
          | attribute_specifier_seq? iteration_statement
          | attribute_specifier_seq? jump_statement
          | declaration_statement
          | attribute_specifier_seq? try_block
          ;

labeled_statement : attribute_specifier_seq? IDENTIFIER ':' statement
                  | attribute_specifier_seq? 'case' constant_expression ':' statement
                  | attribute_specifier_seq? 'default' ':' statement
                  ;

expression_statement : expression? ';' ;

compound_statement : '{' statement_seq? '}' ;

statement_seq : statement
              | statement_seq statement
              ;

selection_statement : 'if' '(' condition ')' statement
                    | 'if' '(' condition ')' statement 'else' statement
                    | 'switch' '(' condition ')' statement
                    ;

condition : expression
          | attribute_specifier_seq? decl_specifier_seq declarator '=' initializer_clause
          | attribute_specifier_seq? decl_specifier_seq declarator braced_init_list
          ;

iteration_statement : 'while' '(' condition ')' statement
                    | 'do' statement 'while' '(' condition ')' ';'
                    | 'for' '(' for_init_statement condition? ';' expression? ')' statement
                    | 'for' '(' for_range_declaration ':' for_range_initializer ')' statement
                    ;

for_init_statement : expression_statement
                   | simple_declaration
                   ;

for_range_declaration : attribute_specifier_seq? decl_specifier_seq declarator ;

for_range_initializer : expression
                      | braced_init_list
                      ;

jump_statement : 'break' ';'
               | 'continue' ';'
               | 'return' expression? ';'
               | 'return' braced_init_list ';'
               | 'goto' IDENTIFIER ';'
               ;

declaration_statement: block_declaration ;

/*******************************************************************
 *                           DECLARATIONS                          *
 *******************************************************************/
declaration_seq : declaration+ ;

declaration : block_declaration
            | function_definition
            | template_declaration
            | explicit_instantiation
            | explicit_specialization
            | linkage_specification
            | namespace_definition
            | empty_declaration
            | attribute_declaration
            ;

block_declaration : simple_declaration
                  | asm_definition
                  | namespace_alias_definition
                  | using_declaration
                  | using_directive
                  | static_assert_declaration
                  | alias_declaration
                  | opaque_enum_declaration
                  ;

alias_declaration : 'using' IDENTIFIER attribute_specifier_seq? '=' type_id ';' ;

simple_declaration : decl_specifier_seq? init_declarator_list? ';'
                   | attribute_specifier_seq decl_specifier_seq? init_declarator_list ';'
                   ;

static_assert_declaration : 'static_assert' '(' constant_expression ',' STRING_LITERAL ')' ';' ;

empty_declaration : ';' ;

attribute_declaration : attribute_specifier_seq ;

decl_specifier_seq : decl_specifier attribute_specifier_seq?
                   | decl_specifier decl_specifier_seq
                   ;

decl_specifier : storage_class_specifier
               | type_specifier
               | function_specifier
               | 'friend'
               | 'typedef'
               | 'constexpr'
               ;

storage_class_specifier : 'register'
                        | 'static'
                        | 'thread_local'
                        | 'extern'
                        | 'mutable'
                        ;

function_specifier : 'inline'
                   | 'virtual'
                   | 'explicit'
                   ;

typedef_name : IDENTIFIER ;

type_specifier : trailing_type_specifier
               | class_specifier
               | enum_specifier
               ;

trailing_type_specifier : simple_type_specifier
                        | elaborated_type_specifier
                        | typename_specifier
                        | cv_qualifier
                        ;

type_specifier_seq : type_specifier attribute_specifier_seq?
                   | type_specifier type_specifier_seq
                   ;

trailing_type_specifier_seq : trailing_type_specifier attribute_specifier_seq?
                            | trailing_type_specifier trailing_type_specifier_seq
                            ;

simple_type_specifier : nested_name_specifier? type_name
                      | nested_name_specifier 'template' simple_template_id
                      | 'char'
                      | 'char16_t'
                      | 'char32_t'
                      | 'wchar_t'
                      | 'bool'
                      | 'short'
                      | 'int'
                      | 'long'
                      | 'signed'
                      | 'unsigned'
                      | 'float'
                      | 'double'
                      | 'void'
                      | 'auto'
                      | decltype_specifier
                      ;

type_name : class_name
          | enum_name
          | typedef_name
          | simple_template_id
          ;

decltype_specifier : 'decltype' '(' expression ')' ;

elaborated_type_specifier : class_key attribute_specifier_seq? nested_name_specifier? IDENTIFIER
                          | class_key nested_name_specifier? 'template'? simple_template_id
                          | 'enum' nested_name_specifier? IDENTIFIER
                          ;

enum_name: IDENTIFIER ;

enum_specifier : enum_header '{' enumerator_list? '}'
               | enum_header '{' enumerator_list ',' '}'
               ;

enum_header : enum_key attribute_specifier_seq? IDENTIFIER? enum_base?
            | enum_key attribute_specifier_seq? nested_name_specifier IDENTIFIER enum_base?
            ;

opaque_enum_declaration : enum_key attribute_specifier_seq? IDENTIFIER enum_base? ';' ;

enum_key : 'enum'
         | 'enum' 'class'
         | 'enum' 'struct'
         ;

enum_base : ':' type_specifier_seq ;

enumerator_list : enumerator_definition
                | enumerator_list ',' enumerator_definition
                ;

enumerator_definition : enumerator
                      | enumerator '=' constant_expression
                      ;

enumerator : IDENTIFIER ;

namespace_name : original_namespace_name
               | namespace_alias
               ;

original_namespace_name : IDENTIFIER;

namespace_alias : IDENTIFIER;

namespace_definition : named_namespace_definition
                     | unnamed_namespace_definition
                     ;

named_namespace_definition : original_namespace_definition
                           | extension_namespace_definition
                           ;

original_namespace_definition : 'inline'? 'namespace' IDENTIFIER '{' namespace_body '}' ;

extension_namespace_definition : 'inline'? 'namespace' original_namespace_name '{' namespace_body '}' ;

unnamed_namespace_definition : 'inline'? 'namespace' '{' namespace_body '}' ;

namespace_body : declaration_seq? ;

namespace_alias_definition : 'namespace' IDENTIFIER '=' qualified_namespace_specifier ';' ;

qualified_namespace_specifier : nested_name_specifier? namespace_name ;

using_declaration : 'using' 'typename'? nested_name_specifier unqualified_id ';'
                  | 'using' '::' unqualified_id ';'
                  ;

using_directive : attribute_specifier_seq? 'using' 'namespace' nested_name_specifier? namespace_name ';' ;

asm_definition : 'asm' '(' STRING_LITERAL ')' ';' ;

linkage_specification : 'extern' STRING_LITERAL '{' declaration_seq? '}'
                      | 'extern' STRING_LITERAL declaration
                      ;

attribute_specifier_seq : attribute_specifier+ ;

attribute_specifier : '[' '[' attribute_list ']' ']'
                    | alignment_specifier
                    ;

alignment_specifier : 'alignas' '(' type_id '...'? ')'
                    | 'alignas' '(' alignment_expression '...'? ')'
                    ;

alignment_expression : constant_expression ;

attribute_list : attribute?
               | attribute_list ',' attribute?
               | attribute '...'
               | attribute_list ',' attribute '...'
               ;

attribute : attribute_token attribute_argument_clause? ;

attribute_token : IDENTIFIER
                | attribute_scoped_token
                ;

attribute_scoped_token : attribute_namespace '::' IDENTIFIER ;

attribute_namespace : IDENTIFIER ;

attribute_argument_clause : '(' balanced_token_seq ')' ;

balanced_token_seq : balanced_token?
                   | balanced_token_seq balanced_token
                   ;

balanced_token : '(' balanced_token_seq ')'
               | '[' balanced_token_seq ']'
               | '{' balanced_token_seq '}'
               | NON_BRACES_CHAR+
               ;

/*******************************************************************
 *                           DECLARATORS                           *
 *******************************************************************/
init_declarator_list : init_declarator
                     | init_declarator_list ',' init_declarator
                     ;

init_declarator : declarator initializer? ;

declarator : ptr_declarator
           | noptr_declarator parameters_and_qualifiers trailing_return_type
           ;

ptr_declarator : noptr_declarator
               | ptr_operator ptr_declarator
               ;

noptr_declarator : declarator_id attribute_specifier_seq?
                 | noptr_declarator parameters_and_qualifiers
                 | noptr_declarator '[' constant_expression? ']' attribute_specifier_seq?
                 | '(' ptr_declarator ')'
                 ;

parameters_and_qualifiers : '(' parameter_declaration_clause ')' attribute_specifier_seq? cv_qualifier_seq? ref_qualifier? exception_specification? ;

trailing_return_type : '->' trailing_type_specifier_seq abstract_declarator? ;

ptr_operator : '*' attribute_specifier_seq? cv_qualifier_seq?
             | '&' attribute_specifier_seq?
             | '&&' attribute_specifier_seq?
             | nested_name_specifier '*' attribute_specifier_seq? cv_qualifier_seq?
             ;

cv_qualifier_seq : cv_qualifier cv_qualifier_seq? ;

cv_qualifier : 'const' | 'volatile' ;

ref_qualifier : '&' | '&&' ;

declarator_id : '...'? id_expression
              | nested_name_specifier? class_name
              ;

type_id : type_specifier_seq abstract_declarator? ;

abstract_declarator : ptr_abstract_declarator
                    | noptr_abstract_declarator? parameters_and_qualifiers trailing_return_type
                    | abstract_pack_declarator
                    ;

ptr_abstract_declarator : noptr_abstract_declarator
                        | ptr_operator ptr_abstract_declarator?
                        ;

noptr_abstract_declarator : parameters_and_qualifiers
                          | noptr_abstract_declarator parameters_and_qualifiers
                          | '[' constant_expression? ']' attribute_specifier_seq?
                          | noptr_abstract_declarator '[' constant_expression? ']' attribute_specifier_seq?
                          | '(' ptr_abstract_declarator ')'
                          ;

abstract_pack_declarator : noptr_abstract_pack_declarator
                         | ptr_operator abstract_pack_declarator
                         ;

noptr_abstract_pack_declarator : noptr_abstract_pack_declarator parameters_and_qualifiers
                               | noptr_abstract_pack_declarator '[' constant_expression? ']' attribute_specifier_seq?
                               | '...'
                               ;

parameter_declaration_clause : parameter_declaration_list? '...'?
                             | parameter_declaration_list ',' '...'
                             ;

parameter_declaration_list : parameter_declaration
                           | parameter_declaration_list ',' parameter_declaration
                           ;

parameter_declaration : attribute_specifier_seq? decl_specifier_seq declarator
                      | attribute_specifier_seq? decl_specifier_seq declarator '=' initializer_clause
                      | attribute_specifier_seq? decl_specifier_seq abstract_declarator?
                      | attribute_specifier_seq? decl_specifier_seq abstract_declarator? '=' initializer_clause
                      ;

function_definition : attribute_specifier_seq? decl_specifier_seq? declarator virt_specifier_seq? function_body ;

function_body : ctor_initializer? compound_statement
              | function_try_block
              | '=' 'default' ';'
              | '=' 'delete' ';'
              ;

initializer : brace_or_equal_initializer
            | '(' expression_list ')'
            ;

brace_or_equal_initializer : '=' initializer_clause
                           | braced_init_list
                           ;

initializer_clause : assignment_expression
                   | braced_init_list
                   ;

initializer_list : initializer_clause '...'?
                 | initializer_list ',' initializer_clause '...'?
                 ;

braced_init_list : '{' initializer_list ','? '}'
                 | '{' '}'
                 ;

/*******************************************************************
 *                             CLASSES                             *
 *******************************************************************/
class_name : IDENTIFIER
           | simple_template_id
           ;

class_specifier : class_head '{' member_specification? '}' ;

class_head : class_key attribute_specifier_seq? class_head_name class_virt_specifier? base_clause?
           | class_key attribute_specifier_seq? base_clause?
           ;

class_head_name : nested_name_specifier? class_name ;

class_virt_specifier : 'final' ;

class_key : 'class' | 'struct' | 'union' ;

member_specification : member_declaration member_specification?
                     | access_specifier ':' member_specification?
                     ;

member_declaration : attribute_specifier_seq? decl_specifier_seq? member_declarator_list? ';'
                   | function_definition ';'?
                   | using_declaration
                   | static_assert_declaration
                   | template_declaration
                   | alias_declaration
                   ;

member_declarator_list : member_declarator
                       | member_declarator_list ',' member_declarator
                       ;

member_declarator : declarator virt_specifier_seq? pure_specifier?
                  | declarator brace_or_equal_initializer?
                  | IDENTIFIER? attribute_specifier_seq? ':' constant_expression
                  ;

virt_specifier_seq : virt_specifier
                   | virt_specifier_seq virt_specifier
                   ;

virt_specifier : 'override' | 'final' ;

pure_specifier : '=' INTEGER_LITERAL ; /* the INTEGER_LITERAL should be 0 at here. */

/*******************************************************************
 *                          DERIVED CLASSES                        *
 *******************************************************************/
base_clause : ':' base_specifier_list ;

base_specifier_list : base_specifier '...'?
                    | base_specifier_list ',' base_specifier '...'?
                    ;

base_specifier : attribute_specifier_seq? base_type_specifier
               | attribute_specifier_seq? 'virtual' access_specifier? base_type_specifier
               | attribute_specifier_seq? access_specifier 'virtual'? base_type_specifier
               ;

class_or_decltype : nested_name_specifier? class_name
                  | decltype_specifier
                  ;

base_type_specifier : class_or_decltype ;

access_specifier : 'private' | 'protected' | 'public' ;

/*******************************************************************
 *                      SPECIAL MEMBER FUNCTIONS                   *
 *******************************************************************/
conversion_function_id : 'operator' conversion_type_id ;

conversion_type_id : type_specifier_seq conversion_declarator? ;

conversion_declarator : ptr_operator conversion_declarator? ;

ctor_initializer : ':' mem_initializer_list ;

mem_initializer_list : mem_initializer '...'?
                     | mem_initializer ',' mem_initializer_list '...'? /*TODO: MAYBE ERRORS HERE*/
                     ;

mem_initializer : mem_initializer_id '(' expression_list? ')'
                | mem_initializer_id braced_init_list
                ;

mem_initializer_id : class_or_decltype
                   | IDENTIFIER
                   ;

/*******************************************************************
 *                            OVERLOADING                          *
 *******************************************************************/
operator_function_id : 'operator' operator ;

operator : 'new' | 'delete' | 'new' '[' ']' | 'delete' '[' ']'
         | '*' | '/' | '%'
         | '+' | '-'
         | '<<' | '>>'
         | '<' | '<=' | '>' | '>='
         | '==' | '!='
         | '&' | '^' | '|'
         | '&&' | '||'
         | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '>>=' | '<<=' | '&=' | '^=' | '|='
         | '~' | '!'
         | '++' | '--'
         | ','
         | '->*' | '->'
         | '(' ')' | '[' ']'
         ;

literal_operator_id : 'operator' '"' '"' IDENTIFIER ;

/*******************************************************************
 *                             TEMPLATES                           *
 *******************************************************************/
template_declaration : 'template' '<' template_parameter_list '>' declaration ;

template_parameter_list : template_parameter
                        | template_parameter_list ',' template_parameter
                        ;

template_parameter : type_parameter
                   | parameter_declaration
                   ;

type_parameter : 'class' '...'? IDENTIFIER?
               | 'class' IDENTIFIER? '=' type_id
               | 'typename' '...'? IDENTIFIER?
               | 'typename' IDENTIFIER? '=' type_id
               | 'template' '<' template_parameter_list '>' 'class' '...'? IDENTIFIER?
               | 'template' '<' template_parameter_list '>' 'class' IDENTIFIER? '=' id_expression
               ;

simple_template_id : template_name '<' template_argument_list? '>' ;

template_id : simple_template_id
            | operator_function_id '<' template_argument_list? '>'
            | literal_operator_id '<' template_argument_list? '>'
            ;

template_name : IDENTIFIER ;

template_argument_list : template_argument '...'?
                       | template_argument_list ',' template_argument '...'?
                       ;

template_argument : constant_expression
                  | type_id
                  | id_expression
                  ;

typename_specifier : 'typename' nested_name_specifier IDENTIFIER
                   | 'typename' nested_name_specifier 'template'? simple_template_id
                   ;

explicit_instantiation : 'extern'? 'template' declaration ;

explicit_specialization : 'template' '<' '>' declaration ;

/*******************************************************************
 *                         EXCEPTION HANDLING                      *
 *******************************************************************/
try_block : 'try' compound_statement handler_seq ;

function_try_block : 'try' ctor_initializer? compound_statement handler_seq ;

handler_seq : handler handler_seq? ;

handler : 'catch' '(' exception_declaration ')' compound_statement ;

exception_declaration : attribute_specifier_seq? type_specifier_seq declarator
                      | attribute_specifier_seq? type_specifier_seq abstract_declarator?
                      | '...'
                      ;

throw_expression : 'throw' assignment_expression? ;

exception_specification : dynamic_exception_specification
                        | noexcept_specification
                        ;

dynamic_exception_specification : 'throw' '(' type_id_list? ')' ;

type_id_list : type_id '...'?
             | type_id_list ',' type_id '...'?
             ;

noexcept_specification : 'noexcept' '(' constant_expression ')'
                       | 'noexcept'
                       ;

/* EOF */

