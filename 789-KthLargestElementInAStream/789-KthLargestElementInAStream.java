// Last updated: 8/11/2026, 4:06:58 PM
import java.util.*;

class KthLargest {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] a) {
        this.k = k;
        for (int x : a) add(x);
    }

    public int add(int v) {
        q.offer(v);
        if (q.size() > k) q.poll();
        return q.peek();
    }
}