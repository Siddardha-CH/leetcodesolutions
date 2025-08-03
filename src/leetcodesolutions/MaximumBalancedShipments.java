// You are given an integer array weight of length n, representing the weights of n parcels
// arranged in a straight line. A shipment is defined as a contiguous subarray of parcels.
// A shipment is considered balanced if the weight of the last parcel is strictly less than the maximum weight among all parcels in that shipment.

// Select a set of non-overlapping, contiguous, balanced shipments such that each parcel appears in at most one shipment (parcels may remain unshipped).

// Return the maximum possible number of balanced shipments that can be formed.

// Note: Please do not copy the description during the contest to maintain the integrity of your submissions.

____________________________________________________________________________________________________________________________




  class Solution {
    public int maxBalancedShipments(int[] weight) {
        int ans =0;
        int max = 0;
        for (int i = 0; i< weight.length ; i++) {
            if (weight[i] < max) {
                ans++;
                max = 0;
            }
            else{
                max = Math.max(max,weight[i]);
            } 
        }
        return ans;
    }
}
