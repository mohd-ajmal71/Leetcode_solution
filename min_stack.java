class MinStack {
    Stack<Integer> st;
    int min=Integer.MIN_VALUE;
    ArrayList<Integer> minArray=new ArrayList<>();

    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) 
    {
        if(min>val)
        {
         min=val;
        }

        st.push(val);
        minArray.add(val);
        
    }
    
    public void pop()
    {
        minArray.remove(Integer.valueOf(st.peek()));
        st.pop();
        
    }
    
    public int top() 
    {
        return st.peek();
        
    }
    
    public int getMin() 
    {
      Collections.sort(minArray);
      return minArray.get(0);  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */