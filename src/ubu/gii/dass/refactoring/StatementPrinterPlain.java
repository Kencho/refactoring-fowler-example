package ubu.gii.dass.refactoring;

public class StatementPrinterPlain implements IStatementPrinter {

	@Override
	public String statementHeader(String customerName) {
		return "Rental Record for " + customerName + "\n";
	}

	@Override
	public String statementLine(String title, double amount) {
		return "\t" + title + "\t" + String.valueOf(amount) + "\n";
	}

	@Override
	public String statementAmountTotal(double totalAmount) {
		return "Amount owed is " + String.valueOf(totalAmount) + "\n";
	}

	@Override
	public String statementPointsTotal(int totalFrequentRenterPoints) {
		return "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
	}

}
