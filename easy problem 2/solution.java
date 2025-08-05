//SORTED & ROTATED FOND MININMUM//
public class Solution {
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        if (arr[low] <= arr[high]) return arr[low];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid] > arr[mid + 1])
                return arr[mid + 1];

            if (mid > low && arr[mid] easy < arr[mid - 1])
                return arr[mid];

            if (arr[mid] >= arr[low])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

}
------------------------------------------------------------------------------------------
  //MOVE ZERO TO END//
  class Solution {
    public void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;  // Tracks where to place the next non-zero

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining elements with zero
        while (index < n) {
            arr[index++] = 0;
        }
    }
}
--------------------------------------------------------------------------------------------
  //NUMBER OF OCCURANCE//
  public class Solution {

    
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    
    public static int countFreq(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) return 0;
        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }

}
----------------------------------------------------------------------------------
//FIRST REPEATED CHARACTER//
  public class Solution {
    public String firstRepChar(String s) {
        boolean[] seen = new boolean[26];

        for (char ch : s.toCharArray()) {
            if (seen[ch - 'a']) {
                return String.valueOf(ch);  
            }
            seen[ch - 'a'] = true;
        }

        return "-1";  
    }
}
------------------------------------------------------------------------------
  //FIRST & LAST OCCURANCE OF X//
  import java.util.*;

class Solution {
    public ArrayList<Integer> firstAndLast(int[] arr, int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int first = -1, last = -1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                first = i;
                break;
            }
        }

      
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                last = i;
                break;
            }
        }

        if (first == -1) {
            res.add(-1);
        } else {
            res.add(first);
            res.add(last);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1, 3, 3, 4};
        int x = 3;

        ArrayList<Integer> ans = obj.firstAndLast(arr, x);
        System.out.println(ans);  
    }
}
------------------------------------------------------------------------------
//CEIL IN A SORTED ARRAY(SMMALEST THAN GIVEN NUMBER)//
  import java.util.*;
public class Solution {
    public static int findCeil(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int x = sc.nextInt(); 
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findCeil(arr, x);
        System.out.println(ans);
    }
}

