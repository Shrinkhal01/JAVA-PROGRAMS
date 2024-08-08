import java.util.*;

public class duprem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a random string:");
        String str = s.nextLine();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate found and it is : " + arr[i]);
                    arr[j] = ""; // Remove the duplicate element from the array
                }
            }
        }
        String result = String.join("", arr);
        System.out.println("String without duplicates: " + result);
    }
}
