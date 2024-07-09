import java.io.*;
import java.math.*;
import java.util.*;
public class RSA {
    public static double gcd(double a, double h) {
        double temp;
        while (true) {
            temp = a % h;
            if (temp == 0)
                return h;
            a = h;
            h = temp;
        }
    }
    public static void main(String[] args) {
        double p = 3;
        double q = 7;
        double n = p * q;
        double e = 2;
        double phi = (p - 1) * (q - 1);
        while (e < phi) {
            if (gcd(e, phi) == 1)
                break;
            else
                e++;
        }
        int k = 2;
        double d = (1 + (k * phi)) / e;
        double msg = 12;
        System.out.println("Message data = " + msg);
        double c = Math.pow(msg, e);
        c = c % n;
        System.out.println("Encrypted data = " + c);
        double m = Math.pow(c, d);
        m = m % n;
        System.out.println("Original Message Sent = " + m);
    }
}
