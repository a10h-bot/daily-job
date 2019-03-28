
class A {
  interface B {
    void m();
  }

  int m1() {
    return 10;
  }
}

class C implements A.B {
  public void m() {
    System.out.println("I am from inside of interface");
  }

  public void m1() {
    System.out.println("Hello World !");
  }
}

public class interfaceinClass {
  public static void main(String[] args) {
    A.B ref = new C();
    ref.m();
    C ref2 = new C();
    ref2.m1();
    A ref3 = new A();
    System.out.println(ref3.m1());

  }
}