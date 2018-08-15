/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class _4_Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        System.out.println("expected: 2.0");
        System.out.println(new _4_Median_of_Two_Sorted_Arrays().findMedianSortedArrays_1(new int[]{1, 3}, new int[]{2}));
        System.out.println("expected: 2.5");
        System.out.println(new _4_Median_of_Two_Sorted_Arrays().findMedianSortedArrays_1(new int[]{1, 2}, new int[]{3, 4}));

        System.out.println("expected: 5.5");
        System.out.println(new _4_Median_of_Two_Sorted_Arrays().findMedianSortedArrays_1(new int[]{1, 3,5,7,9}, new int[]{0,2,4,6,8}));
    }
    /** my solution complexity is (m+n)/2 > log(m+n) **/
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int s1 = 0;
        int s2 = 0;
        int median ;
        /**
         *  1 -> 0 次
         *  2 -> 0 次
         *  3 -> 1 次
         *  4 -> 1次
         */
        for (int i = 0; i < (length-1) / 2 ; i++) {
            if (s1 == nums1.length ) {
                s2++;
            } else if (s2 == nums2.length ) {
                s1++;
            } else if (nums1[s1] < nums2[s2]) {
                s1++;
            } else {
                s2++;
            }
        }

        if (s1 == nums1.length ) {
            median = nums2[s2++];
        } else if (s2 == nums2.length ) {
            median = nums1[s1++];
        } else if (nums1[s1] < nums2[s2]) {
            median = nums1[s1++];
        } else {
            median = nums2[s2++];
        }


        if (length % 2 != 0) {
            return median;
        } else {
            if (s1 == nums1.length ) {
                median += nums2[s2++];
            } else if (s2 == nums2.length ) {
                median += nums1[s1++];
            } else if (nums1[s1] < nums2[s2]) {
                median += nums1[s1++];
            } else {
                median += nums2[s2++];
            }
            return 1.0 * median / 2;
        }
    }

    public double findMedianSortedArrays_1(int[] A,int[] B){
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
