import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        int mid=0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String numbs = bf.readLine();
        String []tokens = numbs.split(" ");
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i =0;i<tokens.length;i++) {
            num.add(Integer.parseInt(tokens[i]));
        }
        
        //ArrayList의 경우 size() 메소드 사용
        //ArrayList의 경우 get() 메소드를 사용하여 배열 접근..?
        for(int i=0;i<num.size();i++) {
            for(int j=0;j<num.size()-i;j++) {
                if(num.get(i)<num.get(i+1)) {
                    int temp = num.get(i);
                    num.get(i)=num.get(i+1);
                    num.get(i+1)=temp;
                }
            }
        }
        
        System.out.print(num.get(1));
    }
}
====에러 고치는 중,,,,
 
