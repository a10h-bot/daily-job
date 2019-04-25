import java.util.Arrays;

// For example,
// Given s = "the sky is blue",
// return "blue is sky the".
class cal1 {
  // public static String reverse(String str) {
  // String[] charArray = str.split(" ");
  // String o = "";
  // for (int i = charArray.length - 1; i >= 0; i--) {
  // o += charArray[i] + " ";
  // }
  // return o;
  // }

  public static String reverse(String str) {
    char[] s = str.toCharArray();
    int i = 0;
    for (int j = 0; j < s.length; j++) {
      if (s[j] == ' ') {
        reverseMethod(s, i, j - 1);
        i = j + 1;
      }
    }
    reverseMethod(s, i, s.length - 1);
    reverseMethod(s, 0, s.length - 1);
    return Arrays.toString(s);
  }

  public static void reverseMethod(char[] s, int i, int j) {
    while (i < j) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      i++;
      j--;
    }

  }

}

public class reverseWords {
  public static void main(String[] args) {
    String s = "the sky is blue";
    System.out.println(String.join("", cal1.reverse(s)));

  }
}