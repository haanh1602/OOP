public class Dictionary {
    Word[] words = new Word[100000000];
    int numOfWord = 0;
    DictionaryCommandline dictionaryCommandline = new DictionaryCommandline(this);
    DictionaryManagement dictionaryManagement = new DictionaryManagement(this);
    Trie trie = new Trie();

}
