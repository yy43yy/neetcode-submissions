class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] alph = new int[26];
        int l = 0;
        int maxFreq=0;
        int result=0;
        for(int r = 0; r<s.length();r++){
            
            alph[s.charAt(r)-'A']++;
            maxFreq= Math.max(maxFreq, alph[s.charAt(r)-'A']);

            while((r-l+1)-maxFreq>k){
                alph[s.charAt(l)-'A']--;
                l++;

                
            }
            result = Math.max(result,(r-l+1));
        }
        return result;

    }
}
