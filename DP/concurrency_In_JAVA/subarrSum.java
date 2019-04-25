public class subarrSum {
  private static int subarraySum(int[] arr) {
    var res = 0;
    for (var i = 0; i < arr.length; i++) {
      for (var j = i; j < arr.length; j++) {
        for (var k = i; k <= j; k++) {
          res += arr[k];
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] A = new int[] { 1, 3, 7 };
    System.out.println(subarraySum(A));
  }

}