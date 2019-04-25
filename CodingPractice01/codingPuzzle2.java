import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class codingPuzzle2 {
  public static void main(String[] args) {
    int[] A = { 8, 7, 2, 5, 3, 1 };
    int[] y = { 2, 3, 8, 9, 10 };
    int sum = 10;
    getPairSum(A, sum);
    System.out.println(getPairSum2(A, sum));
    reverseAnArray(y);
  }

  public static void getPairSum(int[] A, int sum) {
    Arrays.sort(A);
    int low = 0;
    int high = A.length - 1;
    while (low < high) {
      if (A[low] + A[high] == sum) {
        System.out.println("Pair found");
        return;
      } else if (A[low] + A[high] < sum) {
        low++;
      } else {
        high++;
      }
    }
  }

  public static boolean getPairSum2(int[] A, int sum) {
    HashMap<Integer, Integer> map = new HashMap<>();
    boolean res = false;
    for (int i = 0; i < A.length; i++) {
      if (map.containsKey(sum - A[i])) {
        res = true;
      }
      map.put(A[i], i);
    }
    return res;
  }

  public static void reverseAnArray(int[] A) {
    Stack<Integer> st = new Stack<>();
    int j = 0;
    int[] temp = new int[A.length];
    for (var i = 0; i < A.length; i++) {
      st.push(A[i]);
    }
    while (!st.empty()) {
      temp[j++] = st.pop();
    }
    for (int x : temp) {
      System.out.println(x);
    }
  }

  public static void reverseAnArray1(int[] A) {
    var j = A.length - 1;
    var i = 0;
    while (i < j) {
      int temp = A[i];
      A[i] = A[j];
      A[j] = temp;
      i++;
      j--;

    }
    for (var x : A) {
      System.out.println(x);
    }
  }

}