package com.yml.algo;

public class PermutationOfString
{
    public static void main(String[] args)
    {
        String str = "hello";
        int n = str.length();
        PermutationOfString.permute(str, 0, n-1);
    }
 
    /**
    * method to perform permutation function
    * @param 
    * @param 
    * @param 
    */
    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
 
    /**
    * method to swap Swap Characters at position
    * @param 
    * @param 
    * @param 
    * @return 
    */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}