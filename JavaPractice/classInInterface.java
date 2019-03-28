interface A {
  class B {
    void m() {
      System.out.println("Hello World!");
    }
  }

  void printMyName();
}

public class classInInterface implements A {
  public void printMyName() {
    System.out.println(" I am geeky");
  }

  public static void main(String[] args) {
    A.B ref = new A.B();
    ref.m();
    new classInInterface().printMyName();
  }
}