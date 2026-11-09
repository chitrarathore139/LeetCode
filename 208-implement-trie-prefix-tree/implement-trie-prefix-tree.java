class Node{
    Node[] children;
    boolean eow;
    public Node(){
        children = new Node[26];
        eow= false;
    }
}
class Trie {
    Node root;
    public Trie() {
        root= new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index= word.charAt(i)-'a';
            Node node= curr.children[index];
            if(node==null){
                node= new Node();
                curr.children[index] = node;
            }
            if(i == word.length() - 1) {
                node.eow = true;
            }
            curr=node;
        }
    }
    
    public boolean search(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index= word.charAt(i)-'a';
            Node node= curr.children[index];
            if(node==null) return false;
            if(i==word.length()-1 && node.eow==false) return false;
            curr=curr.children[index];
        }
        return true;
    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;
        int i=0;
        while(i<prefix.length()){
            int index= prefix.charAt(i)-'a';
            Node node= curr.children[index];
            if(node==null) return false;
            curr=curr.children[index];
            i++;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */