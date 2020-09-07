import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int x, y, z, mul;

        a=sc.nextInt();
        b=sc.nextInt();

        x=(b%10)*a;
        y=((b%100)/10)*a;
        z=(b/100)*a;
        mul=x+y*10+z*100;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(mul);

    }
}
