// This is a mutant program.
// Author : ysma

public class BackPack
{

    public static  int[][] BackPack_Solution( int m, int n, int[] w, int[] p )
    {
        int[][] c = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            c[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
        }
        return c;
    }

}
