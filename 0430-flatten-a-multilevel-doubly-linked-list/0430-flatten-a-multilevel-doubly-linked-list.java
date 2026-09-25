class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp !=  null){
            if(temp.child != null){
                Node n = temp.next;
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                temp.child = null;
                temp = n;
                while(c.next != null){
                    c = c.next;
                }
                c.next = n;
                if(n != null) n.prev = c;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}