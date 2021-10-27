import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        int[] alpha = new int[26];
        for(int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 65]++;
        }
        int max = -1;
        char ch = '?';

        for(int i = 0; i < alpha.length; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                ch = (char) (65 + i);
            } else if (alpha[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
        br.close();
    }
}