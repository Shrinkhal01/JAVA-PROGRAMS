import java.util.*;
class Node {
    char ch;
    int frequency;
    Node left, right;
    Node(char ch, int frequency) {
        this.ch = ch;
        this.frequency = frequency;
        left = right = null;
    }
}// Node class for Huffman Tree
public class HuffmanEncoding {
    public static void printCodes(Node root, String code) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + ": " + code);
            return;
        }
        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }
    public static void huffmanCoding(char[] chars, int[] freqs) {
        int n = chars.length;
        PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);
        for (int i = 0; i < n; i++) {
            queue.add(new Node(chars[i], freqs[i]));
        }
        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            Node newNode = new Node('-', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;
            queue.add(newNode);
        }
        printCodes(queue.poll(), "");
    }//Function to build Huffman Tree and generate codes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        char[] chars = new char[n];
        int[] freqs = new int[n];
        System.out.println("Enter characters and their frequencies:");
        for (int i = 0; i < n; i++) {
            System.out.print("Character " + (i + 1) + ": ");
            chars[i] = sc.next().charAt(0);
            System.out.print("Frequency of " + chars[i] + ": ");
            freqs[i] = sc.nextInt();
        }
        huffmanCoding(chars, freqs);
    }
}
