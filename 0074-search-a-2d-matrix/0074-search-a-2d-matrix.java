class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int[]nums=matrix[mid];
            int l=0;
            int h = nums.length - 1;
            int max=nums[h];
        
            while (l <= h) {
                int m = l + (h- l) / 2;
                if (nums[m] == target) {
                    return true;
                } else if (nums[m] > target) {
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            }
            if (max < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
