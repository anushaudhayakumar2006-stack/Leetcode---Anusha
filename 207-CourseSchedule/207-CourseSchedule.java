// Last updated: 8/11/2026, 4:09:34 PM
import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());

        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        int taken = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            taken++;
            for (int nxt : graph.get(cur)) {
                indegree[nxt]--;
                if (indegree[nxt] == 0) queue.offer(nxt);
            }
        }

        return taken == numCourses;
    }
}
