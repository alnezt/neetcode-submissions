class Solution {
    public int longestConsecutive(int[] nums) {
        //128 leetcode
        //nums->set pt search cu O(1);elimin duplicate
        Set<Integer> numsSet=new HashSet<>();
        for(int n:nums)
        {
            numsSet.add(n);
        }

        int lengthMax=0;
        int length=0;
        //parcurg array ul si vad daca am in set elem cu 1 mai mic
        int current;
        for(int num:nums)
        {  
            //verific daca e primul element din seq mai intai
            if(!numsSet.contains(num-1))
            {
                length=1;
                current=num;//compar 2 cate 2
            
            while(numsSet.contains(current+1))
            {
                length++; current++;//deci vr mereu sa am 2 vecini din nums
            }
            if(length>lengthMax)
            {
                lengthMax=length;
            }
        }}
        return lengthMax;
    }
}
