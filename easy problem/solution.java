//BUBBLE SORT//
class Solution {
    public void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        
    }
}
--------------------------------------------------------------------------
  //SELECTION SORT//
  class Solution {
    public void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}

----------------------------------------------------------------------------------------
  //SQUARE ROOT//
  import java.util.*;
class Solution {
    public static int floorSqrt(int n) {
        int low=0; int high=n; int ans=0;
        while(low<=high) {
            int mid=low+((high-low)/2);
            if(mid*mid==n) {
                return mid;
            }
            else if(mid*mid < n) {
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        System.out.println(floorSqrt(n));
    }
}
---------------------------------------------------------------------------------------------------------------------
//FLOOR IN A SORTED ARRAY(SMALLER NO)//
import java.util.*;
public class Solution {
    public static int findFloor(int[] arr, int x) {
        int n = arr.length;
        int floor = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                floor = i; 
            } else {
                break; 
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int x = sc.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int output = findFloor(arr, x);
        System.out.println(output);
    }
}
---------------------------------------------------------------------------
//ANAGRAM//
class Solution {
    public boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
------------------------------------------------------------------------------------
//PANAGRAM CHECKING//
import java.util.*;

public class Solution {
    
    public boolean checkPangram(String str) {
        str = str.toLowerCase();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                hs.add(ch);
            }
        }

        return hs.size() == 26;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(new Solution().checkPangram(s) ? "true" : "false");
    }
}

