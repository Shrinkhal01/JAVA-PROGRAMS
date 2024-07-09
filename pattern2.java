import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the inverted triangle:");
        n = s.nextInt();
        int t = 0;

        for (int i = n - 1; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < t; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }

            t++;
            System.out.println();
        }
    }
}
