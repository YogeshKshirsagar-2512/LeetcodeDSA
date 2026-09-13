class Solution {

    public int binary(int low, int high, int[] nums, int target){
        if(low > high) return -1;
        int mid = low + (high - low)/2;
        if(nums[mid] > target) return binary(low, mid-1, nums,target);
        else if(nums[mid] < target) return binary(mid+1, high, nums,target);
        else return mid;
    }
    public int search(int[] nums, int target) {
        return binary(0, nums.length-1, nums,target);
    }
}