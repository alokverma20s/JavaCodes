class Example{
    int x; //instance variable
    static int y;  // static member variable
    public void fun1(){} // instance member function
    public static  void fun2(){ y =4; }//static member function
    
    static class Test{
        public static String country ="INDIA";
    }
}
public class  Main{
    public static void main(String[] args){
        // Example ex1 = new Example();
        // Example ex2  =  new Example();

        Example.fun2();
        System.out.println(Example.y);
        System.out.println( Example.Test.country);
    }
}