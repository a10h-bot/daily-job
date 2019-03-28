interface Animal {
  static void run() {
    System.out.println("Animal is running");
  }
}

public class staticMethodDemo {
  public static void main(String[] args) {

    Animal.run();
  }
}