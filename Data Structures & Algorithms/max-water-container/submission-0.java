class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0,r=n-1;
        int res=Integer.MIN_VALUE;
        while(l<r)
        {
            int area=Math.min(heights[l],heights[r])*(r-l);
            res=Math.max(res,area);
            if(heights[l]<heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return res;
    }
}
