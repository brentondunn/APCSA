/**
* WordPair.java
* @author Brenton Dunn / 218005
* @author Richard Valencia / 218117
* @since 01 February 2021
* @version 1.0
*/

import java.util.*;

public class WordPair {
    private String word1;
    private String word2;

    public WordPair(String w1, String w2) {
        word1 = w1;
        word2 = w2;
    }
    public String getFirst() {
        return word1;
    }
    public String getSecond() {
        return word2;
    }
    public String toString() {
        return "(" + word1 + ", " + word2 + ")";
    }
}
