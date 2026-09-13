class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0; 
        for(int i=0;i < matrix.length; i++){
            if(matrix[i][0]<=target){
                
                start = i; 

            }
        }

        int l = 0;
        int r = matrix[start].length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(matrix[start][mid]==target){
                return true;
            }
            if(matrix[start][mid]>target){
                r=mid-1;
            }
            if(matrix[start][mid]<target){
                l=mid+1;
            }
        }

        return false;


    }
}
