class Solution {
    public int maxArea(int[] heights) {
        
        int left=0;
        int right=heights.length-1;
        int amount,amountMax;
        amount=(right-left)*Math.min(heights[left],heights[right]);
        amountMax=amount;
        while(left<right)
        {
            amount=(right-left)*Math.min(heights[left],heights[right]);
            if(heights[left]>heights[right])
            {
                --right;
            }
            else
            {
                ++left;
            }
        if(amount>amountMax)
        {
            amountMax=amount;
        }
           
        }
        return amountMax;
    }
}
