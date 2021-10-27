import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());                     
        int count = 0;
        for(int i = 0; i < n; i++) {
           if(check(br)) {
               count++;
           }   
        }
        System.out.println(count);
    }
    public static boolean check(BufferedReader br) throws IOException {       
        boolean[] isEquals = new boolean[26];
        String str = br.readLine().trim();
        int prev = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != prev) {
                if(isEquals[str.charAt(i) - 'a'] == false) {
                    isEquals[str.charAt(i) - 'a'] = true;
                    prev = str.charAt(i);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}