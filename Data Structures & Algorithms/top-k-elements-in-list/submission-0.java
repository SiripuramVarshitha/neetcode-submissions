class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(mp.entrySet());

        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int[] ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }
}
