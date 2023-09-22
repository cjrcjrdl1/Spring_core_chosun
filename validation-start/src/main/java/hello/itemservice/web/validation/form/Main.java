package hello.itemservice.web.validation.form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] dp;
    static final int mod = 10007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[1001][10];

        int result = 0;

        for (int i = 0; i < 10; i++) {
            result += logic(n, i);
            result %= mod;
        }

        System.out.println(result);
    }

    public static int logic(int n, int i) {
        if (n == 1) {
            return dp[n][i] = 1;
        }

        if (dp[n][i] > 0) {
            return dp[n][i];
        }

        for (int k = 0; k <= i; k++) {
            dp[n][i] += logic(n - 1, k);
            dp[n][i] %= mod;
        }
        return dp[n][i];
    }

}
