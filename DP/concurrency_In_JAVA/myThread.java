// //Thread creation Thread class

// class thread_demo extends Thread {
//   public void run() {
//     System.out.println("Thread started");
//   }
// }

// public class myThread {
//   public static void main(String[] args) {
//     new thread_demo().start();

//     System.out.println("Hello from main thread");
//   }
// }

//Thread creation through Runnable interface

class runnable_demo implements Runnable {
  public void run() {
    System.out.println("child thread started");
  }
}

public class myThread {
  public static void main(String[] args) {
    runnable_demo t = new Thread();

  }
}
