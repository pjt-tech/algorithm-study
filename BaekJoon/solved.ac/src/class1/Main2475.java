package class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2475 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        br.close();
        int sum = 0;

        for(String s : str) {
            sum+=Math.pow(Integer.parseInt(s),2);
        }
        System.out.println(sum % 10);
    }
}
