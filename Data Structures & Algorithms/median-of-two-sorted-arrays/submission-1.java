class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //so two mark in two array
        // left of the nums1 + left of the nums2 == right of both
        
        int m = nums1.length;
        int n = nums2.length;

        if(m>n ) return findMedianSortedArrays(nums2,nums1);
        int target = (m+n+1) /2;

        int l = 0;
        int r = m;
        while(true){
            int i = (l+r)/2;

            int j = target - i;
            int mLeft = (i==0) ? Integer.MIN_VALUE : nums1[i-1];
            int mRight = (i==m) ? Integer.MAX_VALUE :nums1[i];
            int nLeft = (j==0) ? Integer.MIN_VALUE :nums2[j-1];
            int nRight = (j==n) ? Integer.MAX_VALUE :nums2[j];
            
            if (mLeft <= nRight && nLeft <= mRight){
                if((m+n)%2==1){
                    return Math.max(mLeft,nLeft);
                }

                return(Math.max(mLeft,nLeft)+Math.min(mRight,nRight))/2.0;
            }else if(mLeft>nRight){
                r=i-1;
                continue;
            }else{
                l = i + 1;
                continue;
            }

        }





    }
}
