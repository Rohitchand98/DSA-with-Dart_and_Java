void main(){
    //Optimal solution Using Tabulation DP bottom up
    int amount=11;
    int[] coins={1,5,5};

    int max=amount+1;
    int[] dp=new int[max];
    Arrays.fill(dp, max);
    dp[0]=0;

    for (int i = 1; i <=amount; i++) {
        for (int j=0; j<coins.length; j++) {
            if (coins[j]<=i) {
                dp[i]=Math.min(dp[i], dp[i-coins[j]]+1);
            }  
        }
    }
    IO.print(dp[amount]>amount?-1:dp[amount]);
}