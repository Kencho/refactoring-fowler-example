package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones
 * gen�ricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.1
 * @see java.io.File
 * 
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	double getAmount() {
		double result = 0;
		MovieType movieType = _movie.getType();
		double initialAmount = movieType.getInitialAmount();
		double numFreeDays = movieType.getNumFreeDays();
		double priceRate = movieType.getPriceRate();
		result = initialAmount;
		if (getDaysRented() > numFreeDays)
			result += (getDaysRented() - numFreeDays) * priceRate;
		return result;
	}

	int getFrequentRenterPoints() {
		int result = 0;
		result++;
		// add bonus for a two day new release rental
		if ((getMovie().getPriceCode() == MovieType.NEW_RELEASE)
				&& getDaysRented() > 1)
			result++;
		return result;
	}

}
