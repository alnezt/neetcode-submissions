class Solution {

    public String encode(List<String> strs) {
      //primes lista de string uri, trebuie returnate intr un sg string
      //concatenare cu delimitator:length#
      StringBuilder result=new StringBuilder("");
      for(String str:strs)
      {
        result.append(str.length()).append("#").append(str);
      }
      return result.toString();
    }

    public List<String> decode(String str) {
//primesc string, return lista
List<String> result=new ArrayList<>();
      //length poate avea mai multe caractere=>
      //caut # si caut urmatorul #
      //3#ana3#are4#mere
      int start=0;
      while(start<str.length())
      {
        int end=start;
        while(str.charAt(end)!='#')
        {
          end++;
        }
        //determin lungimea cuvantului
        int substrLength=Integer.parseInt(str.substring(start,end));
        end++;
        result.add(str.substring(end,end+substrLength));
        start=end+substrLength;
      }
      return result;

    }
}
