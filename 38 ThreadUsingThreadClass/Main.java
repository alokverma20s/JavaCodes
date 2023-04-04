class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i + " Thread A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i + " Thread B");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        // a.setPriority(10);
        b.start();
        a.start();
    }
}
