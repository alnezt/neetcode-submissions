class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap();
        for(String str:strs)
        { //construiesc un vector de freq pt fiecare cuvant
            int []freq=new int[26];     //toate elem sunt deja 0         
            
            for(Character c:str.toCharArray())
            {
                freq[c-'a']++;
            }
        //array->stringbuilder
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;++i)
            {
                sb.append(freq[i]);
                sb.append(',');//ca sa separ elementele, ex 11,1, nu 111
            }
//stringbuilder->string
            String key=sb.toString();
            //creez mapul
             map.putIfAbsent(key,new ArrayList<>());//creez o intrare noua pt key cu spatiu pt lista
             map.get(key).add(str);//add cuvintele gasite la lista cu acelasi key
            
        }
        return new ArrayList<>(map.values());
    }
}
