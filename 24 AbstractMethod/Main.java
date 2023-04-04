abstract class Person{
    abstract void show();
}

class Student  extends Person{
    void show(){
        System.out.println("Hello ALok");
    }
}

public class Main {
    public static void main(String[] args) {
        Student  s = new Student();
        s.show();
    }
}
