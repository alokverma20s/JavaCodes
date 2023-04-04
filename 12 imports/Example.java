package pack1;
import pack2.Student;
public class Example{
    public static void main(String[] args){
        Student s1  = new Student();
        s1.setRollNo(100);
        s1.setName("Alok");
        System.out.println("Roll No:" + s1.getRollNo());
        System.out.println("Name:" + s1.getName());
    }
}