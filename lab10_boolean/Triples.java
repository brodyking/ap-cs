// A+ Computer Science-www.apluscompsci.com
// Name - 
// Date -
// Class -
// Lab-
import static java.lang.System.*;
public class Triples {
  private int number;
  public Triples() {
    this(0);
  }
  public Triples(int num) {
    setNum(num);
  }
  public void setNum(int num) {
    number = num;
  }
  private int greatestCommonFactor(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    for (int i = max / 2; i >= 2; i--) {
      if (a % i == 0 && b % i == 0 && c % i == 0)
        return i;
    }
    return 1;
  }
  
  // WHY WAS THIS SO HARD
  
  public String toString() {
    String output = "";
    for (int a = 1; a < number; a++) {
      for (int b = a; b < number; b++) {
        for (int c = a; c < number; c++) {
          if (a * a + b * b == c * c&& 
          	(c % 2 == 1 && (a % 2 == 0 && b % 2 == 1 || a % 2 == 1 && b % 2 == 0))
          		 && greatestCommonFactor(a, b, c) == 1)
            output += a + " " + b + " " + c + "\n";
        }
      }
    }
    return output + "\n";
  }
}