package ada;

import java.util.Arrays;

public class TSP {

    static final int INF = 9999999;

    // Function to solve TSP using dynamic programming
    static int tsp(int[][] graph, int mask, int pos, int n, int[][] dp) {
        if (mask == (1 << n) - 1) // if all cities have been visited
            return graph[pos][0]; // return to the starting city

        if (dp[mask][pos] != -1) // if already computed
            return dp[mask][pos];

        int ans = INF;

        // Try to visit every unvisited city
        for (int city = 0; city < n; city++) {
            if ((mask & (1 << city)) == 0) { // if city not visited
                int newAns = graph[pos][city] + tsp(graph, mask | (1 << city), city, n, dp);
                ans = Math.min(ans, newAns);
            }
        }
        return dp[mask][pos] = ans;
    }

    // Function to initialize DP table
    static int[][] initialize(int n) {
        int[][] dp = new int[1 << n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return dp;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        int n = graph.length;

        // DP table to memoize sub-problems
        int[][] dp = initialize(n);

        // Starting from vertex 0
        int ans = tsp(graph, 1, 0, n, dp);

        System.out.println("Minimum cost to visit all cities: " + ans);
    }
}

