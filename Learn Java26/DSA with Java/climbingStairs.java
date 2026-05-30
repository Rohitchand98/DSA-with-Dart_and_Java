      void main() {
        int n=4;
        if (n<=1) {
            IO.print(1);
        }

        //Optimal Solution 
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        IO.print(dp[n]);
      }
