import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] brr = new boolean[10001];
        
        for(int i = 1; i < 10001; i++) {
            int n = d(i);
            if(n < 10001) {
                brr[n] = true;
            }
        }
        
        for(int i = 1; i < 10001; i++) {
            if(!brr[i]) {
               bw.write(i + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
    
    public static int d(int num) {
        int sum = num;
        while(num != 0) {
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }
}