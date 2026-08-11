// Last updated: 8/11/2026, 4:11:03 PM
class Solution {
    List<Integer> l = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode r) {
        if (r != null) {
            l.add(r.val);
            preorderTraversal(r.left);
            preorderTraversal(r.right);
        }
        return l;
    }
}