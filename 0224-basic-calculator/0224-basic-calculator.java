class Solution {
    public int calculate(String s) {
        Stack<Long> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int i = 0;
        char prev = '('; 
        while(i < s.length()){
            char ch = s.charAt(i);
            int ascii = (int)ch - 48;
            if(ch == ' ') {
                i++;
                continue;
            }
            else if(ascii >= 0 && ascii <= 9){
                StringBuilder sb = new StringBuilder();
                while(i < s.length()){
                    ch = s.charAt(i);
                    ascii = (int)ch - 48;
                    if(ascii < 0 || ascii > 9) break;
                    sb.append(ascii);
                    i++;
                }
                long a = Long.parseLong(sb.toString());
                val.push(a);
                prev = '0';
                continue;
            }
            if((ch == '+' || ch == '-') && prev == '('){
                val.push(0L);
            }
            if(ch == ')'){
                while(op.peek() != '('){
                    long val2 = val.pop();
                    long val1 = val.pop();
                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    op.pop();
                } 
                op.pop();  
            }
            else if(ch == '(' || op.size() == 0 || op.peek() == '('){
                op.push(ch);
            }
            else{
                if(op.size() == 0){
                    op.push(ch);
                }
                else{
                    long val2 = val.pop();
                    long val1 = val.pop();
                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    op.pop();
                    op.push(ch);
                }
            }
            prev = ch;
            i++;
        } 
        while(!op.isEmpty()){
            long val2 = val.pop();
            long val1 = val.pop();
            if(op.peek() == '+') val.push(val1 + val2);
            if(op.peek() == '-') val.push(val1 - val2);
            op.pop();
        }  
        return (int)val.peek().longValue();
    }
}