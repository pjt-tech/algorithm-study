import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int copy = N;
        int count = 0;
        
        while(true) {
            N = ((N%10) * 10) + (((N/10) + (N%10)) % 10); 
            count++;    
            
            if(copy == N) break;
        }
        bw.write(count  + "");
        br.close();
        bw.flush();
        bw.close();
    }
}