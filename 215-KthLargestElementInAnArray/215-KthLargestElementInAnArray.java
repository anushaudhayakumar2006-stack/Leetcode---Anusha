// Last updated: 8/11/2026, 4:09:30 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

        for (int n : nums) {
            pq.offer(n);
            if (pq.size() > k) pq.poll();
        }

        return pq.peek();
    }
}