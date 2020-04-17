// LeetCode Problem 200: Number of Islands
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class islandSearch {
    public void BFS(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        BFS(grid, i+1, j); // Up
        BFS(grid, i-1, j); // Down
        BFS(grid, i, j-1); // Left
        BFS(grid, i, j+1); // Right
    }
    
    public int numIslands(char[][] grid) {
        int count = 0;
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    BFS(grid, i, j);
                }
            }
        }  
        
        return count;
    }
}