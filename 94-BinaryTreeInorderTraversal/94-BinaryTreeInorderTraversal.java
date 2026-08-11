// Last updated: 8/11/2026, 4:11:26 PM
class Solution {
    List<Integer> l = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode r) {
        if (r != null) {
            inorderTraversal(r.left);
            l.add(r.val);
            inorderTraversal(r.right);
        }
        return l;
    }
}