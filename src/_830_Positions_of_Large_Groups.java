import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *  In a string S of lowercase letters,
 *  these letters form consecutive groups of the same character.
 *  For example, a string like S = "abbxxxxzyy" has the groups "a","bb", "xxxx", "z" and "yy".
 *  Call a group large if it has 3 or more characters.
 *  We would like the starting and ending positions of every large group.
 *  The final answer should be in lexicographic order
 *
 *
 */
public class _830_Positions_of_Large_Groups {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] s = S.toCharArray();
        List<List<Integer>>  result = new ArrayList<>();
        int startIndex = 0 ; int endStartIndex = 0 ;
        for(int i =0 ; i< s.length  ; i++ ){
            if(i == s.length -1 || s[i] != s[i+1] ){
                endStartIndex = i;
                if(endStartIndex - startIndex + 1 >= 3 ){
                    ArrayList arrayList = new ArrayList( );
                    arrayList.add(startIndex);
                    arrayList.add(endStartIndex);
                    result.add(arrayList);
                }
                startIndex = i + 1 ;
            }
        }

        return  result;
    }
}
