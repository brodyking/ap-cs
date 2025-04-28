import java.lang.Math;
import java.util.Random;

public class Feeder {
	/**
	 * The amount of food, in grams, currently in the bird feeder; initialized in
	 * the constructor and
	 * always greater than or equal to zero
	 */
	private int currentFood;
	private Random rand = new Random();

	public Feeder(int cf) {
		currentFood = cf;
	}

	/**
	 * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
	 * as described in part (a)
	 * Precondition: numBirds > 0
	 */
	public void simulateOneDay(int numBirds) {
		/* to be implemented in part (a) */
		double conditions = Math.random();
		if (conditions <= 95) {
			for (int i = 0; i < numBirds; i++) {
				currentFood = currentFood - (rand.nextInt(40) + 10);
			}
		} else {
			currentFood = 0;
		}
	}

	/**
	 * Returns the number of days birds or a bear found food to eat at the feeder in
	 * this simulation,
	 * as described in part (b)
	 * Preconditions: numBirds > 0, numDays > 0
	 */
	public int simulateManyDays(int numBirds, int numDays) {
		/* to be implemented in part (b) */
		int cnt = 0;
		for (int i = 0; i < numDays; i++) {
			int old = currentFood;
			simulateOneDay(numBirds);
			if (currentFood == 0 || currentFood < 0) {
				break;
			} else if (currentFood < old) {
				cnt++;
			}
		}
		return cnt;
	}

	public String toString() {
		return "" + currentFood;
	}
}
