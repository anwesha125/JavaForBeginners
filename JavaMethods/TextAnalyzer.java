package JavaMethods;
import java.util.*;

public class TextAnalyzer {
    public static int countWords(String text){
        if(text == null || text.isEmpty()){
            return 0;
        }
        String words[] = text.trim().split("\\s+");
        return words.length;  
      }  

    public static int countCharacters(String text){
        if(text == null || text.isEmpty()){
            return 0;
        }

        return text.length();
    }

    public static int countSentences(String text){
          if(text == null || text.isEmpty()){
            return 0;
        }

        String sentences[] = text.trim().split("[.!?+]");
        return sentences.length;

    }

    public static void main(String args[]){
        System.out.println("Write anything you want :D");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Number of words: " + countWords(input));
        System.out.println("Number of characters: " + countCharacters(input));
        System.out.println("Number of sentences: " + countSentences(input));

        sc.close();
    }
      
      
}
