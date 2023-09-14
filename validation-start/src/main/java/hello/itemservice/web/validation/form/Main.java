package hello.itemservice.web.validation.form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(logic(n));
    }

    static int logic(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(logic(n - 1), Math.min(logic(n / 3), logic(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(logic(n / 3), logic(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(logic(n / 2), logic(n - 1)) + 1;
            } else {
                dp[n] = logic(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
