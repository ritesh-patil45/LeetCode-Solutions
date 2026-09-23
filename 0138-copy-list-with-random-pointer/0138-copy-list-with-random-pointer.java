class Solution {
    Node connect(Node head, Node head2){
        Node pre1 = head;
        Node pre2 = head2;
        Node t1 = pre1.next;
        Node t2 = pre2.next;
        while(t2 != null){
            pre1.next = pre2;
            pre2.next = t1;
            pre1 = t1;
            pre2 = t2;
            t1 = t1.next;
            t2 = t2.next;        
        }
        pre1.next = pre2;
        return head;
    }
    Node disconnect(Node head){
        Node ans = head.next;
        Node t1 = head;
        Node t2 = head.next;
        while (t1 != null) {
            t1.next = t2.next;
            if (t2.next != null) {
                t2.next = t2.next.next;
            }
            t1 = t1.next;
            if (t1 != null) {
                t2 = t1.next;
            }
        }
        return ans;
    }
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node head2 = new Node(head.val);
        Node t1 = head;
        Node t2 = head2;
        while(t1.next != null){
            t1 = t1.next;
            Node a = new Node(t1.val);
            t2.next = a;
            t2 = t2.next;
        }  
        Node newhead = connect(head, head2);
        t1 = newhead;
        t2 = t1.next;
        while(t2 != null){
            if(t1.random != null){
                t2.random = t1.random.next;
            }
            else{
                t2.random = null;
            }
            if(t2.next == null){
                t2 = t2.next;
                break;
            }
            t2 = t2.next.next;
            t1 = t1.next.next;
        }
        Node ans = disconnect(newhead);  
        return ans;
    }
}