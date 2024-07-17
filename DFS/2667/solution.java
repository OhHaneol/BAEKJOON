package algorithm;

import java.io.*;
import java.util.*;

class Main {
    static int n, cnt;
    static int[][] danji;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static List<Integer> result;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && danji[nx][ny] == 1 && !visited[nx][ny]) {
                cnt++;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        cnt = 1;
        result = new ArrayList<>();
        visited = new boolean[n][n];
        danji = new int[n][n];

        // 지도 입력
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                danji[i][j] = str.charAt(j) - '0';
            }
        }

        // 단지 체크 : 0~n-1 까지 전부 돈다.
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (danji[x][y] == 1 && !visited[x][y]) {
                    dfs(x, y);
                    result.add(cnt);
                    cnt = 1;
                }
            }
        }

        // 정답 출력
        Collections.sort(result);
        bw.write(result.size() + "\n");
        for (Integer integer : result) {
            bw.write(integer + "\n");
        }
        bw.flush();
        bw.close();
    }
}
