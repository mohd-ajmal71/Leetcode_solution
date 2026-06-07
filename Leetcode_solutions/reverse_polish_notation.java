class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> st=new Stack<>();

        for(String num:tokens)
        {
            if(num.equals("*"))
            {
                int first=st.pop();
                int second=st.pop();
                int val =first*second;
                st.push(val);


            }
            else if(num.equals("+"))
            {
                int first=st.pop();
                int second=st.pop();
                int val =first+second;
                st.push(val);

            }
            else if(num.equals("-"))
            {
                int second=st.pop();
                int first=st.pop();
                int val=first-second;
                st.push(val);

            }
            else if(num.equals("/"))
            {   
                int second=st.pop();
                int first=st.pop();
                int val=first/second;
                st.push(val);

            }
            else
            {
                st.push(Integer.parseInt(num));
            }
        } 
        return st.pop();
    }
}