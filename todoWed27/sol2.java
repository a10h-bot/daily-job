import java.util.Arrays;

class cal2 {
  public static int[] removeDup(int[] number) {
    int[] o = new int[number.length - 1];
    int index = 0;
    int i = 0;
    int j = 1;
    while (i < number.length) {
      if (number[i] != number[j]) {
        o[index] = number[j];
        index++;
      } else {
        i++;
        j++;
      }
    }
    return o;
  }
}

public class sol2 {
  public static void main(String[] args) {
    int[] num = { 1, 2, 2, 3, 3 };
    System.out.println(Arrays.toString(cal2.removeDup(num)));

  }

}