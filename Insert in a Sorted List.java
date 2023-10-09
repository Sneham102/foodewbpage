class Solution {
    Node sortedInsert(Node head1, int key) {
    
        Node temp = new Node(key);
        if (head1 == null || head1.data > key) {
            temp.next = head1;
            return temp;
        }
        
        Node curr = head1;
        while (curr.next != null && curr.next.data < key) {
            curr = curr.next;
        }
        
        temp.next = curr.next;
        curr.next = temp;
        
        return head1;
    }
}
