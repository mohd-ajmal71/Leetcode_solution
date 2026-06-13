class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int ans[]=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int first=nums[i];
            int second=target-first;
            if(m.containsKey(second))
            {
                ans[0]=i;
                ans[1]=m.get(second);
            }
            m.put(first,i);
        }
        return ans;
        
        
    }
}