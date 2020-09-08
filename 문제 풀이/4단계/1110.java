import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int copy = N;
        int cycle = 0;
        
        do {
            N = (N%10)*10 + (N/10 + N%10)%10;
            cycle++;
        } while(N != copy);
            
        System.out.print(cycle);
	}
}
