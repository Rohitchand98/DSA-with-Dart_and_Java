
//in This process we are finding island from grid of arrays
//char is used to check the island
//Depth first search is used in this process
void main() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '1', '0'},
            {'0', '0', '0', '0', '1'}
        };

        if(grid==null||grid.length==0){
            IO.print(grid);
        }
        int numsOfIsland=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1'){
                    numsOfIsland++;
                    dfs(grid,i,j);
                }
            }
        }
        IO.print(numsOfIsland);
}
private void dfs(char[][] grid, int i, int j) {
    if (i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0') {
        return;//Okay, I’m done here, stop and go back to the caller
    }//If the indices are out of bounds or the cell is water ('0'), you immediately exit the method.No further recursion happens for that branch.

    //assign all the traversed island
    grid[i][j]='0';

    //check all the sides of the island adjacents, DFS: “Consume the whole island at once” (mark it visited).
    dfs(grid, i-1,j);
    dfs(grid, i+1,j);
    dfs(grid, i,j-1);
    dfs(grid, i,j+1);
    //Why a function can call itself
    //This is the essence of recursive algorithms: a function invokes itself with slightly different parameters until a base condition (return;) stops the chain.

}

