//REPEATED CHARACTER//
class Solution {
    public char firstRep(String S) {
        
        int[] freq = new int[26];

        
        for (char c : S.toCharArray()) {
            freq[c - 'a']++;
        }

        
        for (char c : S.toCharArray()) {
            if (freq[c - 'a'] > 1) {
                return c;
            }
        }

        
        return '#';
    }
}
----------------------------------------------------------------------------------------------------
//VOWEL OR NOT//
  class Solution {
    public static String isVowel(char c) {
        
        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }
}
--------------------------------------------------------------------------------------------------------
  //CHECK FOR POWER//
  import java.util.*;

public class Solution {
    public static boolean isPowerOfAnother(int x, int y) {
        if (x == 1) {
            return y == 1; 
        }

        while (y % x == 0) {
            y = y / x;
        }

        return y == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(isPowerOfAnother(x, y));
    }
}
-------------------------------------------------------------------------------------------------
  //CUBE ROOT OF A NUMBER//
  public class Solution {
    public static int cubeRoot(int n) {
        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long cube = (long) mid * mid * mid;

            if (cube == n) {
                return mid; 
            } else if (cube < n) {
                ans = mid;      
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        return ans; 
    }

}
----------------------------------------------------------------------------------------------------------

