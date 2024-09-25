import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false; // Marks the end of a word
}

class Trie {
    private TrieNode root; // Root of the Trie


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app")); // true
        trie.insert("app");
        System.out.println(trie.search("app"));     // true
    }


    public Trie() {
        root = new TrieNode(); // Initialize the root node
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode()); // Add child node if absent
            current = current.children.get(ch); // Move to the child node
        }
        current.isEndOfWord = true; // Mark the end of the word
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return false; // If character not found, word doesn't exist
            }
            current = current.children.get(ch); // Move to the child node
        }
        return current.isEndOfWord; // Check if it's the end of a valid word
    }

    // Check if any word starts with a given prefix
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return false; // If character not found, prefix doesn't exist
            }
            current = current.children.get(ch); // Move to the child node
        }
        return true; // If all characters found, return true
    }
}
