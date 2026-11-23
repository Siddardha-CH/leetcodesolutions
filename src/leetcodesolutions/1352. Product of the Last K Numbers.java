Design an algorithm that accepts a stream of integers and retrieves the product of the last k integers of the stream.

Implement the ProductOfNumbers class:

ProductOfNumbers() Initializes the object with an empty stream.
void add(int num) Appends the integer num to the stream.
int getProduct(int k) Returns the product of the last k numbers in the current list. You can assume that always the current list has at least k numbers.
The test cases are generated so that, at any time, the product of any contiguous sequence of numbers will fit into a single 32-bit integer without overflowing.






class ProductOfNumbers {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-23-11                                               #
        #                                                                       #
        #########################################################################
        */
    int size;
    ArrayList<Integer> nums;
    public ProductOfNumbers() {
        size = 0;
        nums = new ArrayList<>();
    }
    
    public void add(int num) {
        if (num != 0) { 
            if (nums.size() > 0) 
                nums.add(nums.get(size - 1) * num);
            else
                nums.add(num);
            size += 1;
        }
        else {
            nums = new ArrayList<>();
            size = 0;
        }
    }
    
    public int getProduct(int k) {
        if (k > size)
            return 0;
        else if (k == size)
            return nums.get(size - 1);
        return nums.get(size - 1) / nums.get(size - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
