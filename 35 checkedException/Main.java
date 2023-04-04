import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            throw new IOException("Kaisa laga mere majak");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("After Exception");
    }
}