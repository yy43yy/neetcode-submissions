class Solution {
    public int findDuplicate(int[] nums) {
        // nums n+1 integers
        // range 1 , n ;
        //only one repeated integer;

        // LinkedList; 

        int slow = 0;
        int fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums [nums[fast]];
            if(slow == fast) break;

        }

        slow = 0;

        while(true){
            slow= nums[slow];
            fast = nums[fast];
            if(slow == fast){
                break;
            }
        }

        return slow;

    }
}
