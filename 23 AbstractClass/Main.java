abstract class Person{
    private String name;
    private int age;
    public void setName(String n) { name  = n;}
    public void setAge(int a){ age=a;}
    public String getName() {return name;}
    public int getAge() {return age;}
}
class Student extends Person{
    private int rollNo;
    public void setRollNo(int k){  rollNo = k;}
    public int getRollNo() { return rollNo; }
}
public class Main {
    public static void main(String[] args) {
        Student  s = new Student();
        s.setRollNo(21124008);
        s.setName("Alok");
        s.setAge(21);
        System.out.println("Roll No: "+ s.getRollNo());
        System.out.println("Name: "+ s.getName());
        System.out.println("Age: "+ s.getAge());


        
    }
}
