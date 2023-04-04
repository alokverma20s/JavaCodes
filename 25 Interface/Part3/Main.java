interface I1{
    void f1();
}
interface I2{
    void  f2();
}

class A  implements I1, I2{
    public void f1(){System.out.println("I1");}
    public void f2(){System.out.println("I2");}
    public void f3(){System.out.println("A");}
}

public class Main {
    public static void main(String[] args) {
        I1  obj =  new A();
        obj.f1();
        // obj.f2();
        // obj.f3();
    }
}
