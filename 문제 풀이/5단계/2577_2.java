import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];
        int[] arr = new int[10];
        int[] multi;
        int mul = 0;
        int digit;

        for(int i = 0; i< 10; i++) {
            arr[i] = 0;
        }

        //정수를 입력 받아서 곱하기
        for(int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }
        mul = numbers[0]*numbers[1]*numbers[2];

        //int 를 String 으로 바꿔서 자릿수 알아내기
        String num = Integer.toString(mul);
        digit = num.length();

        multi = new int[digit];

        //String 을 잘라서 배열에 저장
        for(int i=0;i<digit;i++) {
            String a = num.substring(i,i+1);
            multi[i] = Integer.parseInt(a);
        }

        //배열에서 숫자 개수 세기
        for(int i = 0; i < multi.length; i++) {
            switch (multi[i]) {
                case 0 : arr[0]++; break;
                case 1 : arr[1]++; break;
                case 2 : arr[2]++; break;
                case 3 : arr[3]++; break;
                case 4 : arr[4]++; break;
                case 5 : arr[5]++; break;
                case 6 : arr[6]++; break;
                case 7 : arr[7]++; break;
                case 8 : arr[8]++; break;
                case 9 : arr[9]++; break;
            }
        }

        //출력
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
