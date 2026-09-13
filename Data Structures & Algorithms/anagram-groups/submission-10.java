class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       

        HashMap<String, List<String>> map = new HashMap<>();
    
        

        for(String s: strs){
            int [] alph = new int[26];
            char [] cha = s.toCharArray();
            for(char c : cha){
                alph[c-'a']++;
            }
            String key = Arrays.toString(alph);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }

        }

         List<List<String>> result = new ArrayList<>();

        map.forEach((k,v)->result.add(v));

        return result;
    }
}
