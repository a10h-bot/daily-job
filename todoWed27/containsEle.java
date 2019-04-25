import java.util.Arrays;

//How to check if array contains a number in Java ?
//linear serach or binary search(is arrays are sorted)
public class containsEle {
  public static void main(String[] args) {
    Integer[] array = new Integer[] { 2, 7, 8, 19, 12, 6 };
    System.out.println(isContains(array, 19));// true
  }

  public static boolean isContains(Integer[] A, Integer el) {
    return Arrays.asList(A).contains(el);
  }
}