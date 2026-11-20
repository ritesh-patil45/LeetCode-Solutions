class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int i = 0;
        Stack<Integer> st = new Stack<>();
        int hig = 0;
        int largest = 0;
        while(i <= n){
            if(i == n) hig = 0;
            else hig = h[i];
            while(!st.isEmpty() && hig < h[st.peek()]){
                int height = h[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                int area =  height * width;
                largest = Math.max(largest, area);
            }
            st.push(i++);
        }
        return largest;
    }
}