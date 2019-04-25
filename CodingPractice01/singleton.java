public class singleton {
  private static singleton instance = null;

  private singleton() {
  }

  public static singleton getInstance() {
    if (instance == null) {
      instance = new singleton();
    }
    return instance;
  }
}

// __________________________________________________________________

class singleton1 {
  private singleton1() {

  }

  public static singleton1 getInstance() {
    return singleton1InstanceHolder.INSTANCE;
  }

  private static class singleton1InstanceHolder {
    private static final singleton1 INSTANCE = new singleton1();
  }
}