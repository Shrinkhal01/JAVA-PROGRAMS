import java.util.*;

public class reversesent {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter the sentence to reverse:");
        str = s.nextLine();
        reverser(str);
    }

    public static void reverser(String str) {
        String[] words = str.split(" ");
        Collections.reverse(Arrays.asList(words));
        String reversedSentence = String.join(" ", words);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
