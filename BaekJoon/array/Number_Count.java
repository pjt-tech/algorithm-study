import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        br.close();
        String result = (num1*num2*num3) + "";
        String[] arrNum = result.split("");
        
        for(int i = 0; i <= 9; i++) {
            int count = 0;
            for(String number : arrNum) {
               if(Integer.parseInt(number) == i) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}