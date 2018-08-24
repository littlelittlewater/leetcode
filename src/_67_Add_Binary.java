import java.util.Stack;

/**
 * Given two binary strings, return their sum (also a binary string).

 The input strings are both non-empty and contains only characters 1 or 0.

 Example 1:

 Input: a = "11", b = "1"
 Output: "100"

 Example 2:

 Input: a = "1010", b = "1011"
 Output: "10101"


 */
public class _67_Add_Binary {
    public static void main(String[] args) {
        System.out.println(new _67_Add_Binary().addBinary("11", "1"));
    }
    public String addBinary(String a, String b) {
        int length = Math.max(a.length(),b.length());
        int[] result = new int[length+1];
        //都多申请一位
        int[] left = convertToBinary(a,length+1);
        int[] right = convertToBinary(b,length+1);
        int isHigh = 0;
        for(int i = 0 ; i < length+1 ;i ++){
            //是否有进位
            if(isHigh == 1){
                result[i] =  left[i] ^ right[i] ^ isHigh;
                isHigh = left[i] | right[i];
            }else {
                result[i] = left[i] ^ right[i];
                isHigh = left[i] & right[i];
            }
        }
        String r = result[result.length-1] == 0 ? "" : "1";
        for(int i = 1 ; i < result.length ; i ++){
            r += result[result.length-1-i];
        }

        return  r;
    }

    private int[] convertToBinary(String a,int length) {
        int[] k = new int[length];
        for(int i = a.length()-1 ;i>-1 ;i --)
            k[a.length()-1-i] = (a.charAt(i) == '0' ? 0 : 1);
        for(int i = a.length() ;i < length ;i ++)
            k[i] = 0 ;
        return k;
    } }