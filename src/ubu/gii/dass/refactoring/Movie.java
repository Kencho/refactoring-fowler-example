package ubu.gii.dass.refactoring;

/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	private String _title;
	private MovieType _type;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return getType().getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		setType(MovieType.createMovieType(priceCode));
	}

	public String getTitle() {
		return _title;
	}

	MovieType getType() {
		return _type;
	}

	void setType(MovieType type) {
		this._type = type;
	}
}
