class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        vector<int> ans;
        int n = digits.size()-1;
        if(digits[n] != 9){  
        digits[n]++;
        for(int i = n ; i >= 0 ; i--){
            ans.push_back(digits[i]);
        }
        reverse(ans.begin(),ans.end());
        return ans ;
        }
        else{
            int carry = 1;
            for(int i = n ; i >= 0 ; i--){
            if(digits[i] + carry > 9){
                ans.push_back(0);
                carry = 1;
            }else{
                ans.push_back(digits[i] + carry);
                carry = 0;
            }
        }
        if(carry == 1) ans.push_back(1);
        reverse(ans.begin(), ans.end());
        return ans;


        }
        
        return ans;
    }
};