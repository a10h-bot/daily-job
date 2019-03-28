import java.util.Arrays;

interface interface1 {
  public static final int x = 6;

  public abstract String saymeHi();
}

interface interface2 extends interface1 {
  String s = " I am from interface 2";

  int[] method2();
}

class demo implements interface2 {
  public String saymeHi() {
    return "Hello buddy !";
  }

  public void method() {
    System.out.println(x + 1);
  }

  public int[] method2() {
    return new int[] { 3, 8, 9, 10, 18 };
  }
}

public class interfaceDemo {
  public static void main(String[] args) {
    interface2 ref = new demo();
    System.out.println(ref.saymeHi());
    new demo().method();

    System.out.println(Arrays.toString(ref.method2()));
  }
}