class Solution 
{
    public int maxArea(int[] height)
    {
        int size=height.length-1;
        int left=0;
        int right=size;

        int max=0;
        int m;
        while(left<right)
        {
            if(height[left]<height[right])
            {
               m= height[left]*(right-left);
               left++;
            }else
            {
               m= height[right]*(right-left);
               right--;
            }

            if(m>max)
            {
                max=m;
            }


        }  

        return max;
    }
}