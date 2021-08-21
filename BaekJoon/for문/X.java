import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
           int A = Integer.parseInt(st.nextToken());
           if(A < X) {
              sb.append(A).append(' ');        
           }
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}