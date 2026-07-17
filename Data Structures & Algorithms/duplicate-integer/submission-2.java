class Solution {
    public boolean hasDuplicate(int[] nums) {
        //imi initializez un ht
        HashMap<Integer,Integer> map=new HashMap();
    //pt fiecare element din vector
        for(int num : nums)
        {//verific daca am key in map
            if(map.containsKey(num))
            {
                return true;
            }
            //pun 1, gasit
            map.put(num,1);
        }
        return false;
    }
}