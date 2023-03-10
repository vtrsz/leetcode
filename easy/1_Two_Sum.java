class Solution {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((nums[i] + nums[j]) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }
}