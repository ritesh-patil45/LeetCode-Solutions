class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] h = new int[m];
        int max = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] == '1'){
                    h[j] += 1; 
                }
                else{
                    h[j] = 0;
                }
            }
            max = Math.max(max,  largestRectangle(h));
        }
        return max;
    }
    int largestRectangle(int[] h){
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