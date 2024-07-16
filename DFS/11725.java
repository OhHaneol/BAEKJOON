package algorithm;

import java.util.*;

class Main {
    static int n;   // 노드 개수 : 1~n
    static int[] parent;
    static boolean[] visited;    // 부모 노드를 저장하는 배열
    static List<List<Integer>> adjList;

    public static void findParent(int currentNode) {
        visited[currentNode] = true;
        for (int adjacent : adjList.get(currentNode)) {
            if (!visited[adjacent]) {   // 인접 노드가 방문되지 않았다면(자식 노드라면)
                parent[adjacent] = currentNode; // 인접 노드의 부모 노드를 현재 노드로 설정
                findParent(adjacent);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 인접 리스트 만들기
        adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        // 부모 노드를 찾기
        parent = new int[n + 1];
        visited = new boolean[n + 1];
        findParent(1);

        // 부모 노드 출력
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }
}
