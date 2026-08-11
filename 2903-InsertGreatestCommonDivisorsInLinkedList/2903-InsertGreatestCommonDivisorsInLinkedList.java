// Last updated: 8/11/2026, 4:03:39 PM
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur.next != null){
            int a = cur.val,
                b = cur.next.val;
                while(b != 0){
                    int t = b;
                    b = a % b;
                    a = t;
                }
                cur.next = new ListNode(a,cur.next);
                cur = cur.next.next;
        }
        return head;
    }
}
    
