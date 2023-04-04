public class Main {
    public static void main(String[] args) {
        String s1 = new String("Computer");

        // System.out.println(s1);
        // System.out.println(s1.toUpperCase()); //toUpperCase()
        // System.out.println(s1.toLowerCase()); //toLowerCase()

        // indexOf()
        // int i = s1.indexOf('m',3);
        int i = s1.indexOf("ute", 2);
        System.out.println("index is: " + i);

        // lastIndexOf()
        int j = s1.lastIndexOf('m', 6);
        System.out.println("index is: " + j);

        // equals()
        String s2 = new String("computer");
        if (s1.equals(s2))
            System.out.println("String are same");
        else
            System.out.println("String are not same");

        // equalsIgnoreCase()
        String s3 = new String("computer");
        if (s1.equalsIgnoreCase(s3))
            System.out.println("String are same");
        else
            System.out.println("String are not same");

        // compareTo()
        int k = s1.compareTo(s3);
        if (k == 0)
            System.out.println("String  are same");
        else if (k > 0)
            System.out.println("Opposite to dictionary order");
        else
            System.out.println("Dictionary order");



        //substring()
        String s4 = s1.substring(4);
        System.out.println(s4);

        String s5 = s1.substring(4, 6);
        System.out.println(s5);
    }
}
