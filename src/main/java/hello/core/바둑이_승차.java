package hello.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑이_승차 {
    static int answer = Integer.MIN_VALUE;
    static int C, N;

    public static void DFS(int L, int sum, int[] arr) {
        if (sum>C) return;
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        바둑이_승차 T = new 바둑이_승차();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }


}
