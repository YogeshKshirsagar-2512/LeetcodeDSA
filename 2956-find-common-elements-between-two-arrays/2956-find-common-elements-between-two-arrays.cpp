class Solution {
public:
    vector<int> findIntersectionValues(vector<int>& nums1, vector<int>& nums2) {



        vector<int> ans(2) ;
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        int ansone = findnumberofcommon(nums1, nums2);
        int anstwo = findnumberofcommon(nums2, nums1);
        ans[0] = ansone;
        ans[1] = anstwo;
        return ans;
   
        
    }

    int findnumberofcommon(vector<int>& nums1, vector<int>& nums2){
        int m = nums1.size();
        int n = nums2.size();
        
        int common = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ;  j < n ; j++){
                if(nums1[i] == nums2[j]){
                    common++;
                    break;
                }
            }
        }
  return common;
    }
};