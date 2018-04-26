package ubu.gii.dass.refactoring;

public interface IStatementPrinter {

	String statementHeader(String customerName);

	String statementLine(String title, double amount);

	String statementAmountTotal(double totalAmount);

	String statementPointsTotal(int totalFrequentRenterPoints);

}