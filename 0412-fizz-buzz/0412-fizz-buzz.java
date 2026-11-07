class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<>();
        int i = 1;
        while(i <= n){
            if (i % 15 == 0) {
                arr.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                arr.add("Fizz");
            } 
            else if (i % 5 == 0) {
                arr.add("Buzz");
            } 
            else {
                arr.add(String.valueOf(i));
            }
            i++;
        }
        return arr;
    }
}