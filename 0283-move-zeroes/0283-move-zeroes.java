
import java.util.Vector;
class Solution {
    public void moveZeroes(int[] nums) {

        Vector<Integer> ans = new Vector<>();
        int zeroes = 0;
        for(int i = 0 ;  i < nums.length ; i++){
            if(nums[i] == 0){
                zeroes++;
            }else{
                ans.add(nums[i]);
            }
        }
        for(int i = 0; i < zeroes; i++){
            ans.add(0);
        }
        for(int i = 0; i < ans.size(); i++){
            nums[i] = ans.get(i);
        }

        
    }
}