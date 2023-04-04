/*

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 6, 8, 10 };  //Default value of arr element is 0
        int arr2[] = { 2, 4, 6, 8, 10 };// int arr1[] = new int[5]{2,4,6,8,10};//error
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" "+arr2[i]);
        }
    }
}

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < 5; i++) {
            System.out.println("arr[" + i + "] =" + arr[i]);
        }
    }
}