class Solution {
    public int search(int[] nums, int target)
    {
        int size=nums.length-1;
        int left=0;
        int right=size;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)return mid;


            if(nums[mid]>=nums[right])
            {
                if(nums[mid]>target && nums[left]<=target)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }

            }
            else if(nums[mid]<nums[right])
            {
                if(nums[mid]<target && target<=nums[right])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
            else
            {

            }
            
        }
        return -1;
        
    }
}