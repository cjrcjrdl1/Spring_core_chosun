package hello.itemservice.web.validation.form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, count;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        int area = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count = 0;
                if (arr[i][j] == 1) {
                    bfs(i, j);
                    list.add(count);
                    area++;
                }
            }
        }

        Collections.sort(list);

        System.out.println(area);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        arr[x][y] = 0;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            count++;
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 1) {
                    q.add(new int[]{nx, ny});
                    arr[nx][ny] = 0;
                }
            }
        }
    }
}
