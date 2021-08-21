import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            String b = st.nextToken();
            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            bw.write("Case #"+i+": "+a+" + "+b+" = "+sum+"\n");           
        }
        br.close();
        bw.flush();
        bw.close();
    }
}