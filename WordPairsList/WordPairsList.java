/**
* WordPairsList.java
* @author Brenton Dunn / 218005
* @author Richard Valencia / 218117
* @since 01 February 2021
* @version 1.0
*/

import java.util.*;

public class WordPairsList {
  private ArrayList<WordPair> allPairs;



  public WordPairsList(String[] words) {
    // WRITE YOUR CODE HERE
    // initialize allPairs to an empty ArrayList of WordPair objects
    allPairs = new ArrayList<WordPair>();
    // nested loops through the words array to add each pair to allPairs
    for (int i = 0; i < words.length; i++){
      for(int j = 0; j < words.length; j++){
        allPairs.add(new WordPair(words[i], words[j]));
      }
    }
  }

  public int numMatches() {
    //Write the code for the second part described below

    // [(x1, x2), (y1, y2)]
    int counter = 0;
    for (int i = 0; i < allPairs.size(); i++){
      if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())){
        counter++;
      }
    }
    return counter;
  }

  public String toString() {
      return allPairs.toString();
  }
}
