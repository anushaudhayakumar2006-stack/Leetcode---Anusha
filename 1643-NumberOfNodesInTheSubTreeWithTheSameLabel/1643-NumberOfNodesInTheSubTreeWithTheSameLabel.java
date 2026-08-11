// Last updated: 8/11/2026, 4:04:46 PM
import java.util.*;
class Solution {
    List<Integer>[] graph;
    int[] result;
    String labels;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        this.labels = labels;
        result = new int[n];
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        dfs(0, -1);
        return result;
    }

    private int[] dfs(int node, int parent) {
        int[] count = new int[26];
        int labelIndex = labels.charAt(node) - 'a';
        count[labelIndex] = 1;
        for (int neighbor : graph[node]) {
            if (neighbor == parent) continue;

            int[] childCount = dfs(neighbor, node);
            for (int i = 0; i < 26; i++) {
                count[i] += childCount[i];
            }
        }
        result[node] = count[labelIndex];
        return count;
    }
}
