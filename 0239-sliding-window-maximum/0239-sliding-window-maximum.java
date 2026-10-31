class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i >= k-1) ans.add(arr[dq.peekFirst()]);
        }
        int[] fans = new int[ans.size()];
        for(int i=0 ; i<ans.size() ; i++){
            fans[i] = ans.get(i);
        }  
        return fans;
    }
}