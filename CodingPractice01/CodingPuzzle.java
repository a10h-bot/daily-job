import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CodingPuzzle {
  public static void main(String[] args) {
    String S1 = "maryland";
    String S2 = "landmary";
    System.out.println(anagramChecker(S1, S2));
    String str = "Hello";
    System.out.println(reverse(str));
    String D = "HellooH";
    String P = "abcdefghija";
    printDuplicate(D);
    getNonRepeated(P);
    String s = "098234";
    System.out.println(isOnlyDigit(s));
    getVowels("heiolp");
    int[] input = { 4, -6, 3, -1, 4, 2, 7 };
    System.out.println(checker(input));
    int[] x = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
    sortBinaryArrays(x);
    int[] Array = new int[] { -1, 5, -3, -2, 6, 2, 0 };
    threeSum1(Array);
  }

  // ___________________________________________________________________________
  // check if two strings are anagram of each other
  public static boolean anagramChecker(String s1, String s2) {
    if (s1 == null || s2 == null)
      return true;
    if (s1.length() != s2.length())
      return false;
    boolean res = true;
    char[] charArray = s1.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (var i = 0; i < charArray.length; i++) {
      map.put(charArray[i], null);
    }
    for (var i = 0; i < s2.length(); i++) {
      if (!map.containsKey(s2.charAt(i))) {
        res = false;
      } else
        res = true;
    }
    return res;
  }

  // ___________________________________________________________________________________
  // reverse a string
  public static String reverse(String S) {
    var x = "";
    for (var i = S.length() - 1; i >= 0; i--) {
      x += S.charAt(i);
    }
    return x;
  }
  // _____________________________________________________________________________________
  // public static String reverseRec(String S) {
  // if (S.substring(S.length() - 1)) {

  // }
  // }
  // print duplicate in a string
  public static void printDuplicate(String S) {
    char[] A = S.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (var i = 0; i < A.length; i++) {
      if (map.containsKey(A[i])) {
        map.put(A[i], map.get(A[i]) + 1);
      } else {
        map.put(A[i], 1);
      }
    }
    Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
    for (Map.Entry<Character, Integer> x : entrySet) {
      if (x.getValue() > 1) {
        System.out.println(x.getKey());
      }
    }
    System.out.println(map);
  }

  // _____________________________________________________________________________
  // How do you print the first non-repeated character from a string?
  public static void getNonRepeated(String S) {
    char[] A = S.toCharArray();
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    for (var i = 0; i < A.length; i++) {
      if (map.containsKey(A[i])) {
        map.put(A[i], map.get(A[i]) + 1);
      } else {
        map.put(A[i], 1);
      }
    }
    Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
    for (Map.Entry<Character, Integer> x : entrySet) {
      if (x.getValue() == 1) {
        System.out.println(x.getKey());
        return;
      }
    }
  }

  // ______________________________________________________________________________
  // How do you check if a string contains only digits
  public static boolean isDigit(char c) {
    int x = (int) c - (int) '0';
    if (x < 0 || x > 9) {
      return false;
    }
    return true;

  }

  public static boolean isOnlyDigit(String s) {

    for (int i = 0; i < s.length(); i++) {
      if (!isDigit(s.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  // ____________________________________________________________________________
  // How to count Vowels and Consonants in Java String Word
  // S = " heiolp" // vowels : { a, i, e ,o , u}
  public static void getVowels(String S) {
    Set<Character> vowelSet = new HashSet<>();
    String V = "aeiou";
    int V_count = 0;
    int C_count = 0;
    for (var x : V.toCharArray()) {
      vowelSet.add(x);
    }
    for (var i = 0; i < S.length(); i++) {
      if (vowelSet.contains(S.charAt(i))) {
        V_count++;
      } else {
        C_count++;
      }

    }
    System.out.println("Vowels count are " + V_count + " Consonants count are " + C_count);
  }

  // _____________________________________________________________________________
  // check if a subArray with zero sum exists
  // input = { 4, -6, 3, -1, 4, 2, 7 }; o/p : {4,6,3,1 };
  public static boolean checker(int[] A) {
    Set<Integer> set = new HashSet<>();
    set.add(0);
    int sum = 0;
    boolean res = false;
    for (var i = 0; i < A.length; i++) {
      sum += A[i];
      if (set.contains(sum)) {
        res = true;
      }
    }
    return res;
  }

  // ________________________________________________________________________________
  // int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
  public static void sortBinaryArrays(int[] A) {
    var j = 0;
    for (var i = 0; i < A.length; i++) {
      if (A[i] == 0) {
        A[j++] = A[i];
      }
    }
    for (var i = j; i < A.length; i++) {
      A[i] = 1;
    }
    System.out.println(Arrays.toString(A));
  }

  // __________________________________________________________________________________
  // 3.) Given an array containing positive and negative numbers.
  // Find the combinations of elements in array so that the sum of 3 elements is
  // 0.
  // Array = [-1, 5, -3, -2, 6, 2,0] Output: [5, -2, -3], [-2, 2, 0]
  public static void threeSum1(int[] A) {
    Arrays.sort(A);
    for (var i = 0; i < A.length - 2; i++) {
      var l = i + 1;
      var r = A.length - 1;
      while (l < r) {
        var sum = A[i] + A[l] + A[r];
        if (sum == 0) {
          System.out.println(A[i] + " " + A[l] + " " + A[r]);
        } else if (sum < 0) {
          l++;
        } else {
          r--;
        }
      }
    }
  }

  public static void threeSum(int[] A) {

    for (var i = 0; i < A.length - 2; i++) {
      for (var j = i + 1; j < A.length - 1; j++) {
        for (var k = j + 1; k < A.length; k++) {
          if (A[i] + A[j] + A[k] == 0) {
            System.out.println(A[i] + " " + A[j] + " " + A[k]);
          }
        }
      }
    }
  }
}