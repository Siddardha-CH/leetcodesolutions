Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int value) pushes the element value onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.




class MinStack {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-08-12                                             #
        #                                                                       #
        #########################################################################
        */
    Stack<Integer> stack;
    Stack<Integer> mini;
    public MinStack() {
        stack = new Stack<>();
        mini = new Stack<>();
    }
    
    public void push(int val)  {
        stack.push(val);
        if (mini.isEmpty() || val <= mini.peek())
            mini.push(val);
    }
    
    public void pop() {
        int k = stack.pop();
        if (k == mini.peek())
            mini.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
