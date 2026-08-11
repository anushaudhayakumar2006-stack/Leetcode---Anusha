// Last updated: 8/11/2026, 4:09:20 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}