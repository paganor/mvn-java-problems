package api;

public class PlateCalculator {
	// final ints
	private final double weight;
	private final int barWeight;

	// use ints
	private int fortyFives;
	private int thirtyFives;
	private int twentyFives;
	private int tens;
	private int fives;
	private int twoAndAHalfs;
	
	public PlateCalculator(double weight, int barWeight) {
		this.weight = weight;
		this.barWeight = barWeight;
		this.calculate();
	}
	
	private void calculate() {
		// initalize variables
		fortyFives = thirtyFives = twentyFives = tens = fives = twoAndAHalfs = 0;

		double remainder = (weight - barWeight) / 2;
	
		while (remainder > 0) {
			if (remainder >= 45) {
				++fortyFives;
				remainder -= 45;
			} else if (remainder >= 35) {
				++thirtyFives;
				remainder -= 35;
			} else if (remainder >= 25) {
				++twentyFives;
				remainder -= 25;
			} else if (remainder >= 10 ) {
				++tens;
				remainder -= 10;
			} else if (remainder >= 5) {
				++fives;
				remainder -= 5;
			} else {
				++twoAndAHalfs;
				remainder -= 2.5;
			}
		}	
	}
	
	// getter methods
	public int getFortyFives() {
		return fortyFives;
	}
	
	public int getThirtyFives() {
		return thirtyFives;
	}
	
	public int getTwentyFives() {
		return twentyFives;
	}
	
	public int getTens() {
		return tens;
	}
	
	public int getFives() {
		return fives;
	}
	
	public int getTwoAndAHalfs() {
		return twoAndAHalfs;
	}
}
