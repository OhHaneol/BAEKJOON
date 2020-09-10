import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost=0;
        
        int Hamb=sc.nextInt();
        for(int i=0;i<2;i++) {
            Hamb=Math.min(Hamb, sc.nextInt());
        }
        
        int Berv=sc.nextInt();
        Berv=Math.min(Berv,sc.nextInt());
        
        cost=Hamb+Berv-50;
        
        System.out.print(cost);
    }
}
