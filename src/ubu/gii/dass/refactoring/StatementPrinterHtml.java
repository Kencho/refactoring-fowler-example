package ubu.gii.dass.refactoring;

public class StatementPrinterHtml implements IStatementPrinter {

	@Override
	public String statementHeader(String customerName) {
		return "<h1>Rental Record for " + customerName + "</h1>";
	}

	@Override
	public String statementLine(String title, double amount) {
		return "<h2>" + title + " " + String.valueOf(amount) + "</h2>";
	}

	@Override
	public String statementAmountTotal(double totalAmount) {
		return "<p>Amount owed is " + String.valueOf(totalAmount) + "</p>";
	}

	@Override
	public String statementPointsTotal(int totalFrequentRenterPoints) {
		return "<p>You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points</p>";
	}

}
