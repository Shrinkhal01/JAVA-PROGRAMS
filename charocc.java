import java.util.*;

class charocc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        occntr(str);
        s.close();
    }

    public static void occntr(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Occurrence: " + entry.getValue());
        }
    }
}