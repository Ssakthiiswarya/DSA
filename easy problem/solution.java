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
