package ubu.gii.dass.refactoring;

public abstract class MovieType {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	public abstract int getPriceCode();

	static MovieType createMovieType(int priceCode) {
		switch (priceCode) {
		case REGULAR:
			return new RegularMovie();
		case NEW_RELEASE:
			return new NewReleaseMovie();
		case CHILDRENS:
			return new ChildrensMovie();
		default:
			throw new RuntimeException("Wrong type");
		}
	}
	
}
