class Solution {
    public String mapWordWeights(String[] words, int[] weights) 
    {
        int sum=0;
        String result="";

        for(String w :words)
        {  
            int i=0;
            sum=0;
            while(i<w.length())
            { 
                int idx=w.charAt(i)-'a'+1;
                sum+=weights[--idx];
                i++;
            }
            sum=sum%26;
            int l=26-sum;
            char ch= (char)('a'+l-1);
            result=result+ch;

        }
        return result;
        
    }
}