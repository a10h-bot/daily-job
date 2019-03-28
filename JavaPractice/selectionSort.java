
import java.util.Arrays;

class Sol {
  public static String sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[min]) {
          int temp = array[min];
          array[min] = array[j];
          array[j] = temp;
        }
      }
    }
    return Arrays.toString(array);
  }
}

public class selectionSort {
  public static void main(String[] args) {
    int[] A = new int[] { 3, 9, 10, 70, 80, 100, 2, 3, 1, 0, 4, 2, 1 };
    System.out.println(Sol.sort(A));
  }
}