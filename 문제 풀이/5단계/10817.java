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
        
        for(int i=0;i<num.length;i++) {
            for(int j=0;j<num.length-i;j++) {
                if(num[i]<num[i+1]) {
                    int temp = num[i];
                    num[i]=num[i+1];
                    num[i+1]=temp;
                }
            }
        }
        
        System.out.print(num[1]);
    }
}
//에러 고치는 중==========================================
