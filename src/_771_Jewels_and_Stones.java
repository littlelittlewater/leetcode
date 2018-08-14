import java.util.HashMap;
import java.util.HashSet;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct,
 * and all characters in J and S are letters.
 * Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 */
public class _771_Jewels_and_Stones {
    public int numJewelsInStones(String J, String S) {
        int count = 0 ;
        char[] iHava = S.toCharArray();
        char[] jewels = J.toCharArray();
        HashSet<Character> sets = new HashSet<>();
        for(int i = 0 ; i < jewels.length ; i++){
            sets.add(jewels[i]);
        }
        for(int j = 0 ; j< iHava.length ; j++){
            if(sets.contains(iHava[j])) count ++;
        }
        return count;
    }
}
