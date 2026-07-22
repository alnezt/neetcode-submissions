class Solution {
    public boolean isAnagram(String s, String t) {
//2 map uri de freq
    HashMap<Character,Integer> mapS=new HashMap();
    for(Character c:s.toCharArray())
    {
        if(!mapS.containsKey(c))
        {
            mapS.put(c,1);
        }
        else
        {
            mapS.put(c,mapS.get(c)+1);
        }

    }

    HashMap<Character,Integer> mapT=new HashMap();
    for(Character c:t.toCharArray())
    {
        if(!mapT.containsKey(c))
         {
            mapT.put(c,1);
        }
        else
        {
            mapT.put(c,mapT.get(c)+1);
        }
    }

    if(mapS.equals(mapT))
    {
        return true;
    }
    return false;

}
}
