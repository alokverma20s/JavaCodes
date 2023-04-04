interface I1{
    int a=0;
    void someFuntion();
}

class A implements I1{
    public void someFuntion(){
        System.out.println("Hello Alok");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.someFuntion();
        System.out.println(A.a);
    }
}
