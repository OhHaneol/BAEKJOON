import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   int N = sc.nextInt();
	   
	   for(int i=1;i<N+1;i++) {
		   int x=N-i;
		   for(int k=x;k>0;k--) {
			   System.out.print(" ");
		   }
		   for(int j=0;j<i;j++) {
			   System.out.print("*");
		   }
		   System.out.print("\n");
	   }
   }
}
