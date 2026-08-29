class Solution {
public:
    int compress(vector<char>& chars) {

        string ans;
        int n = chars.size();
        int i = 0;
        int j = 0;

        while(j < n){
            if(chars[i] == chars[j])j++;
            else{
                int len = j-i;
                ans.push_back(chars[i]);
                if(len > 1) ans += to_string(len);
                i=j;
            }
        }
            int len = j-i;
            ans.push_back(chars[i]);
            if(len > 1) ans += to_string(len);
            vector<char> result(ans.length());
            for(int k = 0 ; k < ans.length() ; k++){
                result[k] = ans[k];
            }
            chars = result;
            return chars.size();
        
    }
};