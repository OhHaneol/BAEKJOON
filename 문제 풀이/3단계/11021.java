import java.io.*;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   for(int i=0;i<T;i++) {
		   int A, B;
		   int x=i+1;
		   String s = br.readLine();
		   StringTokenizer st = new StringTokenizer(s);
		   A = Integer.parseInt(st.nextToken());
		   B = Integer.parseInt(st.nextToken());
		   
		   int sum=A+B;
		   
		   System.out.println("Case #" + x + ": " + sum);
		   bw.newLine();
	   }
	   br.close();
	   bw.flush();
	   bw.close();
   }
}
 
