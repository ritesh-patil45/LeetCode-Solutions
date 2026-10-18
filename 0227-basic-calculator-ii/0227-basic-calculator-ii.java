class Solution {
    public int calculate(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            int ascii = (int)ch - 48;
            if (ch == ' ') {
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
                int a = Integer.parseInt(sb.toString());
                val.push(a);
                continue;
            }
            else if(op.isEmpty()){
                op.push(ch);
            }
            else{
                if(ch == '+' || ch == '-'){
                    while(!op.isEmpty()){
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek() == '+') val.push(val1 + val2);
                        if(op.peek() == '-') val.push(val1 - val2);
                        if(op.peek() == '*') val.push(val1 * val2);
                        if(op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                    }
                    op.push(ch);
                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '+' || op.peek() == '-'){
                        op.push(ch);
                    }
                    else{
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek() == '*') val.push(val1 * val2);
                        if(op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                        op.push(ch);
                    }
                }
            }
            i++;
        }
        while(!op.isEmpty()){
            int val2 = val.pop();
            int val1 = val.pop();
            if(op.peek() == '+') val.push(val1 + val2);
            if(op.peek() == '-') val.push(val1 - val2);
            if(op.peek() == '*') val.push(val1 * val2);
            if(op.peek() == '/') val.push(val1 / val2);
            op.pop();
        }
        return val.peek();
    }
}