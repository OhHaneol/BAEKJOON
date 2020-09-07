import java.io.*;
import java.util.StringTokenizer;

public class Main {

	//예외처리를 위해 throws IOException
	public static void main(String[] args) throws IOException{
		
		//System.out.println 보다 입출력 처리 속도가 빠른 buffer를 이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int 형 변수 대입(입력)
		int T = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<T; i++) {
			int A, B;
			
			//한 줄에 숫자 두 개가 있는데 문자열로 읽기
			String s = br.readLine();
			//공백으로 구분하여 토큰별로 나눠 정수대입
			StringTokenizer st = new StringTokenizer(s);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			int sum = A+B;
			bw.write(sum + "\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
