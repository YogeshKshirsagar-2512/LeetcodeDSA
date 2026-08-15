class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int target) {

        vector<int> ans;
        int i = 0 , j = arr.size()-1;
        while(i < j){
            if((arr[i] + arr[j]) == target){
                ans.push_back(i+1);
                ans.push_back(j+1);
                return ans;
            }else if(arr[i]+arr[j] < target) i++;
            else j--;
        }
        return ans;
        
    }
};