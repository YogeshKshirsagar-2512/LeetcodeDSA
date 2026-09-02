class Solution {
public:
    bool NotValid(char ch) {
        if(97 <= ch &&  ch <= 122) return false;
        if(48 <= ch &&  ch <= 57) return false;
        else return true;
    }
    bool isPalindrome(string s) {
        
        int i = 0 ;
        int j = s.size()-1;

        while(i < j){
            char x = s[i];
            char y = s[j];

            if(65 <= x &&  x <= 90) x += 32;
            if(65 <= y &&  y <= 90) y += 32;

            if(NotValid(x)) i++;
            else if(NotValid(y)) j--;
            else{
                if(x != y) return false;
                i++;
                j--;
            }


        }
        
            return true;
    }
};