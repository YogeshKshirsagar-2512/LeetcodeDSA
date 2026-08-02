class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        vector<int> ans;
        int carry = 1;
        for(int i = digits.size()-1 ; i >= 0; i--){
            if(digits[i] + carry < 10){
                ans.push_back(digits[i]+carry);
                carry = 0;

            }
            else{
                ans.push_back(0);
                carry = 1;
            }

        }
        if(carry == 1){
            ans.push_back(1);
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};