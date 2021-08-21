import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        double[] arrScore = new double[N];
        double[] changeScore = new double[N];
        double max = 0;
        double result = 0;
        for(int i = 0; i < N; i++) {
            arrScore[i] = Integer.parseInt(st.nextToken());
            if(arrScore[i] > max) {
                max = arrScore[i];
            }
        }
        for(int i = 0; i < N; i++) {
            changeScore[i] = arrScore[i]/max*100;
        }
        for(double score : changeScore) {
            result += score;
        }
        bw.write(result/N + "");
        bw.flush();
        bw.close();

    }
}
