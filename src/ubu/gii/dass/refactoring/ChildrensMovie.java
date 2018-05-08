package ubu.gii.dass.refactoring;

public class ChildrensMovie extends MovieType {
	
	public ChildrensMovie() {
		setInitialAmount(1.5);
		setNumFreeDays(3);
		setPriceRate(1.5);
	}

	@Override
	public int getPriceCode() {
		return MovieType.CHILDRENS;
	}

}
