package medium;

import java.util.Arrays;

public class coinChange {
  public int coinChange(int[] coins, int amount) {
    // Initialize an array of size amount + 1 to keep track of the minimum number of coins needed to make up each amount
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1); // Set all elements of the array to amount + 1 as the maximum possible value

    dp[0] = 0; // Base case: 0 coins needed to make up 0 amount

    // Loop through each amount from 1 to amount
    for (int i = 1; i <= amount; i++) {
      // Loop through each coin denomination
      for (int j = 0; j < coins.length; j++) {
        // If the coin denomination is less than or equal to the current amount, update the minimum number of coins needed for the current amount
        if (coins[j] <= i) {
          dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
        }
      }
    }

    // If the last element of the dp array is still amount + 1, it means the amount cannot be made up by any combination of coins
    return dp[amount] > amount ? -1 : dp[amount];
  }
}
