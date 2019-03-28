public class NullPointerExpetionDemo {
  public static void main(String[] args) throws NullPointerException {
    String S1 = null;
    String S2 = "Hello";
    try {
      boolean areEqual = S1.equals(S2);
      System.out.println(areEqual);
    } catch (NullPointerException e) {

    }

  }
}