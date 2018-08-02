package longest_word;
/*
This program search the longest word in sentence
 */

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        System.out.println("Type a sentence:");
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        String sentence = reader.nextLine();
        HashMap<String, Object> result = getResult(sentence);
        System.out.println("Sentence: " + result.get("sentence"));
        System.out.println("Length of sentence = " + result.get("sentenceLength"));
        System.out.println("The longest word: " + result.get("theLongestWord"));
        System.out.println("Length of the longest word = " + result.get("maxLength"));
    }

    public static HashMap<String, Object> getResult(String sentence) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("sentence", sentence);
        String[] words = sentence.split(" ");
        String theLongestWord = "";
        int maxLength = 0;
        int wordLength;
        int sentenceLength = 0;
        for (String word : words) {
            wordLength = word.length();
            if (wordLength > 0) {
                sentenceLength++;
                if (wordLength >= maxLength) {
                    maxLength = wordLength;
                    theLongestWord = word;
                }
            }
        }
        result.put("sentenceLength", sentenceLength);
        result.put("theLongestWord", theLongestWord);
        result.put("maxLength", maxLength);
        return result;
    }
}
