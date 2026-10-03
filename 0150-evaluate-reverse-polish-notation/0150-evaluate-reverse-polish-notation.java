class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int n = arr.length;
        while(i < n){
            if(arr[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                int c = a + b;
                st.push(c);
            }
            else if(arr[i].equals("-")){
                int b = st.pop();
                int a = st.pop();
                int c = a - b;
                st.push(c);
            }
            else if(arr[i].equals("*")){
                int a = st.pop();
                int b = st.pop();
                int c = a * b;
                st.push(c);
            }
            else if(arr[i].equals("/")){
                int b = st.pop();
                int a = st.pop();
                int c = a / b;
                st.push(c);
            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
            i++;
        }
        int ans = st.pop();
        return ans;
    }
}