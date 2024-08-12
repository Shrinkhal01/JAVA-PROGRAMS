import java.util.*;

class stringperm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        permute(str);
    }
    public static void permute(String str) {
        // Call the permuteHelper method with the original string 'str' and an empty
        // prefix
        permuteHelper(str, "");
    }
    public static void permuteHelper(String str, String prefix) {
        int n = str.length();
        // if length is 0 then no permutation print the string
        if (n == 0) {
            System.out.println(prefix);
        }
        // if length is not 0 the permutaions are
        else {
            for (int i = 0; i < n; i++) {
                String newPrefix = prefix + str.charAt(i);// this is the prefix
                // Remove the character at index 'i' from the original string 'str' and create a
                // new string 'newStr'
                String newStr = str.substring(0, i) + str.substring(i + 1);
                permuteHelper(newStr, newPrefix);// this line calls permuteHelper to permute the original string
                
            }
        }
    }
}
