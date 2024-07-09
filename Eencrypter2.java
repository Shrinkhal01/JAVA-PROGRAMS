import java.util.Scanner;

public class Encrypter2 {

public static int[] encrypt(String str, int k1, int k2, int m){


int l = str.length();
char[] chars = str.toCharArray();
int[] encrypted = new int[l];

for(int i = 0; i < l; i++){
  encrypted[i] = (k1*chars[i] + k2) % m; 
}

return encrypted;
}

public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);

System.out.print("Enter string to encrypt: ");
String input = scanner.nextLine();

int k1 = 3; 
int k2 = 5;
int m = 26;

int[] encrypted = encrypt(input, k1, k2, m);

System.out.println("Encrypted string:");
for(int i = 0; i < encrypted.length; i++){
  System.out.print((char)encrypted[i]);
}
}

}