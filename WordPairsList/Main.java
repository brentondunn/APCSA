/**
* Main.java
* @author Brenton Dunn / 218005
* @author Richard Valencia / 218117
* @since 01 February 2021
* @version 1.0
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    String[] words = {"Sep's amazing orange car", "Mental Health", "Richard", "Brenton", "Java"};
    WordPairsList list = new WordPairsList(words);
    System.out.println(list);
    // For second part below, uncomment this test:
    System.out.println("The number of matched pairs is: " + list.numMatches());
  }
}
