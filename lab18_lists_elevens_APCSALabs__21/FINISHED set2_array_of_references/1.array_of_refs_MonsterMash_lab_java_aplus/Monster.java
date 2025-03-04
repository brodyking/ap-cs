//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Monster implements Comparable<Monster>
{
	//add stuff like methods and instance variables
	
	private int height, weight, age;

	public Monster() {
		height = 0;
		weight = 0;
		age = 0;
	}

	public Monster(int h,int w, int a) {
		height = h;
		weight = w;
		age = a;
	}
	
	//you will definitely want to use "get" methods to access the height,
	//weight and age of a Monster
	public int getHeight() { return height;	}
	public int getWeight() { return weight;	}
	public int getAge() { return age; }

	public void setHeight(int h) { height = h; }
	public void setWeight(int w) { weight = w; }
	public void setAge(int a) { age = a; }
	
	/*Arrays.sort uses the compareTo method
	 *Writing the compareTo method here overloads the default version
	 *Order of precedence: height, weight, age*/
	public int compareTo(Monster other)
	{
		int heightOther = other.getHeight();
		int weightOther = other.getWeight();
		int ageOther = other.getAge();


		if (height > heightOther) {
			return 1;
		} else if (height < heightOther) {
			return -1;
		} else {
			if (weight > weightOther) {
				return 1;
			} else if (weight < weightOther) {
				return -1;
			} else {

				if (age > ageOther) {
					return 1;
				} else if (age < ageOther) {
					return -1;
				} else {
					return 0;
				}

			}

		}
	}

	public String toString() {
		return height + " " + weight + " " + age;
	}
}