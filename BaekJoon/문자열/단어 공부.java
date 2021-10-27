import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); 
        str = str.toUpperCase(); //가장 많이 사용된 단어를 대문자로 출력하기 때문에 전부 대분자로 바꿔준다.
        int[] alpha = new int[26]; //알파벳은 총 26자이므로 알파벳 인덱스 배열을 생성해주고
        for(int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 65]++; //입력받은 문자열의 길이만큼 돌면서 문자열의 알파벳문자의 인덱스를 alpha배열의 인덱스에 맞추어 증가시킨다.
        }
        int max = -1; 
        char ch = '?';

        for(int i = 0; i < alpha.length; i++) { //다시 alpha배열의 길이만큼 돌면서 인덱스 크기가 가장큰값을 찾는다.
            if (alpha[i] > max) {
                max = alpha[i]; //가장 큰값을 저장
                ch = (char) (65 + i);
            } else if (alpha[i] == max) { //같은게 하나라도 있으면 '?'를 찍는다.
                ch = '?';
            }
        }
        System.out.println(ch);
        br.close();
    }
}