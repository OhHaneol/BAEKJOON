import java.io.*;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       while(true) {
           String s = br.readLine();
           StringTokenizer st = new StringTokenizer(s);
           int A = Integer.parseInt(st.nextToken());
           int B = Integer.parseInt(st.nextToken());
           
           if(A == 0 && B == 0) break;
           
           int sum = A + B;
           
           bw.write(sum + "\n");
       }
       br.close();
       bw.flush();
       bw.close();
   }
}
