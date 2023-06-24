package hello.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대점수_구하기 {
    static int answer = Integer.MIN_VALUE;
    static int N,M;

    boolean flag = false;

    public static void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time>M) return;
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum+ps[L], time+pt[L],ps,pt);
            DFS(L+1, sum, time,ps,pt);
        }
    }

    public static void main(String[] args) throws IOException {
        최대점수_구하기 T = new 최대점수_구하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        T.DFS(0, 0, 0,a,b);
        System.out.println(answer);
    }


}
