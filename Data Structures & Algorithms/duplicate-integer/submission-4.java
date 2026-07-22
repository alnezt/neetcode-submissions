class Solution {
    public boolean hasDuplicate(int[] nums) {
        //hashmap 2
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                return true;
            }
            map.put(num,1);
        }
        return false;
    }
}