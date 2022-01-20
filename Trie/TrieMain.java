public class TrieMain {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("APPLE");
        t.insert("APPLET");
        t.delete("APIS");
        t.insert("BOOK");
        t.insert("BALL");
        t.search("APIS");
        t.search("BALL");
        t.delete("BALL");
        t.delete("APIS");
    }
}
