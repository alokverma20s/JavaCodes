public class Main {
    public static void main(String[] args) {
        // String str1= "My name is Bond";
        // String str2= "My name is Bond";
        // String str3= "My name"+" is Bond";

        //This all the 3 strings will have same memory address  because they are  contains same sequence of charcter.
        //String class is immutable


        // String  str5= new String("My name is Bond"); //This is  contains a different memory . If we make a string with the help of new keyword then this will always create  a new address.

        //With help of "+"  operator we can concatenate  a string.

        String s1 = "computer";
        String s2 = "computer";
        String s3 = new String("computer");

        System.out.println("Result 1: "+ (s1==s2)); //true
        System.out.println("Result 2: " + s1.equals(s2)); //true
        System.out.println("Result 3: "+ (s1==s3)); //false
        System.out.println("Result 4: "+ s1.equals(s3)); //true
    }
}
