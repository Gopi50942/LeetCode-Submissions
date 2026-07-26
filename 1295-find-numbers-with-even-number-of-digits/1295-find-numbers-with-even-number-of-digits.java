class Solution {
    public int findNumbers(int[] nums) {
        int lcount = 0;      
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i]; 
            int ncount = 0; 
            while (temp > 0) {
                ncount++;
                temp = temp / 10;
            }
            if (ncount % 2 == 0) {
                lcount++;
            }
        }     
        return lcount;
    }
}