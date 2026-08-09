class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer>target=new ArrayList<>();
        int a=nums.length;
         for (int i = 0; i < a; i++) {
            target.add(index[i], nums[i]);
        }
        int[] result=new int[a];
        for (int i = 0; i < a; i++) {
            result[i] = target.get(i);
        }
        return result;
    }
}