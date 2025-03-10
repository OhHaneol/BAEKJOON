// 오름차순 정렬
// 데이터의 크기가 최대 100만 개 까지 늘어났다. 시간 복잡도 O(n2) 의 선택정렬은 시간 초과로 실패한다.

import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
          numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.println(sb);
  }
}
