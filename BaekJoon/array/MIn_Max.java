import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());     
        StringTokenizer st = new StringTokenizer(br.readLine()," ");            
        int min = 1000000;
        int max = -1000000;
        br.close();
            
        for(int i = 0; i < N; i++) { 
           int number = Integer.parseInt(st.nextToken());           
           if(number < min) min = number;               
           if (number > max) max = number;
 
        }
        bw.write(min + " " +max);
        bw.flush();
        bw.close();
    }
}