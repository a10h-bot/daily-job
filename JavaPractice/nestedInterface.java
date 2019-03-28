interface A {
  int value = 10;

  default void printMyName() {
    System.out.println("My name is Tom");
  }

  interface A1 {
    default String m1() {
      return "I am Jerry";
    }
  }
}

interface B {
  float x = 100;
}

class testInteface implements A, A.A1, B {

}

public class nestedInterface {
  public static void main(String[] args) {
    A.A1 ref = new testInteface();
    System.out.println(B.x);
    System.out.println(ref.m1());
    ((A) new testInteface()).printMyName();

  }
}