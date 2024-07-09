import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of rows you want in the triangle:");
        n = s.nextInt();
        System.out.println();
        
        int t = n;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(" ");
            }
            int l = i * 2 + 1;
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }

            System.out.println();
            t--;j
        }
    }
}
