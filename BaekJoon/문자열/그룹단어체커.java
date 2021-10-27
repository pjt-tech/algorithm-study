import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //입력받은 단어의 개수                  
        int count = 0;
        for(int i = 0; i < n; i++) {
           if(check(br)) { 
               count++;
           }   
        }
        System.out.println(count);
    }
    public static boolean check(BufferedReader br) throws IOException {       
        boolean[] isEquals = new boolean[26]; //알파벳만큼 boolean 배열생성
        String str = br.readLine().trim();
        int prev = 0; //이전 문자
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != prev) { //이전문자와 현재 비교하려는문자가 같다면 continue, 다르다면 조건문으로 들어간다.
                if(isEquals[str.charAt(i) - 'a'] == false) { //배열의 인덱스가 false라면 처음인거다.
                    isEquals[str.charAt(i) - 'a'] = true; 
                    prev = str.charAt(i); //배열의 인덱스를 true로 바꾸고 이전 문자를 담아서 저장한다.
                } else {
                    return false; //배열의 인덱스를 true로 바꾸는 이유는 한번 건너뛰고 또 나왔을경우 그문자열은 그룹 단어가 아니게 된다. 그럴 경우 false를 return한다.
                }
            }
        }
        return true;
    }
}