class TrieNode {
  TrieNode[] children = new TrieNode[26];
  boolean isEndOfWord;
}

public class TrieExample {
  TrieNode root = new TrieNode();

  void insert(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
      int index = c - 'a';
      if (node.children[index] == null) {
        node.children[index] = new TrieNode();
      }
      node = node.children[index];
    }
    node.isEndOfWord = true;
  }
}
