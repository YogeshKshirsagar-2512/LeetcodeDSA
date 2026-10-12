class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> ans = new Stack<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            String s = arr[i];
            if(s.equals("C")) ans.pop();
            else if(s.equals("D")) ans.push(2*ans.peek());
            else if(s.equals("+")){
                int top = ans.pop();
                int second_top = ans.peek();
                int sum = top + second_top;
                ans.push(top);
                ans.push(sum);
            }else{
                ans.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while(ans.size() > 0){
            sum += ans.pop();
        }
        return sum;
    }
}