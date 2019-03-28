import java.io.IOException;

public class throwDemo {
  public static void main(String[] args) throws NullPointerException, ArithmeticException {
    try {
      throw new ClassCastException();
    } catch (Exception e) {
      try {
        throw new IOException();
      } catch (Exception e1) {
        System.out.println("Exception occured");
      }
    }

  }
}
