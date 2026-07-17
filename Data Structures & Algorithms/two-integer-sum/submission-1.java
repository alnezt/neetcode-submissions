class Solution {
    public int[] twoSum(int[] nums, int target) {

        //nums[i] + nums[j] == target
        //abordare: iterez cu un singur index si aflu cat imi mai trebuie pt target
        //=> difference=target-nums[i] 
        //analog hint 3
        //fac un hashmap cu elementele array ului

        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;++i)
        {
            map.put(nums[i],i);//eu voi avea nevoie de index
        }
        int [] result=new int[2];
        for(int i=0;i<nums.length;++i)
        {
            int difference=target-nums[i];
            if(map.containsKey(difference) && map.get(difference) != i)
            {
                result[0]=map.get(difference);// get imi da valoarea asociata cheii
            //aici valoarea asociata cheii == indexul elem. din array
               result[1]=i;
               if(result[1]<result[0])
               {
                   int aux=result[1];
                   result[1]=result[0];
                   result[0]=aux;
               }
               return result;
            }
        }
      
        return result;
    }
}
