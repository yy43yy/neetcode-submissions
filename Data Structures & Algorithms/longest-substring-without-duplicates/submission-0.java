class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        int r = 0;
        int result=0;
        while(r<s.length()){
            char c = s.charAt(r);

            if(!set.contains(c)){
                set.add(c);
                r++;
                result= Math.max(result, set.size());
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }

        return result;
    }
}
