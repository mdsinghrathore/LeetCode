class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < nums.length; i++) {
            while(!st.isEmpty() && nums[i] > nums[st.peek()]) {
                int prev = st.pop();
                ans[prev] = i - prev;
            }
            st.push(i);
        }
        return ans;
    }
}