import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine(); //입력할 숫자의 갯수 N을 입력
        String sumStr = br.readLine(); //n개의 숫자를 입력받는다.
        String[] numArr = new String[Integer.parseInt(N)]; //N개의 배열생성
        numArr = sumStr.split("");
 
        int sum = 0;
        for(String num : numArr) {
             sum+=Integer.parseInt(num); //입력받은 숫자문자열을 잘라서 하나씩 더해준다.
        }
        bw.write(""+sum);
        bw.flush();
        bw.close();
    }
}