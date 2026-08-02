class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k %= nums.size();
        reverse_vector(nums, 0 , nums.size()-1);
        reverse_vector(nums, 0 , k-1);
        reverse_vector(nums, k , nums.size()-1);
        


        
    }

    void reverse_vector(vector<int>& nums, int i, int j){
        while(i < j){
            swap(nums[i], nums[j]);
            i++;
            j--;
        }
    }

    
};