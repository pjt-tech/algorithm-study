import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine();
        String sumStr = br.readLine();
        String[] numArr = new String[Integer.parseInt(N)];
        numArr = sumStr.split("");
 
        int sum = 0;
        for(String num : numArr) {
             sum+=Integer.parseInt(num);
        }
        bw.write(""+sum);
        bw.flush();
        bw.close();
    }
}