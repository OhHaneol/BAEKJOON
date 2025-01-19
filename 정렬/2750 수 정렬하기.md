package algorithm;


import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++) {
          numbers[i] = Integer.parseInt(br.readLine());

        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
              if(numbers[i] > numbers[j]){
                  int temp = numbers[i];
                  numbers[i] = numbers[j];
                  numbers[j] = temp;
              }
            }
        }

        for (int number : numbers) {

            System.out.println(number);
        }
  }
}
