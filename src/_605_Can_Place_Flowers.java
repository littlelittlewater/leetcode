/**
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. However,
 * flowers cannot be planted in adjacent plots
 * - they would compete for water and both would die.
 * Given a flowerbed (represented as an array containing 0 and 1,
 * where 0 means empty and 1 means not empty), and a number n,
 * return if n new flowers can be planted in it
 * without violating the no-adjacent-flowers rule.
 * <p>
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * <p>
 * <p>
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 */
public class _605_Can_Place_Flowers {
    /** my solution is not changed the input */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 1 ;
        if(flowerbed.length == 1) return  n + flowerbed[0] < 1 ;
        if(flowerbed[0] == 0  &&  (flowerbed[1] == 0) ) {
            count = 1;
            i++;
        }
        for (; i < flowerbed.length ; i++) {
            if (flowerbed[i] == 0 && (flowerbed[i-1] == 0) && ((i == flowerbed.length - 1)
                    || flowerbed[i + 1] == 0) ) {
                    count++;
                    i++;
                }
            }
        return n <= count;
    }

    /** it depends on observer **/
    public boolean canPlaceFlowers_1(int[] flowerbed, int n) {
        int count = 1;
        int result = 0;
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                count++;
            }else {
                result += (count-1)/2;
                count = 0;
            }
        }
        if(count != 0) result += count/2;
        return result>=n;
    }
}