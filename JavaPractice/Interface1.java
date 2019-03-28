
interface InterfaceDemo {

  void method1(String str);

  default void log(String str) {
    System.out.println("I1 logging::" + str);
  }
}

class testInterface implements InterfaceDemo {
  public void method1(String arg) {
    System.out.println(arg);
  }
}

public class Interface1 {
  public static void main(String[] args) {
    testInterface intr = new testInterface();
    intr.method1("Hello Default method in interface");
    intr.log("Hello Baby");
  }
}