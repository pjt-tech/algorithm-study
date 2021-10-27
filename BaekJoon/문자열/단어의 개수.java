import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim(); //문자열의 공백을 이용하여 문자열안의 단어개수찾기
        if(str.isEmpty()) {
            System.out.println(0);
        } else {
           System.out.println(str.split(" ").length); 
        }
        br.close();
    }  
}