class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        if(n<3) return ans;
        for(int i=0;i<n-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int target=-nums[i];
            twoSum(nums,i+1,n-1,target,ans);
        }
        return ans;
    }
    public void twoSum(int[] nums,int l,int r,int targ,List<List<Integer>>res)
    {
        
        while(l<r)
        {
            if(nums[l]+nums[r]==targ)
            {
                res.add(Arrays.asList(nums[l],nums[r],-targ));
                l++;
                r--;
                while(l<r && nums[l]==nums[l-1])
                {
                    l++;
                }
                while(l<r && nums[r]==nums[r+1])
                {
                    r--;
                }
            }
            else if(nums[l]+nums[r]<targ)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
    }
}
