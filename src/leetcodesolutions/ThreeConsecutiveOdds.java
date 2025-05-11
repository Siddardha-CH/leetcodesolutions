// Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
  
//   Constraints:
// 1 <= arr.length <= 1000
// 1 <= arr[i] <= 1000

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int a,b,c;

        for(int i=0;i<arr.length-2;i++){
            a=arr[i]%2;
            b=arr[i+1]%2;
            c=arr[i+2]%2;
            if(a==b &&b==c && a==1)
            return true;
        }
        return false;
        
    }
}
