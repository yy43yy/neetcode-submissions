class MinStack {
    Deque<Integer> minStack;
    Deque<Integer> stack;
    public MinStack() {
        minStack = new ArrayDeque<>();
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.addFirst(val);
        if(minStack.isEmpty()|| minStack.peekFirst()>=val) minStack.addFirst(val);
    }
    
    public void pop() {
        int removed=stack.removeFirst();
        if(removed==minStack.peekFirst()){
            minStack.removeFirst();
            

        }
    }
    
    public int top() {
        return stack.peekFirst();
    }
    
    public int getMin() {
        return minStack.peekFirst();
    }
}
