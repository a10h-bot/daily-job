import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point() {

  }

  public static List<Integer> getNum() {
    return List.of(1, 8, 2, 4, 5, 7, 10);

  }

  private static int m1(int a, int b) { // method overloading
    return a + b;
  }

  private static int m1(int a, int b, int c) {
    return a + b + c;
  }

  private static double m1(double f) {
    return f * 10;
  }

  public static void main(String[] args) {
    // Point p1 = new Point(4, 9);
    System.out.println(m1(8, 9));
    System.out.println(m1(5, 10, 8));
    System.out.println(m1(8.6));
    // System.out.println(getNum());
    // System.out.println(getString());
  }

  private static Collection<String> getString() {
    Collection<String> str = Arrays.asList("Hello", " Java ", " Colection");
    return str;
  }

}
