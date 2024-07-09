import java.util.Scanner;
class rotatear {
public static void main(String[] args) {
int ar[] = {4, 5, 2, 3, 4, 5, 2, 132, 512, 53, 53, 5};
System.out.println("The initial array:");
for (int i = 0; i < ar.length; i++) {
System.out.print(ar[i] + " ");
}
System.out.println();
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of positions to rotate from:");
int n = s.nextInt();
int arr[] = new int[ar.length];
int len = ar.length;
n = n % len; 
int index = 0;
for (int i = n; i < len; i++) {
arr[index++] = ar[i];
}
for (int i = 0; i < n; i++) {
arr[index++] = ar[i];
}
System.out.println("The rotated array:");
for (int i = 0; i < ar.length; i++) {
System.out.print(arr[i] + " ");
}
}
}
