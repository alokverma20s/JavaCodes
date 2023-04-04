class A{
    int z;
    public void  f1(){}
}
class B  extends A{
    int z;
    public void f1(){
        super.f1();
    }
    public void f2(){
        int z;
        z=2;
        this.z=3;
        super.z=4;
        System.out.println(z+this.z+super.z);
    }

}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1();
        obj.f2();
    }
}
