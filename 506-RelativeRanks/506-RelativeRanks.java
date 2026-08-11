// Last updated: 8/11/2026, 4:07:56 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] m = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] ans = new String[score.length];
        Integer[] idx = java.util.stream.IntStream.range(0, score.length).boxed().toArray(Integer[]::new);

        Arrays.sort(idx, (a, b) -> score[b] - score[a]);
        for (int i = 0; i < idx.length; i++)
            ans[idx[i]] = i < 3 ? m[i] : "" + (i + 1);

        return ans;
    }
}