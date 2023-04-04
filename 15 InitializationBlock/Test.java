public class Test {
    private int x;
    {  //This is the instance Initialization Block
        System.out.println("Initialization Block: x= " +x);
        x =5;
    }
    public Test(){
        System.out.println("Constructor : x=  " +x);
    }
    public static void main(String[] args) {
        Test t1= new Test();
        Test t2 = new  Test();
    }
}
