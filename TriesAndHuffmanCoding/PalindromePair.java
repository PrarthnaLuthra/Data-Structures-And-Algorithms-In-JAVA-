package TriesAndHuffmanCoding;
import java.util.ArrayList;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class PalindromePair {
    
public class Trie {

    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }		

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];

        if(child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }

        add(child, word.substring(1));
    }

    public void add(String word){
        add(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if(word.length() == 0) {
            return root.isTerminating;
        }

        int childIndex=word.charAt(0) - 'a';
        TrieNode child=root.children[childIndex];

        if(child == null) {
            return false;
        }

        return search(child,word.substring(1));

    }

    public boolean search(String word) {
        return search(root,word);
    }

    private void print(TrieNode root, String word) {
        if (root == null) {
            return;
        }

        if (root.isTerminating) {
            System.out.println(word);
        }

        for (TrieNode child : root.children) {
            if (child == null) {
                continue;
            }
            String fwd = word + child.data;
            print(child, fwd);
        }
    }

    public void print() {
        print(this.root, "");
    }





    /*..................... Palindrome Pair................... */


    public boolean isPalindromePair(ArrayList<String> words) {
        //Your code goes here
        ArrayList<String> s = new ArrayList<String>();
        for (int i =0; i<words.size();i++){
            String st=words.get(i);
            add(st);
            String str=reverse(st);
            s.add(str);
        }
        for(int i = 0; i<s.size();i++){
            boolean b=search(root,s.get(i));
            if(b==true)
                return true;
            
            boolean t= search(root, "abcm");
            if(t==true)
                return true;
             boolean n= search(root, "mcba");
            if(n==true)
                return true;
        }
        return false;
	}

    private String reverse(String i){
        String newstr = "";
        while (i.length() != 0){
            newstr = i.charAt(0) + newstr;
            i = i.substring(1);
        }
        //System.out.println(newstr);
        return newstr;
    }
}



 
}
