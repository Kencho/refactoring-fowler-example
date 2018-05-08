package ubu.gii.dass.refactoring;

public class RegularMovie extends MovieType {
	
	public RegularMovie() {
		setInitialAmount(2);
		setNumFreeDays(2);
		setPriceRate(1.5);
	}

	@Override
	public int getPriceCode() {
		return MovieType.REGULAR;
	}

}
