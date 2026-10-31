class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int mod = num % 10;
            int div = num / 10;
            num = mod + div;
        }
        return num;
    }
}