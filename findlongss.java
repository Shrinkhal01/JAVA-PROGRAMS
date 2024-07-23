import java.util.*;
public class findlongss {
    public int ss(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxL = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charMap.containsKey(c)) {
                start = Math.max(start, charMap.get(c) + 1);
            }
            charMap.put(c, i);
            maxL = Math.max(maxL, i - start + 1);
        }
        return maxL;
    }

    public static void main(String[] args) {
        findlongss fls = new findlongss();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        System.out.println("The length of the string without any repeating characters is: " + fls.ss(str));
        s.close();
    }
}
