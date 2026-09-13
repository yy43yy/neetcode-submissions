class Solution {
    public boolean isAnagram(String s, String t) {
        char [] chaS= s.toCharArray();
        char [] chaT= t.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : chaS){ 
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c: chaT ){
            if(!map.containsKey(c)){
                return false;
            }else if(map.get(c)==1){
                map.remove(c);
            }else{
                map.put(c,map.get(c)-1);
            }
        }  

        if(map.isEmpty()){
            return true;
        }
        return false;

    }
}
