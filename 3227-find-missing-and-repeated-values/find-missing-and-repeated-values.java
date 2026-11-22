class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int hash[] = new int[n*n + 1];
        int ans[] = new int[2];

        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid.length ; j++){
                int ind = grid[i][j];
                hash[ind]++;
            }
        }

        for(int i = 1 ; i<hash.length ; i++){
            if(hash[i] == 0)
                ans[1] = i;
            else if(hash[i] == 2)
                ans[0] = i;
        }

        return ans;

    }
}