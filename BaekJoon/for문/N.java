import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer("" + i," ");
            bw.write(Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}