class MyQueue {
 Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
     public MyQueue() {
           
    }
    
    public void push(int x) {
        s1.push(x);  // Always push onto s1
    }
    
    public int pop() {
        // If s2 is empty, transfer all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();  // Pop from s2 which contains the oldest elements
    }
    
    public int peek() {
        // If s2 is empty, transfer all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();  // Peek from s2 which contains the oldest elements
    }
    
    public boolean empty() {
        // Queue is empty if both stacks are empty
        return s1.isEmpty() && s2.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */