/**
 * Given two sorted integer arrays nums1 and nums2,
 * merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 are m
 * and n respectively.
 * You may assume that nums1 has enough space
 * (size that is greater or equal to m + n)
 * to hold additional elements from nums2.
 * <p>
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 * <p>
 * Seen this question in a real interview before?
 */
public class _88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int max = m + n;
        n--;
        m--;
        while (max-- != 0) {
            if (n == -1) return;
            if (m == -1) {
                for (int k = 0; k <= n; k++)
                    nums1[k] = nums2[k];
                break;
            }
            if (nums1[m] > nums2[n]) nums1[max] = nums1[m--];
            else nums1[max] = nums2[n--];
        }
    }

}
