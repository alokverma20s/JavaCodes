class Person{
    private int age;
    private String name;
    public void setAge(int a){
        age = a;
    }
    public  void setName(String s){
        name = s;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
class Student extends Person {
    private int rollNo;

    public void setRollNo(int r) {
        rollNo = r;
    }

    public int getRollNo() {
        return rollNo;
    }
}
public class Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(100);
        s1.setName("Rahul");
        s1.setAge(18);
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
