import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arrNum = new int[9];
        int max = 0;
        int count = 0;
        int idx = 0;
        StringTokenizer st;
        for(int i = 0; i < arrNum.length; i++) {
            st = new StringTokenizer(br.readLine());
            arrNum[i] = Integer.parseInt(st.nextToken());           
        }
        for(int num : arrNum) {            
            count++;
            if(num > max) {
               max = num;
               idx = count;
            }            
        }        

        br.close();
        bw.write(max + "\n" + idx);
        bw.flush();
        bw.close();
    }
}