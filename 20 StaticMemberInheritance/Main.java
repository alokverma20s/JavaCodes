class  Parent{
    public static void f1(){
        System.out.println("Hello");
    }
}
class  Child extends Parent{
    public static void f1(){
        System.out.println("Yo Man");
    }
}
public class Main {
    public static void main(String[] args) {
        Child.f1();
    }
}
