package dsa.dataStructures.nonLinear.tries;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordEnd; // isEndOfWord;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; // Alphabets a-z
    }
}
public class Trie {
    static void insertWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char ch : word.toCharArray()){ // "ram" = {'r','a,'m}
            if(curr.children[ch-'a'] == null){
                // This means the node with character ch doesn't exist
                curr.children[ch-'a'] = new TrieNode();
            }
            // Move to its children for the next character
            curr = curr.children[ch-'a'];
        }
        curr.wordEnd = true; // The word has been inserted
    }
    public static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char ch : word.toCharArray()){
            if(curr.children[ch-'a'] == null){
                // This means the node with character ch doesn't exist
                return false;
            }
            // Move to its children for searching the next character
            curr = curr.children[ch-'a'];
        }
        return curr.wordEnd;
    }
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.asList
                ("mango", "guava", "avocado", "pineapple");
        for (String word : inputWords){
            insertWord(root, word);
        }
        List<String> searchWords = Arrays.asList
                ("mango", "banana", "guava", "avocado",
                        "jackfruit","pineapple", "greenapple");

        for (String word : searchWords){
            if(searchWord(root, word)){
                System.out.println(word + " found in Trie.");
            }else {
                System.out.println(word + " not found in Trie.");
            }
        }
    }
}
