class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replace(" ", "");
        
        char[] chars = temp.toCharArray();
        int left = 0;

        int right = chars.length-1;

        while(left<right){
            char l = chars[left];
            char r = chars[right];

            if(!Character.isLetterOrDigit(l)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(r)){
                right--;
                continue;
            }

            if(Character.toLowerCase(l) == Character.toLowerCase(r)){
                left++;
                right--;
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
