package ubu.gii.dass.refactoring;

public class NewReleaseMovie extends MovieType {

	public NewReleaseMovie() {
		setInitialAmount(0);
		setNumFreeDays(0);
		setPriceRate(3);
	}

	@Override
	public int getPriceCode() {
		return MovieType.NEW_RELEASE;
	}

}
