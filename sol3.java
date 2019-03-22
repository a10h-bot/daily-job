class A {
  public int removeElement(int[] A, int elem) {
    int i = 0;
    int j = 0;
    while (j < A.length) {
      if (A[j] != elem) {
        A[i] = A[j];
        i++;
      }
      j++;
    }
    return i;
  }
}

public class sol3 {
  public static void main(String[] args) {
    int[] array = new int[] { 2, 7, 8, 2, 0, 4, 2, 5, 2 };
    System.out.println(new A().removeElement(array, 2));
  }
}