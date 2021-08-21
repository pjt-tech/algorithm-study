import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            double sum = 0;
            double count = 0;
            int[] arr = new int[P];
            for(int j = 0; j < P; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum+=arr[j];
            }
            double avg = sum/P;
            for(int score : arr) {
                if(score > avg) count++;
            }

            bw.write(String.format("%.3f", (count/P)*100) + "% \n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}