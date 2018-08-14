import java.util.HashSet;

/**
 * Given a list of strings words representing an English Dictionary,
 * find the longest word in words that can be built one character at a time by other words in words. If there is more than one possible answer, return the longest word with the smallest lexicographical order.
 * If there is no answer, return the empty string.
 */
public class _720_Longest_Word_inDictionary {
    public String longestWord(String[] words) {
        HashSet<String> sets = new HashSet<>();
        for(String word:words) sets.add(word);
        String result = "";
        for(String word:words){
            boolean isRight =true;
            for(int i = 1 ; i <word.length();i++){

                if(!sets.contains(word.substring(0,i))){
                    isRight = false;
                    break;
                }


            }
            if(isRight &&( word.length() > result.length()
                    ||( word.length() == result.length() && word.compareTo(result) < 0)))
                result = word;
        }
        return result;
    }
}
