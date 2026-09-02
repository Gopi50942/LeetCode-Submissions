class Solution {
    public int totalHammingDistance(int[] nums) {
        int totalDistance = 0;
        int n = nums.length;
        
        // Loop through each of the 32 bit positions for a standard integer
        for (int i = 0; i < 32; i++) {
            int countOnes = 0;
            
            // Count how many numbers have the i-th bit set to 1
            for (int num : nums) {
                // Shift right by i and check if the last bit is 1
                countOnes += (num >> i) & 1;
            }
            
            // Numbers with 0 at the i-th bit
            int countZeros = n - countOnes;
            
            // Total differing pairs at this specific bit position
            totalDistance += countOnes * countZeros;
        }
        
        return totalDistance;
    }
}
