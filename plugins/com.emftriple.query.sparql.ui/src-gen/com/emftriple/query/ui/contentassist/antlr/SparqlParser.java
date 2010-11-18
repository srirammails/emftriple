/*
* generated by Xtext
*/
package com.emftriple.query.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.emftriple.query.services.SparqlGrammarAccess;

public class SparqlParser extends AbstractContentAssistParser {
	
	@Inject
	private SparqlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.emftriple.query.ui.contentassist.antlr.internal.InternalSparqlParser createParser() {
		com.emftriple.query.ui.contentassist.antlr.internal.InternalSparqlParser result = new com.emftriple.query.ui.contentassist.antlr.internal.InternalSparqlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSPARQLQueryAccess().getAlternatives(), "rule__SPARQLQuery__Alternatives");
					put(grammarAccess.getPrefixAccess().getAlternatives(), "rule__Prefix__Alternatives");
					put(grammarAccess.getSelectionQueryAccess().getAlternatives(), "rule__SelectionQuery__Alternatives");
					put(grammarAccess.getSelectQueryAccess().getAlternatives(), "rule__SelectQuery__Alternatives");
					put(grammarAccess.getSelectAllQueryAccess().getAlternatives_3(), "rule__SelectAllQuery__Alternatives_3");
					put(grammarAccess.getSelectVariablesQueryAccess().getAlternatives_3(), "rule__SelectVariablesQuery__Alternatives_3");
					put(grammarAccess.getUpdateOperationAccess().getAlternatives(), "rule__UpdateOperation__Alternatives");
					put(grammarAccess.getModifyQueryAccess().getAlternatives(), "rule__ModifyQuery__Alternatives");
					put(grammarAccess.getClearGraphQueryAccess().getAlternatives_2(), "rule__ClearGraphQuery__Alternatives_2");
					put(grammarAccess.getDatasetClauseAccess().getAlternatives(), "rule__DatasetClause__Alternatives");
					put(grammarAccess.getGroupConditionAccess().getAlternatives(), "rule__GroupCondition__Alternatives");
					put(grammarAccess.getConstraintAccess().getAlternatives(), "rule__Constraint__Alternatives");
					put(grammarAccess.getGroupGraphPatternAccess().getAlternatives(), "rule__GroupGraphPattern__Alternatives");
					put(grammarAccess.getGraphPatternAccess().getAlternatives(), "rule__GraphPattern__Alternatives");
					put(grammarAccess.getConcreteFilterExpressionAccess().getAlternatives(), "rule__ConcreteFilterExpression__Alternatives");
					put(grammarAccess.getFilterNodeAccess().getAlternatives(), "rule__FilterNode__Alternatives");
					put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
					put(grammarAccess.getBuiltInCallAccess().getAlternatives(), "rule__BuiltInCall__Alternatives");
					put(grammarAccess.getAggregateAccess().getAlternatives(), "rule__Aggregate__Alternatives");
					put(grammarAccess.getAggregateAccess().getAlternatives_0_4(), "rule__Aggregate__Alternatives_0_4");
					put(grammarAccess.getGraphNodeAccess().getAlternatives(), "rule__GraphNode__Alternatives");
					put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getRDFTagAccess().getAlternatives(), "rule__RDFTag__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getPrefixAccess().getGroup_0(), "rule__Prefix__Group_0__0");
					put(grammarAccess.getUnNamedPrefixAccess().getGroup(), "rule__UnNamedPrefix__Group__0");
					put(grammarAccess.getBaseAccess().getGroup(), "rule__Base__Group__0");
					put(grammarAccess.getSelectAllQueryAccess().getGroup(), "rule__SelectAllQuery__Group__0");
					put(grammarAccess.getSelectVariablesQueryAccess().getGroup(), "rule__SelectVariablesQuery__Group__0");
					put(grammarAccess.getAskQueryAccess().getGroup(), "rule__AskQuery__Group__0");
					put(grammarAccess.getDescribeQueryAccess().getGroup(), "rule__DescribeQuery__Group__0");
					put(grammarAccess.getConstructQueryAccess().getGroup(), "rule__ConstructQuery__Group__0");
					put(grammarAccess.getUpdateQueryAccess().getGroup(), "rule__UpdateQuery__Group__0");
					put(grammarAccess.getCreateGraphQueryAccess().getGroup(), "rule__CreateGraphQuery__Group__0");
					put(grammarAccess.getDropGraphQueryAccess().getGroup(), "rule__DropGraphQuery__Group__0");
					put(grammarAccess.getLoadGraphQueryAccess().getGroup(), "rule__LoadGraphQuery__Group__0");
					put(grammarAccess.getLoadGraphQueryAccess().getGroup_2(), "rule__LoadGraphQuery__Group_2__0");
					put(grammarAccess.getClearGraphQueryAccess().getGroup(), "rule__ClearGraphQuery__Group__0");
					put(grammarAccess.getUsingGraphAccess().getGroup(), "rule__UsingGraph__Group__0");
					put(grammarAccess.getInsertQueryAccess().getGroup(), "rule__InsertQuery__Group__0");
					put(grammarAccess.getInsertQueryAccess().getGroup_0(), "rule__InsertQuery__Group_0__0");
					put(grammarAccess.getInsertQueryAccess().getGroup_2(), "rule__InsertQuery__Group_2__0");
					put(grammarAccess.getInsertDataQueryAccess().getGroup(), "rule__InsertDataQuery__Group__0");
					put(grammarAccess.getInsertDataQueryAccess().getGroup_0(), "rule__InsertDataQuery__Group_0__0");
					put(grammarAccess.getInsertDataQueryAccess().getGroup_3(), "rule__InsertDataQuery__Group_3__0");
					put(grammarAccess.getDeleteQueryAccess().getGroup(), "rule__DeleteQuery__Group__0");
					put(grammarAccess.getDeleteQueryAccess().getGroup_0(), "rule__DeleteQuery__Group_0__0");
					put(grammarAccess.getDeleteQueryAccess().getGroup_2(), "rule__DeleteQuery__Group_2__0");
					put(grammarAccess.getDeleteQueryAccess().getGroup_4(), "rule__DeleteQuery__Group_4__0");
					put(grammarAccess.getDeleteDataQueryAccess().getGroup(), "rule__DeleteDataQuery__Group__0");
					put(grammarAccess.getDeleteDataQueryAccess().getGroup_0(), "rule__DeleteDataQuery__Group_0__0");
					put(grammarAccess.getDeleteDataQueryAccess().getGroup_3(), "rule__DeleteDataQuery__Group_3__0");
					put(grammarAccess.getDeleteWhereQueryAccess().getGroup(), "rule__DeleteWhereQuery__Group__0");
					put(grammarAccess.getDeleteWhereQueryAccess().getGroup_0(), "rule__DeleteWhereQuery__Group_0__0");
					put(grammarAccess.getDefaultDataSetAccess().getGroup(), "rule__DefaultDataSet__Group__0");
					put(grammarAccess.getNamedDataSetAccess().getGroup(), "rule__NamedDataSet__Group__0");
					put(grammarAccess.getServiceDataSetAccess().getGroup(), "rule__ServiceDataSet__Group__0");
					put(grammarAccess.getWhereClauseAccess().getGroup(), "rule__WhereClause__Group__0");
					put(grammarAccess.getGroupClauseAccess().getGroup(), "rule__GroupClause__Group__0");
					put(grammarAccess.getHavingClauseAccess().getGroup(), "rule__HavingClause__Group__0");
					put(grammarAccess.getLimitClauseAccess().getGroup(), "rule__LimitClause__Group__0");
					put(grammarAccess.getSubSelectQueryAccess().getGroup(), "rule__SubSelectQuery__Group__0");
					put(grammarAccess.getGroupGraphPatternSubAccess().getGroup(), "rule__GroupGraphPatternSub__Group__0");
					put(grammarAccess.getGroupGraphPatternSubAccess().getGroup_2(), "rule__GroupGraphPatternSub__Group_2__0");
					put(grammarAccess.getTriplesSameSubjectAccess().getGroup(), "rule__TriplesSameSubject__Group__0");
					put(grammarAccess.getTriplesSameSubjectAccess().getGroup_2(), "rule__TriplesSameSubject__Group_2__0");
					put(grammarAccess.getGroupOrUnionGraphPatternAccess().getGroup(), "rule__GroupOrUnionGraphPattern__Group__0");
					put(grammarAccess.getGroupOrUnionGraphPatternAccess().getGroup_1(), "rule__GroupOrUnionGraphPattern__Group_1__0");
					put(grammarAccess.getOptionalGraphPatternAccess().getGroup(), "rule__OptionalGraphPattern__Group__0");
					put(grammarAccess.getPropertyListAccess().getGroup(), "rule__PropertyList__Group__0");
					put(grammarAccess.getGraphGraphPatternAccess().getGroup(), "rule__GraphGraphPattern__Group__0");
					put(grammarAccess.getServiceGraphPatternAccess().getGroup(), "rule__ServiceGraphPattern__Group__0");
					put(grammarAccess.getFilterPatternAccess().getGroup(), "rule__FilterPattern__Group__0");
					put(grammarAccess.getExistsPatternAccess().getGroup(), "rule__ExistsPattern__Group__0");
					put(grammarAccess.getNotExistsPatternAccess().getGroup(), "rule__NotExistsPattern__Group__0");
					put(grammarAccess.getMinusPatternAccess().getGroup(), "rule__MinusPattern__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_1(), "rule__Expression__Group_1_1__0");
					put(grammarAccess.getAndFilterExpressionAccess().getGroup(), "rule__AndFilterExpression__Group__0");
					put(grammarAccess.getAndFilterExpressionAccess().getGroup_1(), "rule__AndFilterExpression__Group_1__0");
					put(grammarAccess.getAndFilterExpressionAccess().getGroup_1_1(), "rule__AndFilterExpression__Group_1_1__0");
					put(grammarAccess.getParFilterExpressionAccess().getGroup(), "rule__ParFilterExpression__Group__0");
					put(grammarAccess.getExpressionFilterExpressionAccess().getGroup(), "rule__ExpressionFilterExpression__Group__0");
					put(grammarAccess.getNamedFunctionAccess().getGroup(), "rule__NamedFunction__Group__0");
					put(grammarAccess.getNamedFunctionAccess().getGroup_5(), "rule__NamedFunction__Group_5__0");
					put(grammarAccess.getSparqlFunctionAccess().getGroup(), "rule__SparqlFunction__Group__0");
					put(grammarAccess.getSparqlFunctionAccess().getGroup_3(), "rule__SparqlFunction__Group_3__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_0(), "rule__BuiltInCall__Group_0__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_1(), "rule__BuiltInCall__Group_1__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_2(), "rule__BuiltInCall__Group_2__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_3(), "rule__BuiltInCall__Group_3__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_4(), "rule__BuiltInCall__Group_4__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_5(), "rule__BuiltInCall__Group_5__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_6(), "rule__BuiltInCall__Group_6__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_7(), "rule__BuiltInCall__Group_7__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_8(), "rule__BuiltInCall__Group_8__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_9(), "rule__BuiltInCall__Group_9__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_10(), "rule__BuiltInCall__Group_10__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_11(), "rule__BuiltInCall__Group_11__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_12(), "rule__BuiltInCall__Group_12__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_13(), "rule__BuiltInCall__Group_13__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_14(), "rule__BuiltInCall__Group_14__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_15(), "rule__BuiltInCall__Group_15__0");
					put(grammarAccess.getAggregateAccess().getGroup_0(), "rule__Aggregate__Group_0__0");
					put(grammarAccess.getAggregateAccess().getGroup_1(), "rule__Aggregate__Group_1__0");
					put(grammarAccess.getAggregateAccess().getGroup_2(), "rule__Aggregate__Group_2__0");
					put(grammarAccess.getAggregateAccess().getGroup_3(), "rule__Aggregate__Group_3__0");
					put(grammarAccess.getAggregateAccess().getGroup_4(), "rule__Aggregate__Group_4__0");
					put(grammarAccess.getAggregateAccess().getGroup_5(), "rule__Aggregate__Group_5__0");
					put(grammarAccess.getAggregateAccess().getGroup_6(), "rule__Aggregate__Group_6__0");
					put(grammarAccess.getAggregateAccess().getGroup_6_5(), "rule__Aggregate__Group_6_5__0");
					put(grammarAccess.getAggregateAccess().getGroup_6_6(), "rule__Aggregate__Group_6_6__0");
					put(grammarAccess.getExprAggArgAccess().getGroup(), "rule__ExprAggArg__Group__0");
					put(grammarAccess.getUnNamedVariableAccess().getGroup(), "rule__UnNamedVariable__Group__0");
					put(grammarAccess.getNamedVariableAccess().getGroup(), "rule__NamedVariable__Group__0");
					put(grammarAccess.getBlankNodeAccess().getGroup(), "rule__BlankNode__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getIRIAccess().getGroup(), "rule__IRI__Group__0");
					put(grammarAccess.getStringValueAccess().getGroup(), "rule__StringValue__Group__0");
					put(grammarAccess.getIntegerValueAccess().getGroup(), "rule__IntegerValue__Group__0");
					put(grammarAccess.getTypeTagAccess().getGroup(), "rule__TypeTag__Group__0");
					put(grammarAccess.getLangTagAccess().getGroup(), "rule__LangTag__Group__0");
					put(grammarAccess.getPrefixAccess().getNameAssignment_0_1(), "rule__Prefix__NameAssignment_0_1");
					put(grammarAccess.getPrefixAccess().getIrefAssignment_0_3(), "rule__Prefix__IrefAssignment_0_3");
					put(grammarAccess.getUnNamedPrefixAccess().getIrefAssignment_2(), "rule__UnNamedPrefix__IrefAssignment_2");
					put(grammarAccess.getBaseAccess().getIrefAssignment_1(), "rule__Base__IrefAssignment_1");
					put(grammarAccess.getSelectAllQueryAccess().getBaseAssignment_0(), "rule__SelectAllQuery__BaseAssignment_0");
					put(grammarAccess.getSelectAllQueryAccess().getPrefixesAssignment_1(), "rule__SelectAllQuery__PrefixesAssignment_1");
					put(grammarAccess.getSelectAllQueryAccess().getIsDistinctAssignment_3_0(), "rule__SelectAllQuery__IsDistinctAssignment_3_0");
					put(grammarAccess.getSelectAllQueryAccess().getIsReducedAssignment_3_1(), "rule__SelectAllQuery__IsReducedAssignment_3_1");
					put(grammarAccess.getSelectAllQueryAccess().getAllAssignment_4(), "rule__SelectAllQuery__AllAssignment_4");
					put(grammarAccess.getSelectAllQueryAccess().getDatasetClauseAssignment_5(), "rule__SelectAllQuery__DatasetClauseAssignment_5");
					put(grammarAccess.getSelectAllQueryAccess().getWhereClauseAssignment_6(), "rule__SelectAllQuery__WhereClauseAssignment_6");
					put(grammarAccess.getSelectAllQueryAccess().getGroupClauseAssignment_7(), "rule__SelectAllQuery__GroupClauseAssignment_7");
					put(grammarAccess.getSelectAllQueryAccess().getHavingClauseAssignment_8(), "rule__SelectAllQuery__HavingClauseAssignment_8");
					put(grammarAccess.getSelectAllQueryAccess().getLimitClauseAssignment_9(), "rule__SelectAllQuery__LimitClauseAssignment_9");
					put(grammarAccess.getSelectVariablesQueryAccess().getBaseAssignment_0(), "rule__SelectVariablesQuery__BaseAssignment_0");
					put(grammarAccess.getSelectVariablesQueryAccess().getPrefixesAssignment_1(), "rule__SelectVariablesQuery__PrefixesAssignment_1");
					put(grammarAccess.getSelectVariablesQueryAccess().getIsDistinctAssignment_3_0(), "rule__SelectVariablesQuery__IsDistinctAssignment_3_0");
					put(grammarAccess.getSelectVariablesQueryAccess().getIsReducedAssignment_3_1(), "rule__SelectVariablesQuery__IsReducedAssignment_3_1");
					put(grammarAccess.getSelectVariablesQueryAccess().getVariablesAssignment_4(), "rule__SelectVariablesQuery__VariablesAssignment_4");
					put(grammarAccess.getSelectVariablesQueryAccess().getVariablesAssignment_5(), "rule__SelectVariablesQuery__VariablesAssignment_5");
					put(grammarAccess.getSelectVariablesQueryAccess().getDatasetClauseAssignment_6(), "rule__SelectVariablesQuery__DatasetClauseAssignment_6");
					put(grammarAccess.getSelectVariablesQueryAccess().getWhereClauseAssignment_7(), "rule__SelectVariablesQuery__WhereClauseAssignment_7");
					put(grammarAccess.getSelectVariablesQueryAccess().getGroupClauseAssignment_8(), "rule__SelectVariablesQuery__GroupClauseAssignment_8");
					put(grammarAccess.getSelectVariablesQueryAccess().getHavingClauseAssignment_9(), "rule__SelectVariablesQuery__HavingClauseAssignment_9");
					put(grammarAccess.getSelectVariablesQueryAccess().getLimitClauseAssignment_10(), "rule__SelectVariablesQuery__LimitClauseAssignment_10");
					put(grammarAccess.getAskQueryAccess().getBaseAssignment_0(), "rule__AskQuery__BaseAssignment_0");
					put(grammarAccess.getAskQueryAccess().getPrefixesAssignment_1(), "rule__AskQuery__PrefixesAssignment_1");
					put(grammarAccess.getAskQueryAccess().getDatasetClauseAssignment_3(), "rule__AskQuery__DatasetClauseAssignment_3");
					put(grammarAccess.getAskQueryAccess().getWhereClauseAssignment_4(), "rule__AskQuery__WhereClauseAssignment_4");
					put(grammarAccess.getAskQueryAccess().getGroupClauseAssignment_5(), "rule__AskQuery__GroupClauseAssignment_5");
					put(grammarAccess.getAskQueryAccess().getHavingClauseAssignment_6(), "rule__AskQuery__HavingClauseAssignment_6");
					put(grammarAccess.getAskQueryAccess().getLimitClauseAssignment_7(), "rule__AskQuery__LimitClauseAssignment_7");
					put(grammarAccess.getDescribeQueryAccess().getBaseAssignment_0(), "rule__DescribeQuery__BaseAssignment_0");
					put(grammarAccess.getDescribeQueryAccess().getPrefixesAssignment_1(), "rule__DescribeQuery__PrefixesAssignment_1");
					put(grammarAccess.getDescribeQueryAccess().getVariablesAssignment_3(), "rule__DescribeQuery__VariablesAssignment_3");
					put(grammarAccess.getDescribeQueryAccess().getVariablesAssignment_4(), "rule__DescribeQuery__VariablesAssignment_4");
					put(grammarAccess.getDescribeQueryAccess().getDatasetClauseAssignment_5(), "rule__DescribeQuery__DatasetClauseAssignment_5");
					put(grammarAccess.getDescribeQueryAccess().getWhereClauseAssignment_6(), "rule__DescribeQuery__WhereClauseAssignment_6");
					put(grammarAccess.getDescribeQueryAccess().getGroupClauseAssignment_7(), "rule__DescribeQuery__GroupClauseAssignment_7");
					put(grammarAccess.getDescribeQueryAccess().getHavingClauseAssignment_8(), "rule__DescribeQuery__HavingClauseAssignment_8");
					put(grammarAccess.getDescribeQueryAccess().getLimitClauseAssignment_9(), "rule__DescribeQuery__LimitClauseAssignment_9");
					put(grammarAccess.getConstructQueryAccess().getBaseAssignment_0(), "rule__ConstructQuery__BaseAssignment_0");
					put(grammarAccess.getConstructQueryAccess().getPrefixesAssignment_1(), "rule__ConstructQuery__PrefixesAssignment_1");
					put(grammarAccess.getConstructQueryAccess().getConstructTemplateAssignment_3(), "rule__ConstructQuery__ConstructTemplateAssignment_3");
					put(grammarAccess.getConstructQueryAccess().getDatasetClauseAssignment_4(), "rule__ConstructQuery__DatasetClauseAssignment_4");
					put(grammarAccess.getConstructQueryAccess().getWhereClauseAssignment_5(), "rule__ConstructQuery__WhereClauseAssignment_5");
					put(grammarAccess.getConstructQueryAccess().getGroupClauseAssignment_6(), "rule__ConstructQuery__GroupClauseAssignment_6");
					put(grammarAccess.getConstructQueryAccess().getHavingClauseAssignment_7(), "rule__ConstructQuery__HavingClauseAssignment_7");
					put(grammarAccess.getConstructQueryAccess().getLimitClauseAssignment_8(), "rule__ConstructQuery__LimitClauseAssignment_8");
					put(grammarAccess.getUpdateQueryAccess().getPrefixesAssignment_1(), "rule__UpdateQuery__PrefixesAssignment_1");
					put(grammarAccess.getUpdateQueryAccess().getOperationsAssignment_2(), "rule__UpdateQuery__OperationsAssignment_2");
					put(grammarAccess.getCreateGraphQueryAccess().getIsSilentAssignment_1(), "rule__CreateGraphQuery__IsSilentAssignment_1");
					put(grammarAccess.getCreateGraphQueryAccess().getGraphAssignment_3(), "rule__CreateGraphQuery__GraphAssignment_3");
					put(grammarAccess.getDropGraphQueryAccess().getIsSilentAssignment_1(), "rule__DropGraphQuery__IsSilentAssignment_1");
					put(grammarAccess.getDropGraphQueryAccess().getGraphAssignment_3(), "rule__DropGraphQuery__GraphAssignment_3");
					put(grammarAccess.getLoadGraphQueryAccess().getGraphAssignment_1(), "rule__LoadGraphQuery__GraphAssignment_1");
					put(grammarAccess.getLoadGraphQueryAccess().getIntoGraphAssignment_2_2(), "rule__LoadGraphQuery__IntoGraphAssignment_2_2");
					put(grammarAccess.getClearGraphQueryAccess().getUriAssignment_2_0(), "rule__ClearGraphQuery__UriAssignment_2_0");
					put(grammarAccess.getClearGraphQueryAccess().getIsDefaultAssignment_2_1(), "rule__ClearGraphQuery__IsDefaultAssignment_2_1");
					put(grammarAccess.getUsingGraphAccess().getNamedAssignment_1(), "rule__UsingGraph__NamedAssignment_1");
					put(grammarAccess.getUsingGraphAccess().getUriAssignment_2(), "rule__UsingGraph__UriAssignment_2");
					put(grammarAccess.getInsertQueryAccess().getWithGraphAssignment_0_1(), "rule__InsertQuery__WithGraphAssignment_0_1");
					put(grammarAccess.getInsertQueryAccess().getGraphAssignment_2_1(), "rule__InsertQuery__GraphAssignment_2_1");
					put(grammarAccess.getInsertQueryAccess().getPatternAssignment_3(), "rule__InsertQuery__PatternAssignment_3");
					put(grammarAccess.getInsertQueryAccess().getWhereClauseAssignment_4(), "rule__InsertQuery__WhereClauseAssignment_4");
					put(grammarAccess.getInsertDataQueryAccess().getWithGraphAssignment_0_1(), "rule__InsertDataQuery__WithGraphAssignment_0_1");
					put(grammarAccess.getInsertDataQueryAccess().getGraphAssignment_3_1(), "rule__InsertDataQuery__GraphAssignment_3_1");
					put(grammarAccess.getInsertDataQueryAccess().getPatternAssignment_4(), "rule__InsertDataQuery__PatternAssignment_4");
					put(grammarAccess.getDeleteQueryAccess().getWithGraphAssignment_0_1(), "rule__DeleteQuery__WithGraphAssignment_0_1");
					put(grammarAccess.getDeleteQueryAccess().getGraphAssignment_2_1(), "rule__DeleteQuery__GraphAssignment_2_1");
					put(grammarAccess.getDeleteQueryAccess().getPatternAssignment_3(), "rule__DeleteQuery__PatternAssignment_3");
					put(grammarAccess.getDeleteQueryAccess().getInsertPatternAssignment_4_1(), "rule__DeleteQuery__InsertPatternAssignment_4_1");
					put(grammarAccess.getDeleteQueryAccess().getWhereClauseAssignment_5(), "rule__DeleteQuery__WhereClauseAssignment_5");
					put(grammarAccess.getDeleteDataQueryAccess().getWithGraphAssignment_0_1(), "rule__DeleteDataQuery__WithGraphAssignment_0_1");
					put(grammarAccess.getDeleteDataQueryAccess().getGraphAssignment_3_1(), "rule__DeleteDataQuery__GraphAssignment_3_1");
					put(grammarAccess.getDeleteDataQueryAccess().getPatternAssignment_4(), "rule__DeleteDataQuery__PatternAssignment_4");
					put(grammarAccess.getDeleteWhereQueryAccess().getWithGraphAssignment_0_1(), "rule__DeleteWhereQuery__WithGraphAssignment_0_1");
					put(grammarAccess.getDeleteWhereQueryAccess().getPatternAssignment_4(), "rule__DeleteWhereQuery__PatternAssignment_4");
					put(grammarAccess.getDefaultDataSetAccess().getDataSetAssignment_1(), "rule__DefaultDataSet__DataSetAssignment_1");
					put(grammarAccess.getNamedDataSetAccess().getDataSetAssignment_2(), "rule__NamedDataSet__DataSetAssignment_2");
					put(grammarAccess.getServiceDataSetAccess().getDataSetAssignment_2(), "rule__ServiceDataSet__DataSetAssignment_2");
					put(grammarAccess.getWhereClauseAccess().getGroupGraphPatternAssignment_1(), "rule__WhereClause__GroupGraphPatternAssignment_1");
					put(grammarAccess.getGroupClauseAccess().getConditionAssignment_2(), "rule__GroupClause__ConditionAssignment_2");
					put(grammarAccess.getHavingClauseAccess().getConstraintAssignment_1(), "rule__HavingClause__ConstraintAssignment_1");
					put(grammarAccess.getLimitClauseAccess().getLimitAssignment_1(), "rule__LimitClause__LimitAssignment_1");
					put(grammarAccess.getSubSelectQueryAccess().getVariablesAssignment_2(), "rule__SubSelectQuery__VariablesAssignment_2");
					put(grammarAccess.getSubSelectQueryAccess().getVariablesAssignment_3(), "rule__SubSelectQuery__VariablesAssignment_3");
					put(grammarAccess.getSubSelectQueryAccess().getWhereClauseAssignment_4(), "rule__SubSelectQuery__WhereClauseAssignment_4");
					put(grammarAccess.getSubSelectQueryAccess().getGroupClauseAssignment_5(), "rule__SubSelectQuery__GroupClauseAssignment_5");
					put(grammarAccess.getSubSelectQueryAccess().getHavingClauseAssignment_6(), "rule__SubSelectQuery__HavingClauseAssignment_6");
					put(grammarAccess.getGroupGraphPatternSubAccess().getGraphPatternsAssignment_1(), "rule__GroupGraphPatternSub__GraphPatternsAssignment_1");
					put(grammarAccess.getGroupGraphPatternSubAccess().getGraphPatternsAssignment_2_1(), "rule__GroupGraphPatternSub__GraphPatternsAssignment_2_1");
					put(grammarAccess.getTriplesSameSubjectAccess().getSubjectAssignment_0(), "rule__TriplesSameSubject__SubjectAssignment_0");
					put(grammarAccess.getTriplesSameSubjectAccess().getPropertyListAssignment_1(), "rule__TriplesSameSubject__PropertyListAssignment_1");
					put(grammarAccess.getTriplesSameSubjectAccess().getPropertyListAssignment_2_1(), "rule__TriplesSameSubject__PropertyListAssignment_2_1");
					put(grammarAccess.getGroupOrUnionGraphPatternAccess().getGraphPatternsAssignment_0(), "rule__GroupOrUnionGraphPattern__GraphPatternsAssignment_0");
					put(grammarAccess.getGroupOrUnionGraphPatternAccess().getGraphPatternsAssignment_1_1(), "rule__GroupOrUnionGraphPattern__GraphPatternsAssignment_1_1");
					put(grammarAccess.getOptionalGraphPatternAccess().getGraphPatternAssignment_1(), "rule__OptionalGraphPattern__GraphPatternAssignment_1");
					put(grammarAccess.getPropertyListAccess().getPropertyAssignment_0(), "rule__PropertyList__PropertyAssignment_0");
					put(grammarAccess.getPropertyListAccess().getObjectAssignment_1(), "rule__PropertyList__ObjectAssignment_1");
					put(grammarAccess.getGraphGraphPatternAccess().getVarAssignment_1(), "rule__GraphGraphPattern__VarAssignment_1");
					put(grammarAccess.getGraphGraphPatternAccess().getPatternAssignment_2(), "rule__GraphGraphPattern__PatternAssignment_2");
					put(grammarAccess.getServiceGraphPatternAccess().getVarAssignment_1(), "rule__ServiceGraphPattern__VarAssignment_1");
					put(grammarAccess.getServiceGraphPatternAccess().getPatternAssignment_2(), "rule__ServiceGraphPattern__PatternAssignment_2");
					put(grammarAccess.getFilterPatternAccess().getExpressionAssignment_2(), "rule__FilterPattern__ExpressionAssignment_2");
					put(grammarAccess.getExistsPatternAccess().getPatternAssignment_2(), "rule__ExistsPattern__PatternAssignment_2");
					put(grammarAccess.getNotExistsPatternAccess().getPatternAssignment_3(), "rule__NotExistsPattern__PatternAssignment_3");
					put(grammarAccess.getMinusPatternAccess().getPatternAssignment_1(), "rule__MinusPattern__PatternAssignment_1");
					put(grammarAccess.getExpressionAccess().getEntriesAssignment_1_1_1(), "rule__Expression__EntriesAssignment_1_1_1");
					put(grammarAccess.getAndFilterExpressionAccess().getEntriesAssignment_1_1_1(), "rule__AndFilterExpression__EntriesAssignment_1_1_1");
					put(grammarAccess.getExpressionFilterExpressionAccess().getLeftAssignment_0(), "rule__ExpressionFilterExpression__LeftAssignment_0");
					put(grammarAccess.getExpressionFilterExpressionAccess().getOperatorAssignment_1(), "rule__ExpressionFilterExpression__OperatorAssignment_1");
					put(grammarAccess.getExpressionFilterExpressionAccess().getRightAssignment_2(), "rule__ExpressionFilterExpression__RightAssignment_2");
					put(grammarAccess.getNamedFunctionAccess().getPrefixAssignment_0(), "rule__NamedFunction__PrefixAssignment_0");
					put(grammarAccess.getNamedFunctionAccess().getNameAssignment_2(), "rule__NamedFunction__NameAssignment_2");
					put(grammarAccess.getNamedFunctionAccess().getParametersAssignment_4(), "rule__NamedFunction__ParametersAssignment_4");
					put(grammarAccess.getNamedFunctionAccess().getParametersAssignment_5_1(), "rule__NamedFunction__ParametersAssignment_5_1");
					put(grammarAccess.getSparqlFunctionAccess().getNameAssignment_0(), "rule__SparqlFunction__NameAssignment_0");
					put(grammarAccess.getSparqlFunctionAccess().getParametersAssignment_2(), "rule__SparqlFunction__ParametersAssignment_2");
					put(grammarAccess.getSparqlFunctionAccess().getParametersAssignment_3_1(), "rule__SparqlFunction__ParametersAssignment_3_1");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_0_2(), "rule__BuiltInCall__ExprAssignment_0_2");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_1_2(), "rule__BuiltInCall__ExprAssignment_1_2");
					put(grammarAccess.getBuiltInCallAccess().getLeftAssignment_2_2(), "rule__BuiltInCall__LeftAssignment_2_2");
					put(grammarAccess.getBuiltInCallAccess().getRightAssignment_2_4(), "rule__BuiltInCall__RightAssignment_2_4");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_3_2(), "rule__BuiltInCall__ExprAssignment_3_2");
					put(grammarAccess.getBuiltInCallAccess().getVarAssignment_4_2(), "rule__BuiltInCall__VarAssignment_4_2");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_5_2(), "rule__BuiltInCall__ExprAssignment_5_2");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_6_2(), "rule__BuiltInCall__ExprAssignment_6_2");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_7_2(), "rule__BuiltInCall__ExprAssignment_7_2");
					put(grammarAccess.getBuiltInCallAccess().getIfExprAssignment_8_2(), "rule__BuiltInCall__IfExprAssignment_8_2");
					put(grammarAccess.getBuiltInCallAccess().getThenExprAssignment_8_4(), "rule__BuiltInCall__ThenExprAssignment_8_4");
					put(grammarAccess.getBuiltInCallAccess().getElseExprAssignment_8_6(), "rule__BuiltInCall__ElseExprAssignment_8_6");
					put(grammarAccess.getBuiltInCallAccess().getLeftAssignment_9_2(), "rule__BuiltInCall__LeftAssignment_9_2");
					put(grammarAccess.getBuiltInCallAccess().getRightAssignment_9_4(), "rule__BuiltInCall__RightAssignment_9_4");
					put(grammarAccess.getBuiltInCallAccess().getLeftAssignment_10_2(), "rule__BuiltInCall__LeftAssignment_10_2");
					put(grammarAccess.getBuiltInCallAccess().getRightAssignment_10_4(), "rule__BuiltInCall__RightAssignment_10_4");
					put(grammarAccess.getBuiltInCallAccess().getLeftAssignment_11_2(), "rule__BuiltInCall__LeftAssignment_11_2");
					put(grammarAccess.getBuiltInCallAccess().getRightAssignment_11_4(), "rule__BuiltInCall__RightAssignment_11_4");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_12_2(), "rule__BuiltInCall__ExprAssignment_12_2");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_13_2(), "rule__BuiltInCall__ExprAssignment_13_2");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_14_2(), "rule__BuiltInCall__ExprAssignment_14_2");
					put(grammarAccess.getBuiltInCallAccess().getExprAssignment_15_2(), "rule__BuiltInCall__ExprAssignment_15_2");
					put(grammarAccess.getAggregateAccess().getIsDistinctAssignment_0_3(), "rule__Aggregate__IsDistinctAssignment_0_3");
					put(grammarAccess.getAggregateAccess().getIsAllAssignment_0_4_0(), "rule__Aggregate__IsAllAssignment_0_4_0");
					put(grammarAccess.getAggregateAccess().getExprAssignment_0_4_1(), "rule__Aggregate__ExprAssignment_0_4_1");
					put(grammarAccess.getAggregateAccess().getExprAssignment_1_2(), "rule__Aggregate__ExprAssignment_1_2");
					put(grammarAccess.getAggregateAccess().getExprAssignment_2_2(), "rule__Aggregate__ExprAssignment_2_2");
					put(grammarAccess.getAggregateAccess().getExprAssignment_3_2(), "rule__Aggregate__ExprAssignment_3_2");
					put(grammarAccess.getAggregateAccess().getExprAssignment_4_2(), "rule__Aggregate__ExprAssignment_4_2");
					put(grammarAccess.getAggregateAccess().getExprAssignment_5_2(), "rule__Aggregate__ExprAssignment_5_2");
					put(grammarAccess.getAggregateAccess().getIsDistinctAssignment_6_3(), "rule__Aggregate__IsDistinctAssignment_6_3");
					put(grammarAccess.getAggregateAccess().getExprAssignment_6_4(), "rule__Aggregate__ExprAssignment_6_4");
					put(grammarAccess.getAggregateAccess().getExprAssignment_6_5_1(), "rule__Aggregate__ExprAssignment_6_5_1");
					put(grammarAccess.getAggregateAccess().getValueAssignment_6_6_3(), "rule__Aggregate__ValueAssignment_6_6_3");
					put(grammarAccess.getExprAggArgAccess().getIsDistinctAssignment_1(), "rule__ExprAggArg__IsDistinctAssignment_1");
					put(grammarAccess.getExprAggArgAccess().getExprAssignment_2(), "rule__ExprAggArg__ExprAssignment_2");
					put(grammarAccess.getUnNamedVariableAccess().getNameAssignment_1(), "rule__UnNamedVariable__NameAssignment_1");
					put(grammarAccess.getNamedVariableAccess().getPrefixAssignment_0(), "rule__NamedVariable__PrefixAssignment_0");
					put(grammarAccess.getNamedVariableAccess().getNameAssignment_2(), "rule__NamedVariable__NameAssignment_2");
					put(grammarAccess.getBlankNodeAccess().getNameAssignment_1(), "rule__BlankNode__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getIRIAccess().getValueAssignment_1(), "rule__IRI__ValueAssignment_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment_0(), "rule__StringValue__ValueAssignment_0");
					put(grammarAccess.getStringValueAccess().getTagAssignment_1(), "rule__StringValue__TagAssignment_1");
					put(grammarAccess.getIntegerValueAccess().getValueAssignment_0(), "rule__IntegerValue__ValueAssignment_0");
					put(grammarAccess.getIntegerValueAccess().getTagAssignment_1(), "rule__IntegerValue__TagAssignment_1");
					put(grammarAccess.getTypeTagAccess().getTypeAssignment_1(), "rule__TypeTag__TypeAssignment_1");
					put(grammarAccess.getLangTagAccess().getLangAssignment_1(), "rule__LangTag__LangAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.emftriple.query.ui.contentassist.antlr.internal.InternalSparqlParser typedParser = (com.emftriple.query.ui.contentassist.antlr.internal.InternalSparqlParser) parser;
			typedParser.entryRuleSPARQLQuery();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SparqlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SparqlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
