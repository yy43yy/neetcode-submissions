class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] s1Freq = new int [26];
        int [] s2Freq = new int [26];
        int l = 0; 
        int r = 0;
        
        if(s1.length()>s2.length()) return false;
        for(int i = 0; i<s1.length();i++){
            char c = s1.charAt(i);
            s1Freq[c-'a']++;

            char c2 = s2.charAt(i);
            s2Freq[c2-'a']++;
            r++;
        }
        if(Arrays.equals(s1Freq,s2Freq)) return true;
        while(r<s2.length()){
            
            char left = s2.charAt(l);
            s2Freq[left-'a']--;
            l++;
            
            char right = s2.charAt(r);
            s2Freq[right-'a']++;
            r++;

            if(Arrays.equals(s1Freq,s2Freq)) return true;
            
        }

        return false;


    }
}
