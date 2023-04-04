public class Main{
    public static void main(String[] args){
        //valueOf()
        Integer i1 = Integer.valueOf("10101001", 2);
        Double d1 = Double.valueOf("3.14");

        //parseXxx()
        int a  = Integer.parseInt("123");
        System.out.println(a);
        
        //xxxValue()
        int c = i1.intValue();
        double d = d1.doubleValue();
        System.out.println(c+d);
    }
}