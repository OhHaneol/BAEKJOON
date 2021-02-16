
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max;
        int i;
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(i=0;i<n;i++) {
            numbers[i] = sc.nextInt();
        }

        quickSort(numbers, 0, numbers.length-1);

        System.out.print(numbers[0] + " " + numbers[--n]);
    }

    public static void quickSort(int[] arr, int l, int r) {
        int left = l;
        int right = r;
        int pivot = arr[(l + r)/2];

        do {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if(left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        } while (left <= right);

        if(l < right) quickSort(arr, l, right);
        if(r > left) quickSort(arr, left, r);
    }
}
