package ubu.gii.dass.refactoring;

/**
* Tema  Refactorizaciones 
*
* Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones gen�ricas de java 1.5
*
* @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
* @version 1.1
* @see java.io.File
*
*/
import java.util.*;

public class Customer {
	private String _name;
	private List<Rental> _rentals;

	public Customer(String name) {
		_name = name;
		_rentals = new ArrayList<Rental>();

	};

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	};

	public String statement(StatementPrinterPlain printer) {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		String result = printer.statementHeader(getName());
		while (rentals.hasNext()) {
			double thisAmount = 0;
			Rental each = rentals.next();
			// determine amounts for each line
			thisAmount = each.getAmount();

			// add frequent renter points
			frequentRenterPoints += each.getFrequentRenterPoints();
			// show figures for this rental
			result += printer.statementLine(each.getMovie().getTitle(), thisAmount);
			totalAmount += thisAmount;
		}
		// add footer lines
		result += printer.statementAmountTotal(totalAmount);
		result += statementPointsTotal(printer, frequentRenterPoints);
		return result;
	}

	private String statementPointsTotal(StatementPrinterPlain printer, int totalFrequentRenterPoints) {
		return "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
	}

}
