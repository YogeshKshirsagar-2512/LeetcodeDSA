class Solution {
public:
    string toLowerCase(string s) {
        string LowerCase;
        for(int i = 0 ; i < s.length(); i++){
            if(65<=s[i] && s[i]<= 90) LowerCase.push_back(s[i] += 32);
            else LowerCase.push_back(s[i]);
        }
        return LowerCase;
    } 
};