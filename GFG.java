import java.util.Scanner;

public class GFG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message to encrypt: ");
        String inputMessage = scanner.nextLine();

        for (int i = 0; i < inputMessage.length(); i++) {
            char currentChar = inputMessage.charAt(i);
            int msg = (int) currentChar;

            int p = 3; // prime no 1
            int q = 7; // prime no 2
            int n = p * q;
            int e = 2; // public key exponent
            int phi = (p - 1) * (q - 1);

            while (e < phi && gcd(e, phi) != 1) {
                e++;
            }

            int d = modInverse(e, phi);

            System.out.println("Message data = " + msg);

            int encryptedMsg = (int) Math.pow(msg, e) % n;
            System.out.println("Encrypted data = " + encryptedMsg);

            int decryptedMsg = (int) Math.pow(encryptedMsg, d) % n;
            System.out.println("Original Message Sent = " + (char) decryptedMsg);
        }

        scanner.close();
    }

    private static int gcd(int a, int h) {
        int temp;
        while (true) {
            temp = a % h;
            if (temp == 0)
                return h;
            a = h;
            h = temp;
        }
    }

    private static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return 1;
    }
}
