class Solution {
public:
    int singleNonDuplicate(vector<int>& arr) {
        if(arr.size()==1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[arr.size()-1] != arr[arr.size()-2]) return arr[arr.size()-1];
        int start = 0;
        int end = arr.size()-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) return arr[mid];
            int f = mid;
            int s = mid;
            if(arr[mid-1] == arr[mid]) f = mid-1;
            else s = mid+1;
            int leftlength = (f-start);
            if(leftlength % 2 != 0) end = f-1;
            else start = s+1;

        
        }
          return -1;
    }
};