class Solution {
    public boolean checkInclusion(String s1, String s2) 
    { 
        int s2_size=s2.length();
        int s1_size=s1.length();
        int S1[]=new int [256];
        int S2[]=new int [256];
        for( char ch : s1.toCharArray())
        {
            S1[ch]++;
        }
      

        for(int i =0;i<s2_size-s1_size+1;i++)
        {
            for(int j=i;j<i+s1_size;j++)
            {
                char ch=s2.charAt(j);
                S2[ch]++;
            }
            if(equals(S1,S2))
            {
                return true;
            }
            for(int z=0;z<256;z++)
            {
                S2[z]=0;
            }
        }
        return false;
        
    }


    boolean equals(int S1[],int S2[])
    {
        for(int i=0;i<S1.length;i++)
        {
            if(S1[i]!=S2[i])
            {
                return false;
            }
        }
        return true;
    }
}