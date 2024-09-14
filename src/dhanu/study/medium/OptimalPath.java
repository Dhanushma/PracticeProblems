package dhanu.study.medium;

public class OptimalPath {
    /*
     ** Instructions to candidate.
     **  1) You are an avid rock collector who lives in southern California. Some rare
     **     and desirable rocks just became available in New York, so you are planning
     **     a cross-country road trip. There are several other rare rocks that you could
     **     pick up along the way.
     **
     **     You have been given a grid filled with numbers, representing the number of
     **     rare rocks available in various cities across the country.  Your objective
     **     is to find the optimal path from So_Cal to New_York that would allow you to
     **     accumulate the most rocks along the way.
     **
     **     Note: You can only travel either north (up) or east (right).
     **  2) Consider adding some additional tests in doTestsPass().
     **  3) Implement optimalPath() correctly.
     **  4) Here is an example:
     **                                                           ^
     **                 {{0,0,0,0,5}, New_York (finish)           N
     **                  {0,1,1,1,0},                         < W   E >
     **   So_Cal (start) {2,0,0,0,0}}                             S
     **                                                           v
     **   The total for this example would be 10 (2+0+1+1+1+0+5).
     */

    public static int optimalPath(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[row-1][0] = grid[row-1][0];


        // filling first column
        for(int i = row-2; i >=0; i --) {
            dp[i][0] = dp[i+1][0] + grid[i][0];
        }

        // filling last row
        for(int j =1; j < col; j++) {
            dp[row-1][j] = dp[row-1][j-1] + grid[row-1][j];
        }

        // filling other grids
        for(int i = row-2; i >=0; i--) {
            for (int j = 1; j < col; j ++ ){
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]) + grid[i][j];
            }
        }

        System.out.println(dp[0][col-1]);
        return dp[0][col-1];
    }

    public static boolean doTestsPass()
    {
        boolean result = true;
        result &= optimalPath(new int[][]{{0,0,0,0,5},
                {0,1,1,1,0},
                {2,0,0,0,0}}) == 10;
        return result;
    }

    public static void main(String[] args)
    {
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("Tests fail.");
        }
    }
}
