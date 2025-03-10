import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
          numbers[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {

                if(numbers[i] > numbers[j]) {
                    // 값 교환
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.println(sb);
  }
}
