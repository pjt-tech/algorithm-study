import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        bw.write(sequence(N) + "");
        br.close();
        bw.flush();
        bw.close();
    }
    
    public static int sequence(int num) {
        int cnt = 0;
        if(num < 100) {
            return num;
        } else {
            cnt = 99;
            if(num == 1000) num = 999;
            for(int i = 100; i <= num; i++) {
                int hun = i/100;
                int ten = (i/10) % 10;
                int one = i%10;
                if((hun-ten) == (ten-one)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}