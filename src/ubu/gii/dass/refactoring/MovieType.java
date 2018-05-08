package ubu.gii.dass.refactoring;

public abstract class MovieType {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	private double initialAmount = 0;
	private double numFreeDays = 0;
	private double priceRate = 1.0;

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

	double getInitialAmount() {
		return initialAmount;
	}

	void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	double getNumFreeDays() {
		return numFreeDays;
	}

	void setNumFreeDays(double numFreeDays) {
		this.numFreeDays = numFreeDays;
	}

	double getPriceRate() {
		return priceRate;
	}

	void setPriceRate(double priceRate) {
		this.priceRate = priceRate;
	}

}
