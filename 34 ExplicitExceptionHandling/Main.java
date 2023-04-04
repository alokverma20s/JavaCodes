public class Main {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawlAmount = 6000;
        try {
            if (balance < withdrawlAmount)
                throw new ArithmeticException("Insufficient Balance");
            balance = balance - withdrawlAmount;
            System.out.println("Transaction Successfully completed");
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program  continue...");
    }
}
