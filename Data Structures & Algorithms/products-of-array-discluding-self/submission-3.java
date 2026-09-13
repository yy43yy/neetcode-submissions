class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int zeroIndex =0;
        int prefix =1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroIndex=i;
                zeroCount++;
            }else{
                prefix*=nums[i];
            }
        }
        int[] result = new int [nums.length];
        if(zeroCount>1) return result;
        if(zeroCount ==1){
            result[zeroIndex] = prefix;
            return result;
        }

        for(int j =0;j<nums.length;j++){
            int temp = prefix/nums[j];
            result[j] = temp;
        }

        return result;
    }
}  
