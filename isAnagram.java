public class isAnagram {
  public static void main(String[] args) {
    System.out.println(isAnagramm("table", "Anand"));
  }

  final static int LETTERS_LEN = 256;

  public static boolean isAnagramm(String s1, String s2) {
    if (s1 == null || s2 == null)
      return false;
    int len = s1.length();
    if (len != s2.length() || len < 2)
      return false;

    int[] letters = new int[LETTERS_LEN];

    for (int i = 0; i < len; i++) {
      letters[s1.charAt(i)]++;
      letters[s2.charAt(i)]--;
    }

    for (int i = 0; i < LETTERS_LEN; i++) {
      if (letters[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
