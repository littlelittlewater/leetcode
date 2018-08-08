/**
 * We have two special characters.
 * The first character can be represented by one bit 0.
 * The second character can be represented by two bits (10 or 11).
 * Now given a string represented by several bits.
 * Return whether the last character must be a one-bit character or not.
 * The given string will always end with a zero.
 * <p>
 * <p>
 * Input:bits = [1, 0, 0]
 * Output: True
 * Explanation:The only way to decode it is two-bit character and one-bit character.
 * So the last character is one-bit character.
 * <p>
 * <p>
 * Input:bits = [1, 1, 1, 0]
 * Output: False
 * Explanation:The only way to decode it is two-bit character and two-bit character.
 * So the last character is NOT one-bit character.
 */


public class _717_1_bit_and_2_bit_Characters {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length <= 1 ) return  false;

        for(int i = 0 ; i < bits.length ; i++ ){
            if(bits[i] == 1 ){
                if(i == bits.length -1) return false;
                i++;
            }

        }
        return true;
    }
}
