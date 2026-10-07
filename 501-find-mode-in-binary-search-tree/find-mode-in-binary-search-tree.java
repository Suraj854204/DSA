/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public int[] findMode(TreeNode root) {
       dfs(root);
       int max=0;
       for(int freq:map.values()){
        max=Math.max(max,freq);
       }
       ArrayList<Integer>list=new ArrayList<>();
       for(int key:map.keySet()){
        if(map.get(key)==max){
            list.add(key);
        }
       }
       int arr[]=new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
       return arr;
    }
    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        map.put(node.val,map.getOrDefault(node.val,0)+1);
        dfs(node.left);
        dfs(node.right);
    }
}