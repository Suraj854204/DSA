class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][]prefix=new int[m][n];
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int xor=matrix[i][j];
                if(i>0){
                    xor^=prefix[i-1][j];
                }
                if(j>0){
                    xor^=prefix[i][j-1];
                }
                if(i>0 && j>0){
                    xor^=prefix[i-1][j-1];
                }
                prefix[i][j]=xor;
                list.add(xor);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        return list.get(k-1);
    }
}