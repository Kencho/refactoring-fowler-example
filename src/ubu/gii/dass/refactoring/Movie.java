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
	private int _oldPriceCode;
	private MovieType _type;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return _type.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		_type = createMovieType(priceCode);
		_oldPriceCode = priceCode;
	}

	public String getTitle() {
		return _title;
	}
	
	private static MovieType createMovieType(int priceCode) {
		switch (priceCode) {
		case MovieType.REGULAR:
			return new RegularMovie();
		case MovieType.NEW_RELEASE:
			return new NewReleaseMovie();
		case MovieType.CHILDRENS:
			return new ChildrensMovie();
		default:
			throw new RuntimeException("Wrong type");
		}
	}
}
