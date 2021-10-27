import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String title = br.readLine();
        String result = "";
                   
        for(char i='a'; i<='z'; i++) { //a-z 까지 반복문 실행
            if(title.indexOf(Character.toString(i)) > -1) {
                result+=title.indexOf(Character.toString(i)); //입력한 문자열중 해당 알파벳이 존재한다면 인덱스값을 result 에 더해주고
            } else {
                result+="-1"; //아니면 -1을 더해준다.
            }
            result+=" ";
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
    }
}