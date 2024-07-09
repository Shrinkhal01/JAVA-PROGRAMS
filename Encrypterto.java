import java.util.Scanner;

public class Encrypterto {

  public static int[] encrypt(String str, int k1, int k2){
  
    int[] encrypted = new int[str.length()];

    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      int x = (int)c - 'a'; 
      int cipher = (x*k1 + k2) % 26;
      encrypted[i] = cipher;
    }

    return encrypted;
  
  }

  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter string to encrypt: ");
    String input = scanner.nextLine();

    int k1,k2;
    System.out.println("Enter the keys : ");
    k1=scanner.nextInt();
    k2=scanner.nextInt();
    System.out.println("");

    int[] encrypted = encrypt(input, k1, k2);

    System.out.print("Encrypted string: ");
    for(int i = 0; i < encrypted.length; i++){
      System.out.print(encrypted[i] + ""); 
    }

  }

}