package ubu.gii.dass.refactoring;

public class StatementPrinterPlain {

	public String statementHeader(String customerName) {
		return "Rental Record for " + customerName + "\n";
	}

	public String statementLine(String title, double amount) {
		return "\t" + title + "\t" + String.valueOf(amount) + "\n";
	}

	public String statementAmountTotal(double totalAmount) {
		return "Amount owed is " + String.valueOf(totalAmount) + "\n";
	}

	public String statementPointsTotal(int totalFrequentRenterPoints) {
		return "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
	}

}
