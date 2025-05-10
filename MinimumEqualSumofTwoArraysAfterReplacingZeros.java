// You are given two arrays nums1 and nums2 consisting of positive integers.

// You have to replace all the 0's in both arrays with strictly positive integers such that the sum of elements of both arrays becomes equal.

// Return the minimum equal sum you can obtain, or -1 if it is impossible.

// Constraints:
// 1 <= nums1.length, nums2.length <= 105
// 0 <= nums1[i], nums2[i] <= 106


class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long a1=0;
        long b1=0;
        long a2=0;
        long b2=0;
        for(int i=0;i<nums1.length;i++){
            if (nums1[i]>0) a1+=nums1[i];
            if(nums1[i]==0){b1+=1;
            a1+=1;}
        }
        for(int i=0;i<nums2.length;i++){
            if (nums2[i]>0) a2+=nums2[i];
            if(nums2[i]==0){b2+=1;
            a2+=1;}
        }
        if ((b1==0 && a2>a1 )|| b2==0 && a1>a2)
        return -1;
        System.out.println(a1+" "+b1+" "+a2+" "+b2);
        long b=Math.max(a1,a2);
        return b;
        
    }
}
