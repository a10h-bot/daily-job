
//move zeros to the end
import java.util.Arrays;

class cal {
  public int[] move(int[] x) {
    int i = 0;
    int j = 0;
    while (i < x.length) {
      if (x[i] == 0) {
        i++;
      } else {
        x[j] = x[i];
        j++;
        i++;
      }
    }
    while (j < x.length) {
      x[j] = 0;
      j++;
    }
    return x;
  }
}

public class sol1 {
  public static void main(String[] args) {
    int[] a = new int[] { 3, 8, 9, 0, 5, 0, 8, 3, 2, 0, 1 };
    cal c = new cal();
    System.out.println(Arrays.toString(c.move(a)));
  }
}