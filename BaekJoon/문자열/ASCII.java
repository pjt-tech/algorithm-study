import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String ascii = br.readLine();
        bw.write((int)ascii.charAt(0)+""); //문자열의 문자 하나를 char 형태로 형변환 후 아스키 코드 값 출력
        
        bw.flush();
        bw.close();        
    }
}