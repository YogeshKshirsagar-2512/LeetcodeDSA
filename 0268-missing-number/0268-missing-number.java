class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int array_sum = 0;
        for(int ele : nums){
            array_sum += ele;
        }
        return sum - array_sum;
    }
}