import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arrRemain = new int[10];
        Set<Integer> set = new HashSet<>();
        int count = 10;
        for(int i = 0; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            arrRemain[i] = num % 42;
        }
        br.close();
        for(int num : arrRemain) {
           set.add(num);
        }
        bw.write(set.size() + "\n");
        bw.flush();
        bw.close();
    }
}