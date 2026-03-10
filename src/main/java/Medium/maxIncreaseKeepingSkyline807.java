package Medium;

public class maxIncreaseKeepingSkyline807 {
    public static void main(String[] args) {
        maxIncreaseKeepingSkyline(new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        });
    }

    static public int maxIncreaseKeepingSkyline(int[][] input) {

        int [][] grid=input;
        for (int i = 0; i < grid.length; i++) {
            int max = grid[i][0];
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                    j = 0;

                }
                grid[i][j] = max;
            }
        }


        for (int i = 0; i < grid.length; i++) {
            int max = grid[0][i];
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max) {
                    j = 0;
                    max = grid[j][i];
                }
                grid[i][j] = max;
            }
        }
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j< grid.length;j++)
            {
                sum+=Math.abs(input[i][j]-grid[i][j]);
            }
        }
        return 0;
    }
}
