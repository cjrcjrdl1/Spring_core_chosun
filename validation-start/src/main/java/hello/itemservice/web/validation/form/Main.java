package hello.itemservice.web.validation.form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dp[] = new int[12];

        int t = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
            }
            sb.append(dp[n]).append('\n');
        }

        System.out.println(sb);
    }


}
