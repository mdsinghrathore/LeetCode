class MinStack {
    protected  int[] a;
    protected int top;
    protected int[] min;

    public MinStack() {
        a=new int[30000];
        top=-1;
        min=new int[30000];
    }
    
    public void push(int p) {
        if (top + 1 < a.length) {
            top++;
            a[top] = p;

            if (top == 0) {
                min[top] = p;
            } else {
                min[top] = Math.min(p, min[top - 1]);
            }
        } else {
            System.out.println("Stack is Full");
        }
    }
    
    public void pop() {
        if(top>=0)
            top--;
        else{
            System.out.println("Stack is empty");
            
        }
    }
    
    public int top() {
        if(top>=0)
        return a[top];
        else{ 
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    
    public int getMin() {
        if (top >= 0)
            return min[top];
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
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