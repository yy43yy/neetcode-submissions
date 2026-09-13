class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap <>();
        
        for(int i = 0; i< strs.length;i++){
            int [] alph = new int[26];
            char [] cha = strs[i].toCharArray();

            for (char c: cha){
                alph[c-'a']++;
            }
            String key = Arrays.toString(alph);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }


        }


        List<List<String>> result = new ArrayList<>();

        map.forEach((k,v)->{result.add(v);});

        return result;
    }
}
