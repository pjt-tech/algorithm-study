import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int score = 1;
        
        String[] arr = new String[N];
        for(int i = 0; i < N; i++) {
           arr[i] = br.readLine(); 
        }
        br.close();
        for(String str : arr) {
           String[] arrOx = str.split("");
           count = 0;
           score = 1;
           for (String ox : arrOx) {             
                if (ox.toUpperCase(Locale.ROOT).equals("O")) {
                    count += score++;
                } else {
                    count += 0;
                    score = 1;
                }
            }
           bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}