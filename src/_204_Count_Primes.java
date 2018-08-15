import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * Example:
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class _204_Count_Primes {
    public static void main(String[] args) {
        System.out.println(new _204_Count_Primes().countPrimes(49979));
    }
    public int countPrimes(int n) {
        boolean[] maps = new boolean[n+1];
        int count =0;
        for(int i = 2 ; i <=n && !maps[i]; i ++){
            count ++;
            for(int j= i ; j<=n  ; j++){
                if(!maps[j] && j%i ==0){
                    maps[j] =true;
                }
            }
        }
        return  count;
    }
}
