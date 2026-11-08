class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left ; i<=right ; i++){
            int a = i;
            boolean flag = false;
            while(a > 0){
                int b = a % 10;
                if(b == 0 || i % b != 0){
                    flag = true;
                    break;
                }
                a = a/10;
            }
            if(flag == false) ans.add(i);
        }
        return ans;
    }
}