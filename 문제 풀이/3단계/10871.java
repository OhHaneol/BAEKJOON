import java.io.*;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String s1 = br.readLine();
	   StringTokenizer st1 = new StringTokenizer(s1);
	   int N = Integer.parseInt(st1.nextToken());
	   int X = Integer.parseInt(st1.nextToken());
	   
	   String s2 = br.readLine();
	   StringTokenizer st2 = new StringTokenizer(s2);
	   
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   for(int i=0;i<N;i++) {
		   int num = Integer.parseInt(st2.nextToken());
		   if(num<X) {
			   bw.write(num + " ");
		   }
	   }
	   
	   bw.flush();
	   bw.close();
	   br.close();
   }
}
