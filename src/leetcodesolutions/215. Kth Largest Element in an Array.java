Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?






class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-20-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    //     for (int i : nums)
    //         pq.offer(i);
    //     while (k-- > 1)
    //         pq.poll();
    //     return pq.poll();
            Arrays.sort(nums);
            return nums[nums.length - k];
    }
}
