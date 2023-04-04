class  A{
    int a;
    public A(){
        System.out.println("A");
    }
    public A(int a){
        System.out.println("aA");
    }
}
class B extends A{
    int b;
    public B(){
        super(5);
        System.out.println("B");
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a + obj.b);
    }
}
