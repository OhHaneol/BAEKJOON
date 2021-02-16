import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[9];
        int no = 0;
        int max = 0;

        for(int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            if(max == numbers[i]) no = i + 1;
        }

        System.out.println(max);
        System.out.println(no);
    }
}
